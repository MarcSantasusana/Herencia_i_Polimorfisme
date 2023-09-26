package n3exercici1;

public class F1 extends Noticia
{
    private String escuderia;


    public F1(String titular, String escuderia)
    {
        super(titular);

        this.escuderia = escuderia;
    }

    public int calcularPreuNoticia()
    {
        int preu = 100;


        if(escuderia.equals("ferrari") || escuderia.equals("mercedes"))
        {
            preu += 50;
        }

        return preu;
    }

    public int calcularPuntsNoticia()
    {
        int punts = 4;


        if(escuderia.equals("ferrari") || escuderia.equals("mercedes"))
        {
            punts = 2;
        }

        return punts;

    }
}
