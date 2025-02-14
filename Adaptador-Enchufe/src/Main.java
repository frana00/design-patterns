import adaptadores.AdaptadorComposicion;
import adaptadores.AdaptadorHerencia;
import interfaces.EnchufeAmericano;
import modelos.EnchufeEuropeo;

public class Main {
    public static void main(String[] args) {
        // Ejemplo con adaptador por composición
        System.out.println("=== Usando adaptador por composición ===");
        EnchufeEuropeo enchufeEuropeo = new EnchufeEuropeo();
        EnchufeAmericano adaptadorComposicion = new AdaptadorComposicion(enchufeEuropeo);
        adaptadorComposicion.conectarEnAmerica();

        // Ejemplo con adaptador por herencia
        System.out.println("\n=== Usando adaptador por herencia ===");
        EnchufeAmericano adaptadorHerencia = new AdaptadorHerencia();
        adaptadorHerencia.conectarEnAmerica();
    }
}