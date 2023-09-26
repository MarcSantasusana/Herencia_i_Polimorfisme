package n1exercici2;

public class Cotxe {

    private static final String marca = "Audi";
    private static String model;
    private final int potencia;

    public Cotxe()
    {
        model = "A4";
        potencia = 230;
    }

    public static void frenar()
    {
        System.out.println("El vehicle està frenant");

    }

    public void accelerar()
    {
        System.out.println("El vehicle està accelerant");
    }
    
}
