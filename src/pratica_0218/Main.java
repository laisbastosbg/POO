package pratica_0218;

public class Main
{
    public static void main(String[] args)
    {
        Ponto p1 = new Ponto(2,3);
        Ponto p2 = new Ponto(2,-3);
        Ponto p3 = new Ponto(-1,2);

        Reta r1 = new Reta(p1, p2);
        Reta r2 = new Reta(p2, p3);
        Reta r3 = new Reta(p3, p1);

        Triangulo ABC = new Triangulo(r1, r2, r3);

        System.out.println("QUADRANTES DOS PONTOS: ");
        p1.quadrante();
        p2.quadrante();
        p3.quadrante();

        System.out.println("\nTAMANHO DAS RETAS");
        System.out.printf("%.2f\n",r1.distancia());
        System.out.printf("%.2f\n",r2.distancia());
        System.out.printf("%.2f\n",r3.distancia());

        System.out.println("\nTRIANGULO");
        if(ABC.isEq()) { System.out.println("Equilatero"); }
        else { System.out.println("Não é equilatero"); }
    }

}
