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
public class Coordenadas {

    private int x;
    private int y;

    public Coordenadas(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {

        if (x > 499 || x < 0) {
            JOptionPane.showMessageDialog(null, "Coordenada X Invalida");
            throw new IllegalArgumentException("Coordenada X Invalida");
        }else{
        this.x = x;
            
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 499 || y < 0) {
           JOptionPane.showMessageDialog(null, "Coordenada Y Invalida");
           throw new IllegalArgumentException("Coordenada Y Invalida");
        }else{
        this.y = y;
            
        }
    }

}
