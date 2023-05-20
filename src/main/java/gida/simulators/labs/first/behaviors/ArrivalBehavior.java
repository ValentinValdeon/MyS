package gida.simulators.labs.first.behaviors;

import gida.simulators.labs.first.utils.Randomizer;
//import gida.simulators.labs.first.utils.distributions.Distribution;

public class ArrivalBehavior implements Behavior {

    private Randomizer randomizer;
    //private Distribution<Double> distribution;

    public ArrivalBehavior(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public double nextTime() {
        double ret = 0.0;
        double r = this.randomizer.nextRandom();
        if(r<0.3){
            ret=10;
        }else if(r<0.7){
            ret=15;
        }else if (r<1){
            ret=20;
        }
        return ret;
    }
}
