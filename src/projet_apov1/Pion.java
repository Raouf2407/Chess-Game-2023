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
public class Pion extends Piece{
    public Pion(String couleur,Case occupee){
        super(couleur,occupee);
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<Case> casesMenacees(){
        ArrayList<Case> caseM=new ArrayList<>();
        int i=this.caseOccupee.getChiffre();
        char o=this.caseOccupee.getLettre();
        int j= (int) o - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        if (this.couleur.equals("blanc")){
            if(j<8){
                caseM.add(this.getEchiquier().getPlateau()[i+1][j+1]);
            }
            if(j>0){
                caseM.add(this.getEchiquier().getPlateau()[i+1][j-1]);
            }
            // cas en passant à étudier
        }
        if (this.couleur.equals("noir")){
            if(j<8){
                caseM.add(this.getEchiquier().getPlateau()[i-1][j+1]);
            }
            if(j>0){
                caseM.add(this.getEchiquier().getPlateau()[i-1][j-1]);
            }
            // cas en passant à étudier
        }
        
        return(caseM);
    }
    public ArrayList<Case> casesAccessibles(){
        ArrayList<Case> caseA=new ArrayList<>();
        int n=this.caseOccupee.getChiffre();
        char o=this.caseOccupee.getLettre();
        int k= (int) o - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
        if(this.couleur.equals("blanc")){
            if(!this.aEteDeplacee && this.getCaseOccupee().getEchiquier().getPlateau()[n-2][k].getOccupant()==null){
                caseA.add(this.getCaseOccupee().getEchiquier().getPlateau()[n-2][k]);
            }
            if(this.getCaseOccupee().getEchiquier().getPlateau()[n-1][k].getOccupant()==null){
                caseA.add(this.getCaseOccupee().getEchiquier().getPlateau()[n-1][k]);
            }
        }
        else{if(!this.aEteDeplacee && this.getCaseOccupee().getEchiquier().getPlateau()[n+2][k].getOccupant()==null){
                caseA.add(this.getCaseOccupee().getEchiquier().getPlateau()[n+2][k]);
            }
            if(this.getCaseOccupee().getEchiquier().getPlateau()[n+1][k].getOccupant()==null){
                caseA.add(this.getCaseOccupee().getEchiquier().getPlateau()[n+1][k]);
            }
        }
        return(caseA);
    }

    
    
    @Override
    public String toString()
    {
        return "P, "+ this.couleur;
    }
    
    @Override
    public void deplacer(Case c){
        int n=this.getCaseOccupee().getChiffre();
        char o=this.getCaseOccupee().getLettre();
        int k=(int) o - (int) this.getCaseOccupee().getEchiquier().getPlateau()[0][0].getLettre();
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
                    this.getEchiquier().nouvelleMemoire();
                    this.getEchiquier().changerJoueur();
                }
            }
        }
        if(this.casesAccessibles().contains(c)){
            this.caseOccupee.setOccupant(null);
            c.setOccupant(this);
            if (this.couleur.equals("blanc")){
                if(this.aEteDeplacee==false && 
                c.getChiffre()==(this.getCaseOccupee().getChiffre()-2) && 
                this.getEchiquier().getPlateau()[n-2][k]==null){
                    this.caseOccupee.setOccupant(null);
                    c.setOccupant(this);
                    for(int i=0;i<8;i++){
                        for(int j=0;j<8;j++){
                            if(this.getEchiquier().getPlateau()[i][j].getOccupant() instanceof Pion){
                                if (this.getEchiquier().getPlateau()[i][j].getOccupant().getEnPassant()==true){
                                    this.getEchiquier().getPlateau()[i][j].getOccupant().setEnPassant(false);
                                }
                            }
                        }
                    }
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
                    this.enPassant=true;

                }
                
            }
            else{
                if(this.aEteDeplacee==false && 
                c.getChiffre()==(this.getCaseOccupee().getChiffre()+2) && 
                this.getCaseOccupee().getEchiquier().getPlateau()[n+2][k]==null){
                    this.caseOccupee.setOccupant(null);
                    c.setOccupant(this);
                    this.enPassant=true;
                    this.aEteDeplacee=false;
                    for(int i=0;i<8;i++){
                        for(int j=0;j<8;j++){
                            if(this.getEchiquier().getPlateau()[i][j].getOccupant() instanceof Pion){
                                if ( this.getEchiquier().getPlateau()[i][j].getOccupant().getEnPassant()==true){
                                    this.getEchiquier().getPlateau()[i][j].getOccupant().setEnPassant(false);
                                }
                            }
                        }
                    }
                }
            }
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
        
        else{
            // La pièce ne peut pas se déplacer vers une case non menacée.
    
        }
    }
}



