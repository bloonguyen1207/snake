/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import GamePlay.HardGame;
import GamePlay.EasyGame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author nguyentranngocdiep
 */
public class Menu3 extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    private void initComponents() {

        EasyButton = new JButton();
        NormalButton = new JButton();
        HardButton = new JButton();
        ExpertButton = new JButton();
        BackButton = new JButton();
        SnakeLabel = new JLabel();
        Background = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1000, 600));
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        EasyButton.setBackground(new Color(255, 204, 0));
        EasyButton.setFont(new Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        EasyButton.setForeground(new Color(204, 51, 0));
        EasyButton.setText("Easy");
        EasyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                EasyButtonActionPerformed(evt);
            }
        });
        add(EasyButton);
        EasyButton.setBounds(400, 200, 200, 59);

        NormalButton.setBackground(new Color(255, 204, 0));
        NormalButton.setFont(new Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        NormalButton.setForeground(new Color(204, 51, 0));
        NormalButton.setText("Normal");
        NormalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NormalButtonActionPerformed(evt);
            }
        });
        add(NormalButton);
        NormalButton.setBounds(400, 270, 200, 59);

        HardButton.setBackground(new Color(255, 204, 0));
        HardButton.setFont(new Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        HardButton.setForeground(new Color(204, 51, 0));
        HardButton.setText("Hard");
        HardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HardButtonActionPerformed(evt);
            }
        });
        add(HardButton);
        HardButton.setBounds(400, 340, 200, 59);

        ExpertButton.setBackground(new Color(255, 204, 0));
        ExpertButton.setFont(new Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        ExpertButton.setForeground(new Color(204, 51, 0));
        ExpertButton.setText("Expert");
        ExpertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ExpertButtonActionPerformed(evt);
            }
        });
        add(ExpertButton);
        ExpertButton.setBounds(400, 410, 200, 59);
        
        BackButton.setBackground(new Color(255, 204, 0));
        BackButton.setFont(new Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        BackButton.setForeground(new Color(204, 51, 0));
        BackButton.setText("Back");
        BackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        add(BackButton);
        BackButton.setBounds(400, 500, 200, 59);

        SnakeLabel.setIcon(new ImageIcon("res\\Menu\\snake.png")); // NOI18N
        SnakeLabel.setText("Title");
        add(SnakeLabel);
        SnakeLabel.setBounds(370, 20, 250, 143);

        Background.setIcon(new ImageIcon("res\\Menu\\bg1.png")); // NOI18N
        Background.setText("Background");
        add(Background);
        Background.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold> 

    private void NormalButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        // TODO add your handling code here:
    } 

    private void ExpertButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        // TODO add your handling code here:
    } 

    private void EasyButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        // TODO add your handling code here:
        EasyGame s = new EasyGame();
        s.setVisible(true);
        setVisible(false);
    } 

    private void HardButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        // TODO add your handling code here:
         HardGame s = new HardGame();
        s.setVisible(true);
        setVisible(false);
    } 
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        // TODO add your handling code here:
        Menu2 m2 = new Menu2();
        m2.setVisible(true);
        setVisible(false);
    } 

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
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify 
    private JLabel Background, SnakeLabel;
    public JButton EasyButton, NormalButton, HardButton, ExpertButton, BackButton;
    // End of variables declaration 
}
