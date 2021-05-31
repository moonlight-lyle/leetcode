package com.it.linkedList;

/**
 * 判断一个链表是否有环
 *
 * @author Lyle
 * @date 2021/5/27
 */
public class CycleLinkedList {
    public static void main(String[] args) {

    }

    /**
     * 判断一个链表是否有环
     * 快慢指针思想：例如分针和秒针，有环的情况下，分针和秒针肯定能重合
     *
     * @param head
     * @return 输入：head = [3,2,0,-4], pos = 1
     * 输出：true
     */
    public static boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        // 慢指针
        ListNode slow = head;
        // 快指针指向head.next
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
