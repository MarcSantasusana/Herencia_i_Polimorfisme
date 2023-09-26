package n3exercici1;

public class Basquet extends Noticia
{
    private String competicio;
    private String club;


    public Basquet(String titular, String competicio, String club)
    {
        super(titular);

        this.competicio = competicio;
        this.club = club;

    }

    public int calcularPreuNoticia()
    {
        int preu = 250;

        if(competicio.equals("eurolliga"))
        {
            preu += 75;
        }

        if(club.equals("barça") || club.equals("madrid"))
        {
            preu += 75;
        }


        return preu;
    }

    public int calcularPuntsNoticia()
    {
        int punts = 4;

        if(competicio.equals("eurolliga"))
        {
            punts += 3;
        }

        if(competicio.equals("abc"))
        {
            punts += 2;
        }

        if(club.equals("barça") || club.equals("madrid"))
        {
            punts += 1;
        }

        return punts;

    }
}
