package adaptadores;

import interfaces.EnchufeAmericano;
import modelos.EnchufeEuropeo;

public class AdaptadorHerencia extends EnchufeEuropeo implements EnchufeAmericano {
    @Override
    public void conectarEnAmerica() {
        System.out.println("Adaptando voltaje de 110V a 220V mediante herencia");
        conectarEnEuropa();
    }
}