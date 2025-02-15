package MismaJerarquia;

public class ConstructorDocumentoHTML implements ConstructorDocumento {
    private DocumentoHTML documento;

    @Override
    public void iniciarDocumento() {
        documento = new DocumentoHTML();
    }

    @Override
    public void construirCabecera(String texto) {
        documento.setCabecera("<h1>" + texto + "</h1>");
    }

    @Override
    public void construirCuerpo(String texto) {
        documento.setCuerpo("<p>" + texto + "</p>");
    }

    @Override
    public void construirPie(String texto) {
        documento.setPie("<footer>" + texto + "</footer>");
    }

    @Override
    public Documento obtenerProducto() {
        return documento;
    }
}
