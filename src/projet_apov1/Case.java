/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_apov1;

/**
 *
 * @author ASUS
 */
public class Case {
    private final Echiquier echiquier;
    /**
     * La couleur de la case (par exemple "blanche" ou "noire").
     */
    private final String couleur;
    /**
     * La lettre associée à la position de la case sur l'échiquier.
     */
    private final char lettre;
    /**
     * Le chiffre associé à la position de la case sur l'échiquier.
     */
    private final int chiffre;
    /**
     * La pièce qui occupe éventuellement cette case.
     */
    private Piece occupant;
    /**
     * Constructeur de la classe Case.
     *
     * @param couleur La couleur de la case.
     * @param lettre  La lettre associée à la position de la case.
     * @param chiffre Le chiffre associé à la position de la case.
     * @param echiquier L'echiquier sur lequel est présente la case.
     */
    public Case(Echiquier echiquier,String couleur,char lettre, int chiffre){
        this.echiquier=echiquier;
        this.chiffre=chiffre;
        this.couleur=couleur;
        this.lettre=lettre;
    }
    
    /**
     * Obtient la couleur de la case.
     *
     * @return La couleur de la case.
     */
    public String getCouleur(){
        return(this.couleur);
    }
    /**
     * Obtient l'échiquier sur lequel se trouve la case.
     *
     * @return L'échiquier de la case.
     */
    public Echiquier getEchiquier(){
        return(this.echiquier);
    }
    /**
     * Obtient la lettre associée à la position de la case sur l'échiquier.
     *
     * @return La lettre de la case.
     */
    public char getLettre(){
        return(this.lettre);
    }
    
    /**
     * Obtient le chiffre associé à la position de la case sur l'échiquier.
     *
     * @return Le chiffre de la case.
     */
    public int getChiffre(){
        return (this.chiffre);
    }
    
    /**
     * Obtient la pièce qui occupe éventuellement cette case.
     *
     * @return La pièce occupant la case, ou null si la case est vide.
     */
    public Piece getOccupant(){
        return(this.occupant);
    }
    
    /**
     * Définit la pièce qui occupe cette case.
     *
     * @param p La pièce à placer sur la case.
     */
    public void setOccupant(Piece p){
        this.occupant=p;
        if ( p!= null){
            p.setCaseOccupee(this);
        }     
    }
    
    /**
     * Vérifie si la case est menacée par une pièce du plateau.
     *
     * @return true si la case est menacée, sinon false.
     */
    public boolean estMenacee(){
        for(Case[] row : this.getEchiquier().getPlateau()){
            for(Case c:row){
                if(c.getOccupant()!=null && c.getOccupant().casesMenacees().contains(this)){
                    return(true);
                }
            }
        }
        return(false);
        
        }
    
    @Override
    public String toString()
    {
        if(this.occupant==null)
        {
            return this.lettre +""+ this.chiffre +", vide";
        }
        else
        {
            return this.lettre +""+ this.chiffre +", " +this.occupant.toString();
        }
    }
   
}
