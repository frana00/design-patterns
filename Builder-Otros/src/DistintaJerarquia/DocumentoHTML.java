package DistintaJerarquia;

public class DocumentoHTML {
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
        return "<html>\n" + cabecera + "\n" + cuerpo + "\n" + pie + "\n</html>";
    }
}
