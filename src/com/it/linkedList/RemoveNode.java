package com.it.linkedList;

/**
 * 删除链表中的节点
 *
 * @author Lyle
 * @date 2021/5/24
 */
public class RemoveNode {
    public static void main(String[] args) {

    }

    /**
     * 输入：head = [4,5,1,9], node = 5
     * 输出：[4,1,9]
     * @param node
     */
    public static void deleteNode(ListNode node) {
        // 获取当前节点的下一个节点
        ListNode nextNode=node.next;
        // 将下一个节点的值覆盖当前的节点的值
        node.val=nextNode.val;
        // 改变当前节点的指针指向
        node.next=nextNode.next;
    }


}
