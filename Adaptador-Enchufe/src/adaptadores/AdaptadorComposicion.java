package adaptadores;

import interfaces.EnchufeAmericano;
import modelos.EnchufeEuropeo;

public class AdaptadorComposicion implements EnchufeAmericano {
    private EnchufeEuropeo enchufeEuropeo;

    public AdaptadorComposicion(EnchufeEuropeo enchufe) {
        this.enchufeEuropeo = enchufe;
    }

    @Override
    public void conectarEnAmerica() {
        System.out.println("Adaptando voltaje de 110V a 220V");
        enchufeEuropeo.conectarEnEuropa();
    }
}