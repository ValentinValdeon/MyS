package gida.simulators.labs.first.engine;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

//import gida.simulators.labs.first.events.Arrival;
//import gida.simulators.labs.first.events.EndOfService;
import gida.simulators.labs.first.events.Event;
import gida.simulators.labs.first.utils.Order;

public class FutureEventList {

    private List<Event> fel;
    private Order order;

    public FutureEventList () {
        this.fel = new ArrayList<>();
        this.order = new Order();
    }

    public void insert(Event event) {
        this.fel.add(event);
        this.fel.sort(this.order);
    }

    public Event getImminent() {
        return this.fel.remove(0);
    }

    @Override
    public String toString() {
        String ret =
                "============================================================== F E L ==============================================================\n";

        Iterator<Event> it = this.fel.iterator();

        while (it.hasNext()) {
            ret += it.next().toString() + "\n";
        }

        ret += "***********************************************************************************************************************************\n\n";

        return ret;
    }
}
