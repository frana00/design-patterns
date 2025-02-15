package MismaJerarquia;

public class Cliente {
    private Director director;
    private ConstructorDocumento constructor;

    public Cliente() {
    }

    public Documento construirDocumento() {
        // Cambiar aquí entre HTML y JSON
        constructor = new ConstructorDocumentoHTML();  // O ConstructorDocumentoJSON
        director = new Director(constructor);

        String cabecera = "Cabecera del documento";
        String cuerpo = "Cuerpo del documento";
        String pie = "Pie del documento";

        director.construirDocumento(cabecera, cuerpo, pie);

        return constructor.obtenerProducto();
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println(cliente.construirDocumento());
    }
}
