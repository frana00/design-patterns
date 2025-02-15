package MismaJerarquia;

public interface ConstructorDocumento {
    void iniciarDocumento();

    void construirCabecera(String texto);

    void construirCuerpo(String texto);

    void construirPie(String texto);

    Documento obtenerProducto();
}
