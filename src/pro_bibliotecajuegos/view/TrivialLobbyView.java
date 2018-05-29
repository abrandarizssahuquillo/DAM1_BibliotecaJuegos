/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_bibliotecajuegos.view;

import java.awt.Color;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import pro_bibliotecajuegos.controller.TrivialController;
import pro_bibliotecajuegos.model.TrivialPlayerModel;

/**
 *
 * @author Hansen
 */
public class TrivialLobbyView extends javax.swing.JFrame {

    String nombre = JOptionPane.showInputDialog("Nombre del jugador 1:");
    String nombre2 = JOptionPane.showInputDialog("Introduce el nombre del jugador 2:");
    TrivialPlayerModel player1 = new TrivialPlayerModel(nombre, 0, true);
    TrivialPlayerModel player2 = new TrivialPlayerModel(nombre2, 0, false);
    TrivialController control = new TrivialController();
    String listaPro = "FicheroPreguntasPRO.txt";
    String listaSis = "FicheroPreguntasSI.txt";
    String listaBds = "FicheroPreguntasBD.txt";
    String listaLmsxi = "FicheroPreguntasLMSXI.txt";
    String listaFol = "FicheroPreguntasFOL.txt";
    String listaCod = "FicheroPreguntasCOD.txt";
    File fichero;

    /**
     * Creates new form TrivialLobbyView
     */
    public TrivialLobbyView() {
        initComponents();
    }

    public JTextField getJtBds() {
        return jtBds;
    }

    public void setJtBds(JTextField jtBds) {
        this.jtBds = jtBds;
    }

    public JTextField getJtBds2() {
        return jtBds2;
    }

    public void setJtBds2(JTextField jtBds2) {
        this.jtBds2 = jtBds2;
    }

    public JTextField getJtCod() {
        return jtCod;
    }

    public void setJtCod(JTextField jtCod) {
        this.jtCod = jtCod;
    }

    public JTextField getJtCod2() {
        return jtCod2;
    }

    public void setJtCod2(JTextField jtCod2) {
        this.jtCod2 = jtCod2;
    }

    public JTextField getJtFol() {
        return jtFol;
    }

    public void setJtFol(JTextField jtFol) {
        this.jtFol = jtFol;
    }

    public JTextField getJtFol2() {
        return jtFol2;
    }

    public void setJtFol2(JTextField jtFol2) {
        this.jtFol2 = jtFol2;
    }

    public JTextField getJtLmsxi() {
        return jtLmsxi;
    }

    public void setJtLmsxi(JTextField jtLmsxi) {
        this.jtLmsxi = jtLmsxi;
    }

    public JTextField getJtLmsxi2() {
        return jtLmsxi2;
    }

    public void setJtLmsxi2(JTextField jtLmsxi2) {
        this.jtLmsxi2 = jtLmsxi2;
    }

    public JTextField getJtPro() {
        return jtPro;
    }

    public void setJtPro(JTextField jtPro) {
        this.jtPro = jtPro;
    }

    public JTextField getJtPro2() {
        return jtPro2;
    }

    public void setJtPro2(JTextField jtPro2) {
        this.jtPro2 = jtPro2;
    }

    public JTextField getJtSis() {
        return jtSis;
    }

    public void setJtSis(JTextField jtSis) {
        this.jtSis = jtSis;
    }

    public JTextField getJtSis2() {
        return jtSis2;
    }

    public void setJtSis2(JTextField jtSis2) {
        this.jtSis2 = jtSis2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtNombreJugador = new javax.swing.JLabel();
        jlJugador1 = new javax.swing.JLabel();
        jtPro = new javax.swing.JTextField();
        jtBds = new javax.swing.JTextField();
        jtSis = new javax.swing.JTextField();
        jtCod = new javax.swing.JTextField();
        jtLmsxi = new javax.swing.JTextField();
        jtFol = new javax.swing.JTextField();
        jlJugador2 = new javax.swing.JLabel();
        jtPro2 = new javax.swing.JTextField();
        jtBds2 = new javax.swing.JTextField();
        jtSis2 = new javax.swing.JTextField();
        jtCod2 = new javax.swing.JTextField();
        jtLmsxi2 = new javax.swing.JTextField();
        jtFol2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bPro = new javax.swing.JButton();
        bBd = new javax.swing.JButton();
        bSis = new javax.swing.JButton();
        bCod = new javax.swing.JButton();
        bLmsxi = new javax.swing.JButton();
        bFol = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jtNombreJugador.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jtNombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        jtNombreJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtNombreJugador.setText("Trivial Quiz");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtNombreJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtNombreJugador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlJugador1.setForeground(new java.awt.Color(255, 255, 255));
        jlJugador1.setText("Xogador 1:");

        jtPro.setEditable(false);
        jtPro.setBackground(new java.awt.Color(255, 255, 255));
        jtPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtProActionPerformed(evt);
            }
        });
        jtPro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtProPropertyChange(evt);
            }
        });

        jtBds.setEditable(false);
        jtBds.setBackground(new java.awt.Color(255, 255, 255));

        jtSis.setEditable(false);
        jtSis.setBackground(new java.awt.Color(255, 255, 255));

        jtCod.setEditable(false);
        jtCod.setBackground(new java.awt.Color(255, 255, 255));

        jtLmsxi.setEditable(false);
        jtLmsxi.setBackground(new java.awt.Color(255, 255, 255));

        jtFol.setEditable(false);
        jtFol.setBackground(new java.awt.Color(255, 255, 255));

        jlJugador2.setForeground(new java.awt.Color(255, 255, 255));
        jlJugador2.setText("Xogador 2:");

        jtPro2.setEditable(false);
        jtPro2.setBackground(new java.awt.Color(255, 255, 255));

        jtBds2.setEditable(false);
        jtBds2.setBackground(new java.awt.Color(255, 255, 255));

        jtSis2.setEditable(false);
        jtSis2.setBackground(new java.awt.Color(255, 255, 255));

        jtCod2.setEditable(false);
        jtCod2.setBackground(new java.awt.Color(255, 255, 255));

        jtLmsxi2.setEditable(false);
        jtLmsxi2.setBackground(new java.awt.Color(255, 255, 255));

        jtFol2.setEditable(false);
        jtFol2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRO");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BD");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LMS");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("COD");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SI");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FOL");

        bPro.setBackground(new java.awt.Color(255, 102, 255));
        bPro.setText("PRO");
        bPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProActionPerformed(evt);
            }
        });

        bBd.setBackground(new java.awt.Color(0, 204, 0));
        bBd.setText("BD");
        bBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBdActionPerformed(evt);
            }
        });

        bSis.setBackground(new java.awt.Color(255, 255, 0));
        bSis.setText("SI");
        bSis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSisActionPerformed(evt);
            }
        });

        bCod.setBackground(new java.awt.Color(255, 153, 0));
        bCod.setText("COD");
        bCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCodActionPerformed(evt);
            }
        });

        bLmsxi.setBackground(new java.awt.Color(204, 0, 204));
        bLmsxi.setText("LMS");
        bLmsxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLmsxiActionPerformed(evt);
            }
        });

        bFol.setBackground(new java.awt.Color(0, 204, 255));
        bFol.setText("FOL");
        bFol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFolActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿Cál é a seguinte pregunta que queres contestar?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bPro, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(bCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bBd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLmsxi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlJugador2)
                                .addGap(18, 18, 18)
                                .addComponent(jtPro2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtBds2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtSis2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCod2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtLmsxi2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFol2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlJugador1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtBds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtSis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtLmsxi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtFol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJugador1)
                    .addComponent(jtPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtSis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLmsxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJugador2)
                    .addComponent(jtPro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBds2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtSis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLmsxi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPro)
                    .addComponent(bBd)
                    .addComponent(bSis))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCod)
                    .addComponent(bLmsxi)
                    .addComponent(bFol))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSisActionPerformed
        fichero = new File(listaSis);
        control.leerPregunta(fichero, player1, player2, "s", this);
    }//GEN-LAST:event_bSisActionPerformed

    private void bProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProActionPerformed
        fichero = new File(listaPro);
        control.leerPregunta(fichero, player1, player2, "p", this);
    }//GEN-LAST:event_bProActionPerformed

    private void bCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCodActionPerformed
        fichero = new File(listaCod);
        control.leerPregunta(fichero, player1, player2, "c", this);
    }//GEN-LAST:event_bCodActionPerformed

    private void bBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBdActionPerformed
        fichero = new File(listaBds);
        control.leerPregunta(fichero, player1, player2, "b", this);
    }//GEN-LAST:event_bBdActionPerformed

    private void bLmsxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLmsxiActionPerformed
        fichero = new File(listaLmsxi);
        control.leerPregunta(fichero, player1, player2, "l", this);
    }//GEN-LAST:event_bLmsxiActionPerformed

    private void bFolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFolActionPerformed
        fichero = new File(listaFol);
        control.leerPregunta(fichero, player1, player2, "f", this);
    }//GEN-LAST:event_bFolActionPerformed

    private void jtProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtProActionPerformed
        if (player1.isQuesitoPro() == true) {
            jtPro.setBackground(Color.pink);
        }
    }//GEN-LAST:event_jtProActionPerformed

    private void jtProPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtProPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jtProPropertyChange

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TrivialLobbyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrivialLobbyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrivialLobbyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrivialLobbyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrivialLobbyView().setVisible(true);
            }
        });

        // Cuando el jugador X esté activo se marcará poniendo el nombre en amarillo.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBd;
    private javax.swing.JButton bCod;
    private javax.swing.JButton bFol;
    private javax.swing.JButton bLmsxi;
    private javax.swing.JButton bPro;
    private javax.swing.JButton bSis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlJugador1;
    private javax.swing.JLabel jlJugador2;
    private javax.swing.JTextField jtBds;
    private javax.swing.JTextField jtBds2;
    private javax.swing.JTextField jtCod;
    private javax.swing.JTextField jtCod2;
    private javax.swing.JTextField jtFol;
    private javax.swing.JTextField jtFol2;
    private javax.swing.JTextField jtLmsxi;
    private javax.swing.JTextField jtLmsxi2;
    private javax.swing.JLabel jtNombreJugador;
    private javax.swing.JTextField jtPro;
    private javax.swing.JTextField jtPro2;
    private javax.swing.JTextField jtSis;
    private javax.swing.JTextField jtSis2;
    // End of variables declaration//GEN-END:variables
}
