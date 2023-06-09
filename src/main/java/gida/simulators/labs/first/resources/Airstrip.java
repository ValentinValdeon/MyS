package gida.simulators.labs.first.resources;

import java.util.List;
import gida.simulators.labs.first.policies.ServerQueuePolicy;

public class Airstrip extends Server {

    public Airstrip(int id, List<Queue> queues, ServerQueuePolicy serverQueuePolicy) {
        super(id,queues,serverQueuePolicy);
    }

    @Override
    public String toString() {
        String ret = super.toString();

        ret += "type: airstrip";

        return ret;
    }
}
