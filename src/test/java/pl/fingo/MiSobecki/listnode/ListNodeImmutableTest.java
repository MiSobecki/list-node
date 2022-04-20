package pl.fingo.MiSobecki.listnode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeImmutableTest {

    @Test
    public void shouldNotBeEmpty() {
        // given
        ListNode<String> node = new ListNodeImmutable<>("test", null);

        // then
        assertFalse(node.isEmpty());
    }

    @Test
    public void shouldSetNextNodeCorrectly() {
        // given
        ListNode<String> first = new ListNodeImmutable<>("test", null);
        ListNode<String> second = new ListNodeImmutable<>("test", first);
        ListNode<String> third = new ListNodeImmutable<>("test", second);

        // then
        assertEquals(third.next().next(), first);
    }

    @Test
    public void setNextCallShouldThrowUnsupportedOperationException() {
        // given
        ListNode<String> node = new ListNodeImmutable<>("test", null);

        // then
        assertThrows(UnsupportedOperationException.class, () -> node.setNext(node));
    }

}