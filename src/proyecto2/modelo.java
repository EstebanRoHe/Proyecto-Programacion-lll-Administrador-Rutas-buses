package proyecto2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class modelo extends Observable {

    public modelo() {
        choferes = new ArrayList<>();
        bus = new ArrayList<>();
        viaje = new ArrayList<>();
        enco = new ArrayList<>();
    }

    public void cargar(ArrayList<chofer> choferes, ArrayList<buses> bus, ArrayList<viajes> viaje, ArrayList<encomienda> enco) {
        // public void cargar() {
        this.choferes = new ArrayList<>();
        this.bus = new ArrayList<>();
        this.viaje = new ArrayList<>();
        this.enco = new ArrayList<>();
    }

    public void agregarObservador(Observer observador) {
        addObserver(observador);
        setChanged();
        notifyObservers("observador");
    }
//-----------------------------------------------------------------------------------------------------------
    //conjunto de choferes

    public void agregarChoferes(chofer nuevoC) {
        choferes.add(nuevoC);
    }

    public int obtenesNumeroChoferes() {
        return choferes.size();
    }

    public chofer obtenerChofer(int index) {
        return choferes.get(index);

    }

    public void toStringC() {
        for (int i = 0; i < choferes.size(); i++) {
            System.out.println(choferes.get(i).datos());
        }
    }

//-----------------------------------------------------------------------------------------------------------
    //conjunto de buses
    public void agregarbus(buses nuevoB) {
        bus.add(nuevoB);
    }

    public int obtenesNumeroBus() {
        return bus.size();
    }

    public buses obtenerBus(int index) {
        return bus.get(index);
    }

    public void toStringB() {
        for (int i = 0; i < bus.size(); i++) {
            System.out.println(bus.get(i).datosB());
        }
    }

    public void crearBus(String estado, String placa, String codigo, int capacidad) {

        buses b = new buses(estado, placa, codigo, capacidad);

    }
//-----------------------------------------------------------------------------------------------------------
    //conjuto de viajes

    public void agregarViaje(viajes nuevoV) {
        viaje.add(nuevoV);
    }

    public int obtenesNumeroViajes() {
        return viaje.size();
    }

    public viajes obtenerViajes(int index) {
        return viaje.get(index);
    }

    public void toStringV() {
        for (int i = 0; i < viaje.size(); i++) {
            System.out.println(viaje.get(i).datosV());
        }
    }

    public void crearViaje(String salida, String destino, int kilometros, String fecha, String fechaLl, int horaS, int horaLl, double precio) {

        viajes v = new viajes(salida, destino, kilometros, fecha, fechaLl, horaS, horaLl, precio);

    }

//-----------------------------------------------------------------------------------------------------------
    //Conjunto de encomiendas
    public void agregarEcomienda(encomienda nuevoE) {
        enco.add(nuevoE);
    }

    public int obtenesNumeroEcomiendas() {
        return enco.size();
    }

    public encomienda obtenerEcomienda(int index) {
        return enco.get(index);
    }

    public void crearEcomienda(double peso, String codigo, String personaEntrega, String personaRetirar, String salida, String destino, int horaS, int horaE, String fechaS, String fechaE, int estado, String fecha) {

        encomienda e = new encomienda(peso, codigo, personaEntrega, personaRetirar, salida, destino, horaS, horaE, fechaS, fechaE, estado, fecha);

    }

    public String retirar(String codigo) {
        String x = " ";

        for (int i = 0; i < enco.size(); i++) {
            if (enco.get(i).getcodigo().equals(codigo)) {
                if (enco.get(i).getestado() == 0) {
                    enco.get(i).setestado(1);
                    x = "Se retiro correcta mente \n";
                    break;
                } else {
                    x = " No hay encomienda pendiente con ese codigo ";
                }
            } else {
                x = "No se pudo encontrar la encomienda o no existe tal ";
            }
        }
        return x;
    }

    public String retirarXnombre(String nombre) {
        String x = " ";

        for (int i = 0; i < enco.size(); i++) {
            if (enco.get(i).getpersonaRetirar().equals(nombre)) {
                if (enco.get(i).getestado() == 0) {
                    enco.get(i).setestado(1);
                    x = "Se retiro correcta mente \n";
                    break;
                } else {
                    x = " No hay encomienda pendiente con ese nombre ";
                }
            } else {
                x = "No se pudo encontrar la encomienda o no existe tal ";
            }
        }
        return x;
    }

    public String BuscaEnco(String codigo) {
        String x = " ";

        for (int i = 0; i < enco.size(); i++) {
            if (enco.get(i).getcodigo().equals(codigo)) {
                x = enco.get(i).datosE();

                break;
            } else {
                x = "No se pudo encontrar la encomienda o no existe tal ";
            }
        }
        return x;
    }

    public void BuscaCliente(String cliente) {
        int cont = 0;

        for (int i = 0; i < enco.size(); i++) {
            if (enco.get(i).getpersonaEntrega().equals(cliente)) {
                System.out.println(enco.get(i).datosE());
                cont++;
            }

        }
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "El Cliente no a realizado encomiendas");
        }
    }

    public void BuscaRuta(String ruta) {
        int cont = 0;

        for (int i = 0; i < enco.size(); i++) {
            if (enco.get(i).getRuta().equals(ruta)) {
                System.out.println(enco.get(i).datosE());
                cont++;
            }
        }
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "Esta Rutana no tiene encomiendas");
        }
    }

    public void toStringE() {
        for (int i = 0; i < enco.size(); i++) {
            System.out.println(enco.get(i).datosE());
        }
    }

//--------------------------------------------------------------------------
    //Base de datos
    public chofer recuperarC() {
        chofer resultadoC = null;
        return resultadoC;
    }

    public void guardar(chofer nuevoC) throws Exception {
        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();
        PreparedStatement stm = cnx.prepareStatement(COMANDO_INSERTAR);
        stm.clearParameters();
        stm.setString(1, nuevoC.getid());
        stm.setString(2, nuevoC.getnombre());
        stm.setString(3, nuevoC.gettelefono());
        stm.setString(4, nuevoC.getedad());
        if (stm.executeUpdate() != 1) {
            throw new Exception();
        }

        GestorBD.obtenerInstancia().cerrarConexion();

    }
    // UPDATE

    public void actualizar(chofer actual, chofer nueva) throws Exception {

        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();

        PreparedStatement stm = cnx.prepareStatement(COMANDO_ACTUALIZAR);

        stm.setString(1, nueva.getnombre());
        stm.setString(2, nueva.gettelefono());
        stm.setString(2, nueva.getedad());
        stm.setString(4, actual.getid());

        if (stm.executeUpdate() != 1) {
            throw new Exception();
        }
        GestorBD.obtenerInstancia().cerrarConexion();

    }

    // DELETE
    public void eliminar(String idchofer) throws Exception {
        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();

        PreparedStatement stm = cnx.prepareStatement(COMANDO_ELIMINAR);
        stm.clearParameters();
        stm.setString(1, idchofer);
        if (stm.executeUpdate() != 1) {
            throw new Exception();
        }

        GestorBD.obtenerInstancia().cerrarConexion();
    }
    //Consultar

    public void cargarDatos() throws Exception {

        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();

        Statement stm = cnx.createStatement();

        // Contiene los datos recuperados.
        ResultSet rs = stm.executeQuery(COMANDO_CONSULTAR);
        while (rs.next()) {
            String id = rs.getNString("id");
            String nombre = rs.getString("nombre");
            String telefono = rs.getString("telefono");
            String edad = rs.getString("edad");
            chofer c = new chofer(nombre, id, telefono, edad);
            choferes.add(c);
        }
        GestorBD.obtenerInstancia().cerrarConexion();

    }

    public ComboBoxModel<chofer> comboBox() {
        JComboBox<chofer> combo = new JComboBox<chofer>();
        for (int i = 0; i < choferes.size(); i++) {
            combo.addItem(choferes.get(i));
        }
        return combo.getModel();
    }
    
     public ComboBoxModel<buses> comboBoxBus() {
        JComboBox<buses> combo = new JComboBox<buses>();
        for (int i = 0; i < bus.size(); i++) {
            combo.addItem(bus.get(i));
        }
        return combo.getModel();
    }
     
      public ComboBoxModel<viajes> comboBoxViaje() {
        JComboBox<viajes> combo = new JComboBox<viajes>();
        for (int i = 0; i < viaje.size(); i++) {
            combo.addItem(viaje.get(i));
        }
        return combo.getModel();
    }
         
    
  
     

    //----------------------------------------------------------------------
    //Buses
    public void guardarBuses(buses nuevoB) throws Exception {
        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();
        PreparedStatement stm = cnx.prepareStatement(COMANDO_INSERTARB);
        stm.clearParameters();
        stm.setString(1, nuevoB.getcodigo());
        stm.setString(2, nuevoB.getestado());
        stm.setString(3, nuevoB.getplaca());
        stm.setInt(4, nuevoB.getcapacidad());
        stm.setString(5, nuevoB.getc().getid());
        if (stm.executeUpdate() != 1) {
            throw new Exception();
        }

        GestorBD.obtenerInstancia().cerrarConexion();

    }

    public void cargarDatosB() throws Exception {

        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();

        Statement stm = cnx.createStatement();

        // Contiene los datos recuperados.
        ResultSet rs = stm.executeQuery(COMANDO_CONSULTARB);
        while (rs.next()) {
            String codigo = rs.getString("codigo");
            String estado = rs.getNString("estado");
            String placa = rs.getString("placa");
            int capacidad = rs.getInt("capacidad");
            chofer c = getChofer(rs.getNString("id"));
            buses b = new buses(estado, placa, codigo, capacidad);
            b.setC(c);
            bus.add(b);
           
        }
        GestorBD.obtenerInstancia().cerrarConexion();

    }
    //--------------------------------------------------------------
    //viajes

    public void guardarViajes(viajes nuevoV) throws Exception {
        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();
        PreparedStatement stm = cnx.prepareStatement(COMANDO_INSERTARV);
        stm.clearParameters();
        stm.setString(1, nuevoV.getruta());
        stm.setString(2, nuevoV.getsalida());
        stm.setString(3, nuevoV.getdestino());
        stm.setInt(4, nuevoV.getkilometros());
        stm.setString(5, nuevoV.getfecha());
        stm.setString(6, nuevoV.getfechaLl());
        stm.setInt(7, nuevoV.gethoraS());
        stm.setInt(8, 1);
        stm.setDouble(9, nuevoV.getprecio());
        stm.setString(10, nuevoV.getunidad().getcodigo());
        if (stm.executeUpdate() != 1) {
            throw new Exception();
        }

        GestorBD.obtenerInstancia().cerrarConexion();

    }
 
    public void cargarDatosV() throws Exception {

        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();

        Statement stm = cnx.createStatement();

        // Contiene los datos recuperados.
        ResultSet rs = stm.executeQuery(COMANDO_CONSULTARV);
        while (rs.next()) {
           // String ruta = rs.getNString("ruta");
            String salida = rs.getNString("salida");
            int  kilometros = rs.getInt("kilometros");
            String destino = rs.getNString("destino");
            String fecha = rs.getNString("fecha");
            String fechaLl = rs.getString("fechaLl");
            int horaS = rs.getInt("horaS");
            int horaLl = rs.getInt("horaLl");
            double precio = rs.getDouble("precio");
            buses b= getBus(rs.getNString("unidad"));
            viajes v = new viajes(salida,destino,kilometros,fecha,fechaLl,horaS,horaLl,precio);
            v.setUnidad(b);
            viaje.add(v);
           
        }

     GestorBD.obtenerInstancia().cerrarConexion();
    }
  //-------------------------------------------------------------------
    //encomiendas
    
     public void guardarEncomienda(encomienda nuevoE) throws Exception {
        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();
        PreparedStatement stm = cnx.prepareStatement(COMANDO_INSERTARE);
        stm.clearParameters();
        stm.setString(1, nuevoE.getcodigo());
        stm.setDouble(2, nuevoE.getpeso());
        stm.setDouble(3, nuevoE.getprecioXpeso());
        stm.setString(4, nuevoE.getpersonaEntrega());
        stm.setString(5, nuevoE.getpersonaRetirar());
        stm.setString(6, nuevoE.getsalida());
        stm.setString(7, nuevoE.getdestino());
        stm.setInt(8, nuevoE.gethoraS());
        stm.setInt(9, nuevoE.gethoraE());
        stm.setString(10, nuevoE.getfechaS());
        stm.setString(11,nuevoE.getfechaE());
        stm.setInt(12,nuevoE.getestado());
        stm.setString(13,nuevoE.getfecha());
        stm.setString(14, nuevoE.getviaje().getruta());
        if (stm.executeUpdate() != 1) {
            throw new Exception();
        }

        GestorBD.obtenerInstancia().cerrarConexion();

    }

    public void cargarDatosE() throws Exception {

        Connection cnx = GestorBD.obtenerInstancia().obtenerConexion();
 
        Statement stm = cnx.createStatement();

        // Contiene los datos recuperados.
        ResultSet rs = stm.executeQuery(COMANDO_CONSULTARE);
        while (rs.next()) {
          String codigo = rs.getNString("codigo");
          Double peso = rs.getDouble("peso");
         // Double precioXpeso = rs.getDouble("precioXpeso");
          String personaEntrega = rs.getNString("personaEntrega");
          String personaRetirar= rs.getNString("personaRetirar");
          String salida = rs.getNString("salida");
          String destino = rs.getNString("destino");
          int horaS = rs.getInt("horaS");
          int horaE = rs.getInt("horaE");
         String fechaS = rs.getNString("fechaS");
         String fechaE = rs.getNString("fechaE");
         int estado = rs.getInt("estado");
         String fecha = rs.getNString("fecha");
         viajes v=getViaje(rs.getNString("viaje"));
         encomienda e = new encomienda( peso,  codigo, personaEntrega,  personaRetirar, salida,  destino, horaS, horaE,  fechaS,  fechaE,  estado,  fecha);
         e.setviaje(v);
         enco.add(e);
          
        }

     GestorBD.obtenerInstancia().cerrarConexion();
    }
    
    public chofer getChofer(String id){
        String edad="", telefono="", nombre="";
        for(int i=0; i<choferes.size(); i++){
            if(choferes.get(i).getid().equals(id)){
                nombre=choferes.get(i).getnombre();
                edad=choferes.get(i).getedad();
                telefono=choferes.get(i).gettelefono();
                break;
            }
        }
        chofer c = new chofer(nombre, id , telefono, edad);
        return c;
    }
    
    public buses getBus(String codigo){
        String estado=" ", placa=" ";
        int capacidad=0;
        for(int i=0; i<bus.size(); i++){
            if(bus.get(i).getcodigo().equals(codigo)){
                estado=bus.get(i).getestado();
                placa= bus.get(i).getestado();
                capacidad=bus.get(i).getcapacidad();
                break;
            }
        }
        buses b = new buses(estado, placa, codigo, capacidad);
        return b;
    }
    
    public viajes getViaje(String ruta){
        String salida="", destino="" , fecha="", fechaLl="";
        int kilometros=0, horaS=0, horaLl=0;
        double precio=0.0;
        for(int i=0; i<viaje.size(); i++){
            if(viaje.get(i).getruta().equals(ruta)){
                salida=viaje.get(i).getsalida();
                destino=viaje.get(i).getdestino();
                fecha=viaje.get(i).getfecha();
                fechaLl=viaje.get(i).getfechaLl();
                kilometros=viaje.get(i).getkilometros();
                horaS=viaje.get(i).gethoraS();
                horaLl=viaje.get(i).gethoraLl();
                precio=viaje.get(i).getprecio();
                break;
            }
        }
        
        viajes v=new viajes(salida, destino, kilometros, fecha, fechaLl, horaS, horaLl, precio);
        
        return v;
    }
    
    //----------------------------------------
    //Los private
    public void toB() {
        for (int i = 0; i < bus.size(); i++) {
System.out.println("Bus");
            System.out.println(bus.get(i).datosB());
        }
    }
    
     public void toV() {
        for (int i = 0; i < viaje.size(); i++) {
System.out.println("Viajes");
            System.out.println(viaje.get(i).datosV());
        }
    }
     
      public void toE() {
        for (int i = 0; i < enco.size(); i++) {
System.out.println("Encomienda");
            System.out.println(enco.get(i).datosE());
        }
    }

    //--------------------------------------
    private static final String COMANDO_INSERTAR
            = "INSERT INTO choferes "
            + "(id, nombre, telefono, edad) "
            + "VALUES(?, ?, ?, ?); ";
    private static final String COMANDO_ELIMINAR
            = "DELETE FROM choferes "
            + "WHERE id = ?; ";

    private static final String COMANDO_CONSULTAR
            = "SELECT * FROM choferes; ";

    private static final String COMANDO_ACTUALIZAR
            = "UPDATE choferes SET nombre=?, telefono=? , edad=? WHERE id=?; ";

    //----------------------------------------------  
// buses
    private static final String COMANDO_INSERTARB
            = "INSERT INTO buses "
            + "(codigo, estado, placa, capacidad, id) "
            + "VALUES(?, ?, ?, ?, ?); ";

    private static final String COMANDO_CONSULTARB
            = "SELECT * FROM buses";
//------------------------------------------------
    // viajes

    private static final String COMANDO_INSERTARV
            = "INSERT INTO viajes "
            + "(ruta,salida,destino,kilometros,fecha,fechaLl,horaS,horaLl,precio,unidad) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";

    private static final String COMANDO_CONSULTARV
            = "SELECT * FROM viajes ";
//-------------------------------------------------------------
    //encomiendas
    private static final String COMANDO_INSERTARE
            = "INSERT INTO encomiendas "
            + "(codigo,peso,precioXpeso,personaEntrega,personaRetirar,salida,destino,horaS,horaE,fechaS,fechaE,estado,fecha,viaje) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";

    private static final String COMANDO_CONSULTARE
            = "SELECT * FROM encomiendas; ";
    
    

    private ArrayList<chofer> choferes;
    private ArrayList<buses> bus;
    private ArrayList<viajes> viaje;
    private ArrayList<encomienda> enco;

}
