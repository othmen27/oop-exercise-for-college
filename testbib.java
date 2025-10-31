public class testbib{
    public static void main(String[] args){
        etudiant e1 = new etudiant(1011,"Ben Salah","Ali","Sousse");
        etudiant e2 = new etudiant(1022,"Ben Amor","Walid","Sousse");
        livre l1 = new livre(4921,"Penser en java","B.Ecckel");
        livre l2 = new livre(4922,"BD relationelle","G.Gardarin");
        livre l3 = new livre(4923,"Uml2","C.Soutou");
        l2.emprunter(e1);
        l3.emprunter(e2);
        l1.retourner();
        biblio B = new biblio("Almaaref");
        B.ajouterLivre(l1);
        B.ajouterLivre(l2);
        B.ajouterLivre(l3);
        l3.retourner();
        System.out.println(B.compter());
        B.rechercheLivre(4922);
    }
}