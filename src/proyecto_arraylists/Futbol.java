
package proyecto_arraylists;


public class Futbol {
    private String nombre;
    private String Apellido;
    private String Fecha;
    private int Edad;
    private int Goles;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int Goles) {
        this.Goles = Goles;
    }
    
     public Futbol(String nombre, String Apellido, String Fecha,int Edad, int Goles){
     setNombre(nombre);
     setApellido(Apellido);
     setFecha(Fecha);
     setEdad(Edad);
     setGoles(Goles);
     }

    @Override
    public String toString() {
        return  "Nombre= " + nombre + "\n Apellido= " + Apellido + "\n Fecha= " + Fecha + "\nEdad= " + Edad + "\n Goles=" + Goles ;
    }
     
}
