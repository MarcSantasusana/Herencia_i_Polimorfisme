package n3exercici1;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean sortir = false;

        ArrayList<Redactor> llistaRedactors = new ArrayList<Redactor>();
        String nom;
        String DNI;
        String titular;

        while (!sortir) {


            try {


                int opcio = demanarInt("Menú principal: \n\n" +
                        "0.- Sortir del programa \n" +
                        "1.- Introduir redactor/a \n" +
                        "2.- Eliminar redactor/a \n" +
                        "3.- Introduir notícia a un redactor/a \n" +
                        "4.- Eliminar notícia \n" +
                        "5.- Mostrar totes les notícies per redactor/a \n" +
                        "6.- Calcular puntuació de la notícia \n" +
                        "7.- Calcular preu-notícia");

                switch (opcio) {

                    case 0:
                        sortir = true;
                        break;

                    case 1:

                        nom = demanarString("Introdueixi el nom del redactor");
                        DNI = demanarString("Introdueixi el DNI del redactor");

                        introduirRedactor(llistaRedactors, nom, DNI);

                        break;

                    case 2:

                        DNI = demanarString("Introdueixi el DNI del redactor");
                        eliminarRedactor(llistaRedactors, DNI);

                        break;

                    case 3:

                        DNI = demanarString("Introdueixi el DNI del redactor");
                        introduirNoticiaRedactor(llistaRedactors, DNI);

                        break;

                    case 4:

                        titular = demanarString("Introdueixi el titular de la notícia");
                        DNI = demanarString("Introdueixi el DNI del redactor autor de la notícia");

                        eliminarNoticia(llistaRedactors, DNI, titular);

                        break;

                    case 5:

                        mostrarNoticiesRedactor(llistaRedactors);

                        break;

                    case 6:

                        titular = demanarString("Introdueixi el titular de la notícia");
                        DNI = demanarString("Introdueixi el DNI del redactor autor de la notícia");

                        calcularPuntuacioNoticia(llistaRedactors, DNI, titular);

                        break;

                    case 7:

                        titular = demanarString("Introdueixi el titular de la notícia");
                        DNI = demanarString("Introdueixi el DNI del redactor autor de la notícia");

                        calcularPreuNoticia(llistaRedactors, DNI, titular);

                        break;

                    default:
                        System.out.println("Aquesta opció no és vàlida \n");
                }

            } catch (InputMismatchException e) {
                System.out.println("Introdueixi un número, si us plau \n");
            }
        }


    }

    public static int demanarInt(String missatge) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(missatge);

        int enter = scanner.nextInt();

        return enter;
    }

    public static String demanarString(String missatge) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(missatge);

        String cadena = scanner.nextLine();

        return cadena;
    }

    public static void introduirRedactor(ArrayList<Redactor> llistaRedactors, String nom, String DNI)
    {
        int index = cercarRedactor(llistaRedactors, DNI);

        if(index == -1)
        {
            Redactor redactor = new Redactor(nom, DNI);

            llistaRedactors.add(redactor);
        }
        else {

            System.out.println("Aquest redactor ja es troba dins la llista");
        }



    }

    public static void eliminarRedactor(ArrayList<Redactor> llistaRedactors, String DNI)
    {
        int index = cercarRedactor(llistaRedactors, DNI);

        if(index == -1)
        {
            System.out.println("Aquest redactor no es troba dins la llista");
        }

        else {

            llistaRedactors.remove(index);
        }

    }

    public static int cercarRedactor(ArrayList<Redactor> llistaRedactors, String DNI)
    {
        boolean trobat = false;
        int i = 0;

        while(!trobat && i < llistaRedactors.size())
        {
            if(llistaRedactors.get(i).getDNI().equals(DNI))
            {
                trobat = true;
            }
            else {
                i++;
            }
        }

        if(!trobat)
        {
            i = -1;
        }

        return i;
    }

    public static void introduirNoticiaRedactor(ArrayList<Redactor> llistaRedactors, String DNI)
    {
        int index = cercarRedactor(llistaRedactors, DNI);


        if(index == -1)
        {
            System.out.println("Aquest redactor no es troba dins la llista");
        }

        else
        {

            String titular = demanarString("Introdueixi el titular de la notícia");

            int opcio = demanarInt("Introdueixi la categoria de la notícia: \n" +
                    "1.- Futbol \n" +
                    "2.- Bàsquet \n" +
                    "3.- Tennis \n" +
                    "4.- F1 \n" +
                    "5.- Motociclisme \n");

            String competicio;
            String club;
            String jugador;

            switch (opcio)
            {

                case 1:

                     competicio = demanarString("Introdueixi a quina competició fa referència la notícia");
                     club = demanarString("Introdueixi a quin club fa referència la notícia");
                     jugador = demanarString("Introdueixi a quin jugador fa referència la notícia");

                    competicio =  competicio.toLowerCase();
                    club = club.toLowerCase();
                    jugador = jugador.toLowerCase();


                    Futbol noticiaFutbol = new Futbol(titular, competicio, club, jugador);
                    llistaRedactors.get(index).getLlistaNoticies().add(noticiaFutbol);

                    break;

                case 2:

                    competicio = demanarString("Introdueixi a quina competició fa referència la notícia");
                    club = demanarString("Introdueixi a quin club fa referència la notícia");

                    competicio = competicio.toLowerCase();
                    club = club.toLowerCase();

                    Basquet noticiaBasquet = new Basquet(titular, competicio, club);
                    llistaRedactors.get(index).getLlistaNoticies().add(noticiaBasquet);

                    break;

                case 3:

                    competicio = demanarString("Introdueixi a quina competició fa referència la notícia");
                    jugador = demanarString("Introdueixi a quin tennista fa referència la notícia");

                    competicio = competicio.toLowerCase();
                    jugador = jugador.toLowerCase();

                    Tenis noticiaTennis = new Tenis(titular, competicio, jugador);
                    llistaRedactors.get(index).getLlistaNoticies().add(noticiaTennis);

                    break;

                case 4:

                    club = demanarString("Introdueixi a quina escuderia fa referència la notícia");

                    club = club.toLowerCase();

                    F1 noticiaF1 = new F1(titular, club);
                    llistaRedactors.get(index).getLlistaNoticies().add(noticiaF1);

                    break;

                case 5:

                    club = demanarString("Introdueixi a quin equip fa referència la notícia");

                    club = club.toLowerCase();

                   Motociclisme noticiaMotos = new Motociclisme(titular, club);
                    llistaRedactors.get(index).getLlistaNoticies().add(noticiaMotos);

                    break;

                default:

                    System.out.println("Aquesta opció no és vàlida");

            }



        }
    }

    public static void mostrarNoticiesRedactor(ArrayList<Redactor> llistaRedactors)
    {

        for(int i = 0; i < llistaRedactors.size(); i++)
        {
            System.out.println("Notícies del redactor " + llistaRedactors.get(i).getNom() + " amb DNI " + llistaRedactors.get(i).getDNI() + ": \n");

           for(int j = 0; j < llistaRedactors.get(i).getLlistaNoticies().size(); j++)
           {
               System.out.println("Titular: " + llistaRedactors.get(i).getLlistaNoticies().get(j).getTitular());
               System.out.println("Text: " + llistaRedactors.get(i).getLlistaNoticies().get(j).getText() + "\n");

           }
        }


    }

    public static int[] cercarNoticia(ArrayList<Redactor> llistaRedactors, String DNI, String titular)
    {
       int indexRedactor = cercarRedactor(llistaRedactors, DNI);
       int indexNoticia[] = {-1, -1};


       if(indexRedactor == -1)
       {
           System.out.println("Aquest redactor no es troba dins la llista");
       }

       else {

           boolean trobat = false;
           int i = 0;

           while(!trobat && i < llistaRedactors.get(indexRedactor).getLlistaNoticies().size())
           {
               if(llistaRedactors.get(indexRedactor).getLlistaNoticies().get(i).getTitular().equals(titular))
               {
                   trobat = true;
                   indexNoticia[0] = indexRedactor;
                   indexNoticia[1] = i;
               }

               else {
                   i++;
               }
           }

       }

       return indexNoticia;
    }

    public static void calcularPuntuacioNoticia(ArrayList<Redactor> llistaRedactors, String DNI, String titular)
    {

        int[] indexNoticia = cercarNoticia(llistaRedactors, DNI, titular);

        if(indexNoticia[0] == -1)
        {
            System.out.println("Aquesta notícia no es troba dins la llista");
        }
        else
        {
            int puntuacio = 0;


                puntuacio = llistaRedactors.get(indexNoticia[0]).getLlistaNoticies().get(indexNoticia[1]).calcularPuntsNoticia();


            System.out.println("La puntuació de la notícia (" + titular + ") és: " + puntuacio);
        }

    }

    public static void calcularPreuNoticia(ArrayList<Redactor> llistaRedactors, String DNI, String titular)
    {

        int[] indexNoticia = cercarNoticia(llistaRedactors, DNI, titular);

        if(indexNoticia[0] == -1)
        {
            System.out.println("Aquesta notícia no es troba dins la llista");
        }
        else
        {
            int preu = 0;


                preu = llistaRedactors.get(indexNoticia[0]).getLlistaNoticies().get(indexNoticia[1]).calcularPreuNoticia();


            System.out.println("El preu de la notícia (" + titular + ") és: " + preu + "€");
        }

    }



    public static void eliminarNoticia(ArrayList<Redactor> llistaRedactors, String DNI, String titular)
    {

       int indexNoticia[] = cercarNoticia(llistaRedactors, DNI, titular);

        if(indexNoticia[0] == -1)
        {
            System.out.println("Aquesta notícia no existeix");
        }
        else
        {
            llistaRedactors.get(indexNoticia[0]).getLlistaNoticies().remove(indexNoticia[1]);

            System.out.println("Notícia eliminada correctament");

        }
    }


}