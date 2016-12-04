
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exo15_1 {
    static Scanner lire = new Scanner(System.in);
    static int[] tableau = {17, 12, 15, 38, 29, 157, 59, -22, 0, 3};

    static int division(int indice, int diviseur) {
        if (diviseur == 0) throw new ArithmeticException("devision par zero");{
             if((indice<0)&&(indice>9)) throw new ArrayIndexOutOfBoundsException("indice ne se trouve pas");{
                if(tableau==null)throw new NullPointerException("tableau non initialiser");
        else
            return (indice) / diviseur;
            }
        }
    }
    public static void main(String[] args) {
        int x, y;
        x = 0;
        y = 1;
        System.out.println("Entrer l'indice l'entier à diviser");
        lire.nextLine();
        System.out.println("Entrer le diviseur");
        lire.nextLine();
        System.out.println("le resultat est ");
        System.out.println(division(x, y));
        try {
            System.out.println(+division(x, y));
        }catch(ArithmeticException ex){
            System.err.println(ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex.getMessage());
        }catch (NullPointerException ex){
            System.err.println(ex.getMessage());
        }catch (InputMismatchException ex){
            System.err.println("faute de frappe il faut saisir un entier");
        }
    }
}