package br.com.todo.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.todo.model.Todo;
import br.com.todo.repository.TodoRepository;

@Service
public class TodoService {
     private TodoRepository todoRepository;
     public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    
    public List<Todo> list(){
        Sort sort =  Sort.by("prioridade").descending().and(
              Sort.by("title").ascending());
          return  todoRepository.findAll(sort);
      }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);  
        return list();
    }

     public List<Todo> update(Todo todo){
        todoRepository.save(todo); 
        return list();
    }
    
     public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
     }
}
