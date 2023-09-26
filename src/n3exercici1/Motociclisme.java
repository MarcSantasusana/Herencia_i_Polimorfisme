package n3exercici1;

public class Motociclisme extends Noticia
{
    private String equip;


    public Motociclisme(String titular, String equip)
    {
        super(titular);

        this.equip = equip;
    }

    public int calcularPreuNoticia()
    {
        int preu = 100;


        if(equip.equals("honda") || equip.equals("yamaha"))
        {
            preu += 50;
        }

        return preu;
    }

    public int calcularPuntsNoticia()
    {
        int punts = 3;


        if(equip.equals("honda") || equip.equals("yamaha"))
        {
            punts += 3;
        }

        return punts;

    }
}
