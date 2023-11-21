import java.util.*;

public class Biblioteca {
    private Autores autoresCol;
    private Libros librosCol;

    public Biblioteca() {
        autoresCol = new Autores();
        librosCol = new Libros();

        // Crear autores
        Author autor1 = new Author("Gabriel García Márquez", "marquez@gmail.com");
        Author autor2 = new Author("J. R. R. Tolkien", "tolkien@gmail.com");
        Author autor3 = new Author("George Orwell", "orwell@gmail.com");
        Author autor4 = new Author("Aldous Huxley", "huxley@gmail.com", 'm');
        Author autor5 = new Author("Jane Austen", "austen@gmail.com", 'f');
        Author autor6 = new Author("Fiódor Dostoyevski", "dostoyevski@gmail.com", 'm');
        Author autor7 = new Author("Vladimir Nabokov", "nabokov@gmail.com", 'm');
        Author autor8 = new Author("James Joyce", "joyce@gmail.com", 'm');
        Author autor9 = new Author("Gustave Flaubert", "flaubert@gmail.com", 'm');
        Author autor10 = new Author("Marcel Proust", "proust@gmail.com", 'm');
        Author autor11 = new Author("Miguel de Cervantes", "cervantes@gmail.com", 'm');
        Author autor12 = new Author("Oscar Wilde", "wilde@gmail.com", 'm');
        Author autor13 = new Author("Antoine de Saint-Exupéry", "saint@gmail.com", 'm');
        Author autor14 = new Author("William Faulkner", "faulkner@gmail.com", 'm');
        Author autor15 = new Author("Jonathan Swif", "swif@gmail.com", 'm');
        Author autor16 = new Author("Arthur Golden", "golden@gmail.com", 'm');
        Author autor17 = new Author("Suzanne Collins", "collins@gmail.com", 'f');
        Author autor18 = new Author("J. K. Rowling", "rowling@gmail.com", 'f');
        Author autor19 = new Author("Isaac Asimov", "asimov@gmail.com", 'm');
        Author autor20 = new Author("Dante Alighieri", "alighieri@gmail.com", 'm');

        // ... (resto de los autores)

        Book libro1 = new Book("Cien años de soledad", autor1, 200, 200.00, 400);
        Book libro2 = new Book("El señor de los anillos (Trilogía)", autor2, 1500, 1500.00, 1200);
        Book libro3 = new Book("1984", autor3, 500, 300.00, 300);
        Book libro4 = new Book("Un mundo feliz", autor4, 320, 500.00, 500);
        Book libro5 = new Book("Orgullo y prejuicio", autor5, 130, 700.00, 700);
        Book libro6 = new Book("Crimen y castigo", autor6, 230, 540.00, 540);
        Book libro7 = new Book("Lolita", autor7, 140, 456.00, 456);
        Book libro8 = new Book("Ulises", autor8, 158, 400.00, 400);
        Book libro9 = new Book("Madame Bovary", autor9, 120, 430.00, 430);
        Book libro10 = new Book("En busca del tiempo perdido", autor10, 345, 450.00, 450);
        Book libro11 = new Book("Don Quijote de la Mancha", autor11, 340, 123.00, 123);
        Book libro12 = new Book("El retrato de Dorian Gray", autor12, 125, 67.00, 67);
        Book libro13 = new Book("El Principito", autor13, 259, 345.00, 345);
        Book libro14 = new Book("El ruido y la furia", autor14, 134, 246.00, 246);
        Book libro15 = new Book("Los viajes de Gulliver", autor15, 186, 234.00, 234);
        Book libro16 = new Book("Memorias de una geisha", autor16, 195, 234.00, 234);
        Book libro17 = new Book("Los juegos del hambre", autor17, 181, 234.00, 234);
        Book libro18 = new Book("Harry Potter y la piedra filosofal", autor18, 650, 4000.00, 4000);
        Book libro19 = new Book("Los miserables", autor19, 23, 245.00, 245);
        Book libro20 = new Book("Las crónicas de Narnia", autor20, 456, 444.00, 444);

        // ... (resto de los libros)

        autoresCol.addAuthor(autor1);
        autoresCol.addAuthor(autor2);
        autoresCol.addAuthor(autor3);
        autoresCol.addAuthor(autor4);
        autoresCol.addAuthor(autor5);
        autoresCol.addAuthor(autor6);
        autoresCol.addAuthor(autor7);
        autoresCol.addAuthor(autor8);
        autoresCol.addAuthor(autor9);
        autoresCol.addAuthor(autor10);
        autoresCol.addAuthor(autor11);
        autoresCol.addAuthor(autor12);
        autoresCol.addAuthor(autor13);
        autoresCol.addAuthor(autor14);
        autoresCol.addAuthor(autor15);
        autoresCol.addAuthor(autor16);
        autoresCol.addAuthor(autor17);
        autoresCol.addAuthor(autor18);
        autoresCol.addAuthor(autor19);
        autoresCol.addAuthor(autor20);
        // ... (resto de los autores)

        librosCol.addBook(libro1);
        librosCol.addBook(libro2);
        librosCol.addBook(libro3);
        librosCol.addBook(libro4);
        librosCol.addBook(libro5);
        librosCol.addBook(libro6);
        librosCol.addBook(libro7);
        librosCol.addBook(libro8);
        librosCol.addBook(libro9);
        librosCol.addBook(libro10);
        librosCol.addBook(libro11);
        librosCol.addBook(libro12);
        librosCol.addBook(libro13);
        librosCol.addBook(libro14);
        librosCol.addBook(libro15);
        librosCol.addBook(libro16);
        librosCol.addBook(libro17);
        librosCol.addBook(libro18);
        librosCol.addBook(libro19);
        librosCol.addBook(libro20);
        // ... (resto de los libros)
    }

    public void mostrarListaLibros() {
        System.out.println("Nro\tTítulo\t\t\t\t\t\t\tAutor\t\t\t\t\t\t\t\t\t\tPáginas\tCantidad");
        int nro = 1;
        for (Book libro : librosCol.getLibros()) {
            System.out.printf("%-5d %s\n", nro++, libro);
        }
    }

    public void agregarLibro(String titulo, String nombreAutor, int paginas, int cantidad) {
        Author autor = autoresCol.getAuthorByNombre(nombreAutor);
        if (autor == null) {
            System.out.println("El autor no existe. Agrega primero al autor.");
            return;
        }

        Book nuevoLibro = new Book(titulo, autor, paginas, cantidad);
        librosCol.addBook(nuevoLibro);
        System.out.println("Libro agregado exitosamente.");
    }

    public void eliminarLibro(String titulo) {
        Book libroAEliminar = librosCol.getBookByTitulo(titulo);
        if (libroAEliminar == null) {
            System.out.println("El libro no existe.");
            return;
        }

        librosCol.removeBook(libroAEliminar);
        System.out.println("Libro eliminado exitosamente.");
    }

    public void editarLibro(String titulo, int paginas, int cantidad) {
        Book libroAEditar = librosCol.getBookByTitulo(titulo);
        if (libroAEditar == null) {
            System.out.println("El libro no existe.");
            return;
        }

        libroAEditar.setPaginas(paginas);
        libroAEditar.setCantidad(cantidad);
        System.out.println("Libro editado exitosamente.");
    }

    public void buscarLibroPorTitulo(String titulo) {
        Book libroBuscado = librosCol.getBookByTitulo(titulo);
        if (libroBuscado == null) {
            System.out.println("El libro no existe.");
            return;
        }

        System.out.println("Libro encontrado: " + libroBuscado);
    }

    public void buscarAutorDadoLibro(String titulo) {
        Book libroBuscado = librosCol.getBookByTitulo(titulo);
        if (libroBuscado == null) {
            System.out.println("El libro no existe.");
            return;
        }

        System.out.println("Autor del libro '" + titulo + "': " + libroBuscado.getAutor());
    }

    public void ordenarLibrosPorAutor() {
        librosCol.sortByAuthor();
        System.out.println("Libros ordenados por autor.");
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Ejemplos de uso
        biblioteca.mostrarListaLibros();
        biblioteca.agregarLibro("Nuevo Libro", "Gabriel García Márquez", 200, 100);
    }
}
