package ru.privetdruk.wessenger.repos;

import org.springframework.data.repository.CrudRepository;
import ru.privetdruk.wessenger.domain.Message;

import java.util.List;

public interface MessagesRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
