package com.example.collections.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException() {
        super("Такой сотрудник не найден");
    }
}
