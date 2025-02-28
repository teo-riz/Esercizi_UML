
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" TORRE DI HANOI ");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        Colonne colonne = new Colonne();
        System.out.println();
        boolean stato = true;
        int mosse = 0 ;
        while (stato) {
            colonne.stampa();
            System.out.println("      MENU ");
            System.out.println("1. SPOSTA DISCO \n 2. ESCI ");
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