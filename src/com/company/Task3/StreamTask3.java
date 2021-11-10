package com.company.Task3;

import com.company.Task2.Task;

import java.util.List;

public class StreamTask3 {
    public List<TaskDTO> converter(List<Task> tasks) {
        return tasks.stream()
                .map(t -> new TaskDTO(t.getId(), t.getTitle(), t.getType(), t.getCreatedOn(), t.getTags()))
                .toList();
    }
}
