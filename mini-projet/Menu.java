package miniProjet;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList <Employe> liste=new ArrayList<Employe>();
    Scanner sc = new Scanner(System.in);
    // Ajouter employé
    public void ajouter(){
        Employe employe = new Employe();
        System.out.println("Entrez le matricule:");
        int matr = sc.nextInt();
        System.out.println("Entrez le nom:");
        String nom = sc.nextLine();
        System.out.println("Entrez le prenom:");
        String prenom = sc.nextLine();
        System.out.println("Entrez l'age:");
        int age = sc.nextShort();
        System.out.println("Entrez le salaire:");
        int salaire = sc.nextInt();
        employe.setMatricule(matr);
        employe.setNom(nom);
        employe.setPrenom(prenom);
        employe.setAge(age);
        employe.setSalaire(salaire);
        if(liste.contains(employe.getMatricule())){
            System.out.println("L'employé existe");
        }else {liste.add(employe);
            System.out.println("Ajouter avec succeé");
        }
    }

    //Modifier Employé
    public void modifier(){
        Employe employe = new Employe();
        System.out.println("Entrez le matricule de l'employé:");
        int matricule = sc.nextInt();
        for (Employe i:liste) {
            if (i.getMatricule()==matricule){
                System.out.println("Entrez le nouveau nom:");
                String nom = sc.nextLine();
                System.out.println("Entrez le nouveau prenom:");
                String prenom = sc.nextLine();
                System.out.println("Entrez le nouveau age:");
                short age = sc.nextShort();
                System.out.println("Entrez le nouveau salaire:");
                int salaire = sc.nextInt();
                i.setNom(nom);
                i.setPrenom(prenom);
                i.setAge(age);
                i.setSalaire(salaire);
                System.out.println("Modification avec succeé");
            }else {
                System.out.println("L'employe n'existe pas");
            }
        }
    }

    //Suprimmer Employé
    public void suprimer() {
        Employe employe = new Employe();
        System.out.println("Entrez le matricule de l'employé:");
        int matricule = sc.nextInt();
        int cmp =0;
        for (Employe i : liste) {
            if (i.getMatricule() == matricule) {
                liste.remove(i);
                System.out.println("L'employe et suprimer");
                cmp++;
            }
        }
        if (cmp==0){
            System.out.println("L'employe n'existe pas");
        }
    }

    //Afficher Employé
    public void afficher(){
        System.out.println("Entrez le matricule de l'employé:");
        int matricule = sc.nextInt();
        System.out.println("\n*****************************************************************\n");
        if(liste.isEmpty()){
            System.out.println("La liste est vide!!!");
        }else{
            for (Employe i : liste) {
                if (i.getMatricule() == matricule) {
                    System.out.println("Matricule:" + i.getMatricule() + "\nNom complet:" + i.getNom() + " " + i.getPrenom()
                            + "\nAge:" + i.getAge() + "\nSalaire:" + i.getSalaire());
                } else {
                    System.out.println( "L'emplyé n'xiste pas");
                }
            }
        }
    }

    //Afficher tout les employe
    public void afficherListe(){
        if(liste.isEmpty()){
            System.out.println("La liste est vide");
        } else{
            for (Employe i : liste) {
                if (liste.size() != 0) {
                    System.out.println("Matricule:"+i.getMatricule()+"\nNom complet:"+i.getNom()+" "+i.getPrenom()
                            +"\nAge:"+i.getAge()+"\nSalaire:"+i.getSalaire() + "**********" + "*********");
                }
            }
        }
    }

    //Salaire>10000
    public void SLP(){
        int cmp =0;
        for (Employe i:liste) {
            if (i.getSalaire()>10000) {
                cmp++;
            }
        }
        if (cmp>0){
            System.out.println("Le nombre d'employés est:"+cmp);
        }else {
            System.out.println("acun employé");
        }
    }

    //Plus agé
    public int plusAge(){
        Employe employe = new Employe();
        int max = employe.getAge();
        for (Employe i:liste) {
            if(i.getAge()>max){
                max=i.getAge();
            }
        }
        return max;
    }

    //moin agé
    public int moinAge(){
        int moin = liste.get(0).getAge();
        for (Employe i:liste) {
            if(i.getAge()<moin){
                moin=i.getAge();
            }
        }
        return moin;
    }

    //quitter
    public void quitter(){
        System.out.println("Merci.");
        System.exit(0);
    }
    public void menu(){
        System.out.println("                  < Menu >           ");
        System.out.println("1-Ajouter un employé :");
        System.out.println("2-Modifier un employé :");
        System.out.println("3-Suprimmer un employé :");
        System.out.println("4-Afficher un employé :");
        System.out.println("5-Afficher tous les employé :");
        System.out.println("6-Nombre d'employé avc un salaire > 10000 :");
        System.out.println("7-Afficher l'employer le plus agé :");
        System.out.println("8-Afficher l'employer le moin agé :");
        System.out.println("9-Quitter :");
    }
}