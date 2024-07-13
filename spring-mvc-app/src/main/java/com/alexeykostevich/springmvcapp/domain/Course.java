package com.alexeykostevich.springmvcapp.domain;

import java.util.Objects;

public record Course(
        int id,
        String title
) {
    public Course(int id, String title) {
        this.id = id;
        this.title = Objects.requireNonNull(title);
    }
}
