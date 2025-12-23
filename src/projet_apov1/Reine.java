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
public class Reine extends Piece{
    public Reine(String couleur,Case occupee){
        super(couleur,occupee);
    }
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
        int kp=this.caseOccupee.getChiffre();
        int km=this.caseOccupee.getChiffre();
        char op=this.caseOccupee.getLettre();
        char om=this.caseOccupee.getLettre();
        int np= (int) op - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        int nm= (int) om - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        
        while(ip<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[ip+1][j].getOccupant()!=null &&
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
        while(km>0 && np<7){
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
        return "D, "+ this.couleur;
    }
}
