package modern;

import interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Sentado en silla moderna minimalista");
    }
}