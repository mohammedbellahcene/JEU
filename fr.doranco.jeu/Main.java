
import categories.Race;
import outils.*;
import personnages.Guerrier;
import personnages.Mage;
import personnages.Personnage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(5 / 2.);
        Personnage p1 = Fonctions.choixPersonnage();
        Personnage p2 = Fonctions.choixPersonnage();
        Fonctions.combat(p1, p2);

        /*
         * Guerrier conan = new Guerrier("Conan", "barbare", 18, 100, 1);
         * Mage gandalf = new Mage("Gandalf", "vagabond", 9, 90, 100);
         * conan.setRace(Race.HUMAIN);
         * gandalf.setRace(Race.ISTAR);
         * Fonctions.combat(conan, gandalf);
         * System.out.println("Race : " + conan.getRace());
         * System.out.println("Race : " + gandalf.getRace());
         * if (conan.getRace() == Race.HUMAIN) {
         * System.out.println("humain");
         * } else {
         * System.out.println("not humain");
         * }
         * 
         * try {
         * if (gandalf.getRace() == Race.valueOf("ISTRE")) {
         * System.out.println("humain");
         * } else {
         * System.out.println("not humain");
         * }
         * 
         * } catch (IllegalArgumentException e) {
         * System.out.println("\n*****************");
         * System.out.println("cette race n'existe pas dans cet univers");
         * System.out.println(e.getMessage());
         * } catch (Exception e) {
         * System.out.println("Error non définie");
         * System.out.println(e.getMessage());
         * } finally {
         * System.out.println("ce block est executé dans tous les cas");
         * }
         * System.out.println("Liste des races disponibles: ");
         * for (Race race : Race.values()) {
         * System.out.println("- " + race);
         * }
         */
    }

}
