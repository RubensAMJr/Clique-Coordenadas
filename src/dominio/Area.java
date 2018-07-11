/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Rubens Augusto e Artut
 */
public class Area {
    
    private String nome;
    private Coordenadas coordenadas;
    private Coordenadas iniciais;
    private Coordenadas finais;
    
    public Area(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }
    
    

    public Coordenadas getIniciais() {
        return iniciais;
    }

    public void setIniciais(Coordenadas iniciais) {
        this.iniciais = iniciais;
    }
    
    

    public Coordenadas getFinais() {
        return finais;
    }

    public void setFinais(Coordenadas finais) {
        this.finais = finais;
    }
    
    

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        if (coordenadas == null) {
            throw new IllegalArgumentException("Coordenada inválida");
        }
        this.coordenadas = coordenadas;
    }

}
