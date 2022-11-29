package proyecto2;
 
public class viajes {

    private String ruta;
    private String salida;
    private String destino;
    private int kilometros;
    private String fecha;
    private String fechaLl;
    private int horaS;
    private int horaLl;
    private double precio;
    private buses unidad;
    
    public viajes(){
         this.salida = "";
        this.destino = "";
        this.kilometros = 0;
        this.unidad=new buses();
        this.fecha = "";
        this.fechaLl = "";
        this.horaS = 0;
        this.horaLl = 0;
        this.precio = 0.0;
        this.ruta = salida + " - " + destino;
        
    }

    public buses getUnidad() {
        return unidad;
    }

    public void setUnidad(buses unidad) {
        this.unidad = unidad;
    }
    public viajes(String salida, String destino, int kilometros, String fecha, String fechaLl, int horaS, int horaLl, double precio){
        this.salida = salida;
        this.destino = destino;
        this.kilometros = kilometros;
        this.unidad=new buses();
        this.fecha = fecha;
        this.fechaLl = fechaLl;
        this.horaS = horaS;
        this.horaLl = horaLl;
        this.precio = precio;
        this.ruta = salida + " - " + destino;
      
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

    public int getkilometros() {
        return kilometros;
    }

    public void setkilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public buses getunidad() {
        return unidad;
    }

    public void setunidad(buses unidad) {
        this.unidad = unidad;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public String getfechaLl() {
        return fechaLl;
    }

    public void setfechaLl(String fechaLl) {
        this.fechaLl = fechaLl;
    }

    public int gethoraS() {
        return horaS;
    }

    public void sethoraS(int horaS) {
        this.horaS = horaS;
    }

    public int gethoraLl() {
        return horaLl;
    }

    public void sethoraLl(int horaLl) {
        this.horaLl = horaLl;
    }

    public double getprecio() {
        return precio;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    public String getruta() {
        return ruta;
    }

    public void setruta(String ruta) {
        this.ruta = ruta;
    }

    public String datosV() {

        return "Ruta " + getruta() + "Punto de salida" + getsalida() + "Punto de destino" + getdestino() + "Kilometros" + getkilometros()
                + "Unidad manejada" + getunidad() + "Fecha" + getfecha() + "Hora de salida" + gethoraS() + "Hora de llegada" + gethoraLl() + "Precio del vieja" + getprecio() +"Unidad" + getUnidad();
    }

    @Override
    public String toString() {
        return ruta;
    }
}
