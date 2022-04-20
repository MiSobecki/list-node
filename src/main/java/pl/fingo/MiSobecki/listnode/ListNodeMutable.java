package pl.fingo.MiSobecki.listnode;

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

    @Override
    public ListNode<T> setNext(ListNode<T> next) {
        this.next = next;

        return this.next;
    }

    @Override
    public boolean isEmpty() {
        return data == null;
    }
}
