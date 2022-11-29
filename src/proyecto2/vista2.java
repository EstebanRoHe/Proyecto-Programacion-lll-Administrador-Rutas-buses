package proyecto2;
 
import javax.swing.ComboBoxModel;

public class vista2 extends javax.swing.JFrame {

    
    public vista2() {
        initComponents();
        componentes2();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLruta = new javax.swing.JLabel();
        jLHoraSalida = new javax.swing.JLabel();
        jLHoraLlegada = new javax.swing.JLabel();
        jLFechaSalida = new javax.swing.JLabel();
        jLFechaLlegada = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLcampo = new javax.swing.JLabel();

        setTitle("ticket");
        setLocation(new java.awt.Point(800, 80));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(101, 57, 82));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 130, 80, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora de salida  :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 210, 120, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora de llegada :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 249, 120, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Salida :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 299, 130, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de llegada :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 350, 130, 19);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ruta :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 170, 60, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 389, 70, 30);

        jLnombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLnombre);
        jLnombre.setBounds(90, 130, 320, 30);

        jLruta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLruta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLruta);
        jLruta.setBounds(70, 170, 340, 30);

        jLHoraSalida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLHoraSalida.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLHoraSalida);
        jLHoraSalida.setBounds(150, 210, 260, 30);

        jLHoraLlegada.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLHoraLlegada.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLHoraLlegada);
        jLHoraLlegada.setBounds(150, 250, 260, 30);

        jLFechaSalida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLFechaSalida.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLFechaSalida);
        jLFechaSalida.setBounds(150, 300, 260, 30);

        jLFechaLlegada.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLFechaLlegada.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLFechaLlegada);
        jLFechaLlegada.setBounds(150, 350, 260, 30);

        jLPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLPrecio);
        jLPrecio.setBounds(80, 390, 260, 30);

        jLabel8.setFont(new java.awt.Font("Goudy Stout", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ticket");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 20, 280, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 10, 70, 70);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Campo :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 430, 70, 19);

        jLcampo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLcampo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLcampo);
        jLcampo.setBounds(80, 430, 100, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 420, 460);

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
            java.util.logging.Logger.getLogger(vista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista2().setVisible(true);
            }
        });
    }
    public void componentes2(){
        
    }
       
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLFechaLlegada;
    public javax.swing.JLabel jLFechaSalida;
    public javax.swing.JLabel jLHoraLlegada;
    public javax.swing.JLabel jLHoraSalida;
    public javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLcampo;
    public javax.swing.JLabel jLnombre;
    public javax.swing.JLabel jLruta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
