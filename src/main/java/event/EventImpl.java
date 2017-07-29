package event;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by amora on 29-07-2017.
 */
@Entity
public class EventImpl implements Event {
    int eventId;
    String eventType;
    String source;
    String device;
    Date timeOfEvent;
    Servirity servirity;
    String comments;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Date getTimeOfEvent() {
        return timeOfEvent;
    }

    public void setTimeOfEvent(Date timeOfEvent) {
        this.timeOfEvent = timeOfEvent;
    }

    public Servirity getServirity() {
        return servirity;
    }

    public void setServirity(Servirity servirity) {
        this.servirity = servirity;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
