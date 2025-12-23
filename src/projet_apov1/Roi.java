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
public class Roi extends Piece{
    public Roi(String couleur,Case occupee){
        super(couleur,occupee);
    }

    
    
    @Override
    public ArrayList<Case> casesMenacees(){
        ArrayList<Case> caseM=new ArrayList<>();
        int i=this.caseOccupee.getChiffre();
        char l=this.caseOccupee.getLettre();
        int j= (int) l - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        int k=this.caseOccupee.getChiffre();
        char o=this.caseOccupee.getLettre();
        int n= (int) o - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        
        if(i<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j]);
            }
        }
        if(i>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j].getOccupant()!=null &&
                this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j]);
            }
        }
        if(j<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i][j+1].getOccupant()!=null &&
                this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i][j+1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i][j+1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i][j+1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i][j+1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i][j+1]);
            }
        }
        if(j>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i][j-1].getOccupant()!=null &&
                this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i][j-1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i][j-1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i][j-1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i][j-1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i][j-1]);
            }
        }
        
        if(k<7 && n<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n+1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n+1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n+1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n+1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n+1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n+1]);
            }
        }
        if(k<7 && n>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-1]);
            }
        }
        if (k>0 && n<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+1]);
            }
        }
        if(k>0 && n>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n-1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n-1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n-1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n-1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n-1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n-1]);

            }
        }
        
        
        return(caseM);
    }
    @Override
    public String toString()
    {
        return "R, "+ this.couleur;
    }
}
