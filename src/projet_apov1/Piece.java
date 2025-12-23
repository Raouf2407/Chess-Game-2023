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
public abstract class Piece {
    protected boolean estEnEchec=false;
    protected boolean enPassant=false;
    /**
     * Indique si la pièce a été déplacée ou non.
     */
    protected boolean aEteDeplacee=false;
     /**
     * La couleur de la pièce ("blanche" ou "noire").
     */
    protected final String couleur;
     /**
     * La case sur laquelle la pièce est actuellement positionnée.
     */
    protected Case caseOccupee;
    /**
     * Constructeur de la classe Piece.
     *
     * @param couleur           La couleur de la pièce.
     * @param occupee           La case occupée par la pièce.
     */
    
    
    public Piece(String couleur,Case occupee){
        this.couleur=couleur;
        this.caseOccupee=occupee;
    }
    
    /**
     * Obtient la couleur de la pièce.
     *
     * @return La couleur de la pièce.
     */
    public String getCouleur(){
        return(this.couleur);
    }
    public boolean isEstEnEchec() {
        return estEnEchec;
    }
    public void echec(){
        this.estEnEchec = this.getCaseOccupee().estMenacee();
    }
    
    /**
     * Obtient la case sur laquelle la pièce est actuellement positionnée.
     *
     * @return La case occupée par la pièce.
     */
    public Case getCaseOccupee(){
        return(this.caseOccupee);
    }

    /**
     * Définit la case sur laquelle la pièce est actuellement positionnée.
     *
     * @param c La nouvelle case occupée par la pièce.
     */
    public void setCaseOccupee(Case c){
        this.caseOccupee=c;
    }
    
    /**
     * Déplace la pièce vers une nouvelle case spécifiée.
     *
     * @param c La nouvelle case vers laquelle la pièce se déplace.
     */
    public void deplacer(Case c){
        if(this.casesMenacees().contains(c)){   
            if (c.getOccupant()==null){
                this.caseOccupee.setOccupant(null);
                c.setOccupant(this);
                if (this.getEchiquier().getRoi(this.couleur).estEnEchec==true){
                    this.getEchiquier().revenirEchiquier();
                }
                else{
                    if(this.aEteDeplacee==false){
                        this.aEteDeplacee=true;
                    }
                    this.getEchiquier().ajouterMemoire();
                    this.getEchiquier().changerJoueur();
                }
                
                
                
            }
            else if(!this.couleur.equals(c.getOccupant().couleur)){
                this.caseOccupee.setOccupant(null);
                c.setOccupant(this);
                if (this.getEchiquier().getRoi(this.couleur).estEnEchec==true){
                    this.getEchiquier().revenirEchiquier();
                }
                else{
                    if(this.aEteDeplacee==false){
                        this.aEteDeplacee=true;
                    }
                    this.getEchiquier().nouvelleMemoire();
                    this.getEchiquier().changerJoueur();
                }
            }
            else if(this.couleur.equals(c.getOccupant().couleur)){ 
                // La pièce ne peut pas se déplacer sur une case occupée par une pièce de même couleur.
            }
        }
        else{
            // La pièce ne peut pas se déplacer vers une case non menacée.
    
        }
    }
    public Echiquier getEchiquier(){
        return(this.getCaseOccupee().getEchiquier());
    }
    /**
     * Retourne la liste des cases menacées par la pièce.
     *
     * @return Une ArrayList de cases menacées par la pièce.
     */
    public abstract ArrayList<Case> casesMenacees();
    /**
     * Détermine si la pièce a déjà été déplacée plus d'une fois.
     *
     * @return un boolean.
     */
    public boolean getAEteDeplacee(){
        return(this.aEteDeplacee);
    }
    
    public boolean getEnPassant(){
        return(this.enPassant);
    }
    public void setEnPassant(boolean b){
        this.enPassant=b;
    }

}
