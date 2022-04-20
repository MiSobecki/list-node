package pl.fingo.MiSobecki.listnode;

import java.util.Objects;

public class ListNodeMutable<T> implements ListNode<T> {

    private T data;
    private ListNode<T> next;

    public ListNodeMutable(T data) {
        this.data = data;
    }

    public ListNodeMutable() {

    }

    @Override
    public T data() {
        return data;
    }

    @Override
    public ListNode<T> next() {
        return next;
    }

    // I think we should return void instead of ListNode
    @Override
    public ListNode<T> setNext(ListNode<T> next) {
        this.next = next;

        return this.next;
    }

    @Override
    public boolean isEmpty() {
        return data == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNodeMutable<?> that = (ListNodeMutable<?>) o;
        return Objects.equals(data, that.data) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
