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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String title;
    
    @Column
    @Nullable
    private String desc;

    @Column
    private boolean isDone;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}

