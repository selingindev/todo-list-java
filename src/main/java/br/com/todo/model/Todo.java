package br.com.todo.model;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String title;
    
    @Column
    @Nullable
    private String description;

    @Column
    private Integer prioridade;

    @Column
    private boolean isDone;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setPrioridade(Integer prioridade){
        this.prioridade = prioridade;
    }

    public Integer getPrioridade(){
        return prioridade;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String descripition) {
        this.description = description;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}

