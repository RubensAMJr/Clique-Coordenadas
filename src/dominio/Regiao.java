/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rubens Augusto e Artut
 */
public class Regiao extends Area {

    private int tamanhoX;
    private int tamanhoY;

    public Regiao(String nome, int tamanhoX, int tamanhoY, Coordenadas coordenadas) {
        super(coordenadas);

        this.tamanhoX = tamanhoX;
        this.tamanhoY = tamanhoY;
        this.setNome(nome);
    }

    public int getTamanhoX() {
        return tamanhoX;
    }

    public void setTamanhoX(int tamanhoX) {
        if (tamanhoX > 499 || tamanhoX < 0) {
            JOptionPane.showMessageDialog(null, "Tamanho X  da Regiao invalido");
            throw new IllegalArgumentException("Tamanho X  da Regiao invalido");
        }
        this.tamanhoX = tamanhoX;
    }

    public int getTamanhoY() {
        return tamanhoY;
    }

    public void setTamanhoY(int TamanhoY) {
        if (tamanhoY > 499 || tamanhoY < 0) {
            JOptionPane.showMessageDialog(null, "Tamanho Y  da Regiao invalido");
            throw new IllegalArgumentException("Tamanho Y  da Regiao invalido");
        }
        this.tamanhoY = TamanhoY;
    }

}
