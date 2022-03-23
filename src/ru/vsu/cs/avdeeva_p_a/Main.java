package ru.vsu.cs.avdeeva_p_a;

public class Main {

    public static void main(String[] args) {
        QueueList<Integer> queue = new QueueList<>();
        queue.add(1);
        queue.add(3);
        queue.add(1);
        queue.add(4);
        queue.add(5);
        queue.add(5);
        queue.add(4);
        queue.add(5);

        System.out.println("Queue :\n" + queue);
    }
}
