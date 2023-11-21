
import java.util.ArrayList;
import java.util.List;

class Autores {
    private List<Author> autores;

    public Autores() {
        autores = new ArrayList<>();
    }

    public void addAuthor(Author autor) {
        autores.add(autor);
    }

    public List<Author> getAutores() {
        return autores;
    }

    Author getAuthorByNombre(String nombreAutor) {
        for (Author autor : autores) {
            if (autor.getNombre().equals(nombreAutor)) {
                return autor;
            }
        }
        return null;
    }
}