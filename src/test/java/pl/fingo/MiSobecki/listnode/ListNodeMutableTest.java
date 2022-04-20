package pl.fingo.MiSobecki.listnode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeMutableTest {

    @Test
    public void shouldNotBeEmpty() {
        // given
        ListNode<String> node = new ListNodeMutable<>("test");

        // then
        assertFalse(node.isEmpty());
    }

    @Test
    public void shouldBeEmpty() {
        // given
        ListNode<String> node = new ListNodeMutable<>();

        // then
        assertTrue(node.isEmpty());
    }

    @Test
    public void shouldSetNextNodeCorrectly() {
        // given
        ListNode<String> first = new ListNodeMutable<>();
        ListNode<String> second = new ListNodeMutable<>();
        ListNode<String> next = new ListNodeMutable<>();

        // when
        first.setNext(second);
        next = second.setNext(next);

        // then
        assertEquals(first.next().next(), next);
    }

}