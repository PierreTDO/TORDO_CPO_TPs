/*
 * TP1 Syntaxe de Base - convertisseur
 * TORDO
 * BERTOLIN
 * 4/10/2021
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pierre
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.println(n);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Essayez de deviner le nombre compris entre 0 et 100 :");
        int nb = sc.nextInt();
        int i = 1;
        while (nb != n) {

            if (nb < n) {
                System.out.println("\n Essaie encore, valeur trop petite !");
                nb = sc.nextInt();
            }
            if (nb > n) {
                System.out.println("\n Essaie encore, valeur trop grande !");
                nb = sc.nextInt();

            }
            i++;
        }
        if (nb == n) {
            System.out.println("\n C'est gagné ! en " + i + " coups");

        }
    }

}
