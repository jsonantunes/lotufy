/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.QuestionController;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author johnson
 */
public class FormQuestion extends javax.swing.JFrame {

    /**
     * Creates new form FormQuestion
     */
    public FormQuestion() {
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

        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        correctAnswer = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        discursive = new javax.swing.JCheckBox();
        subjectId = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        difficultyLevel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        option1 = new javax.swing.JTextField();
        option2 = new javax.swing.JTextField();
        option3 = new javax.swing.JTextField();
        option4 = new javax.swing.JTextField();
        option5 = new javax.swing.JTextField();
        correctAnswer1 = new javax.swing.JRadioButton();
        correctAnswer2 = new javax.swing.JRadioButton();
        correctAnswer3 = new javax.swing.JRadioButton();
        correctAnswer4 = new javax.swing.JRadioButton();
        correctAnswer5 = new javax.swing.JRadioButton();
        ButtonGerarProva = new javax.swing.JButton();

        jLabel6.setText("Opção 1");

        jTextField3.setText("jTextField1");

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Questão");

        discursive.setText("Discursiva");

        subjectId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Assunto");

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);
        description.getAccessibleContext().setAccessibleName("description");

        jLabel2.setText("Descrição");

        difficultyLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        difficultyLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyLevelActionPerformed(evt);
            }
        });

        jLabel3.setText("Dificuldade");

        jButton1.setText("Salvar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Gabarito"));
        jPanel2.setToolTipText("");

        option1.setBackground(java.awt.Color.white);

        option2.setBackground(java.awt.Color.white);
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });

        option3.setBackground(java.awt.Color.white);
        option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option3ActionPerformed(evt);
            }
        });

        option4.setBackground(java.awt.Color.white);

        option5.setBackground(java.awt.Color.white);

        correctAnswer.add(correctAnswer1);
        correctAnswer1.setText("A");
        correctAnswer1.setToolTipText("");
        correctAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctAnswer1ActionPerformed(evt);
            }
        });

        correctAnswer.add(correctAnswer2);
        correctAnswer2.setText("B");
        correctAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctAnswer2ActionPerformed(evt);
            }
        });

        correctAnswer.add(correctAnswer3);
        correctAnswer3.setText("C");

        correctAnswer.add(correctAnswer4);
        correctAnswer4.setText("D");

        correctAnswer.add(correctAnswer5);
        correctAnswer5.setText("E");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correctAnswer1)
                            .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correctAnswer2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correctAnswer3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correctAnswer4)))
                    .addComponent(option5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correctAnswer5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(correctAnswer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(correctAnswer1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(correctAnswer4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(correctAnswer3)
                        .addGap(6, 6, 6)
                        .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(correctAnswer5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        option1.getAccessibleContext().setAccessibleName("option1");
        option2.getAccessibleContext().setAccessibleName("option2");
        option3.getAccessibleContext().setAccessibleName("option3");
        option4.getAccessibleContext().setAccessibleName("option4");
        option5.getAccessibleContext().setAccessibleName("option5");

        ButtonGerarProva.setText("Gerar Prova");
        ButtonGerarProva.setMaximumSize(new java.awt.Dimension(190, 29));
        ButtonGerarProva.setMinimumSize(new java.awt.Dimension(190, 29));
        ButtonGerarProva.setPreferredSize(new java.awt.Dimension(190, 29));
        ButtonGerarProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGerarProvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(259, 259, 259)
                                .addComponent(jLabel3))
                            .addComponent(discursive, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(subjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(difficultyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonGerarProva, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(317, 317, 317))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(difficultyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(discursive)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ButtonGerarProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        subjectId.getAccessibleContext().setAccessibleName("subject_id");
        difficultyLevel.getAccessibleContext().setAccessibleName("difficultyLevel");
        difficultyLevel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option2ActionPerformed

    private void option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option3ActionPerformed

    private void difficultyLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_difficultyLevelActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            // TODO add your handling code here:
            Map<String, Object> map = new HashMap<String, Object>();
            
            map.put("description", this.description.getText());
            map.put("difficultyLevel", this.difficultyLevel.getSelectedIndex());
            map.put("correctAnswer", this.correctAnswer);
            //map.put("answers");            
            
            QuestionController.store(this);
        
        } catch (Exception ex) {
            Logger.getLogger(FormQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void subjectIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectIdActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void correctAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correctAnswer2ActionPerformed

    private void correctAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correctAnswer1ActionPerformed

    private void ButtonGerarProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGerarProvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonGerarProvaActionPerformed

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
            java.util.logging.Logger.getLogger(FormQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormQuestion().setVisible(true);                   
            }
        });
    }   

    public ButtonGroup getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(ButtonGroup correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public JRadioButton getCorrectAnswer1() {
        return correctAnswer1;
    }

    public void setCorrectAnswer1(JRadioButton correctAnswer1) {
        this.correctAnswer1 = correctAnswer1;
    }

    public JRadioButton getCorrectAnswer2() {
        return correctAnswer2;
    }

    public void setCorrectAnswer2(JRadioButton correctAnswer2) {
        this.correctAnswer2 = correctAnswer2;
    }

    public JRadioButton getCorrectAnswer3() {
        return correctAnswer3;
    }

    public void setCorrectAnswer3(JRadioButton correctAnswer3) {
        this.correctAnswer3 = correctAnswer3;
    }

    public JRadioButton getCorrectAnswer4() {
        return correctAnswer4;
    }

    public void setCorrectAnswer4(JRadioButton correctAnswer4) {
        this.correctAnswer4 = correctAnswer4;
    }

    public JRadioButton getCorrectAnswer5() {
        return correctAnswer5;
    }

    public void setCorrectAnswer5(JRadioButton correctAnswer5) {
        this.correctAnswer5 = correctAnswer5;
    }

    public JTextArea getDescription() {
        return description;
    }

    public void setDescription(JTextArea description) {
        this.description = description;
    }

    public JComboBox<String> getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(JComboBox<String> difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JCheckBox getjCheckBox1() {
        return discursive;
    }

    public void setjCheckBox1(JCheckBox jCheckBox1) {
        this.discursive = jCheckBox1;
    }

    public JCheckBox getjCheckBox4() {
        return jCheckBox4;
    }

    public void setjCheckBox4(JCheckBox jCheckBox4) {
        this.jCheckBox4 = jCheckBox4;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public void setjTextField3(JTextField jTextField3) {
        this.jTextField3 = jTextField3;
    }

    public JTextField getOption1() {
        return option1;
    }

    public void setOption1(JTextField option1) {
        this.option1 = option1;
    }

    public JTextField getOption2() {
        return option2;
    }

    public void setOption2(JTextField option2) {
        this.option2 = option2;
    }

    public JTextField getOption3() {
        return option3;
    }

    public void setOption3(JTextField option3) {
        this.option3 = option3;
    }

    public JTextField getOption4() {
        return option4;
    }

    public void setOption4(JTextField option4) {
        this.option4 = option4;
    }

    public JTextField getOption5() {
        return option5;
    }

    public void setOption5(JTextField option5) {
        this.option5 = option5;
    }

    public JComboBox<String> getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(JComboBox<String> subjectId) {
        this.subjectId = subjectId;
    }
    
    public void clearFields() {
        this.description.setText("");
        this.subjectId.setSelectedIndex(0);
        this.discursive.setSelected(false);
        this.correctAnswer1.setSelected(false);
        this.correctAnswer2.setSelected(false);
        this.correctAnswer3.setSelected(false);
        this.correctAnswer4.setSelected(false);
        this.correctAnswer5.setSelected(false);
        this.option1.setText("");
        this.option2.setText("");
        this.option3.setText("");
        this.option4.setText("");
        this.option5.setText("");
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGerarProva;
    private javax.swing.ButtonGroup correctAnswer;
    private javax.swing.JRadioButton correctAnswer1;
    private javax.swing.JRadioButton correctAnswer2;
    private javax.swing.JRadioButton correctAnswer3;
    private javax.swing.JRadioButton correctAnswer4;
    private javax.swing.JRadioButton correctAnswer5;
    private javax.swing.JTextArea description;
    private javax.swing.JComboBox<String> difficultyLevel;
    private javax.swing.JCheckBox discursive;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField option1;
    private javax.swing.JTextField option2;
    private javax.swing.JTextField option3;
    private javax.swing.JTextField option4;
    private javax.swing.JTextField option5;
    private javax.swing.JComboBox<String> subjectId;
    // End of variables declaration//GEN-END:variables

    public void setDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
