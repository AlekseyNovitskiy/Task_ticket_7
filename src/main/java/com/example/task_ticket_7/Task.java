package com.example.task_ticket_7;

public class Task {
    public static void main(String[] args) {

        Integer[] element = {1, 2, 3};

        element[0] = 10;

        try {
            element[4] = 20;
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
        }
        System.out.printf(element[0].toString());

    }
}
