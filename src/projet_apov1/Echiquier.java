/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_apov1;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Echiquier {
    private ArrayList<ArrayList<Echiquier>> memoire = new ArrayList<>();
    /**
     * Indique le joueur qui doit jouer.
     */
    private String joueur="blanc";
    /**
     * Indique si la partie est un nulle.
     */
    private boolean partieNulle=false;
    
     /**
     * Le plateau d'échecs représenté par un tableau bidimensionnel de cases.
     */
    private final Case[][] plateau;
    /**
     * Constructeur privé de la classe Echiquier.
     * Initialise le plateau et le remplit avec des instances de la classe Case.
     */
    public Echiquier(){
        this.plateau =new Case[8][8]; 
        this.initialiserPlateau();
    }
    /**
     * Initialise le plateau avec des cases en alternance de couleur blanche et noire.
     */
    private void initialiserPlateau(){
        char x='A';
        String n="noir";
        String b="blanc";
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if ((i+j)%2==0){
                    plateau[j][i]=new Case(this,b,x,8-j);
                }
                else{
                    plateau[j][i]=new Case(this,n,x,8-j);
                }
            }
            x++;
        }
        for (int i=0;i<8;i++){
            plateau[1][i].setOccupant(new Pion("noir",plateau[1][i]));
            plateau[6][i].setOccupant(new Pion("blanc",plateau[6][i]));
        }
        plateau[0][0].setOccupant(new Tour("noir",plateau[0][0]));
        plateau[7][0].setOccupant(new Tour("blanc",plateau[7][0]));
        plateau[0][7].setOccupant(new Tour("noir",plateau[0][7]));
        plateau[7][7].setOccupant(new Tour("blanc",plateau[7][7]));
        plateau[0][1].setOccupant(new Cavalier("noir",plateau[0][1]));
        plateau[7][1].setOccupant(new Cavalier("blanc",plateau[7][1]));
        plateau[0][6].setOccupant(new Cavalier("noir",plateau[0][6]));
        plateau[7][6].setOccupant(new Cavalier("blanc",plateau[7][6]));
        plateau[0][2].setOccupant(new Fou("noir",plateau[0][2]));
        plateau[7][2].setOccupant(new Fou("blanc",plateau[7][2]));
        plateau[0][5].setOccupant(new Fou("noir",plateau[0][5]));
        plateau[7][5].setOccupant(new Fou("blanc",plateau[7][5]));
        plateau[0][3].setOccupant(new Reine("noir",plateau[0][3]));
        plateau[7][3].setOccupant(new Reine("blanc",plateau[7][3]));
        plateau[0][4].setOccupant(new Roi("noir",plateau[0][3]));
        plateau[7][4].setOccupant(new Roi("blanc",plateau[7][3]));
    }
    
    /**
     * Obtient le plateau d'échecs représenté par un tableau bidimensionnel de cases.
     *
     * @return Le plateau d'échecs.
     */
    public Case[][] getPlateau(){
        return this.plateau;
    }
           
    
    @Override
    public String toString()
    {
        String plat = "";
        for(int i = 0; i<8; i++)
        {
            for(int j = 0; j<8; j++)
            {
                plat = plat + this.plateau[i][j].toString() + "; ";
            }
            plat = plat + "\n";
        }
        return plat;
    }
    public int nombreCaseNulle(){
        int s=0;
        for (int i=0;i<8;i++){
            for (int j=0;i<8;j++){
                if(this.plateau[i][j].getOccupant()==null){
                    s++;
                }
            }
        }
        return(s);
    }
    public boolean getPartieNulle(){
        return(this.partieNulle);
    }
       
    public String getJoueur(){
        return(this.joueur);
    }

    
    public void changerJoueur(){
        if (this.joueur.equals("blanc")){
            this.joueur="noir";
        }
        else{
            this.joueur="blanc";
        }
    }
    public void nouvelleMemoire(){
        this.memoire=new ArrayList<>();
        ArrayList<Echiquier> A=new ArrayList<>();
        A.add(this);
        this.memoire.add(A);
    }
    public void ajouterMemoire(Echiquier this){
        for (int i=0;i<this.memoire.size();i++){
            if (this.memoire.get(i).get(0)==this){
                this.memoire.get(i).add(this);
            }
            else{
                ArrayList<Echiquier> A=new ArrayList<>();
                A.add(this);
                this.memoire.add(A);
            }
        }
        for (int i=0;i<this.memoire.size();i++){
            if(this.memoire.get(i).size()==3){
                this.partieNulle=true;
            }
        }
    }
    public Roi getRoi(String couleur){
        Roi r = null;
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if (this.getPlateau()[i][j].getOccupant() instanceof Roi && this.getPlateau()[i][j].getOccupant().getCouleur().equals(couleur)){
                    r=(Roi) this.getPlateau()[i][j].getOccupant();
                }
            }
        }
        return(r);
    }
    public Echiquier getDernierEchiquier(){
        return(this.memoire.get(this.memoire.size()-1).get(0));
    }
    public void revenirEchiquier(){
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                this.plateau[i][j]=this.getDernierEchiquier().plateau[i][j];
            }
        }
    }

}
