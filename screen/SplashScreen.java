/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spalsh.screen;

/**
 *
 * @author ASUS
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        this.setExtendedState(SplashScreen.MAXIMIZED_BOTH);
        this.setUndecorated(true);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        load = new javax.swing.JLabel();
        Bar = new javax.swing.JProgressBar();
        time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(13, 28, 53));
        background.setForeground(new java.awt.Color(0, 255, 204));
        background.setPreferredSize(new java.awt.Dimension(1920, 1080));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setBackground(new java.awt.Color(13, 28, 53));
        Logo.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\OOP\\coba.png")); // NOI18N
        Logo.setText("jLabel2");
        background.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 124, 636, 563));

        load.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        load.setForeground(new java.awt.Color(255, 255, 255));
        load.setText("Loading...");
        background.add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 933, -1, -1));

        Bar.setBackground(new java.awt.Color(51, 255, 255));
        Bar.setForeground(new java.awt.Color(0, 255, 204));
        background.add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1020, 1896, 30));

        time.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("0");
        background.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1842, 928, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\OOP\\tes.png")); // NOI18N
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 851, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SplashScreen sp =new SplashScreen();
        sp.setVisible(true);
        
        try {
            for(int i=0; i<=100; i++){
                Thread.sleep(30);
                sp.time.setText(i+"%");
                if(i==10){
                    sp.load.setText("Memulai Modul");
                }
                if(i==30){
                    sp.load.setText("Memuat Modul");
                }
                if(i==50){
                    sp.load.setText("Menghubungkan ke Database");
                }
                 if(i==70){
                    sp.load.setText("Berhasil menghubungkan ke Database");
                }
                  if(i==90){
                    sp.load.setText("Menjalankan Apilkasi");
                }
                   if(i==100){
                   Beranda home= new Beranda();
                   home.setVisible(true);
                   sp.setVisible(false);
                   
                }
                sp.Bar.setValue(i);
            }
        } catch (Exception e) {
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Bar;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel load;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}