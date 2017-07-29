package repository;

import event.EventImpl;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by amora on 29-07-2017.
 */
public interface EventRepository extends CrudRepository<EventImpl, Integer> {
}
