package day5;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    static class ListNode{
        public int value;
        public ListNode next;
        ListNode(int x){
            value = x;
            next = null;
        }
    }
    public ListNode insertAtTail(ListNode head, int X) {
        //YOUR CODE GOES HERE
        if(head == null){
            return new ListNode(X);
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        ListNode newNode = new ListNode(X);
        temp.next = newNode;
        return head;
    }
    public ListNode insertAtHead(ListNode head, int X) {
        //YOUR CODE GOES HERE
        ListNode newNode = new ListNode(X);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public List<Integer> LLTraversal(ListNode head) {
        //your code goes here
        List<Integer> list = new ArrayList<>();
        if(head == null){
            return list;
        }

        while(head != null){
            list.add(head.value);
            head = head.next;
        }
        return list;
    }
    public ListNode deleteHead(ListNode head) {
        //your code goes here
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp = null;
        return head;
    }
}
