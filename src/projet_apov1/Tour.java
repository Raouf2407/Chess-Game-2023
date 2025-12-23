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
public class Tour extends Piece{
    /**
     * Constructeur de la classe Tour.
     *
     * @param couleur La couleur de la pièce ("Blanc" ou "Noir").
     * @param occupee La case sur laquelle la pièce est initialement positionnée.
     */
    public Tour(String couleur,Case occupee){
        super(couleur,occupee);
    }
     /**
     * Calcule et retourne la liste des cases menacées par la Tour sur l'échiquier.
     *
     * @return Une ArrayList contenant les cases menacées par la Tour.
     */
    @Override
    public ArrayList<Case> casesMenacees(){
        ArrayList<Case> caseM=new ArrayList<>();
        int i=this.caseOccupee.getChiffre();
        int ip=this.caseOccupee.getChiffre();
        int im=this.caseOccupee.getChiffre();
        char lp=this.caseOccupee.getLettre();
        char lm=this.caseOccupee.getLettre();
        int j= (int) lp - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        int jp= (int) lp - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        int jm= (int) lm - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        while(ip<7){
            if(this.getCaseOccupee().getEchiquier().getPlateau()[ip+1][j].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[ip+1][j].getOccupant().couleur)){ 
                break;
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[ip+1][j].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[ip+1][j].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[ip+1][j]);
                break;
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[ip+1][j]);
                ip++;
            }
        }
        while(im>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[im-1][j].getOccupant()!=null &&
                this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[im-1][j].getOccupant().couleur)){ 
                break;
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[im-1][j].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[im-1][j].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[im-1][j]);
                break;
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[im-1][j]);
                im--;
            }
        }
        while(jp<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i][jp+1].getOccupant()!=null &&
                this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i][jp+1].getOccupant().couleur)){ 
                break;
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i][jp+1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i][jp+1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i][jp+1]);
                break;
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i][jp+1]);
                jp++;
            }
        }
        while(jm>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i][jm-1].getOccupant()!=null &&
                this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i][jm-1].getOccupant().couleur)){ 
                break;
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i][jm-1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i][jm-1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i][jm-1]);
                break;
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i][jm-1]);
                jm--;
            }
        }
        return(caseM);
    }
    @Override
    public String toString()
    {
        return "T, "+ this.couleur;
    }
}
