public class ProyectoDiscretas {
    
    public static void main(String[] args) {
        
        int valorDelGrafo = 6;

        int sumaGrafos = valorDelGrafo*2;

        int n = 7; //n son el numero de vertices

        System.out.println("");
        System.out.println("Tenga en cuenta que n = 7 y que el grado cada vertice es de 6");

        System.out.println("");
        System.out.println("_______________________________");
        System.out.println("");
        System.out.println("Vertice Principal: Konrad Lorenz (KL)");
        System.out.println("");
        System.out.println("d(KL)+d(MO) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(KL) + d(MO)");
        System.out.println("d(KL)+d(MA) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(KL) + d(MA)");
        System.out.println("d(KL)+d(C) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(KL) + d(C)");
        System.out.println("d(KL)+d(TC) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(KL) + d(TC)");
        System.out.println("d(KL)+d(JB) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(KL) + d(JB)");
        
        System.out.println("");
        System.out.println("_______________________________");
        System.out.println("");
        System.out.println("Vertice Principal: Museo del Oro (MO)");
        System.out.println("");
        System.out.println("d(MO)+d(JB) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(MO) + d(JB)");
        System.out.println("d(MO)+d(TC) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(MO) + d(TC)");
        System.out.println("d(MO)+d(P93) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(MO) + d(P93)");
        System.out.println("d(MO)+d(MA) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(MO) + d(MA)");
        System.out.println("d(MO)+d(C) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(MO) + d(C)");

        System.out.println("");
        System.out.println("_______________________________");
        System.out.println("");
        System.out.println("Vertice Principal: Parque de la 93 (P93)");
        System.out.println("");
        System.out.println("d(P93)+d(C) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(P93) + d(C)");
        System.out.println("d(P93)+d(MA) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(P93) + d(MA)");
        System.out.println("d(P93)+d(TC) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(P93) + d(TC)");
        System.out.println("d(P93)+d(JB) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(P93) + d(JB)");

        System.out.println("");
        System.out.println("_______________________________");
        System.out.println("");
        System.out.println("Vertice Principal: Jardin Botanico (JB)");
        System.out.println("");
        System.out.println("d(JB)+d(TC) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(JB) + d(TC)");
        System.out.println("d(JB)+d(MA) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(JB) + d(MA)");
        System.out.println("d(JB)+d(C) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(JB) + d(C)");

        System.out.println("");
        System.out.println("_______________________________");
        System.out.println("");
        System.out.println("Vertice Principal: Corferias (C)");
        System.out.println("");
        System.out.println("d(C)+d(TC) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(C) + d(TC)");
        System.out.println("d(C)+d(MA) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(C) + d(MA)");

        System.out.println("");
        System.out.println("_______________________________");
        System.out.println("");
        System.out.println("Vertice Principal: Mundo Aventura (MA)");
        System.out.println("");
        System.out.println("d(MA)+d(TC) = " + sumaGrafos + ", es decir: " + sumaGrafos + " > " + n + ". Donde es evidente que NO SE CUMPLE n > d(MA) + d(TC)");

        System.out.println("");
        System.out.println("______________________________________");
        System.out.println("");
        System.out.println("Vertice Principal: Torre Colpatria (TC)");
        System.out.println("");
        System.out.println("Ya se han establecido todas las conexiones posibles con este vertice en los anteriores planteamientos");
        System.out.println("");
        System.out.println("______________________________________");
        System.out.println("");

        System.out.println("Rta: Para ninguna suma de cada par de vértices se cumple la suma de los grados de los vértices \nsea menor al número de vértices, por lo que según el enunciado no son adyacentes, sin embargo, \nesto no quiere decir que realmente no lo sean, solo no cumplen el enunciado. Entonces podemos \nafirmar que el enunciado es falso y por ende su formula planteada no es veridica.");


        System.out.println("");
    }
}