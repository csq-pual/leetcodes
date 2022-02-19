package list;
//合并两个有序链表
/*
* 收获
* temp.next = head1 == null ? head2 : head1;
* */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class leetcode_合并有序链表 {
    public static void main(String[] args) {
        //创建节点
        ListNode i1 = new ListNode(1);
        ListNode i2 = new ListNode(5);
        ListNode i3 = new ListNode(7);
        ListNode i4 = new ListNode(10);
        ListNode i5 = new ListNode(11);

        i1.next = i2;
        i2.next = i3;
        i4.next = i5;

        mergeTwoLists(i1,i4);
        showlist(i1);
    }


    //定义节点
    static class ListNode{
        public int val;
        public ListNode next;

        //构造器
        public ListNode(int val) {
            this.val = val;
        }
        //重写显示方法
        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }
            //合并方法
    //1 5 7          10 11
            public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
                ListNode head3 = new ListNode(0);
                ListNode temp = head3;

                //有一个链表直接为空
                if (head1 == null){
                    temp.next = head2;
                }
                if (head2 == null){
                    temp.next = head1;
                }

                //俩都不是空
                while(head1 != null && head2 != null){
                    if(head1.val <= head2.val){
                        temp.next = head1;
                        head1 = head1.next;
                    }else{
                        temp.next = head2;
                        head2 = head2.next;
                    }
                    temp = temp.next;

                    //换了之后为空
                if (head1 == null){
                    temp.next = head2;
                }
                if (head2 == null){
                    temp.next = head1;
                }
            }
                return head3.next;
    }

            public static void showlist(ListNode prehead){
                ListNode temp = prehead;
                while(temp!=null){
                    System.out.println(temp.val);
                    temp = temp.next;
                }
            }

}
