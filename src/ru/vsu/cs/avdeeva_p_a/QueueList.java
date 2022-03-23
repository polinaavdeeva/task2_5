package ru.vsu.cs.avdeeva_p_a;

public class QueueList<T> {
    private class ListNode {
        public T value;
        public ListNode next;

        public ListNode(T value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }

        public ListNode(T value) {
            this(value, null);
        }
    }

    private ListNode head = null;
    private ListNode tail = null;
    private int count = 0;

    public void add(T value) {
        ListNode newNode = new ListNode(value);
        if (count == 0) {
            head = tail = newNode;
        } else if (!findDuplicates(newNode)) {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public boolean findDuplicates(ListNode newNode) {
        for (ListNode current = head; current != null; current = current.next) {
            if (newNode.value == current.value) {
                return true;
            }
        }
        return false;
    }

    public T remove() throws Exception {
        T result = element();
        head = head.next;
        if (count == 1) {
            tail = null;
        }
        count--;
        return result;
    }

    public T element() throws Exception {
        if (count() == 0) {
            throw new Exception("Queue is empty");
        }
        return head.value;
    }

    @Override
    public String toString() {
        ListNode value = head;
        StringBuilder stringBuilder = new StringBuilder();
        while (value != null) {
            stringBuilder.append(value.value).append(" ");
            value = value.next;
        }
        return stringBuilder.toString();
    }

    public int count() {
        return count;
    }

    public boolean isEmpty() {
        return count() == 0;
    }
}
