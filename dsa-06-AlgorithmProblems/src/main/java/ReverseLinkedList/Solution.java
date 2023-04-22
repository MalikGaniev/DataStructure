package ReverseLinkedList;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list=new MySinglyLinkedList();

        for(int i=0;i<10;i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();
    }
     static void reverse(MySinglyLinkedList list) {
      //Create a two pointers
         Node prev=list.head;
         Node current=list.head.next;
         //while loop
         while (current!=null){
             Node next=current.next;
             current.next=prev;//change dirrecion of current
             prev=current;//move prev to right to the current
             current=next;//move current to right on the next one
         }
         list.tail=list.head;//assigne tail to the head
         list.tail.next=null;//assign tai.next to the null end
         list.head=prev;//assign head to the prev
    }
}
