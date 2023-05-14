package com.example.collections.exceptions;

public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException() {
        super("Штат сотрудников переполнен");
    }
}
