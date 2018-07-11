package apresentacao;

import dominio.Area;
import dominio.Clique;
import dominio.Controle;
import dominio.Coordenadas;
import dominio.Incone;
import dominio.Regiao;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rubens Augusto e Artur
 */
public class Apresentacao extends javax.swing.JFrame {

    DateFormat df = DateFormat.getDateTimeInstance();
    Controle ctrl = new Controle();
    int nmrClique = 0;
    //total de incones e regiões na tela
    ArrayList<Area> total = new ArrayList();

    public Apresentacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnRegistrarIncone = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        coorIncX = new javax.swing.JTextField();
        coorIncY = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tamanhoPadrao = new javax.swing.JLabel();
        tamanhoInconeX = new javax.swing.JTextField();
        tamanhoPadrao2 = new javax.swing.JLabel();
        tamanhoInconeY = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        xClique = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        yClique = new javax.swing.JTextField();
        btnClicar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        numeroCliques = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrarRegiao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tamanhoRegiaoX = new javax.swing.JTextField();
        tamanhoRegiaoY = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        coorX = new javax.swing.JTextField();
        coorY = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lmprLinha = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        jComboBoxAreas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Íncone"));

        btnRegistrarIncone.setText("Registrar");
        btnRegistrarIncone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarInconeActionPerformed(evt);
            }
        });

        jLabel1.setText("Coordenadas:");

        coorIncX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coorIncXActionPerformed(evt);
            }
        });

        jLabel3.setText("X:");

        jLabel4.setText("Y:");

        jPanel2.setEnabled(false);

        tamanhoPadrao.setText("Tamanho padrão:");

        tamanhoInconeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoInconeXActionPerformed(evt);
            }
        });

        tamanhoPadrao2.setText("Por");

        tamanhoInconeY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoInconeYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tamanhoInconeX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamanhoPadrao2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamanhoInconeY, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tamanhoPadrao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tamanhoPadrao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanhoInconeX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanhoPadrao2)
                    .addComponent(tamanhoInconeY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coorIncX, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coorIncY, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnRegistrarIncone)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(coorIncX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(coorIncY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarIncone))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Clique"));

        jLabel12.setText("Seleciona as coordenadas:");

        xClique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xCliqueActionPerformed(evt);
            }
        });

        jLabel13.setText("X:");

        jLabel14.setText("Y:");

        yClique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yCliqueActionPerformed(evt);
            }
        });

        btnClicar.setText("Clicar");
        btnClicar.setEnabled(false);
        btnClicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicarActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero De Cliques:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroCliques)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xClique, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yClique))
                    .addComponent(jLabel12))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClicar))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xClique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(yClique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numeroCliques))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnClicar))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nova Região"));

        btnRegistrarRegiao.setText("Registrar");
        btnRegistrarRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRegiaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamanho");

        tamanhoRegiaoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoRegiaoXActionPerformed(evt);
            }
        });

        jLabel6.setText("Por");

        jLabel7.setText("Coordenada central:");

        jLabel8.setText("X:");

        jLabel9.setText("Y:");

        coorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coorXActionPerformed(evt);
            }
        });

        coorY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coorYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tamanhoRegiaoX, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tamanhoRegiaoY, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coorX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coorY, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrarRegiao))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanhoRegiaoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanhoRegiaoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(coorX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coorY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnRegistrarRegiao))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data/Hora", "Clique", "Item Selecionado", "Distância"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lmprLinha.setText("Limpar");
        lmprLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmprLinhaActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Coordenadas"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnExcluir.setText("Excluir:");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jComboBoxAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAreasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lmprLinha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lmprLinha)
                    .addComponent(btnExcluir)
                    .addComponent(jComboBoxAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarInconeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarInconeActionPerformed
        //Verifica se não tem nenhum valor vazio
        if (coorIncX.getText().isEmpty() || coorIncY.getText().isEmpty()
                || tamanhoInconeX.getText().isEmpty() || tamanhoInconeY.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Coordenadas vazias");
        } else if(coorIncX.getText().matches("[0-9]+") == false ||
                coorIncX.getText().matches("[0-9]+") == false ||
                tamanhoInconeX.getText().matches("[0-9]+") == false||
                tamanhoInconeY.getText().matches("[0-9]+") == false){
                JOptionPane.showMessageDialog(this, "Coordenadas invalidas!");
        
        }else {
            //Pega o tamanho e desailita a função de digitar novamente , Caso o botão clicar esteja desativado
            //a função setEnabled ira ativar ele 
            btnClicar.setEnabled(true);
            String nome = "Incone " + ctrl.getIndiceNumero();
            tamanhoInconeX.setEnabled(false);
            tamanhoInconeY.setEnabled(false);
            tamanhoPadrao.setEnabled(false);
            tamanhoPadrao2.setEnabled(false);
            //Pega os valores e cria uma coordenada e incone
            int x = Integer.parseInt(coorIncX.getText());
            int y = Integer.parseInt(coorIncY.getText());
            Coordenadas cdr = new Coordenadas(x, y);
            int x2 = Integer.parseInt(tamanhoInconeX.getText());
            int y2 = Integer.parseInt(tamanhoInconeY.getText());
            Incone icn = new Incone(nome, cdr, x2, y2);
            ctrl.addIncone(icn);
            jComboBoxAreas.addItem(nome);
            total.add(icn);
            //Adiciona na tabela de Areas cadastradas
            String incone = nome;
            String coord = cdr.getX() + "," + cdr.getY();
            Object[] row = {incone, coord};
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.addRow(row);
            jTable2.setModel(model);
        }


    }//GEN-LAST:event_btnRegistrarInconeActionPerformed

    private void coorIncXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coorIncXActionPerformed

    }//GEN-LAST:event_coorIncXActionPerformed

    private void tamanhoInconeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoInconeXActionPerformed

    }//GEN-LAST:event_tamanhoInconeXActionPerformed

    private void tamanhoInconeYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoInconeYActionPerformed

    }//GEN-LAST:event_tamanhoInconeYActionPerformed

    private void xCliqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xCliqueActionPerformed

    }//GEN-LAST:event_xCliqueActionPerformed

    private void yCliqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yCliqueActionPerformed

    }//GEN-LAST:event_yCliqueActionPerformed

    private void btnRegistrarRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRegiaoActionPerformed
        if(coorX.getText().isEmpty() || coorY.getText().isEmpty()
           || tamanhoRegiaoX.getText().isEmpty() || tamanhoRegiaoY.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Coordenadas vazias");
            
        
        }else if(coorX.getText().matches("[0-9]+") == false ||
                coorY.getText().matches("[0-9]+") == false ||
                tamanhoRegiaoX.getText().matches("[0-9]+") == false||
                tamanhoRegiaoY.getText().matches("[0-9]+") == false){
                JOptionPane.showMessageDialog(this, "Coordenadas invalidas");
        
        }else{
        btnClicar.setEnabled(true);
        //Pega os valores e cria uma coordenada e uma regiao
        String letra = "Regiao " + ctrl.getLetra();
        int x = Integer.parseInt(coorX.getText());
        int y = Integer.parseInt(coorY.getText());
        Coordenadas cdr = new Coordenadas(x, y);
        int x2 = Integer.parseInt(tamanhoRegiaoX.getText());
        int y2 = Integer.parseInt(tamanhoRegiaoY.getText());
        Coordenadas iniciais = new Coordenadas((x - (x2 / 2)), (y - (y2 / 2)));
        Coordenadas finais = new Coordenadas((x + (x2 / 2)), (y + (y2 / 2)));
        Regiao rg = new Regiao(letra, x2, y2, cdr);
        rg.setIniciais(iniciais);
        rg.setFinais(finais);
        ctrl.addRegiao(rg);
        jComboBoxAreas.addItem(letra);
        total.add(rg);
        //Adiciona na tabela as Areas cadastradas
        String regiao = letra;
        String coord = cdr.getX() + "," + cdr.getY();
        Object[] row = {regiao, coord};
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(row);
        jTable2.setModel(model);

        }
        
    }//GEN-LAST:event_btnRegistrarRegiaoActionPerformed

    private void tamanhoRegiaoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoRegiaoXActionPerformed

    }//GEN-LAST:event_tamanhoRegiaoXActionPerformed

    private void coorYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coorYActionPerformed

    }//GEN-LAST:event_coorYActionPerformed

    private void btnClicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClicarActionPerformed
        //Verifica se o clique não está vazio e caso sim ele mostra uma tela
        if (xClique.getText().isEmpty() || yClique.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Coordenada Vazia");
        }else if(xClique.getText().matches("[0-9]+") == false ||
                yClique.getText().matches("[0-9]+") == false 
                ){
                JOptionPane.showMessageDialog(this, "Coordenadas invalidas");
        
        } else {
            //Pega os valores inseridos e cria um Clique e uma Coordenada e então registra o clique e a area que ele selecionou
            int x = Integer.parseInt(xClique.getText());
            int y = Integer.parseInt(yClique.getText());
            Coordenadas cdrClk = new Coordenadas(x, y);
            Date data = new Date();
            Clique clk = new Clique(df.format(data), cdrClk);
            nmrClique++;
            numeroCliques.setText(" " + Integer.toString(nmrClique));
            clk.setRegiao(ctrl.selecionarArea(cdrClk));
            ctrl.addClique(clk);

            //Adiciona os valores na tabela inferior
            String dataHora = clk.getDataClique();
            String clkCoor = Integer.toString(clk.getCoordenadas().getX()) + "," + Integer.toString(clk.getCoordenadas().getY());
            String itemSelec = ctrl.selecionarArea(cdrClk).getNome();
            String dist = Double.toString(ctrl.getUltmaDistancia());
            Object[] row = {dataHora, clkCoor, itemSelec, dist};
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(row);
            jTable1.setModel(model);
        }

        //jScrollPane3.setViewportView(jTable3);

    }//GEN-LAST:event_btnClicarActionPerformed

    private void coorXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coorXActionPerformed

    }//GEN-LAST:event_coorXActionPerformed

    private void lmprLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmprLinhaActionPerformed
        //Limpa o conteudo da tabela
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        int rowCount = dm.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        jTable1.setModel(dm);
    }//GEN-LAST:event_lmprLinhaActionPerformed

    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       //Excluir uma area da tabela e da lista de Areas
        String nome = (String) jComboBoxAreas.getSelectedItem();
       DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
       //Se começar com I é um incone
       if(Character.toString(nome.charAt(0)).equals("I")){
           
           ctrl.removerIncone(nome);
           //percore a lista de total e remove o  incone selecionado na combo box
           for (int i = 0; i < total.size(); i++) {
               if(total.get(i).getNome().equals(nome)){
                   total.remove(i);
                   jComboBoxAreas.removeItemAt(i);
                   model.removeRow(i);
                   
               }
           }
           jTable2.setModel(model);
           if(total.isEmpty()){
               btnClicar.setEnabled(false);
           }
           
           
       }else{
          //se não é uma regiao 
          ctrl.removerRegiao(nome);
          //percore a lista de total e remove a area selecionada na combo box
           for (int i = 0; i < total.size(); i++) {
               if(total.get(i).getNome().equals(nome)){
                   total.remove(i);
                   jComboBoxAreas.removeItemAt(i);
                   model.removeRow(i);
               }
           }
           jTable2.setModel(model);
           if(total.isEmpty()){
               btnClicar.setEnabled(false);
           }
       }
       
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jComboBoxAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAreasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAreasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClicar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRegistrarIncone;
    private javax.swing.JButton btnRegistrarRegiao;
    private javax.swing.JTextField coorIncX;
    private javax.swing.JTextField coorIncY;
    private javax.swing.JTextField coorX;
    private javax.swing.JTextField coorY;
    private javax.swing.JComboBox<String> jComboBoxAreas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton lmprLinha;
    private javax.swing.JLabel numeroCliques;
    private javax.swing.JTextField tamanhoInconeX;
    private javax.swing.JTextField tamanhoInconeY;
    private javax.swing.JLabel tamanhoPadrao;
    private javax.swing.JLabel tamanhoPadrao2;
    private javax.swing.JTextField tamanhoRegiaoX;
    private javax.swing.JTextField tamanhoRegiaoY;
    private javax.swing.JTextField xClique;
    private javax.swing.JTextField yClique;
    // End of variables declaration//GEN-END:variables
}
