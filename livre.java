public class livre{
    private int numLiv;
    private String titre;
    private String auter;
    private boolean disponible;
    private etudiant emprunter;
    public livre(int numLiv, String titre, String auter){
        this.numLiv=numLiv;
        this.titre=titre;
        this.auter=auter;
    }
    public String toString(){
        if(disponible==true){
            return("Le livre numero "+this.numLiv+" ayant pour titre "+this.titre+" ecrit par "+this.auter+" est disponible");
        }else{
            return("Le livre numero "+this.numLiv+" ayant pour titre "+this.titre+" ecrit par "+this.auter+" est emprunté par"+ emprunter.toString());
        }
    }
    public int getNumLiv(){
        return(this.numLiv);
    }
    public boolean getDisponible(){
        return(this.disponible);
    }
    public void emprunter(etudiant e){
        this.emprunter = e;
        this.disponible = false;
    }
    public void retourner(){
        this.emprunter = null;
        this.disponible = true;
    }
}