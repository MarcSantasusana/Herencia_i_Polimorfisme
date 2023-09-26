package n3exercici1;

public class Futbol extends Noticia
{
    private String competicio;
    private String club;
    private String jugador;


    public Futbol(String titular, String competicio, String club, String jugador)
    {
        super(titular);

        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    public int calcularPreuNoticia()
    {
        int preu = 300;

        if(competicio.equals("lliga de campions"))
        {
            preu += 100;
        }

        if(club.equals("barça") || club.equals("madrid"))
        {
            preu += 100;
        }

        if(jugador.equals("ferran torres") || jugador.equals("benzema"))
        {
            preu += 50;
        }

        return preu;
    }

    public int calcularPuntsNoticia()
    {
        int punts = 5;


        if(competicio.equals("lliga de campions"))
        {
           punts += 3;
        }

        if(competicio.equals("lliga"))
        {
            punts += 2;
        }



        if(club.equals("barça") || club.equals("madrid"))
        {
            punts += 1;
        }



        if(jugador.equals("ferran torres") || jugador.equals("benzema"))
        {
            punts += 1;
        }

        return punts;

    }



}
