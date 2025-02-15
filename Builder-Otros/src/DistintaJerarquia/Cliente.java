package DistintaJerarquia;

public class Cliente {
    private Director director;
    private ConstructorDocumento constructor;

    public Cliente() {
    }

    public Object construirDocumento() {
        // Cambiar aquí entre HTML y JSON
        constructor = new ConstructorDocumentoHTML();  // O ConstructorDocumentoJSON
        director = new Director(constructor);

        String cabecera = "Cabecera del documento";
        String cuerpo = "Cuerpo del documento";
        String pie = "Pie del documento";

        director.construirDocumento(cabecera, cuerpo, pie);

//Si el constructor es un ConstructorDocumentoHTML, se obtiene el documento HTML
//Si el constructor es un ConstructorDocumentoJSON, se obtiene el documento JSON

        if (constructor instanceof ConstructorDocumentoHTML) {
            return ((ConstructorDocumentoHTML) constructor).obtenerProducto();
        } else {
            return ((ConstructorDocumentoJSON) constructor).obtenerProducto();
        }
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println(cliente.construirDocumento());
    }
}
