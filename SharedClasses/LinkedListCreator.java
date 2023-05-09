package SharedClasses;

import java.util.Scanner;

/*
This class hosts various methods for creating linked lists
 */
public class LinkedListCreator {
    //Create a linked list from a provided array of integers
    public static ListNode createLinkedListFromArray(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for(int value: arr){
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    //Create a linked list from user input after providing a length for the list
    public static ListNode createLinkedList(int length) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int i = 0; i < length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int value = scanner.nextInt();
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

}
