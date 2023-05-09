package SharedClasses;

public class ListNode {
    public ListNode(Object theElement) {
        this(theElement, null);
    }

    public ListNode(Object theElement, ListNode n) {
        element = theElement;
        next = n;
    }

    public Object element;

    public ListNode next;
}