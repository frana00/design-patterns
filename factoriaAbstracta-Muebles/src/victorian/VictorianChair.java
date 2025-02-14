package victorian;

import interfaces.Chair;

public class VictorianChair implements Chair {
    public boolean hasLegs() {
        return true;
    }

    public void sitOn(){
        System.out.println("Sentado en silla victoriana");
    }
}
