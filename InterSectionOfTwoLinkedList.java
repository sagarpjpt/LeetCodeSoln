/*
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
*/ 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode trvA = null;
        ListNode trvB = null;
        int lenA = 0, lenB = 0;
        trvA = headA;
        while(trvA != null){
            lenA++;
            trvA = trvA.next;
        }

        trvB = headB;
        while(trvB != null){
            lenB++;
            trvB = trvB.next;
        }

        trvA = headA;
        trvB = headB;
        int temp = lenA > lenB ? lenA - lenB : lenB - lenA;
        for(int i = 0;i < temp;i++){
            if(lenA > lenB)
                trvA = trvA.next;
            else
                trvB = trvB.next;
        }

        while(trvA != null && trvA != trvB){
            trvA = trvA.next;
            trvB = trvB.next;
        }

        return trvA;

    }
}
