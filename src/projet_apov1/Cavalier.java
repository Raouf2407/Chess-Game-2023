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
public class Cavalier extends Piece{
    public Cavalier(String couleur,Case occupee){
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
        
        if(i<6 && j<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i+2][j+1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[i+2][j+1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i+2][j+1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i+2][j+1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i+2][j+1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i+2][j+1]);
            }
        }
        if(i>1 && j<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i-2][j+1].getOccupant()!=null &&
                this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i-2][j+1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i-2][j+1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i-2][j+1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i-2][j+1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i-2][j+1]);
            }
        }
        if(j<6 && i<7){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j+2].getOccupant()!=null &&
                this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j+2].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j+2].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j+2].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j+2]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i+1][j+2]);
            }
        }
        while(j>1 && i>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j-2].getOccupant()!=null &&
                this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j-2].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j-2].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j-2].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j-2]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[i-1][j-2]);
            }
        }
        
        if(k>0 && n<6){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+2].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+2].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+2].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+2].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+2]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k-1][n+2]);
            }
        }
        if(k<7 && n>1){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-2].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-2].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-2].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-2].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-2]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k+1][n-2]);
            }
        }
        if (k>1 && n>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[k-2][n-1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[k-2][n-1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[k-2][n-1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[k-2][n-1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k-2][n-1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k-2][n-1]);
            }
        }
        if(k<6 && n>0){
            if( this.getCaseOccupee().getEchiquier().getPlateau()[k+2][n-1].getOccupant()!=null &&
                this.couleur.equals( this.getCaseOccupee().getEchiquier().getPlateau()[k+2][n-1].getOccupant().couleur)){ 
            }
            else if(this.getCaseOccupee().getEchiquier().getPlateau()[k+2][n-1].getOccupant()!=null &&
                ! this.couleur.equals(this.getCaseOccupee().getEchiquier().getPlateau()[k+2][n-1].getOccupant().couleur)){
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k+2][n-1]);
            }
            else{
                caseM.add(this.getCaseOccupee().getEchiquier().getPlateau()[k+2][n-1]);

            }
        }
        
        
        return(caseM);
    }
    @Override
    public String toString()
    {
        return "C, "+ this.couleur;
    }
}
