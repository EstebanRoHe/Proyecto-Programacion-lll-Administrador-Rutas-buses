package proyecto2;
   
import java.util.ArrayList;
import java.util.Observer;
import javax.swing.ComboBoxModel;

 
public class controlador {
    private modelo datos;
    private static controlador instancia = null;
    public controlador(){
        datos = new modelo();
    }
     public void agregarObservador(Observer observador){
        datos.agregarObservador(observador);
    }
     public void cargar(ArrayList<chofer> choferes ,ArrayList<buses> bus,ArrayList<viajes> viaje,ArrayList<encomienda> enco){
        datos.cargar(  choferes ,bus,viaje,enco);
    }
//-----------------------------------------------------------------------------------------------------------
     //coferes
    public void agregarChofer(chofer nuevoC){
        datos.agregarChoferes(nuevoC);
    }
    public void obtenerNumeroDeChoferes(){
        datos.obtenesNumeroChoferes();
    }
    public void obteneralChofer(){
        datos.obtenerChofer(0);
    }
    public void stringC(){
        datos.toStringC();
    }
   
 //-----------------------------------------------------------------------------------------------------------
    //buses
     public void agregarBus(buses nuevoB){
        datos.agregarbus(nuevoB);
    }
    public void obtenerNumeroDeBuses(){
        datos.obtenesNumeroBus();
    }
    public void obteneralBus(){
        datos.obtenerBus(0);
    }
    public void stringB(){
        datos.toStringB();
    }
    public void nuevoB(String estado, String placa, String codigo, int capacidad){
        datos.crearBus(estado, placa, codigo, capacidad);
    }
 //-----------------------------------------------------------------------------------------------------------  
    //viejes
     public void agregarViajes(viajes nuevoV){
        datos.agregarViaje(nuevoV);
    }
    public void obtenerNumeroDeViajes(){
        datos.obtenesNumeroViajes();
    }
    public void obtenerelViaje(){
        datos.obtenerViajes(0);
    }
    public void stringV(){
         datos.toStringV();
    }
    public void nuevoV(String salida, String destino, int kilometros,  String fecha,String fechaLl, int horaS, int horaLl, double precio){
     datos.crearViaje(salida, destino, kilometros, fecha,fechaLl, horaS, horaLl, precio);
    }
 //-----------------------------------------------------------------------------------------------------------   
    //encomienda
     public void agregarEncomineda(encomienda nuevoE){
        datos.agregarEcomienda(nuevoE);
    }
    public void obtenerNumeroDeEcomienda(){
        datos.obtenesNumeroEcomiendas();
    }
    public void obteneralEcomienda(){
        datos.obtenerEcomienda(0);
    }
    public void stringE(){
        datos.toStringE();
    }
     public String retirar(String codigo){
       return datos.retirar(codigo);
    }
      public String retirarXnombre(String nombre){
       return datos.retirarXnombre(nombre);
    }
     public String BuscarEnco(String codigo){
       return datos.BuscaEnco(codigo);
    }
    
    public void nuevoE(double peso, String codigo,  String personaEntrega, String personaRetirar, String salida, String destino, int horaS, int horaE, String fechaS, String fechaE, int estado, String fecha){
        datos.crearEcomienda(peso, codigo,  personaEntrega, personaRetirar, salida, destino, horaS, horaE, fechaS, fechaE, estado,fecha);
    }
    public void  BuscaCliente(String cliente){
        datos.BuscaCliente(cliente);
    }
    public void  BuscaRuta(String ruta){
        datos.BuscaRuta(ruta);
    }
     public ComboBoxModel<chofer> comboBox(){
        return datos.comboBox();
     }
     
     public ComboBoxModel<buses> comboBoxBus(){
        return datos.comboBoxBus();
     }
      
     public ComboBoxModel<viajes> comboBoxViaje(){
        return datos.comboBoxViaje();
     }
     
    //-------------------------------------------------------------
    //Base de datos de choferes
    public static controlador obtenerInstancia() {
        if (instancia == null) {
            instancia = new  controlador();
        }
        return instancia;
    }
    public chofer recuperarC() {
        return datos.recuperarC();
    }
    public void guardar(chofer nuevoC) throws Exception {
        datos.guardar(nuevoC);
    }
     public void actualizar(chofer actual, chofer nueva) throws Exception {
        datos.actualizar(actual, nueva);
     
    }
       public void eliminar(String idchofer) throws Exception {
       datos.eliminar(idchofer);
    
    }
         public void cargarDatos() throws Exception{
             datos.cargarDatos();
    } 
//--------------------------------------------------------------------------------------------         
//Bases de datos buses
    public void guardarBuses(buses nuevoB)throws Exception{
        datos.guardarBuses(nuevoB);
    }   
    
    public void cargarBuses() throws Exception{
        datos.cargarDatosB();
    }
   public void toB(){
       datos.toB();
    }
   
   //------------------------------------------------------------------------------------------
   // viajes 
     public void cargarDatosV() throws Exception {
         datos.cargarDatosV();
     }
      public void guardarViajes(viajes nuevoV) throws Exception {
          datos.guardarViajes(nuevoV);
      }
     
        public void toV() {
            datos.toV();
        }
      
     //---------------------------------------------------------------------------------------
    // encomiendasd
      public void cargarDatosE() throws Exception {
          datos.cargarDatosE();
      }
       public void guardarEncomienda(encomienda nuevoE) throws Exception {
           datos.guardarEncomienda(nuevoE);
       }
       public void toE() {
           datos.toE();
       }
}
