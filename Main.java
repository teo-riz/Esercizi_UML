
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("|");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.println("|");
        System.out.print("|");
        System.out.print("TORRE DI HANOI");
        System.out.print("|\n");
        System.out.print("|");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("|\n");
        Colonne colonne = new Colonne();
        System.out.println();
        boolean stato = true;
        int mosse = 0 ;
        while (stato) {

            System.out.print("|");
            for (int i = 0; i < 15; i++) {
                System.out.print("-");
            }
            System.out.println("|");
            System.out.println("      MENU ");
            System.out.println("1. SPOSTA DISCO \n 2. ESCI ");
            System.out.print("|");
            for (int i = 0; i < 15; i++) {
                System.out.print("-");
            }
            System.out.print("|\n");
            colonne.stampa();
            System.out.println("cosa decidi di fare : ");
            int scelta = sc.nextInt();
            switch (scelta){
                case 1 :
                    System.out.println("scegli la colonna dove togliere il disco : ");
                    int sceltaColonna = sc.nextInt();
                    System.out.println("scegli dove mettere il disco : ");
                    int sceltaColonna2 = sc.nextInt();
                    colonne.sposta(sceltaColonna,sceltaColonna2);
                    mosse ++;
                    colonne.vittoria();
                    break;
                case 2 :
                    stato = false ;
                    break;

                default:
                    System.out.println("inserisci uno dei numeri proposti");
            }
        }


    }

}