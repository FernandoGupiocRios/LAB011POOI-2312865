import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Author {
    private String nombre;
    private String apellido;

    public Author(String nombre, String apellido) {
        this(nombre, apellido, 'm');
    }

    public Author(String nombre, String apellido, char par) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido;
    }
}
