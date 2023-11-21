public class Book {
    private String titulo;
    private Author autor;
    private int paginas;
    private double precio;
    private int cantidad;


    public Book(String titulo, Author autor, int paginas, double precio, int cantidad) {
        this(titulo, autor, paginas, cantidad);
    }

    // Constructor con precio y cantidad
    public Book(String titulo, Author autor, int paginas, int cantidad) {
        this(titulo, autor, paginas);
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Book(String titulo, Author autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-30s %10.2f %10d", titulo, autor.getNombre() + " " + autor.getApellido(), precio, cantidad);
    }
}
