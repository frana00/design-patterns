package artdeco;

import interfaces.Chair;

public class ArtDecoChair implements Chair {
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Sentado en silla Art Decó");
    }
}
