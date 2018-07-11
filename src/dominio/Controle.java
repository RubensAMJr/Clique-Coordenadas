/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Rubens Augusto e Artur
 */
public class Controle {

    ArrayList<Incone> telaIncone;
    ArrayList<Regiao> telaRegiao;
    ArrayList<Clique> cliques;
    private int iNumero;
    private int iLetra;
    private String alfabeto;
    //ultima distancia a ser calculada
    private double ultmaDistancia;

    public Controle() {
        //Numero para controle de Nome de Incones
        iNumero = 1;
        //indice e alfabeto para Controle de Nome de Area
        iLetra = 0;
        alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        telaIncone = new ArrayList();
        telaRegiao = new ArrayList();
        cliques = new ArrayList();

    }

    public void addIncone(Incone incone) {
        if (incone == null) {
            throw new IllegalArgumentException("Incone invalido");

        }
        telaIncone.add(incone);
    }

    public void removerIncone(String nome) {
        //remove incone pelo nome
        for (int i = 0; i < telaIncone.size(); i++) {
            if (telaIncone.get(i).getNome().equals(nome)) {
                telaIncone.remove(i);
            }
        }

    }

    public void removerIncone(Incone icn) {
        //remove incone pelo objeto
        telaIncone.remove(icn);

    }

    public void addClique(Clique clique) {
        if (clique == null) {
            throw new IllegalArgumentException("Clique Invalido");
        }
        cliques.add(clique);
    }

    public double getUltmaDistancia() {
        return ultmaDistancia;
    }

    public void setUltmaDistancia(double ultmaDistancia) {
        this.ultmaDistancia = ultmaDistancia;
    }

    public void addRegiao(Regiao regiao) {
        if (regiao == null) {
            throw new IllegalArgumentException("Região invalida");

        }

        //Clona a lista para não dar ConcurrentModificationException
        //verifica se existe ja um incone nas coordenadas registradas
        ArrayList<Incone> clone = new ArrayList<>(telaIncone);

        for (Incone incone : clone) {
            if (incone.getCoordenadas().getX() >= regiao.getIniciais().getX() && incone.getCoordenadas().getX() <= regiao.getFinais().getX()) {
                if (incone.getCoordenadas().getY() >= regiao.getIniciais().getY() && incone.getCoordenadas().getY() <= regiao.getFinais().getY()) {
                    System.out.println("Removeu " + incone.getNome());
                    removerIncone(incone);

                }
            }
        }
        telaRegiao.add(regiao);
    }

    public void removerRegiao(String nome) {
        //Remove região pelo nome
        for (int i = 0; i < telaRegiao.size(); i++) {
            if (telaRegiao.get(i).getNome().equals(nome)) {
                telaRegiao.remove(i);
            }

        }
    }

    public void removerRegiao(Regiao regiao) {
        //remove região pelo objeto
        telaRegiao.remove(regiao);
    }

    public int getiLetra() {
        return iLetra;
    }

    public String getAlfabeto() {

        return alfabeto;
    }

    public ArrayList<Incone> getIncones() {
        return telaIncone;
    }

    public ArrayList<Regiao> getRegioes() {
        return telaRegiao;
    }

    public int getIndiceNumero() {
        iNumero++;
        return (iNumero - 1);
    }

    public String getLetra() {
        iLetra++;

        String letra = Character.toString(alfabeto.charAt(iLetra - 1));
        return letra;
    }

    public double distanciaDoisPontos(Coordenadas clk, Coordenadas area) {
        //Calcula a distancia utiliando a função hypot da classe math que retorna a raiz quadrada de x2 + y2
        double distancia = Math.hypot(clk.getX() - area.getX(), clk.getY() - area.getY());

        return distancia;
    }

    public Area selecionarArea(Coordenadas clk) {

        Area area = null;

        //Primeiro verifica se esta dentro de uma região caso o x e o y estiveram entre as coordenadas iniciais e finais
        for (Regiao regiao : telaRegiao) {
            if (clk.getX() >= regiao.getIniciais().getX() && clk.getX() <= regiao.getFinais().getX()) {

                if (clk.getY() >= regiao.getIniciais().getY() && clk.getY() <= regiao.getFinais().getY()) {

                    area = regiao;
                    setUltmaDistancia(0);

                }
            }
        }
        //caso não tenha selecionado nenhuma area ele ira calcular as distancias na lista de incones e selecionar a menor distancia
        if (area == null) {
            Double menorDist = 1000.0;

            for (Incone incone : telaIncone) {
                if (distanciaDoisPontos(clk, incone.getCoordenadas()) < menorDist) {
                    menorDist = distanciaDoisPontos(clk, incone.getCoordenadas());
                    area = incone;
                    setUltmaDistancia(distanciaDoisPontos(clk, incone.getCoordenadas()));
                }
            }
        }

        return area;

    }

}
