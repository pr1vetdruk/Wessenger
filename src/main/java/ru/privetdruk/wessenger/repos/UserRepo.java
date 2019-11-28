package ru.privetdruk.wessenger.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.privetdruk.wessenger.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
