/**Ecrire un programme "exercice1" permettant de recevoir en ligne
 * de commande une chaine de caractère 'str' puis puis affiche 
 * 'hello str'
*/

public class Exercice1 {

    public static void main(String[] args) {
        // Déclaration de la variable str
        String str;

        // Lecture de la chaîne de caractères en ligne de commande
        str = args[0];

        // Affichage de la chaîne de caractères
        System.out.println("hello " + str);
    }
}