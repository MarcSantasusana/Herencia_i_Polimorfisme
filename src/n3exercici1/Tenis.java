package n3exercici1;

public class Tenis extends Noticia
{
    private String competicio;
    private String tenista;


    public Tenis(String titular, String competicio, String tenista)
    {
        super(titular);

        this.competicio = competicio;
        this.tenista = tenista;
    }

    public int calcularPreuNoticia()
    {
        int preu = 150;


        if(tenista.equals("federer") || tenista.equals("nadal") || tenista.equals("djokovic"))
        {
            preu += 75;
        }

        return preu;
    }

    public int calcularPuntsNoticia()
    {
        int punts = 4;


        if(tenista.equals("federer") || tenista.equals("nadal") || tenista.equals("djokovic"))
        {
           punts += 3;
        }

        return punts;

    }

}
