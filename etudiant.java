public class etudiant{
    private int mat;
    private String nom,prenom,adresse;
    public etudiant(int mat, String nom,String prenom){
        this.mat = mat;
        this.nom=nom;
        this.prenom=prenom;
    }
    public etudiant(int mat, String nom, String prenom, String adresse){
        this.mat = mat;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
    }
    public String toString(){
        return("Le etudiant "+ this.nom+ " de matricule"+ this.mat+" qui habite a "+this.adresse);
    }
}