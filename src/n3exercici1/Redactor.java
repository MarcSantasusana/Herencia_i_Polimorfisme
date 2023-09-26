package n3exercici1;

import java.util.ArrayList;

public class Redactor
{
    private String nom;
    private final String DNI;
    private static int sou;

    private ArrayList<Noticia> llistaNoticies;

    public Redactor(String nom, String DNI)
    {
        this.nom = nom;
        this.DNI = DNI;
        sou = 1500;
        llistaNoticies = new ArrayList<Noticia>();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Noticia> getLlistaNoticies() {
        return llistaNoticies;
    }
}
