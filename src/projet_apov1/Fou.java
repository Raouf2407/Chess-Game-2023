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
public class Fou extends Piece{
    /**
     * Constructeur de la classe Tour.
     *
     * @param couleur La couleur de la pièce ("Blanc" ou "Noir").
     * @param occupee La case sur laquelle la pièce est initialement positionnée.
     */
    public Fou(String couleur,Case occupee){
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
        int kp=this.caseOccupee.getChiffre();
        int km=this.caseOccupee.getChiffre();
        char op=this.caseOccupee.getLettre();
        char om=this.caseOccupee.getLettre();
        int np= (int) op - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        int nm= (int) om - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        while(kp<7 && np<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][np+1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][np+1].getOccupant().couleur)){ 
                break;
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][np+1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][np+1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][np+1]);
                break;
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][np+1]);
                kp++;
                np++;
            }
        }
        while(kp<7 && nm>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][nm-1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][nm-1].getOccupant().couleur)){ 
                break;
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][nm-1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][nm-1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][nm-1]);
                break;
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[kp+1][nm-1]);
                kp++;
                nm--;
            }
        }
        while(km<0 && np<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[km-1][np+1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[km-1][np+1].getOccupant().couleur)){ 
                break;
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[km-1][np+1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[km-1][np+1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[km-1][np+1]);
                break;
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[km-1][np+1]);
                km--;
                np++;
            }
        }
        while(km>0 && nm>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[km-1][nm-1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[km-1][nm-1].getOccupant().couleur)){ 
                break;
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[km-1][nm-1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[km-1][nm-1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[km-1][nm-1]);
                break;
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[km-1][nm-1]);
                km--;
                nm--;
            }
        }
            return(caseM);
        }
    @Override
    public String toString()
    {
        return "F, "+ this.couleur;
    }
}
