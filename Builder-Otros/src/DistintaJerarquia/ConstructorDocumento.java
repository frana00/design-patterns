package DistintaJerarquia;

public interface ConstructorDocumento {
    void iniciarDocumento();

    void construirCabecera(String texto);

    void construirCuerpo(String texto);

    void construirPie(String texto);
}
