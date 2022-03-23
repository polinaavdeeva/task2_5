package ru.vsu.cs.avdeeva_p_a;

public interface Queue<T> {
    void add(T value);
    T remove() throws Exception;
    T element() throws Exception;
    int count();
    boolean empty();
}
