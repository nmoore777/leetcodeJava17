package leetcode_75;
import SharedClasses.LinkedListCreator;
import SharedClasses.ListNode;

import java.util.ArrayList;

/*

 */
public class MergeTwoSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        //create a dummy node to serve as head of merged list
        ListNode dummy = new ListNode(-1);
        //create a pointer to the current node in the merged list
        ListNode current = dummy;

        if(list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        } else if (list1 == null && list2 == null){
             return null;
        }
        //traverse both input lists while they are not null
        while (list1 != null && list2 != null){
            //compare the values of the current nodes of input lists
            //add smaller value to merged list and advance the pointer
            if((int)list1.element <= (int)list2.element){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        //append the remaining nodes to the merged list
        if (list1 != null){
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
    public static void getMergeTwoSortedLinkedListsSolution(){
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        ListNode list1 = LinkedListCreator.createLinkedListFromArray(arr1);
        ListNode list2 = LinkedListCreator.createLinkedListFromArray(arr2);
        ListNode list3 = new ListNode(null);
        ListNode list4 = new ListNode(0);

        System.out.println(String.valueOf(mergeTwoLists(list1, list2).element));
        try{
            System.out.println(mergeTwoLists(list3, list3));
        } catch (NullPointerException e){
            System.out.println("null");
        }
        System.out.println(mergeTwoLists(list3, list4).element);

    }
}

