package proyecto2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class vista extends javax.swing.JFrame {
    
    public vista() {
        initComponents();
        componentes();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NombreDePersonaAEntrgar = new javax.swing.JLabel();
        NombreQuienRecibeLaEcomineda = new javax.swing.JLabel();
        HoraDeEntrega = new javax.swing.JLabel();
        HoraDeRetiro = new javax.swing.JLabel();
        ViajeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLSalida = new javax.swing.JLabel();
        jLHoraLl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtNombreEntregaEco = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtNombreRecibeEco = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtHoraDeEntregaEco = new javax.swing.JTextPane();
        BtnAgregarEco = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtPeso = new javax.swing.JTextPane();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLFechaDeSalidaDelViaje = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLPrecioXpeso = new javax.swing.JLabel();
        jLDestinoDelBusEnco = new javax.swing.JLabel();
        jLSalidaDelBusEnco = new javax.swing.JLabel();
        jLFechaDeLlegada = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLFechaS = new javax.swing.JLabel();
        jLSB = new javax.swing.JLabel();
        jLdB = new javax.swing.JLabel();
        jLcodigo = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtbuscar = new javax.swing.JTextPane();
        btnRetirar = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtRxNombre = new javax.swing.JTextPane();
        btnRxNombre = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TxtNombreChofer = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        TxtCedulaChofer = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        TxtEdadChofer = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        TxtTelefonoChofer = new javax.swing.JTextPane();
        agregarChoferes = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNumeroPlaca = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtIdenti = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCapacidadMaxBus = new javax.swing.JTextPane();
        comboBoxSeleccionarChofer = new javax.swing.JComboBox<>();
        BtnAgregarBus = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        CboxEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtPuntoDeSalidaViajes = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtPuntoDeLlegadaViaje = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtCantidadDeKilometros = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtFechaDeSalidaDelViaje = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtFehadeLlegadaDelViaje = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtHoraDesalidaviajes = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtHoraDeLlegaViajes = new javax.swing.JTextPane();
        comboBoxSbus = new javax.swing.JComboBox<>();
        btnAgregarViaje = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtPrecio = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtBuscarEnco = new javax.swing.JTextPane();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtClienteBusqueda = new javax.swing.JTextPane();
        btnBuscarClientes = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jComboBoxConsultar = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnTickets = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        txtCliente = new javax.swing.JTextPane();
        jLabel32 = new javax.swing.JLabel();
        boxTickets = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        comBoxMostrarBus = new javax.swing.JComboBox<>();
        panelBus = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz");
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jPanelPrincipal.setBackground(new java.awt.Color(51, 40, 40));
        jPanelPrincipal.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encomienda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        NombreDePersonaAEntrgar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreDePersonaAEntrgar.setForeground(new java.awt.Color(255, 255, 255));
        NombreDePersonaAEntrgar.setText("Nombre quien entrega la ecomienda");
        jPanel1.add(NombreDePersonaAEntrgar);
        NombreDePersonaAEntrgar.setBounds(20, 60, 270, 20);

        NombreQuienRecibeLaEcomineda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreQuienRecibeLaEcomineda.setForeground(new java.awt.Color(255, 255, 255));
        NombreQuienRecibeLaEcomineda.setText("Nombre quien recibe la ecomienda");
        jPanel1.add(NombreQuienRecibeLaEcomineda);
        NombreQuienRecibeLaEcomineda.setBounds(20, 100, 260, 20);

        HoraDeEntrega.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HoraDeEntrega.setForeground(new java.awt.Color(255, 255, 255));
        HoraDeEntrega.setText("Hora de llegada de la ecomienda");
        jPanel1.add(HoraDeEntrega);
        HoraDeEntrega.setBounds(20, 300, 240, 20);

        HoraDeRetiro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HoraDeRetiro.setForeground(new java.awt.Color(255, 255, 255));
        HoraDeRetiro.setText("Hora de salida de la ecomienda");
        jPanel1.add(HoraDeRetiro);
        HoraDeRetiro.setBounds(20, 270, 230, 20);

        ViajeComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViajeComboBoxMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ViajeComboBoxMouseReleased(evt);
            }
        });
        ViajeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViajeComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(ViajeComboBox);
        ViajeComboBox.setBounds(200, 150, 430, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora de entrega al destinario");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 340, 230, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione el viaje");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 150, 160, 30);

        jLSalida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLSalida.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLSalida);
        jLSalida.setBounds(280, 270, 330, 20);

        jLHoraLl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLHoraLl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLHoraLl);
        jLHoraLl.setBounds(280, 300, 330, 20);

        jScrollPane4.setViewportView(TxtNombreEntregaEco);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(320, 50, 310, 30);

        jScrollPane5.setViewportView(TxtNombreRecibeEco);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(320, 100, 310, 30);

        jScrollPane6.setViewportView(txtHoraDeEntregaEco);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(330, 330, 300, 30);

        BtnAgregarEco.setText("Agregar Encomienda");
        BtnAgregarEco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarEcoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregarEco);
        BtnAgregarEco.setBounds(460, 490, 170, 32);

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Peso del paquete");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(20, 380, 130, 19);

        jScrollPane19.setViewportView(txtPeso);

        jPanel1.add(jScrollPane19);
        jScrollPane19.setBounds(160, 380, 90, 30);

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Codigo de Encomienda :");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(20, 430, 170, 19);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Fecha de Llegada de la Encomineda");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(20, 200, 260, 19);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Fecha de Salida de la Encomienda");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(20, 230, 260, 19);

        jLFechaDeSalidaDelViaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jLFechaDeSalidaDelViaje);
        jLFechaDeSalidaDelViaje.setBounds(330, 230, 300, 0);

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Total de Precio x Peso");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(20, 500, 160, 19);

        jLPrecioXpeso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLPrecioXpeso.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLPrecioXpeso);
        jLPrecioXpeso.setBounds(190, 500, 170, 20);

        jLDestinoDelBusEnco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jLDestinoDelBusEnco);
        jLDestinoDelBusEnco.setBounds(520, 410, 120, 0);

        jLSalidaDelBusEnco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jLSalidaDelBusEnco);
        jLSalidaDelBusEnco.setBounds(520, 380, 100, 0);

        jLFechaDeLlegada.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLFechaDeLlegada.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLFechaDeLlegada);
        jLFechaDeLlegada.setBounds(330, 190, 300, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salida del Bus :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 380, 110, 19);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Destino del Bus :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(350, 410, 120, 19);

        jLFechaS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLFechaS.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLFechaS);
        jLFechaS.setBounds(330, 226, 300, 30);

        jLSB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLSB.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLSB);
        jLSB.setBounds(480, 376, 160, 20);

        jLdB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLdB.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLdB);
        jLdB.setBounds(480, 410, 160, 20);

        jLcodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLcodigo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLcodigo);
        jLcodigo.setBounds(200, 430, 140, 20);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Digite el codigo de la encomienda a retirar");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(20, 600, 300, 20);

        jScrollPane21.setViewportView(txtbuscar);

        jPanel1.add(jScrollPane21);
        jScrollPane21.setBounds(330, 595, 180, 25);

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetirar);
        btnRetirar.setBounds(520, 590, 120, 30);

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Digite el cliete de la encomienda a retirar");
        jPanel1.add(jLabel35);
        jLabel35.setBounds(20, 549, 300, 30);

        jScrollPane20.setViewportView(txtRxNombre);

        jPanel1.add(jScrollPane20);
        jScrollPane20.setBounds(330, 550, 180, 25);

        btnRxNombre.setText("Retirar");
        btnRxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRxNombreActionPerformed(evt);
            }
        });
        jPanel1.add(btnRxNombre);
        btnRxNombre.setBounds(520, 550, 120, 30);

        jPanelPrincipal.add(jPanel1);
        jPanel1.setBounds(10, 10, 650, 630);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choferes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Pristina", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre a registrar");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 40, 140, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cedula ");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 90, 110, 19);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edad");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 130, 110, 19);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefono");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 170, 110, 19);

        TxtNombreChofer.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(TxtNombreChofer);

        jPanel4.add(jScrollPane7);
        jScrollPane7.setBounds(160, 35, 220, 30);

        TxtCedulaChofer.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(TxtCedulaChofer);

        jPanel4.add(jScrollPane8);
        jScrollPane8.setBounds(160, 75, 220, 30);

        TxtEdadChofer.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane9.setViewportView(TxtEdadChofer);

        jPanel4.add(jScrollPane9);
        jScrollPane9.setBounds(160, 120, 220, 30);

        TxtTelefonoChofer.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane10.setViewportView(TxtTelefonoChofer);

        jPanel4.add(jScrollPane10);
        jScrollPane10.setBounds(160, 160, 220, 30);

        agregarChoferes.setText("Agregar Chofer");
        agregarChoferes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarChoferesActionPerformed(evt);
            }
        });
        jPanel4.add(agregarChoferes);
        agregarChoferes.setBounds(250, 320, 140, 32);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 410, 370);

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Pristina", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("# Placa");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(10, 30, 90, 20);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Numero Unico");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(10, 80, 140, 20);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Capacidad Maxima");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(10, 130, 140, 19);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Seleccione el Chofer");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 170, 160, 20);

        txtNumeroPlaca.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtNumeroPlaca);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(170, 20, 210, 30);

        txtIdenti.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtIdenti);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(170, 70, 210, 30);

        txtCapacidadMaxBus.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(txtCapacidadMaxBus);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(170, 120, 100, 30);

        comboBoxSeleccionarChofer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboBoxSeleccionarChofer.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(comboBoxSeleccionarChofer);
        comboBoxSeleccionarChofer.setBounds(170, 160, 100, 30);

        BtnAgregarBus.setText("Agregar Bus");
        BtnAgregarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarBusActionPerformed(evt);
            }
        });
        jPanel5.add(BtnAgregarBus);
        BtnAgregarBus.setBounds(260, 320, 130, 32);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Seleccione el Estado del Bus");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(10, 210, 220, 19);

        CboxEstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CboxEstado.setForeground(new java.awt.Color(0, 0, 0));
        CboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exelente", "Bueno", "Mantenimiento", " ", " " }));
        jPanel5.add(CboxEstado);
        CboxEstado.setBounds(240, 200, 130, 29);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(410, 0, 410, 370);

        jPanelPrincipal.add(jPanel2);
        jPanel2.setBounds(670, 150, 820, 370);

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Viajes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Pristina", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Digite el Punto de Salida");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(10, 30, 210, 30);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Digite el Punto de Llegada");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(10, 70, 220, 20);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cantidad De Kilometros recorridos");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 110, 250, 20);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Hora de Salida del Bus");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(10, 230, 190, 20);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Hora de Llegada del Bus");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(10, 270, 190, 19);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Seleccione el Bus deseado para el Viaje");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(10, 360, 290, 19);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Fecha de Salida del Viaje");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(10, 150, 190, 19);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Fecha de Llegada del Viaje");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(10, 190, 190, 19);

        txtPuntoDeSalidaViajes.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane11.setViewportView(txtPuntoDeSalidaViajes);

        jPanel3.add(jScrollPane11);
        jScrollPane11.setBounds(290, 20, 340, 30);

        txtPuntoDeLlegadaViaje.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane12.setViewportView(txtPuntoDeLlegadaViaje);

        jPanel3.add(jScrollPane12);
        jScrollPane12.setBounds(290, 60, 340, 30);

        txtCantidadDeKilometros.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane13.setViewportView(txtCantidadDeKilometros);

        jPanel3.add(jScrollPane13);
        jScrollPane13.setBounds(290, 100, 340, 30);

        txtFechaDeSalidaDelViaje.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane14.setViewportView(txtFechaDeSalidaDelViaje);

        jPanel3.add(jScrollPane14);
        jScrollPane14.setBounds(290, 140, 340, 30);

        txtFehadeLlegadaDelViaje.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane15.setViewportView(txtFehadeLlegadaDelViaje);

        jPanel3.add(jScrollPane15);
        jScrollPane15.setBounds(290, 180, 340, 30);

        txtHoraDesalidaviajes.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane16.setViewportView(txtHoraDesalidaviajes);

        jPanel3.add(jScrollPane16);
        jScrollPane16.setBounds(290, 220, 340, 30);

        txtHoraDeLlegaViajes.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane17.setViewportView(txtHoraDeLlegaViajes);

        jPanel3.add(jScrollPane17);
        jScrollPane17.setBounds(290, 260, 340, 30);

        comboBoxSbus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboBoxSbus.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxSbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSbusActionPerformed(evt);
            }
        });
        jPanel3.add(comboBoxSbus);
        comboBoxSbus.setBounds(310, 350, 100, 30);

        btnAgregarViaje.setText("Agregar Nuevo Viaje");
        btnAgregarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarViajeActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarViaje);
        btnAgregarViaje.setBounds(630, 350, 170, 32);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Precio");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(10, 310, 48, 16);

        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane18.setViewportView(txtPrecio);

        jPanel3.add(jScrollPane18);
        jScrollPane18.setBounds(60, 300, 210, 30);

        jPanelPrincipal.add(jPanel3);
        jPanel3.setBounds(670, 530, 820, 400);

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Encomiendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(null);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Digite el codigo de la encomienda a consultar");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(10, 20, 330, 30);

        jScrollPane23.setViewportView(txtBuscarEnco);

        jPanel6.add(jScrollPane23);
        jScrollPane23.setBounds(340, 20, 170, 25);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel6.add(btnBuscar);
        btnBuscar.setBounds(520, 20, 120, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite el cliente que desea consultar");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(10, 70, 280, 20);

        jScrollPane24.setViewportView(txtClienteBusqueda);

        jPanel6.add(jScrollPane24);
        jScrollPane24.setBounds(300, 65, 210, 25);

        btnBuscarClientes.setText("Bucar Cliente");
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });
        jPanel6.add(btnBuscarClientes);
        btnBuscarClientes.setBounds(520, 60, 120, 32);

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Seleccione la Ruta que desa consultar");
        jPanel6.add(jLabel34);
        jLabel34.setBounds(10, 100, 270, 30);

        jComboBoxConsultar.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxConsultarMouseClicked(evt);
            }
        });
        jPanel6.add(jComboBoxConsultar);
        jComboBoxConsultar.setBounds(300, 100, 340, 26);

        jPanelPrincipal.add(jPanel6);
        jPanel6.setBounds(10, 650, 650, 140);

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venta de Tickets", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setToolTipText("");
        jPanel7.setLayout(null);

        btnTickets.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTickets.setText("Tickets");
        btnTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsActionPerformed(evt);
            }
        });
        jPanel7.add(btnTickets);
        btnTickets.setBounds(490, 90, 140, 30);

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Vender Tickets");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(360, 90, 110, 30);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Nombre del cliente");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(10, 20, 140, 19);

        jScrollPane22.setViewportView(txtCliente);

        jPanel7.add(jScrollPane22);
        jScrollPane22.setBounds(160, 15, 220, 25);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Seleccion el viaja a vender");
        jPanel7.add(jLabel32);
        jLabel32.setBounds(10, 50, 200, 30);

        boxTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTicketsActionPerformed(evt);
            }
        });
        jPanel7.add(boxTickets);
        boxTickets.setBounds(220, 50, 380, 26);

        jPanelPrincipal.add(jPanel7);
        jPanel7.setBounds(10, 800, 650, 130);

        jLabel36.setFont(new java.awt.Font("Goudy Stout", 1, 60)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 0));
        jLabel36.setText("Tico Viajes");
        jPanelPrincipal.add(jLabel36);
        jLabel36.setBounds(690, 20, 780, 90);

        jPanel8.setBackground(new java.awt.Color(0, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Buses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setLayout(null);

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Seleccione la ruta a consultar");
        jPanel8.add(jLabel37);
        jLabel37.setBounds(10, 30, 220, 30);

        comBoxMostrarBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comBoxMostrarBusMouseClicked(evt);
            }
        });
        comBoxMostrarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxMostrarBusActionPerformed(evt);
            }
        });
        jPanel8.add(comBoxMostrarBus);
        comBoxMostrarBus.setBounds(240, 30, 390, 26);

        jPanelPrincipal.add(jPanel8);
        jPanel8.setBounds(10, 940, 650, 70);

        getContentPane().add(jPanelPrincipal);
        jPanelPrincipal.setBounds(420, 0, 1500, 1020);

        panelBus.setBackground(new java.awt.Color(153, 153, 153));
        panelBus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panelBus.setForeground(new java.awt.Color(255, 255, 255));
        panelBus.setAutoscrolls(true);
        panelBus.setLayout(null);
        getContentPane().add(panelBus);
        panelBus.setBounds(0, 50, 420, 970);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Nuevo bus ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 2, 420, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarEcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarEcoActionPerformed
        try {
            viajes v = (viajes) ViajeComboBox.getSelectedItem();
            encomienda e = new encomienda(Double.parseDouble(txtPeso.getText()), String.valueOf(jLcodigo.getText()), TxtNombreEntregaEco.getText(), TxtNombreRecibeEco.getText(), txtPuntoDeSalidaViajes.getText(), txtPuntoDeLlegadaViaje.getText(), Integer.parseInt(jLSalida.getText()), Integer.parseInt(jLHoraLl.getText()), txtFechaDeSalidaDelViaje.getText(), txtHoraDeEntregaEco.getText(), 0, txtFehadeLlegadaDelViaje.getText());
            e.setviaje(v);
            gestor.agregarEncomineda(e);
            gestor.guardarEncomienda(e);
            jLPrecioXpeso.setText(String.valueOf(e.getprecioXpeso()));
            
            JOptionPane.showMessageDialog(null, " Se agrego correctamente la encomienda ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnAgregarEcoActionPerformed

    private void agregarChoferesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarChoferesActionPerformed
        try {
            chofer c = new chofer(TxtNombreChofer.getText(), TxtCedulaChofer.getText(), TxtTelefonoChofer.getText(), TxtEdadChofer.getText());
            comboBoxSeleccionarChofer.addItem(c);
            gestor.guardar(c);
            
            JOptionPane.showMessageDialog(null, " Se agrego correctamente el chofer ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_agregarChoferesActionPerformed

    private void BtnAgregarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarBusActionPerformed
        try {
            chofer c = (chofer) comboBoxSeleccionarChofer.getSelectedItem();
            buses b = new buses(String.valueOf(CboxEstado.getSelectedItem()), txtNumeroPlaca.getText(), txtIdenti.getText(), Integer.parseInt(txtCapacidadMaxBus.getText()));
            b.setC(c);
            comboBoxSbus.addItem(b);
            gestor.agregarBus(b);
            gestor.guardarBuses(b);
            JOptionPane.showMessageDialog(null, " Se agrego correctamente el bus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnAgregarBusActionPerformed

    private void btnAgregarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarViajeActionPerformed
        try {
            buses b = (buses) comboBoxSbus.getSelectedItem();
            if (!b.getestado().equalsIgnoreCase("Mantenimiento")) {
                viajes v = new viajes(txtPuntoDeSalidaViajes.getText(), txtPuntoDeLlegadaViaje.getText(), Integer.parseInt(txtCantidadDeKilometros.getText()), txtFechaDeSalidaDelViaje.getText(), txtFehadeLlegadaDelViaje.getText(), Integer.parseInt(txtHoraDesalidaviajes.getText()), Integer.parseInt(txtHoraDeLlegaViajes.getText()), Double.parseDouble(txtPrecio.getText()));
                v.setUnidad(b);
                ViajeComboBox.addItem(v);
                jComboBoxConsultar.addItem(v);
                boxTickets.addItem(v);
                comBoxMostrarBus.addItem(v);
                gestor.guardarViajes(v);
                gestor.agregarViajes(v);
                JOptionPane.showMessageDialog(null, " Se agrego correctamente el viaje ");
            } else {
                JOptionPane.showMessageDialog(null, " La Unidad seleccionada esta en matenimiento, seleccione otra ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnAgregarViajeActionPerformed

    private void ViajeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViajeComboBoxActionPerformed
        
        viajes v = (viajes) ViajeComboBox.getSelectedItem();
        jLFechaDeLlegada.setText(v.getfechaLl());
        jLFechaS.setText(v.getfecha());
        jLSalida.setText(String.valueOf(v.gethoraS()));
        jLHoraLl.setText(String.valueOf(v.gethoraLl()));
        jLSB.setText(v.getsalida());
        jLdB.setText(v.getdestino());
        int numero = (int) (Math.random() * 1000 + 1);
        jLcodigo.setText("" + numero);

    }//GEN-LAST:event_ViajeComboBoxActionPerformed

    private void ViajeComboBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViajeComboBoxMouseReleased
// No se usa
    }//GEN-LAST:event_ViajeComboBoxMouseReleased

    private void ViajeComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViajeComboBoxMouseClicked
// No se usa
    }//GEN-LAST:event_ViajeComboBoxMouseClicked

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        
        JOptionPane.showMessageDialog(null, gestor.retirar(txtbuscar.getText()));

    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        viajes v = (viajes) boxTickets.getSelectedItem();
        v2.jLnombre.setText(txtCliente.getText());
        v2.jLFechaSalida.setText(v.getfecha());
        v2.jLFechaLlegada.setText(v.getfechaLl());
        v2.jLHoraSalida.setText(String.valueOf(v.gethoraS()));
        v2.jLHoraLlegada.setText(String.valueOf(v.gethoraLl()));
        v2.jLPrecio.setText(String.valueOf(v.getprecio()));
        v2.jLruta.setText(v.getruta());
        v.getUnidad().setLista(campo2, "Cliente: " + txtCliente.getText() + " | № Campo: " + (campo2 + 1));
        v2.jLcampo.setText("" + (campo2 + 1));
        v2.setVisible(true);
        panelBus.removeAll();
        panelBus.updateUI();
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void comboBoxSbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSbusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSbusActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        JOptionPane.showMessageDialog(null, gestor.BuscarEnco(txtBuscarEnco.getText()));

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed
        gestor.BuscaCliente(txtClienteBusqueda.getText());
    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void jComboBoxConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxConsultarMouseClicked
        viajes v = (viajes) jComboBoxConsultar.getSelectedItem();
        gestor.BuscaRuta(v.getruta());
    }//GEN-LAST:event_jComboBoxConsultarMouseClicked

    private void btnRxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRxNombreActionPerformed
        JOptionPane.showMessageDialog(null, gestor.retirarXnombre(txtRxNombre.getText()));
    }//GEN-LAST:event_btnRxNombreActionPerformed

    private void boxTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTicketsActionPerformed
        panelBus.updateUI();
        
        botones = new ArrayList<>();
        panelBus.setLayout(new GridLayout(0, 2, 100, 5));
        int campo = 1;
        
        viajes v = (viajes) boxTickets.getSelectedItem();
        for (int i = 0; i < v.getUnidad().getcapacidad(); i++) {            
            int aux = i;
            JButton boton = new JButton("Campo " + campo++);
            if (v.getUnidad().getLista(aux).equals("Disponible")) {
                boton.setBackground(Color.green);
            } else {
                boton.setBackground(Color.red);
                
            }
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    if (boton.getBackground() == Color.green) {
                        campo2 = aux;
                    }else{
                        JOptionPane.showMessageDialog(null, v.getUnidad().getLista(aux));
                    }
                }
            });
            
            boton.setSize(1, 1);
            botones.add(boton);
            panelBus.add(boton);
            
        }
         
        panelBus.updateUI();
        
    }//GEN-LAST:event_boxTicketsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelBus.removeAll();
        panelBus.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comBoxMostrarBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comBoxMostrarBusMouseClicked
//        viajes v = (viajes) comBoxMostrarBus.getSelectedItem();
//        v.getUnidad().toLista(v.getruta());
    }//GEN-LAST:event_comBoxMostrarBusMouseClicked

    private void comBoxMostrarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxMostrarBusActionPerformed
         viajes v = (viajes) comBoxMostrarBus.getSelectedItem();
        v.getUnidad().toLista(v.getruta());
    }//GEN-LAST:event_comBoxMostrarBusActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new vista().setVisible(true);
                
            }
        });
    }
    
    public void componentes() {
        try {
            gestor = new controlador();
            v2 = new vista2();
            v2.setSize(460, 500);
            gestor.cargarDatos();
            gestor.cargarBuses();
            gestor.cargarDatosV();
            gestor.cargarDatosE();
            
            comboBoxSeleccionarChofer.setModel(gestor.comboBox());
            comboBoxSbus.setModel(gestor.comboBoxBus());
            ViajeComboBox.setModel(gestor.comboBoxViaje());
            jComboBoxConsultar.setModel(gestor.comboBoxViaje());
            boxTickets.setModel(gestor.comboBoxViaje());
            comBoxMostrarBus.setModel(gestor.comboBoxViaje());
        } catch (Exception e) {
            
        }
    }
    
    private controlador gestor;
    private vista2 v2;
    private ArrayList<JButton> botones;
    private int campo2;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAgregarBus;
    public javax.swing.JButton BtnAgregarEco;
    public javax.swing.JComboBox<String> CboxEstado;
    public javax.swing.JLabel HoraDeEntrega;
    public javax.swing.JLabel HoraDeRetiro;
    public javax.swing.JLabel NombreDePersonaAEntrgar;
    public javax.swing.JLabel NombreQuienRecibeLaEcomineda;
    public javax.swing.JTextPane TxtCedulaChofer;
    public javax.swing.JTextPane TxtEdadChofer;
    public javax.swing.JTextPane TxtNombreChofer;
    public javax.swing.JTextPane TxtNombreEntregaEco;
    public javax.swing.JTextPane TxtNombreRecibeEco;
    public javax.swing.JTextPane TxtTelefonoChofer;
    public javax.swing.JComboBox<viajes> ViajeComboBox;
    public javax.swing.JButton agregarChoferes;
    public javax.swing.JComboBox<viajes> boxTickets;
    public javax.swing.JButton btnAgregarViaje;
    public javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarClientes;
    public javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnRxNombre;
    private javax.swing.JButton btnTickets;
    public javax.swing.JComboBox<viajes> comBoxMostrarBus;
    public javax.swing.JComboBox<buses> comboBoxSbus;
    public javax.swing.JComboBox<chofer> comboBoxSeleccionarChofer;
    private javax.swing.JButton jButton1;
    public javax.swing.JComboBox<viajes> jComboBoxConsultar;
    public javax.swing.JLabel jLDestinoDelBusEnco;
    private javax.swing.JLabel jLFechaDeLlegada;
    public javax.swing.JLabel jLFechaDeSalidaDelViaje;
    private javax.swing.JLabel jLFechaS;
    public javax.swing.JLabel jLHoraLl;
    public javax.swing.JLabel jLPrecioXpeso;
    private javax.swing.JLabel jLSB;
    public javax.swing.JLabel jLSalida;
    public javax.swing.JLabel jLSalidaDelBusEnco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLcodigo;
    private javax.swing.JLabel jLdB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JPanel panelBus;
    public javax.swing.JTextPane txtBuscarEnco;
    public javax.swing.JTextPane txtCantidadDeKilometros;
    public javax.swing.JTextPane txtCapacidadMaxBus;
    public javax.swing.JTextPane txtCliente;
    public javax.swing.JTextPane txtClienteBusqueda;
    public javax.swing.JTextPane txtFechaDeSalidaDelViaje;
    public javax.swing.JTextPane txtFehadeLlegadaDelViaje;
    public javax.swing.JTextPane txtHoraDeEntregaEco;
    public javax.swing.JTextPane txtHoraDeLlegaViajes;
    public javax.swing.JTextPane txtHoraDesalidaviajes;
    public javax.swing.JTextPane txtIdenti;
    public javax.swing.JTextPane txtNumeroPlaca;
    public javax.swing.JTextPane txtPeso;
    public javax.swing.JTextPane txtPrecio;
    public javax.swing.JTextPane txtPuntoDeLlegadaViaje;
    public javax.swing.JTextPane txtPuntoDeSalidaViajes;
    private javax.swing.JTextPane txtRxNombre;
    public javax.swing.JTextPane txtbuscar;
    // End of variables declaration//GEN-END:variables
}
