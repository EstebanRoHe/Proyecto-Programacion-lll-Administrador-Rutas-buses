package proyecto2;
  
public class chofer {
   private String nombre;
   private String id;
   private String telefono;
   private String edad;
    public chofer(){
        this.nombre = "";
        this.id = "";
        this.telefono = "";
        this.edad = "";
    }
    public chofer(String nombre, String id, String telefono, String edad) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.edad = edad;
    }
   
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getedad() {
        return edad;
    }

    public void setedad(String edad) {
        this.edad = edad;
    }
    
    public String datos(){
      
        return " Nombre : "+getnombre()+" | Cedula : "+getid()+" | Telefono : "+gettelefono()+" | Edad : "+getedad();
    }
    
   @Override
   public String toString(){
       return nombre;
   }
}
