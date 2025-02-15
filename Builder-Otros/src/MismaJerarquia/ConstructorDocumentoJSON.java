package MismaJerarquia;

public class ConstructorDocumentoJSON implements ConstructorDocumento {
    private DocumentoJSON documento;

    @Override
    public void iniciarDocumento() {
        documento = new DocumentoJSON();
    }

    @Override
    public void construirCabecera(String texto) {
        documento.setCabecera("\"" + texto + "\"");
    }

    @Override
    public void construirCuerpo(String texto) {
        documento.setCuerpo("\"" + texto + "\"");
    }

    @Override
    public void construirPie(String texto) {
        documento.setPie("\"" + texto + "\"");
    }

    @Override
    public Documento obtenerProducto() {
        return documento;
    }
}
