package ru.krasheninnikov.MySpringBoot2Database.service;

public class ApiResponse {
    private boolean success;
    private String message;

    // Конструктор
    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // Геттеры и сеттеры
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
