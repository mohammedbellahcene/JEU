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
        if (p1.getDureeDeVie() <= 0 && p2.getDureeDeVie() <= 0)
            System.out.println("Le deux personnage sont entretués!!!");
        else if (p1.getDureeDeVie() <= 0)
            System.out.println("\nLe vainqueur est : \n" + p2.fiche());

        else if (p2.getDureeDeVie() <= 0)
            System.out.println("\nLe vainqueur est : \n" + p1.fiche());

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
        int entree;
        do {
            entree = sisirEntier(propriete);

        } while (entree < min || entree > max);
        return entree;
    }

    public static String sisairProprietesStrNonvide(String propriete) {
        String entree;
        do {
            entree = sisirTexte(propriete);

        } while (entree == null);
        return entree;
    }

    public static Personnage choixPersonnage() {
        System.out.println("1 -> Guerrier");
        System.out.println("2 -> Mage");

        int choix = sisirEntier("choix? : ");

        switch (choix) {
            case 1:
                Personnage guerrier = new Guerrier();
                guerrier.setNom(sisairProprietesStrNonvide("nom : "));
                guerrier.setForce(sisairProprietesEntier(1, 20, "Force : "));
                guerrier.setDureeDeVie(sisairProprietesEntier(50, 200, "Vie : "));
                ((Guerrier) guerrier).setArmature(sisairProprietesEntier(1, 5, "Armure : "));
                return guerrier;

            case 2:
                Personnage mage = new Mage();
                mage.setNom(sisairProprietesStrNonvide("nom : "));
                mage.setForce(sisairProprietesEntier(1, 10, "Force : "));
                mage.setDureeDeVie(sisairProprietesEntier(50, 200, "Vie : "));
                ((Mage) mage).setMana(sisairProprietesEntier(1, 100, "Mana : "));
                return mage;

            default:
                return null;
        }
    }

}
