/*
 * TP1 Syntaxe de Base - manipNombreInt
 * TORDO
 * BERTOLIN
 * 4/10/2021
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author pierre
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un premier nombre :");
        int nb1 = sc.nextInt(); // on demande à l'utilisateur de saisir un permier nombre
        
        System.out.println("\n Entrer un deuxième nombre :");
        int nb2 = sc.nextInt(); // on demande à l'utilisateur de saisir un permier nombre
        System.out.println("Les nombres choisi sont : " + nb1 + " et " + nb2); // on affiche les nombres choisi par l'utilisateur
        
        System.out.println("La somme des 2 nombres est: " + (nb1+nb2)); // on effectue les calculs demandé
        System.out.println("La différence des 2 nombres est: " + (nb1-nb2));
        System.out.println("La multiplication des 2 nombres est: " + (nb1*nb2));
        System.out.println("La différence des 2 nombres est: " + (nb1/nb2));
        System.out.println("Le reste de la division des 2 nombres est: " + (nb1%nb2));
    }
    
}
