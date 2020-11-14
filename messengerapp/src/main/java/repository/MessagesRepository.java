package repository;

import entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessagesRepository extends JpaRepository<Messages, Integer> {
    @Override
    List<Messages> findAllById(Iterable<Integer> iterable);
}
