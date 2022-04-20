package pl.fingo.MiSobecki.listnode;

public record ListNodeImmutable<T>(T data, ListNode<T> next) implements ListNode<T> {

    @Override
    public ListNode<T> setNext(ListNode<T> next) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("This List is immutable");
    }

    @Override
    public boolean isEmpty() {
        return data == null;
    }
}
