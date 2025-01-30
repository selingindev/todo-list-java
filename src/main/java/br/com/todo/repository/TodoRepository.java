package br.com.todo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.todo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
