package miniProjet;

import java.util.Scanner;

public class Test {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        Menu menu=new Menu();
        int i=0;
        do {
            menu.menu();
            System.out.print("Donner votre choix:");
            int choix=s.nextInt();
                switch (choix){
                    case 1:
                        menu.ajouter();
                        break;
                    case 2:
                        menu.modifier();
                        break;
                    case 3:
                        menu.suprimer();
                        break;
                    case 4:
                        menu.afficher();
                        break;
                    case 5:
                        menu.afficherListe();
                        break;
                    case 6:
                        menu.SLP();
                        break;
                    case 7:
                        System.out.println("Le Employe le plus Agé est:"+menu.plusAge());
                        break;
                    case 8:
                        System.out.println("Le Employe le moin Agé est:"+menu.moinAge());
                        break;
                    case 9:
                        menu.quitter();
                        break;
                }
        }while (i==0);
    }
}

