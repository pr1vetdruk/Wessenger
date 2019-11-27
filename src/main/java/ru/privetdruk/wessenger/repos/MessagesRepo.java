package ru.privetdruk.wessenger.repos;

import org.springframework.data.repository.CrudRepository;
import ru.privetdruk.wessenger.domain.Message;

public interface MessagesRepo extends CrudRepository<Message, Long> {

}
