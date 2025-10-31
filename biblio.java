public class biblio{
    private String nomBib;
    private int nbLiv=0;
    private livre[] tabLiv = new livre[100];
    public biblio(String nom){
        this.nomBib = nom;
    }
    public void ajouterLivre(livre liv){
        this.tabLiv[this.nbLiv] = liv;
        this.nbLiv++;    
    }
    public livre[] getLivres(){
        return(this.tabLiv);
    }
    public void rechercheLivre(int num){
        boolean ok=false;
        for(int i=0;i<nbLiv;i++){
            if(this.tabLiv[i].getNumLiv() == num){
                System.out.println(this.tabLiv[i].toString());
                ok=true;
                break;
            }
        }
        if(ok==false){
            System.out.println("Livre introuvable");
        }
    }
    public int compter(){
       return(this.nbLiv);
    }

}