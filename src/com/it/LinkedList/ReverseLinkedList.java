package com.it.LinkedList;

/**
 * 链表反转
 *
 * @author Lyle
 * @date 2021/5/26
 */
public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    /**
     * 递归方法实现
     * @param head
     * @return
     * 输入: 5->4->3->2->1->NULL
     * 输出: 1->2->3->4->5->NULL
     */
    public ListNode reverse(ListNode head){
        // 返回条件
        if (null==head||null==head.next){
            return head;
        }
        // 假设输入的是4，4->3->2->1->NULL，返回应该是1->2->3->4->NULL
        ListNode newHead=reverse(head.next);
        // 将4的next指向5
        head.next.next=head;
        // 原先的头指向null
        head.next=null;
        return newHead;
    }

    /**
     * 非递归方法实现
     * @param head
     * @return
     * 输入: 5->4->3->2->1->NULL
     * 输出: 1->2->3->4->5->NULL
     */
    public ListNode reverse2(ListNode head){
        // 当前节点为null或者只有一个节点的情况
        if (null==head||null==head.next){
            return head;
        }
        ListNode newHead=null;
        while (head!=null){
            // 创建临时变量指向head.next
           ListNode temp=head.next;
           // head.next指向newHead
           head.next=newHead;
           // newHead指向head
           newHead=head;
           // 原先的head指向temp指向的节点
           head=temp;
        }
        return newHead;
    }
}
