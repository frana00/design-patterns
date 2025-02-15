package MismaJerarquia;

public class DocumentoJSON extends Documento {
    // Métodos específicos para el documento JSON si es necesario
    @Override
    public String toString() {
        return "{ \"cabecera\": \"" + cabecera + "\", \"cuerpo\": \"" + cuerpo + "\", \"pie\": \"" + pie + "\" }";
    }
}
