/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_apov1;

/**
 *
 * @author MATT
 */
public class Temps 
{/***
 
 */
    
    /**
	
	
	/**
	 * Temps en seconde
	 */
	private int s;
	
	/**
	 * Temps en minute
	 */
	private int m;
	
	/**
	 * Couleur du chrono, truc si blanc
	 */
	private boolean estBlanc;
	
	/**
	 * Mise en pause du thread
	 */
	private boolean pause = false;
	
	/**
	 * Constructeur
	 */
	public Temps(){
		
	}
	
	/**
	 * Constructeur
	 * @param m minute
	 * @param s seconde
	 * @param estBlanc vrai si c'est un chrono du joueur blanc
	 */
	public Temps(int m, int s, boolean estBlanc){
		this.s = s;
		this.m = m;
		this.estBlanc = estBlanc;
	}
	

	
	/**
	 * Active / desactive la mise en pause du thread
	 * @param pause
	 */
	public void pause(boolean pause){
		this.pause = pause;
	}
	
	@Override
	public String toString(){
		String contenu = "";
		if(m < 10){
			contenu += "0"+m;
		}else{
			contenu += m;
		}
		
		if(s < 10){
			contenu += "0"+s;
		}else{
			contenu += s;
		}
		return contenu;
	}
	
	/**
	 * Renvoie le nombre de secondes
	 * @return
	 */
	public int getSeconde(){
		return s;
	}
	
	/**
	 * Renvoie le nombre de minutes
	 * @return
	 */
	public int getMinute(){
		return m;
	}
	
	/**
	 * Configure le nombre de secondes
	 * @param sec le nombre de secondes
	 */
	public void setSeconde(int sec){
		this.s = sec;
	}
	
	/**
	 * Configure le nombre de minutes
	 * @param min
	 */
	public void setMinute(int min){
		this.m = min;
	}
    
    
}
