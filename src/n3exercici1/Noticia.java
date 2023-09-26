package n3exercici1;

public abstract class Noticia
{
    private String titular;
    private String text;
    private int preu;
    private int puntuacio;

    public Noticia(String titular)
    {
        this.titular = titular;

        text = "";
    }

    public abstract int calcularPreuNoticia();
    public abstract int calcularPuntsNoticia();

    public int getPreu() { return preu;}
    public int getPuntuacio() {
        return puntuacio;
    }

    public String getText() {
        return text;
    }

    public String getTitular() {
        return titular;
    }
}
