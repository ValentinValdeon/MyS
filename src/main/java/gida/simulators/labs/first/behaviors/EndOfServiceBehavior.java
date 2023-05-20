package gida.simulators.labs.first.behaviors;

import gida.simulators.labs.first.utils.Randomizer;
//import gida.simulators.labs.first.utils.distributions.Distribution;

public class EndOfServiceBehavior implements Behavior {

    private Randomizer randomizer;
    //private Distribution<Double> distribution;

    public EndOfServiceBehavior(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public double nextTime() {
        double ret=0.0;
        double r = this.randomizer.nextRandom();
        if(r<0.1){
            ret=8.0;
        }else if(r<0.48){
            ret=10.0;
        }else if(r<0.8){
            ret=15.0;
        }else if(r<1){
            ret=20.0;
        }
        return ret;
    }
}
