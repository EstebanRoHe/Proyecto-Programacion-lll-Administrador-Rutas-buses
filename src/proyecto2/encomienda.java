package proyecto2;

public class encomienda {
    private double peso;
    private String codigo;
    private double precioXpeso;
    private String personaEntrega;
    private String personaRetirar;
    private String salida;
    private String destino;
    private int horaS;
    private int horaE;
    private String fechaS;
    private String fechaE;
    private int estado;
    viajes viaje;
    private String fecha;
     
             
    public encomienda(double peso, String codigo, String personaEntrega, String personaRetirar, String salida, String destino, int horaS, int horaE, String fechaS, String fechaE, int estado, String fecha) {
        this.peso = peso;
        this.codigo = codigo;
        this.precioXpeso = precioXpeso;
        this.personaEntrega = personaEntrega;
        this.personaRetirar = personaRetirar;
        this.viaje = new viajes();
        this.salida = salida;
        this.destino = destino;
        this.horaS = horaS;
        this.horaE = horaE;
        this.fechaS = fechaS;
        this.fechaE = fechaE;
        this.estado = estado;
        this.fecha=fecha;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public double getpeso() {
        return peso;
    }

    public void setpeso(double peso) {
        this.peso = peso;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getprecioXpeso() {
        return peso*1000;
    }

    public void setprecioXpeso(double precioXpeso) {
        this.precioXpeso = precioXpeso;
    }

    public String getpersonaEntrega() {
        return personaEntrega;
    }

    public void setpersonaEntrega(String personaEntrega) {
        this.personaEntrega = personaEntrega;
    }

    public String getpersonaRetirar() {
        return personaRetirar;
    }

    public void setpersonaRetirar(String personaRetirar) {
        this.personaRetirar = personaRetirar;
    }

    public viajes getviaje() {
        return viaje;
    }

    public void setviaje(viajes viaje) {
        this.viaje = viaje;
    }

    public String getsalida() {
        return salida;
    }

    public void setsalida(String salida) {
        this.salida = salida;
    }

    public String getdestino() {
        return destino;
    }

    public void setdestino(String destino) {
        this.destino = destino;
    }
 
    public int gethoraS() {
        return horaS;
    }

    public void sethoraS(int horaS) {
        this.horaS = horaS;
    }

    public int gethoraE() {
        return horaE;
    }

    public void sethoraE(int horaE) {
        this.horaE = horaE;
    }

    public String getfechaS() {
        return fechaS;
    }

    public void setfechaS(String fechaS) {
        this.fechaS = fechaS;
    }

    public String getfechaE() {
        return fechaE;
    }

    public void setfechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public int getestado() {
        return estado;
    }

    public void setestado(int estado) {
        this.estado = estado;
    }
    
       public String datosE(){
           String x;
       if(getestado() == 0){
           x=" En espera ";
           
       }else{
           x=" Retirado ";
           
       }
           
       return "-----------Encomienda-----------\nCodigo :"+getcodigo()+"\nPrecio por el peso : "+getprecioXpeso()+"\nNombre de la persona quien entrega : "+getpersonaEntrega()+"\nNombre de la persona quien recibe : "
               +getpersonaRetirar()+"\nViaje : "+getviaje()+"\nLugar de salida : "+getsalida()+"\nLugar de destino : "+getdestino()+"\nHora de salida : "+gethoraS()+
               "\nHora de Llegada : "+gethoraE()+"\nFecha de Salida : "+getfechaS()+"\nFecha de Llegada :"+getfecha()+"\nHora de Entrega : "+getfechaE()+"\nEstado : "+ x +"\n--------------------&--------------------"; 
    }
       @Override
       public String toString(){
           return codigo;
       }
       public String getRuta(){
           return salida + " - " + destino;

       }
}
