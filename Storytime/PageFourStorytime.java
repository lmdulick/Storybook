//story time
//slideshow of cj sweaters

package Storytime;

import EndingChapter.RandomEndingOne;
import business.Person;
import business.RandomObject;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class PageFourStorytime extends javax.swing.JFrame {

    public PageFourStorytime() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public PageFourStorytime(Person p) {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        
        Timer tm = new Timer(1000, (ActionEvent e) -> {
            storypg1.setVisible(true);
            
            txtArea.setVisible(true);
            txtArea2.setVisible(false);
            
            txtArea.setText("\n                       IT'S STORY TIME!!");
               
        });
        tm.start();   
        
        Timer tm1 = new Timer(4000, (ActionEvent e) -> {
            tm.stop();
            
            storypg1.setVisible(false);
            storypg2.setVisible(true);
            storypg3.setVisible(false);
            storypg4.setVisible(false);
            
            txtArea.setVisible(true);
            txtArea2.setVisible(false);
            
            txtArea.setText("  This was my FIRST ever sweater..."
                    + "\n  well I guess it's more like a costume." 
                    + "\n  But here I look so small!");
            
        });
        tm1.start();
        
        Timer tm2 = new Timer(8000, (ActionEvent e) -> {
            tm1.stop();
            
            storypg1.setVisible(false);
            storypg2.setVisible(false);
            storypg3.setVisible(true);
            storypg4.setVisible(false);
            
            txtArea.setVisible(true);
            txtArea2.setVisible(false);
            
            txtArea.setText("  This is another one of my sweaters!"
                    + "\n  It's Christmas themed, and it's awesome!"
                    + "\n  so so so so comfy!");
                            
        });
        tm2.start();
        
        Timer tm3 = new Timer(12000, (ActionEvent e) -> {
            tm2.stop();
            
            storypg1.setVisible(false);
            storypg2.setVisible(false);
            storypg3.setVisible(false);
            storypg4.setVisible(true);
            
            txtArea.setVisible(false);
            txtArea2.setVisible(true);
            
            txtArea2.setText("  Sometimes my mom puts me in sweatshirts like this one "
                    + "\n  when I sit on her lap, so I'm comfy and warm."
                    + "\n  I like this one alot, especially because it's an XXL."
                    + "\n  Anyways, thanks for listening to my TED Talk on sweaters!"
                    + "\n  Let's keep going!");
            
        });
        tm3.start();
        
        Timer tm4 = new Timer(20000, (ActionEvent e) -> {
            tm3.stop();
            
            new Storytime2(p).setVisible(true);
            
            storypg1.setVisible(false);
            storypg2.setVisible(false);
            storypg3.setVisible(false);
            storypg4.setVisible(false);
            
        });
        tm4.start();
        
        Timer tm5 = new Timer(20500, (ActionEvent e) -> {
            tm4.stop();
        });
        tm5.start();
        
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
        txtArea = new javax.swing.JTextArea();
        storypg1 = new javax.swing.JLabel();
        storypg2 = new javax.swing.JLabel();
        storypg3 = new javax.swing.JLabel();
        txtArea2 = new javax.swing.JTextArea();
        storypg4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        txtArea.setRows(5);
        txtArea.setBorder(null);
        jPanel1.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 800, 140));

        storypg1.setBackground(new java.awt.Color(204, 204, 255));
        storypg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OpeningChapter/Photos/cjBaby1resized.jpg"))); // NOI18N
        jPanel1.add(storypg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1540, 830));

        storypg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OpeningChapter/Photos/cjCostume1resized.jpg"))); // NOI18N
        jPanel1.add(storypg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, -40, -1, 880));

        storypg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OpeningChapter/Photos/cjsweater1resized.jpg"))); // NOI18N
        jPanel1.add(storypg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 650, 830));

        txtArea2.setColumns(20);
        txtArea2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        txtArea2.setRows(5);
        txtArea2.setBorder(null);
        jPanel1.add(txtArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 860, 180));

        storypg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OpeningChapter/Photos/cjSweater3.JPG"))); // NOI18N
        jPanel1.add(storypg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 630, 830));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel storypg1;
    private javax.swing.JLabel storypg2;
    private javax.swing.JLabel storypg3;
    private javax.swing.JLabel storypg4;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtArea2;
    // End of variables declaration//GEN-END:variables
}
