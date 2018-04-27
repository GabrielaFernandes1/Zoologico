/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.Interfacegrafica;

import br.com.Animais.Animal;
import br.com.Animais.Grupo;
import br.com.Animais.Lobo;
import br.com.Animais.zoologico;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
 */
public class CadastroDeAnimal extends javax.swing.JFrame {
    zoologico z = new zoologico();
    /**
     * Creates new form CadastroDeAnimal
     */
    
    
    public void desabilitarLobo(){
        this.jPesoLobo.setEnabled(false);
        this.jTamanhoLobo.setEnabled(false);
        this.jDataNascLobo.setEnabled(false);
    }
    public void habilitarLobo(){
      this.jPesoLobo.setEnabled(true);
      this.jTamanhoLobo.setEnabled(true);
      this.jDataNascLobo.setEnabled(true);  
    }
    public void desabilitarPeixe(){
        this.jTipoPeixe.setEnabled(false);
    }
    public void habilitarPeixe(){
        this.jTipoPeixe.setEnabled(true);
    }
    
    public CadastroDeAnimal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSalvar = new javax.swing.JButton();
        jPeixe = new javax.swing.JRadioButton();
        jLobo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelGrupo = new javax.swing.JPanel();
        jNomegrupo = new javax.swing.JTextField();
        jDescricaogrupo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelAnimal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDescricaoAnimal = new javax.swing.JTextField();
        jStatusAnimal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanelLobo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPesoLobo = new javax.swing.JTextField();
        jTamanhoLobo = new javax.swing.JTextField();
        jDataNascLobo = new javax.swing.JTextField();
        jPanelPeixe = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTipoPeixe = new javax.swing.JTextField();
        jMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSalvar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSalvar.setText("Salvar");
        jSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarActionPerformed(evt);
            }
        });

        jPeixe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPeixe.setText("Peixe");
        jPeixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPeixeActionPerformed(evt);
            }
        });

        jLobo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLobo.setText("Lobo");
        jLobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("Cadastro de Animal");

        jNomegrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomegrupoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Grupo");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Descrição:");

        javax.swing.GroupLayout jPanelGrupoLayout = new javax.swing.GroupLayout(jPanelGrupo);
        jPanelGrupo.setLayout(jPanelGrupoLayout);
        jPanelGrupoLayout.setHorizontalGroup(
            jPanelGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGrupoLayout.createSequentialGroup()
                .addGroup(jPanelGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGrupoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGrupoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanelGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrupoLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrupoLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanelGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jNomegrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jDescricaogrupo))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelGrupoLayout.setVerticalGroup(
            jPanelGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGrupoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNomegrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDescricaogrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jPanelAnimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Descrição:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Status:");

        jDescricaoAnimal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDescricaoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDescricaoAnimalActionPerformed(evt);
            }
        });

        jStatusAnimal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Animal");

        javax.swing.GroupLayout jPanelAnimalLayout = new javax.swing.GroupLayout(jPanelAnimal);
        jPanelAnimal.setLayout(jPanelAnimalLayout);
        jPanelAnimalLayout.setHorizontalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDescricaoAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jStatusAnimal))))
                .addContainerGap())
        );
        jPanelAnimalLayout.setVerticalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jDescricaoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jStatusAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelLobo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Lobo");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Peso:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Tamanho:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Data de Nascimento:");

        jPesoLobo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPesoLobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesoLoboActionPerformed(evt);
            }
        });

        jTamanhoLobo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jDataNascLobo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDataNascLobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDataNascLoboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoboLayout = new javax.swing.GroupLayout(jPanelLobo);
        jPanelLobo.setLayout(jPanelLoboLayout);
        jPanelLoboLayout.setHorizontalGroup(
            jPanelLoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addGroup(jPanelLoboLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7))
                    .addGroup(jPanelLoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPesoLobo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addComponent(jTamanhoLobo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jDataNascLobo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanelLoboLayout.setVerticalGroup(
            jPanelLoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPesoLobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTamanhoLobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDataNascLobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanelPeixe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Peixe");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Tipo:");

        jTipoPeixe.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelPeixeLayout = new javax.swing.GroupLayout(jPanelPeixe);
        jPanelPeixe.setLayout(jPanelPeixeLayout);
        jPanelPeixeLayout.setHorizontalGroup(
            jPanelPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPeixeLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelPeixeLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPeixeLayout.createSequentialGroup()
                        .addComponent(jTipoPeixe)
                        .addContainerGap())))
        );
        jPanelPeixeLayout.setVerticalGroup(
            jPanelPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTipoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMostrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMostrar.setText("Mostrar Cadastrados");
        jMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSalvar)
                            .addComponent(jMostrar)
                            .addComponent(jPanelGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPeixe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLobo)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelLobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPeixe)
                            .addComponent(jLobo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jMostrar)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelLobo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelPeixe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
              if (this.jLobo.isSelected()){
                  SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
                float peso = 0, tamanho = 0;
                Date dataNascimento = null;
                Grupo grupo;
                String descricao;
                char status = 0;
                
                descricao = this.jDescricaoAnimal.getText();
                  try {
                   status = this.jStatusAnimal.getText().charAt(0);
                  } catch (StringIndexOutOfBoundsException p) {
                      JOptionPane.showMessageDialog(this, p );
                  }               
               
                  try {
                    dataNascimento = stf.parse(this.jDataNascLobo.getText());  
                  } catch (Exception pe) {
                      JOptionPane.showMessageDialog(this, pe);
                  }  
                  try{
                peso = Float.parseFloat(this.jPesoLobo.getText());
                tamanho = Float.parseFloat(this.jTamanhoLobo.getText());
                  }catch(NumberFormatException nfe){
                     JOptionPane.showMessageDialog(this, nfe);
                  }
                  grupo = new Grupo(0,this.jNomegrupo.getText(),this.jDescricaogrupo.getText());
                  z.getAnimais().add(new Lobo(peso, tamanho, dataNascimento, WIDTH, descricao, status));
                
              }else if (jPeixe.isSelected()){
                  
              }else {
                  JOptionPane.showMessageDialog(this,"Selecione um tipo de animal!" );
              }
    }//GEN-LAST:event_jSalvarActionPerformed

    private void jPeixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPeixeActionPerformed
        desabilitarLobo();
        this.jLobo.setSelected(false);
        habilitarPeixe();
    }//GEN-LAST:event_jPeixeActionPerformed

    private void jNomegrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomegrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomegrupoActionPerformed

    private void jDescricaoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDescricaoAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDescricaoAnimalActionPerformed

    private void jPesoLoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesoLoboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPesoLoboActionPerformed

    private void jDataNascLoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDataNascLoboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDataNascLoboActionPerformed

    private void jLoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoboActionPerformed
        desabilitarPeixe();
        this.jPeixe.setSelected(false);
        habilitarLobo();
    }//GEN-LAST:event_jLoboActionPerformed

    private void jMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMostrarActionPerformed
        String animais = "";
        for (Animal animal : z.getAnimais()){
            animais += animal.toString();
        }
        JOptionPane.showMessageDialog(this, animais);
        
    }//GEN-LAST:event_jMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jDataNascLobo;
    private javax.swing.JTextField jDescricaoAnimal;
    private javax.swing.JTextField jDescricaogrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jLobo;
    private javax.swing.JButton jMostrar;
    private javax.swing.JTextField jNomegrupo;
    private javax.swing.JPanel jPanelAnimal;
    private javax.swing.JPanel jPanelGrupo;
    private javax.swing.JPanel jPanelLobo;
    private javax.swing.JPanel jPanelPeixe;
    private javax.swing.JRadioButton jPeixe;
    private javax.swing.JTextField jPesoLobo;
    private javax.swing.JButton jSalvar;
    private javax.swing.JTextField jStatusAnimal;
    private javax.swing.JTextField jTamanhoLobo;
    private javax.swing.JTextField jTipoPeixe;
    // End of variables declaration//GEN-END:variables
}
