package MismaJerarquia;

public class Documento {
    protected String cabecera;
    protected String cuerpo;
    protected String pie;

    // Métodos para establecer las partes
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
        return cabecera + "\n" + cuerpo + "\n" + pie;
    }
}
