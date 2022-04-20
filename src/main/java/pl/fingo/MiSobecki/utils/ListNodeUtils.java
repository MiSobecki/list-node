package pl.fingo.MiSobecki.utils;

import pl.fingo.MiSobecki.listnode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class ListNodeUtils {

    public static <T> boolean hasCycle(ListNode<T> node) {
        Set<ListNode<T>> nodeSet = new HashSet<>();

        while (node != null) {
            if (nodeSet.contains(node)) return true;

            nodeSet.add(node);

            node = node.next();
        }

        return false;
    }
}
