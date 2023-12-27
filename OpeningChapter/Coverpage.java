//CoverPage
//name, fav show, fav subject, age

package OpeningChapter;

import EndingChapter.RandomEndingOne;
import business.Person;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Coverpage extends javax.swing.JFrame {

    public Coverpage() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        yourName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yourShow = new javax.swing.JTextField();
        yourSubject = new javax.swing.JTextField();
        yourAge = new javax.swing.JTextField();
        openBookButton = new javax.swing.JButton();
        passedAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(1580, 1060));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yourName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        yourName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourNameActionPerformed(evt);
            }
        });
        jPanel1.add(yourName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 700, 250, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setText("What's your name?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OpeningChapter/Photos/Colby Jack image resized2.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 6)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 610));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("What is your favorite show?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 670, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("What is your favorite subject?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 710, 230, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("What is your age?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 740, 150, -1));

        yourShow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        yourShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourShowActionPerformed(evt);
            }
        });
        jPanel1.add(yourShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 680, 250, 20));

        yourSubject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        yourSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourSubjectActionPerformed(evt);
            }
        });
        jPanel1.add(yourSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, 250, 20));

        yourAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        yourAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourAgeActionPerformed(evt);
            }
        });
        jPanel1.add(yourAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 740, 250, 20));

        openBookButton.setBackground(new java.awt.Color(255, 204, 153));
        openBookButton.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        openBookButton.setText("Open Book");
        openBookButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        openBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBookButtonActionPerformed(evt);
            }
        });
        jPanel1.add(openBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 690, 210, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 830));
        getContentPane().add(passedAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 560, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yourNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourNameActionPerformed
        
    }//GEN-LAST:event_yourNameActionPerformed

    private void yourShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourShowActionPerformed
        
    }//GEN-LAST:event_yourShowActionPerformed

    private void yourSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourSubjectActionPerformed
        
    }//GEN-LAST:event_yourSubjectActionPerformed

    private void yourAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourAgeActionPerformed
        
    }//GEN-LAST:event_yourAgeActionPerformed

    private void openBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBookButtonActionPerformed
        if(yourName.getText().isEmpty() || yourShow.getText().isEmpty() || yourSubject.getText().isEmpty() || yourAge.getText().isEmpty()){
        JOptionPane.showMessageDialog(yourName, "You must enter your name, favorite show, favorite subject, and age to open the book");
    }else{
        String name = yourName.getText().toUpperCase().substring(0,1) + yourName.getText().substring(1);
        
        String color = yourShow.getText().toLowerCase();
        
        String subject = yourSubject.getText().toLowerCase();
        
        String age = yourAge.getText();
        int myAge = 0;
        try{          
            myAge = Integer.parseInt(age);
            if(myAge > 100){
                JOptionPane.showMessageDialog(yourAge, "Please enter an age under 100 years old");
            }else{
                passedAge.setText(age);
                Person p = new Person(name, color, subject, age);
                new FirstPage(p).setVisible(true);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(yourAge, "Please enter a valid number");
            yourAge.setText("");
    }//GEN-LAST:event_openBookButtonActionPerformed

    }
    }
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RandomEndingOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomEndingOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomEndingOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomEndingOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coverpage().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton openBookButton;
    private javax.swing.JTextField passedAge;
    private javax.swing.JTextField yourAge;
    private javax.swing.JTextField yourName;
    private javax.swing.JTextField yourShow;
    private javax.swing.JTextField yourSubject;
    // End of variables declaration//GEN-END:variables

}