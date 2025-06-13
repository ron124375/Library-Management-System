/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jvtictactoe;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;

/**
 *
 * @author Administrator
 */
public class jvtictactoe extends javax.swing.JFrame {
        private String startGame ="X";
    private int xCount =0;
    private int oCount =0;
    boolean checker;
    
    public jvtictactoe() {
        initComponents();
    }

    private void gameScore()
    {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
           
    }
    private void choose_a_Player()
    {
        if (startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
        
        }
        
        private void winningGame ()
    {
        String b1 = btnreset1.getText();
        String b2 = btnreset2.getText();
        String b3 = btnreset3.getText();
        String b4 = btnreset4.getText();
        String b5 = btnreset5.getText();
        String b6 = btnreset6.getText();
        String b7 = btnreset7.getText();
        String b8 = btnreset8.getText();
        String b9 = btnreset9.getText();
        
        if (b1 == ("X") && b4 == ("X")&& b7 == ("X") )
        {
        
            JOptionPane.showMessageDialog(this, "Player X Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset1.setBackground(Color.yellow);
            btnreset4.setBackground(Color.yellow);
            btnreset7.setBackground(Color.yellow); 
            xCount++;
            gameScore();
       
        }
        
        if (b2 == ("X") && b5 == ("X")&& b8 == ("X") )
        {
        
            JOptionPane.showMessageDialog(this, "Player X Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset2.setBackground(Color.yellow);
            btnreset5.setBackground(Color.yellow);
            btnreset8.setBackground(Color.yellow); 
            xCount++;
            gameScore();
       
        }
        if (b3 == ("X") && b6 == ("X")&& b9 == ("X") )
        {
        
            JOptionPane.showMessageDialog(this, "Player X Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset3.setBackground(Color.yellow);
            btnreset6.setBackground(Color.yellow);
            btnreset9.setBackground(Color.yellow); 
            xCount++;
            gameScore();
       
        }
        if (b1 == ("X") && b5 == ("X")&& b9 == ("X") )
        {
        
            JOptionPane.showMessageDialog(this, "Player X Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset1.setBackground(Color.yellow);
            btnreset5.setBackground(Color.yellow);
            btnreset9.setBackground(Color.yellow); 
            xCount++;
            gameScore();
       
        }
        if (b1 == ("X") && b2 == ("X")&& b3 == ("X") )
        {
        
            JOptionPane.showMessageDialog(this, "Player X Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset1.setBackground(Color.yellow);
            btnreset2.setBackground(Color.yellow);
            btnreset3.setBackground(Color.yellow); 
            xCount++;
            gameScore();
       
        }
        if (b4 == ("X") && b5 == ("X")&& b6 == ("X") )
        {
        
            JOptionPane.showMessageDialog(this, "Player X Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset4.setBackground(Color.yellow);
            btnreset5.setBackground(Color.yellow);
            btnreset6.setBackground(Color.yellow); 
            xCount++;
            gameScore();
       
        }
        if (b7 == ("X") && b8 == ("X")&& b9 == ("X") )
        {
        
            JOptionPane.showMessageDialog(this, "Player X Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset7.setBackground(Color.yellow);
            btnreset8.setBackground(Color.yellow);
            btnreset9.setBackground(Color.yellow); 
            xCount++;
            gameScore();
       
        }
        if (b3 == ("X") && b5 == ("X")&& b7 == ("X") )
        {
        
            JOptionPane.showMessageDialog(this, "Player X Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset3.setBackground(Color.yellow);
            btnreset5.setBackground(Color.yellow);
            btnreset7.setBackground(Color.yellow); 
            xCount++;
            gameScore();
       
        }
        
        if (b1 == ("O") && b4 == ("O")&& b7 == ("O") )
        {
        
            JOptionPane.showMessageDialog(this, "Player O Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset1.setBackground(Color.green);
            btnreset4.setBackground(Color.green);
            btnreset7.setBackground(Color.green); 
            oCount++;
            gameScore();        
       
        }
        
        if (b2 == ("O") && b5 == ("O")&& b8 == ("O") )
        {
        
            JOptionPane.showMessageDialog(this, "Player O Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset2.setBackground(Color.green);
            btnreset5.setBackground(Color.green);
            btnreset8.setBackground(Color.green); 
            oCount++;
            gameScore();
       
        }
        if (b3 == ("O") && b6 == ("O")&& b9 == ("O") )
        {
        
            JOptionPane.showMessageDialog(this, "Player O Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset3.setBackground(Color.green);
            btnreset6.setBackground(Color.green);
            btnreset9.setBackground(Color.green); 
            oCount++;
            gameScore();
       
        }
        if (b1 == ("O") && b5 == ("O")&& b9 == ("O") )
        {
        
            JOptionPane.showMessageDialog(this, "Player O Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset1.setBackground(Color.green);
            btnreset5.setBackground(Color.green);
            btnreset9.setBackground(Color.green); 
            oCount++;
            gameScore();
       
        }
        if (b1 == ("O") && b2 == ("O")&& b3 == ("O") )
        {
        
            JOptionPane.showMessageDialog(this, "Player O Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset1.setBackground(Color.green);
            btnreset2.setBackground(Color.green);
            btnreset3.setBackground(Color.green); 
            oCount++;
            gameScore();
       
        }
        if (b4 == ("O") && b5 == ("O")&& b6 == ("O") )
        {
        
            JOptionPane.showMessageDialog(this, "Player O Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset4.setBackground(Color.green);
            btnreset5.setBackground(Color.green);
            btnreset6.setBackground(Color.green); 
            oCount++;
            gameScore();
       
        }
        if (b7 == ("O") && b8 == ("O")&& b9 == ("O") )
        {
        
            JOptionPane.showMessageDialog(this, "Player O Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset7.setBackground(Color.green);
            btnreset8.setBackground(Color.green);
            btnreset9.setBackground(Color.green); 
            oCount++;
            gameScore();
       
        }
        if (b3 == ("O") && b5 == ("O")&& b7 == ("O") )
        {
        
            JOptionPane.showMessageDialog(this, "Player O Wins", "Pec Pec Coe",JOptionPane.INFORMATION_MESSAGE);     
            btnreset3.setBackground(Color.green);
            btnreset5.setBackground(Color.green);
            btnreset7.setBackground(Color.green); 
            oCount++;
            gameScore();
       
        }
        
    
    }
        

    /**
     * Creates new form jvtictactoe
     */
    

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
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnreset9 = new javax.swing.JButton();
        btnreset2 = new javax.swing.JButton();
        btnreset3 = new javax.swing.JButton();
        btnreset1 = new javax.swing.JButton();
        btnreset4 = new javax.swing.JButton();
        btnreset7 = new javax.swing.JButton();
        btnreset5 = new javax.swing.JButton();
        btnreset6 = new javax.swing.JButton();
        btnreset8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton6.setMinimumSize(new java.awt.Dimension(200, 168));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 210, 160));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.setText("New Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 100));

        exit.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel4.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 280, 170));

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel4.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 310, 170));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 630, 300));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setName("0"); // NOI18N
        jlblPlayerO.setOpaque(true);
        jPanel5.add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 290, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setText("Player X:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);
        jPanel5.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 290, 80));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, 260));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 670, 620));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnreset9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset9.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset9.setMinimumSize(new java.awt.Dimension(200, 168));
        btnreset9.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset9ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 210, 200));

        btnreset2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset2.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset2.setMinimumSize(new java.awt.Dimension(200, 168));
        btnreset2.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 210, 190));

        btnreset3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset3.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset3.setMinimumSize(new java.awt.Dimension(200, 168));
        btnreset3.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 8, 210, 190));

        btnreset1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset1.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset1.setMinimumSize(new java.awt.Dimension(200, 168));
        btnreset1.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 190));

        btnreset4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset4.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset4.setMinimumSize(new java.awt.Dimension(200, 168));
        btnreset4.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 190));

        btnreset7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset7.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset7.setMinimumSize(new java.awt.Dimension(200, 168));
        btnreset7.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset7ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 210, 200));

        btnreset5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset5.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset5.setMinimumSize(new java.awt.Dimension(200, 168));
        btnreset5.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 210, 190));

        btnreset6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset6.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset6.setMinimumSize(new java.awt.Dimension(200, 168));
        btnreset6.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset6ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 210, 190));

        btnreset8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btnreset8.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset8.setMinimumSize(new java.awt.Dimension(200, 168));
        btnreset8.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset8ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 210, 200));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 670, 620));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1360, 90));

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel5.setText("Tic Tac Toe");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1360, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 1400, 1040));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnreset9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset9ActionPerformed
        // TODO add your handling code here:
         btnreset9.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }   
        else 
        {
            checker = true;
        }  
        choose_a_Player();
        winningGame();         
    }//GEN-LAST:event_btnreset9ActionPerformed

    private void btnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset1ActionPerformed
btnreset1.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }   
        else 
        {
            checker = true;
        }  
        choose_a_Player();
        winningGame();          
                                          // TODO add your handling code here:
    }//GEN-LAST:event_btnreset1ActionPerformed

    private void btnreset4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset4ActionPerformed
        // TODO add your handling code here:
        btnreset4.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }   
        else 
        {
            checker = true;
        }  
        choose_a_Player();
        winningGame();         
    }//GEN-LAST:event_btnreset4ActionPerformed

    private void btnreset7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset7ActionPerformed
        // TODO add your handling code here:
        btnreset7.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }   
        else 
        {
            checker = true;
        }  
        choose_a_Player();
        winningGame();         
    }//GEN-LAST:event_btnreset7ActionPerformed

    private void btnreset5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset5ActionPerformed
        // TODO add your handling code here:
        btnreset5.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }   
        else 
        {
            checker = true;
        }  
        choose_a_Player();
        winningGame();         
    }//GEN-LAST:event_btnreset5ActionPerformed

    private void btnreset6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset6ActionPerformed
        // TODO add your handling code here:
        btnreset6.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }   
        else 
        {
            checker = true;
        }  
        choose_a_Player();
        winningGame();         
    }//GEN-LAST:event_btnreset6ActionPerformed

    private void btnreset8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset8ActionPerformed
        // TODO add your handling code here:
        btnreset8.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }   
        else 
        {
            checker = true;
        }  
        choose_a_Player();
        winningGame();         
    }//GEN-LAST:event_btnreset8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        btnreset1.setEnabled(true); 
    btnreset2.setEnabled(true);
    btnreset3.setEnabled(true); 
    btnreset4.setEnabled(true);
    btnreset5.setEnabled(true); 
    btnreset6.setEnabled(true);
    btnreset7.setEnabled(true); 
    btnreset8.setEnabled(true);
    btnreset9.setEnabled(true); 
    
    jlblPlayerX.setText("");
  
    jlblPlayerO.setText("");
            
    btnreset1.setText("");
    btnreset2.setText("");
    btnreset3.setText("");
    btnreset4.setText("");
    btnreset5.setText("");
    btnreset6.setText("");
    btnreset7.setText("");
    btnreset8.setText("");
    btnreset9.setText("");
      
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       
         frame = new JFrame ("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Pec Pec Poe", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
                                           

    }//GEN-LAST:event_exitActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
          
       btnreset1.setEnabled(true); 
    btnreset2.setEnabled(true);
    btnreset3.setEnabled(true); 
    btnreset4.setEnabled(true);
    btnreset5.setEnabled(true); 
    btnreset6.setEnabled(true);
    btnreset7.setEnabled(true); 
    btnreset8.setEnabled(true);
    btnreset9.setEnabled(true); 
    
    jlblPlayerX.setText("");
  
    jlblPlayerO.setText("");
            
    btnreset1.setText("");
    btnreset2.setText("");
    btnreset3.setText("");
    btnreset4.setText("");
    btnreset5.setText("");
    btnreset6.setText("");
    btnreset7.setText("");
    btnreset8.setText("");
    btnreset9.setText("");
    
    btnreset1.setBackground(Color.LIGHT_GRAY);
    btnreset2.setBackground(Color.LIGHT_GRAY);
    btnreset3.setBackground(Color.LIGHT_GRAY); 
    btnreset4.setBackground(Color.LIGHT_GRAY);
    btnreset5.setBackground(Color.LIGHT_GRAY);
    btnreset6.setBackground(Color.LIGHT_GRAY);
    btnreset7.setBackground(Color.LIGHT_GRAY);
    btnreset8.setBackground(Color.LIGHT_GRAY);
    btnreset9.setBackground(Color.LIGHT_GRAY); 

    
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnreset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset3ActionPerformed
 btnreset3.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }   
        else 
        {
            checker = true;
        }  
        choose_a_Player();
        winningGame();                 // TODO add your handling code here:
    }//GEN-LAST:event_btnreset3ActionPerformed

    private void btnreset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset2ActionPerformed
        // TODO add your handling code here:
         btnreset2.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }   
        else 
        {
            checker = true;
        }  
        choose_a_Player();
        winningGame();         
    }//GEN-LAST:event_btnreset2ActionPerformed

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
            java.util.logging.Logger.getLogger(jvtictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jvtictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jvtictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jvtictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jvtictactoe().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnreset1;
    private javax.swing.JButton btnreset2;
    private javax.swing.JButton btnreset3;
    private javax.swing.JButton btnreset4;
    private javax.swing.JButton btnreset5;
    private javax.swing.JButton btnreset6;
    private javax.swing.JButton btnreset7;
    private javax.swing.JButton btnreset8;
    private javax.swing.JButton btnreset9;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
