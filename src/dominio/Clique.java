/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;

/**
 *
 * @author Rubens Augusto e Artur
 */
public class Clique extends Area{
    
    private String dataClique;
    private Area regiao;

    public Clique(String dataClique, Coordenadas coordenadas) {
        super(coordenadas);
        this.dataClique = dataClique;
    }

    public String getDataClique() {
        return dataClique;
    }

    public Area getRegiao() {
        return regiao;
    }

    public void setRegiao(Area regiao) {
        this.regiao = regiao;
    }
    
    

    public void setDataClique(String dataClique) {
        
        this.dataClique = dataClique;
    }
    
    
    
    
    
    
}
