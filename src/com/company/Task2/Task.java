package com.company.Task2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Task {
    private static Integer maxId = 0;

    private final String id;
    private final String title;
    private final TaskType type;
    private final LocalDate createdOn;
    private boolean done = false;
    private Set<String> tags = new HashSet<>();
    private LocalDate dueTo;

    public Task(String title, TaskType type, LocalDate createdOn) {
        maxId++;
        this.id = maxId.toString();
        this.title = title;
        this.type = type;
        this.createdOn = createdOn;
    }

    public Task addTag(String tag) {
        tags.add(tag);
        return this;
    }

    public LocalDate getDueTo() {
        return dueTo;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskType getType() {
        return type;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public boolean isDone() {
        return done;
    }

    public Set<String> getTags() {
        return tags;
    }
}
