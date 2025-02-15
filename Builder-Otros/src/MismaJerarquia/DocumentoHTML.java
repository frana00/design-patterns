package MismaJerarquia;

public class DocumentoHTML extends Documento {
    // Métodos específicos para el documento HTML si es necesario
    @Override
    public String toString() {
        return "<html>\n" + super.toString() + "\n</html>";
    }
}

