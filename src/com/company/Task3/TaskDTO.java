package com.company.Task3;

import com.company.Task2.TaskType;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class TaskDTO {
    private final String id;
    private final String title;
    private final TaskType type;
    private final LocalDate createdOn;
    private Set<String> tags = new HashSet<>();

    public TaskDTO(String id, String title, TaskType type, LocalDate createdOn, Set<String> tags) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.createdOn = createdOn;
        this.tags.addAll(tags);
    }

    @Override
    public String toString() {
        return "TaskDTO{" + '\n' +
                "id='" + id + '\n' +
                ", title='" + title + '\n' +
                ", type=" + type + '\n' +
                ", createdOn=" + createdOn + '\n' +
                ", tags=" + tags + '\n' +
                '}';
    }
}
