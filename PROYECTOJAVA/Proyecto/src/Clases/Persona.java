package Clases;

public class Persona {
    private String Nombre;
    private String Apellido;
    private String DNI;

    public Persona(String nombre, String apellido, String DNI) {
        Nombre = nombre;
        Apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}


