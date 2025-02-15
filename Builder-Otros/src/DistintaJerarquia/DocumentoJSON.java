package DistintaJerarquia;

public class DocumentoJSON {
    private String cabecera;
    private String cuerpo;
    private String pie;

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    @Override
    public String toString() {
        return "{ \"cabecera\": \"" + cabecera + "\", \"cuerpo\": \"" + cuerpo + "\", \"pie\": \"" + pie + "\" }";
    }
}
