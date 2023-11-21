
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Libros {
    private List<Book> libros;

    public Libros() {
        libros = new ArrayList<>();
    }

    public void addBook(Book libro) {
        libros.add(libro);
    }

    public List<Book> getLibros() {
        return libros;
    }

    public Book getBookByTitulo(String titulo) {
        for (Book libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void removeBook(Book libro) {
        libros.remove(libro);
    }

    public void editBook(Book libro, int paginas, double precio, int cantidad) {
        editBook(libro, paginas, cantidad);
    }

    public void editBook(Book libro, int paginas, int cantidad) {
        libro.setPaginas(paginas);
        double precio = 0;
        libro.setPrecio(precio);
        libro.setCantidad(cantidad);
    }

    public void sortByAuthor() {
        Collections.sort(libros, Comparator.comparing(b -> b.getAutor().getApellido()));
    }
}