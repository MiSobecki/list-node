package pl.fingo.MiSobecki.utils;

import org.junit.jupiter.api.Test;
import pl.fingo.MiSobecki.listnode.ListNode;
import pl.fingo.MiSobecki.listnode.ListNodeMutable;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListNodeUtilsTest {

    @Test
    public void shouldHasCycle() {
        // given
        ListNode<String> first = new ListNodeMutable<>();
        ListNode<String> second = new ListNodeMutable<>();
        ListNode<String> third = new ListNodeMutable<>();

        // when
        second = first.setNext(second);
        third = second.setNext(third);
        first = third.setNext(first);

        // then
        assertTrue(ListNodeUtils.hasCycle(first));
    }

    @Test
    public void shouldNotHasCycle() {
        // given
        ListNode<String> first = new ListNodeMutable<>();
        ListNode<String> second = new ListNodeMutable<>();
        ListNode<String> third = new ListNodeMutable<>();

        // when
        second = first.setNext(second);
        second.setNext(third);

        // then
        assertFalse(ListNodeUtils.hasCycle(first));
    }

}