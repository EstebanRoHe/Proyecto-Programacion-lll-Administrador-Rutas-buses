package proyecto2;
  
import java.util.ArrayList;

public class buses {
    private String estado;
    private String placa;
    private String codigo;
    private int capacidad;
    private ArrayList<String> Lista;
    chofer c;
    
 public buses(){
     this.estado = "";
        this.placa = "";
        this.codigo = "";
        this.capacidad = 0;
        this.c=new chofer();
        
 }
    public buses(String estado, String placa, String codigo, int capacidad) {
        this.estado = estado;
        this.placa = placa;
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.c=new chofer();
        this.Lista = new ArrayList<>();
        for(int i=0;i<capacidad;i++){
            
            Lista.add("Disponible");
        }
    }
    public void toLista(String x){
       System.out.println("Ruta: " + x);
        for(int j=0; j < Lista.size(); j++){
         if(!Lista.get(j).equals("Disponible"))
            System.out.println(Lista.get(j));
        }
    }
    
    public String getLista(int index) {
        return Lista.get(index);
    }

    public void setLista(int index, String x) {
        Lista.set(index, x);
    }
    
    public chofer getC() {
        return c;
    }

    public void setC(chofer c) {
        this.c = c;
    }
    
    public chofer getc() {
        return c;
    }

    public void setc(chofer c) {
        this.c = c;
    }
    public String getestado() {
        return estado;
    }

    public void setestado(String estado) {
        this.estado = estado;
    }

    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getcapacidad() {
        return capacidad;
    }

    public void setcapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String datosB(){
        for(int i=0;i<getcapacidad();i++){
           System.out.println(" Estados de Acientos del bus "+i);
        }
     return " Estado "+getestado()+" Placa "+getplaca()+" Codigo "+getcodigo()+" Capacidad "+getcapacidad()+" Chofer "+ getc().datos();
    }
    @Override
   public String toString(){
       return codigo;
   }

}
