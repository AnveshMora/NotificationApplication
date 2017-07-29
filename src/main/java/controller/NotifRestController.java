package controller;

import event.EventImpl;
import event.Servirity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by amora on 29-07-2017.
 */
@RestController
public class NotifRestController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello Word!";
    }

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public EventImpl sample(){
        EventImpl event = new EventImpl();
        event.setEventId(123);
        event.setServirity(Servirity.ALARM);
        event.setSource("PHone");
        return  event;
    }
}
