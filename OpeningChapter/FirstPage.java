/*first page:
    cj - christmas sweater
    dropdown box - where to go?
*/

package OpeningChapter;

import Park.PageThreePark;
import Storytime.PageFourStorytime;
import Library.PageFiveLibrary;
import EndingChapter.RandomEndingOne;
import business.Person;
import javax.swing.JFrame;

public class FirstPage extends javax.swing.JFrame {

   
    public FirstPage() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public FirstPage(Person p) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       
        String name = p.getName();
        String show = p.getShow();
        String subject = p.getSubject();
        String age = p.getAge();
        
        
        passedName.setText(name);
        passedShow.setText(show);
        passedSubject.setText(subject);
        passedAge.setText(age);
        int myAge = Integer.parseInt(age);
        
        pageTwo.setText("\nHi " + name + "!" +
                "\nMy name is Colby Jack (I know...named after the cheese)." +
                "\nYou're " + Math.abs(myAge - 3) + " years older than me! I can't wait to be " + (age) + "!" +
                "\nAnyways, this is a picture of me with my mom. She's pretty cool!" +
                "\nAnd I'm wearing my favorite sweater, so I'm ready for an adventure " +
                "\nwhenever you are!" +
                "\nClick on where you want to go!");
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
        jLabel2 = new javax.swing.JLabel();
        backToHomeButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pageTwo = new javax.swing.JTextArea();
        passedName = new javax.swing.JLabel();
        passedShow = new javax.swing.JLabel();
        passedSubject = new javax.swing.JLabel();
        passedAge = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 900));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OpeningChapter/Photos/Colby Jack sweater2 resized.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 6)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 71, -1, -1));

        backToHomeButton.setBackground(new java.awt.Color(204, 255, 204));
        backToHomeButton.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        backToHomeButton.setText("Back to Home");
        backToHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backToHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1189, 665, 280, 70));

        jComboBox1.setBackground(new java.awt.Color(0, 102, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Where to go?", "park", "library", "story time" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 440, 280, 62));

        pageTwo.setColumns(20);
        pageTwo.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        pageTwo.setRows(5);
        pageTwo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 6)));
        jScrollPane1.setViewportView(pageTwo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 71, 921, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 830));

        passedName.setText("passedName");
        getContentPane().add(passedName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        passedShow.setText("passedShow");
        getContentPane().add(passedShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        passedSubject.setText("passedSubject");
        getContentPane().add(passedSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        passedAge.setText("passedAge");
        getContentPane().add(passedAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String itemChosen = (String)jComboBox1.getSelectedItem();
        
        String name = passedName.getText();
        String show = passedShow.getText();
        String subject = passedSubject.getText();
        String age = passedAge.getText();
        
        Person p = new Person(name, show, subject, age);
       
        if(itemChosen.equals("park")){
            new PageThreePark(p).setVisible(true);
            this.setVisible(false);
        }
        else if(itemChosen.equals("library")){
            new PageFiveLibrary(p).setVisible(true);
            this.setVisible(false);
        //problem opening PageFiveLibrary
        }
        else if(itemChosen.equals("story time")){
            new PageFourStorytime(p).setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void backToHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeButtonActionPerformed
        new Coverpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backToHomeButtonActionPerformed

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
                new FirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToHomeButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pageTwo;
    private javax.swing.JLabel passedAge;
    private javax.swing.JLabel passedName;
    private javax.swing.JLabel passedShow;
    private javax.swing.JLabel passedSubject;
    // End of variables declaration//GEN-END:variables

}
