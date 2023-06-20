package org.example.june15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BookTickets {
    private int availableTickets;

    public BookTickets(int totalTickets) {
        this.availableTickets = totalTickets;
    }

    public synchronized void bookTicket(int requestedTickets) {
        if (availableTickets >= requestedTickets) {
            availableTickets -= requestedTickets;
            System.out.println(Thread.currentThread().getName() + " booked " + requestedTickets + " tickets.");
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot book " + requestedTickets + " tickets.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        int totalTickets = 10;
        BookTickets bookingSystem = new BookTickets(totalTickets);

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            int requestedTickets = 2; // booking 2 at a time

            executorService.execute(() -> bookingSystem.bookTicket(requestedTickets));
        }

        executorService.shutdown();

    }
}

