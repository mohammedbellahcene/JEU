package outils;

import java.util.InputMismatchException;
import java.util.Scanner;

import personnages.Guerrier;
import personnages.Mage;
import personnages.*;

public final class Fonctions {
    public static final Scanner scan = new Scanner(System.in);

    public static int aleatoire(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void combat(Personnage p1, Personnage p2) {
        int tour = 1;
        while (p1.getDureeDeVie() > 0 && p2.getDureeDeVie() > 0) {
            p1.attaquer(p2);
            p2.attaquer(p1);
            System.out.println("Tour" + tour++);
            System.out.println("Points de vie restant pour " + p2.getNom() + ": " + p2.getDureeDeVie());
            System.out.println("Points de vie restant pour " + p1.getNom() + ": " + p1.getDureeDeVie());

        }
        if (p1.getDureeDeVie() <= 0)
            System.out.println("\nLe ganant est : \n" + p2.fiche());

        else if (p2.getDureeDeVie() <= 0)
            System.out.println("\nLe ganant est : \n" + p1.fiche());
        else
            System.out.println("Egalité");

    }

    public static String sisirTexte(String question) {
        System.out.println(question + " > ");
        String texte = scan.nextLine();
        return texte;
    }

    public static int sisirEntier(String question) {

        Integer nb = null;
        do {
            try {
                System.out.println(question + " > ");
                String str = scan.nextLine();
                nb = Integer.parseInt(str);
            } catch (InputMismatchException e) {
                System.out.println("\033[31m Ce n'est pas un nombre \033[0m");
                nb = null;
            } catch (NumberFormatException e) {
                System.out.println("\033[31m Mauvaise saisie \033[0m");
                nb = null;
            } catch (Exception e) {
                System.out.println("\033[31m Error \033[0m]");
                nb = null;
            }
        } while (nb == null);
        return nb;
    }

    public static int sisairProprietesEntier(int min, int max, String propriete) {
        int entry;
        do {
            entry = sisirEntier(propriete + " : ");

        } while (entry < min || entry > max);
        return entry;
    }

    public static String sisairProprietesStrNonvide(String propriete) {
        String entry;
        do {
            entry = sisirTexte(propriete + " : ");

        } while (entry == null);
        return entry;
    }

    public static Personnage choixPersonnage() {
        System.out.println("1 -> Guerrier");
        System.out.println("2 -> Mage");
        System.out.println("totobefore");
        int choix = sisirEntier("choix? : ");
        System.out.println("after");
        switch (choix) {
            case 1:
                Personnage conan = new Guerrier();
                conan.setNom(sisairProprietesStrNonvide("nom : "));
                conan.setForce(sisairProprietesEntier(1, 20, "Force : "));
                conan.setDureeDeVie(sisairProprietesEntier(50, 200, "Vie : "));
                ((Guerrier) conan).setArmature(sisairProprietesEntier(1, 5, "Armure : "));
                return conan;

            case 2:
                Personnage gandalf = new Mage();
                gandalf.setNom(sisairProprietesStrNonvide("nom : "));
                gandalf.setForce(sisairProprietesEntier(1, 20, "Force : "));
                gandalf.setDureeDeVie(sisairProprietesEntier(50, 200, "Vie : "));
                ((Mage) gandalf).setMana(sisairProprietesEntier(1, 100, "Mana : "));
                return gandalf;

            default:
                return null;
        }
    }

}
