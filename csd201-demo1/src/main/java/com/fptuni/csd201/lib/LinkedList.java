package com.fptuni.csd201.lib;

public class LinkedList {

    private Node head, tail;

    public LinkedList() {
        head = null;
        tail = null;

    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
        tail = null;
    }

    // null exception
    // head & tail is correct
    
    
//    1. `void addToHead(int x)` - add a node with value x  at the head of  a list.
    public void addToHead(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

//2. `void addToTail(int x)` - add a node with value x  at the tail of  a list.
    
    public void addToTail(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
        
    }
    
 // void addAfter(index i, int x)
//3. `void addAfter(Node p, int x)` - add a node with value x  after the node p.

    public void addAfter(Node p, int x) {
        if(x == -1){
            addToHead(x); return;
        }
        int count = 0;
        Node p1 = head;
        while(p1 != null && count < x){
            p1 = p1.next; count++;
        }
        if(p1.next == null && count == x){
            addToTail(x); return;
        }
        p.next = p1.next;
        p1.next = p; 
        
    }

//4. `void traverse()` - traverse from head to tail and dislay info of all nodes in the list.
    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info + "  ");
            p = p.next;
        }
        System.out.println("");
    
    }

//5. `int deleteFromHead()` - delete the head and return its info.
    public int deleteFromHead() {
        Node p = head;
        if (p == null) {

        }
        //if head in not null and next of head is null, delete the head
        if (p.next == null) {
            p = null;
        } else {
            head = p.next;
            head = p.next;
            //head = head.next
        }
        return 0;
    }
//6. `int deleteFromTail()` - delete the tail and return its info.

    public int deleteFromTail() {

        
        return 0;

    }
    
//7. `int deleteAter(Node p)` - delete the node after the node  p  and return its info.

    public int deleteAter(Node p) {
           
        Node q = p.next;//if p is before tail then remove tail
        if(q.next == null){
            tail = p;
            p.next = null;
        }
        else{
            p.next = q.next;
            q.next = null;
        }
        return 0;
    }

//8. `void dele(int x)` - delele the first node whose info is equal to  x.
    public void dele(int x) {

        
    }

//9. `Node search(int x)` - search and return the reference to the first node having info x.
    public Node search(int x) {

        return null;
    }

//10. `int count()` - count and return number of nodes in the list.
    public int count() {
       return 0;
    }
//11. `void dele(int i)` - delete an i-th node on the list. Besure that such a node exists.
//12. `void sort()` - sort the list by ascending order of info.
//13. `void remove(Node p)` - delete node p if it exists in the list.
//14. `int [] toArray()` - create and return array containing info of all nodes in the list.
//15. Merge two ordered singly linked lists of integers into one ordered list.
//16. `void addBefore(Node p, int x)` - add a node with value x  before the node p.
//17. Attach a singly linked list to the end of another singly linked list.
//18. `int max()` - find and return the maximum value in the list. 
//19. `int min()` - find and return the minimum value in the list. 
//20. `int sum()` - return the sum of all values in the list. 
//21. `int avg()` - return the average of all values in the list.
//22. `boolean sorted()` - check and return true if the list is sorted, return false if the list is not sorted.
//23. `void insert(int x)` - insert node with value x into sorted list so that the new list is sorted.
//24. Reverse a singly linked list using only one pass through the list.
//25. Check whether two singly linked list have the same contents.    

}
