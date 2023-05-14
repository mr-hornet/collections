package com.example.collections.exceptions;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException() {
        super("Такой сотрудник уже добавлен");
    }
}
