package sim.actors.checkout;

import sim.utils.AExternalEvent;

class ExternalEvent extends AExternalEvent<EventType> {
    public ExternalEvent(EventType eventType, Double time) {
        super(eventType, time);
    }
}
