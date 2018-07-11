/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import javax.swing.JOptionPane;

/**
 *
 * @author Rubens Augusto e Artur
 */
public class Incone extends Area {
    
    
    private int tamanhoX;
    private int tamanhoY;
    

    public Incone(String nome, Coordenadas coordenadas,int tamanhoX,int tamanhoY) {
        super(coordenadas);
        this.tamanhoX = tamanhoX;
        this.tamanhoY = tamanhoY;
        this.setNome(nome);
        
    }

    public int getTamanhoX() {
        return tamanhoX;
    }

    public void setTamanhoX(int tamanhoX) {
        if(tamanhoX == 0 || tamanhoX < 0 || tamanhoX > 499){
            
            JOptionPane.showMessageDialog(null, "Tamanho X  do incone invalido");
            throw new IllegalArgumentException("Tamanho X  do incone invalido");
        }
        this.tamanhoX = tamanhoX;
    }

    public int getTamanhoY() {
        return tamanhoY;
    }

    public void setTamanhoY(int tamanhoY) {
        if(tamanhoY == 0 || tamanhoY < 0 || tamanhoY > 499){
            
            JOptionPane.showMessageDialog(null, "Tamanho Y  do incone invalido");
            throw new IllegalArgumentException("Tamanho Y  do incone invalido");
        }
        this.tamanhoY = tamanhoY;
    }
    
    
    

    

    
    
    
    
    
    
}
