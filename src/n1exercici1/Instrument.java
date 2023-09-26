package n1exercici1;

public abstract class Instrument {

    protected String nom;
    protected int preu;

    public Instrument(String nom, int preu)
    {

        this.nom = nom;
        this.preu = preu;

        System.out.println("Constructor");

    }

    {
        System.out.println("Bloc d'inicialització");
    }

    static{

        System.out.println("Bloc estàtic");
    }

   abstract public void tocar();

}
