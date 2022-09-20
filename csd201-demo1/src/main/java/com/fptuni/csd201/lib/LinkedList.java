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

    // 1. `void addToHead(int x)` - add a node with value x at the head of a list.
    public void addToHead(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    // 2. `void addToTail(int x)` - add a node with value x at the tail of a list.

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
    // 3. `void addAfter(Node p, int x)` - add a node with value x after the node p.

    public void addAfter(Node p, int x) {
        if (x == -1) {
            addToHead(x);
            return;
        }
        int count = 0;
        Node p1 = head;
        while (p1 != null && count < x) {
            p1 = p1.next;
            count++;
        }
        if (p1.next == null && count == x) {
            addToTail(x);
            return;
        }
        p.next = p1.next;
        p1.next = p;

    }

    // 4. `void traverse()` - traverse from head to tail and dislay info of all
    // nodes in the list.
    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info + "  ");
            p = p.next;
        }
        System.out.println("");

    }

    // 5. `int deleteFromHead()` - delete the head and return its info.
    public int deleteFromHead() {
        Node p = head;
        if (p == null) {

        }
        // if head in not null and next of head is null, delete the head
        if (p.next == null) {
            p = null;
        } else {
            head = p.next;
            head = p.next;
            // head = head.next
        }
        return 0;
    }
    // 6. `int deleteFromTail()` - delete the tail and return its info.

    public int deleteFromTail() {
        Node p = head;
        if (p == null) {
            return 0;
        }
        // if head in not null and next of head is null, delete the head
        if (p.next == null) {
            p = null;
        } else { // else, traverse to the second last element of the list
            Node temp = new Node();
            temp = p;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            // change the next of the second last node to null and
            // delete the last node
            Node lastNode = temp.next;
            temp.next = null;
            lastNode = null;
        }
        return 0;

    }

    // 7. `int deleteAter(Node p)` - delete the node after the node p and return its
    // info.

    public int deleteAter(Node p) {

        return 0;
    }

    // 8. `void dele(int x)` - delele the first node whose info is equal to x.
    public void dele(int x) {

    }

    // 9. `Node search(int x)` - search and return the reference to the first node
    // having info x.
    public Node search(int x) {
        Node p = head;
        while (p != null && p.info != x)
            p = p.next;
        return p;

    }

    // 10. `int count()` - count and return number of nodes in the list.
    public int count() {
        return 0;
    }
    // 11. `void dele(int i)` - delete an i-th node on the list. Besure that such a
    // node exists.

    // 12. `void sort()` - sort the list by ascending order of info.
    public Node getNode(int k) {
        int c = 0;
        Node p = head;
        while (p != null && c < k) {
            p = p.next;
            c++;
        }
        return p;
    }

    public int size() {
        Node p = head;
        int c = 0;
        while (p != null) {
            c++;
            p = p.next;
        }
        return c;
    }

    public void sort() {
        int n = size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Node pi = getNode(i), pj = getNode(j);
                if (pi.info > pj.info) {
                    int t = pi.info;
                    pi.info = pj.info;
                    pj.info = t;
                }
            }
        }
    }

    // 13. `void remove(Node p)` - delete node p if it exists in the list.
    public void remove(Node p) {
        if (p == null)
            return;
        // find q where q.next = p
        Node f = head, q = null;
        while (f != null && f != p) {
            q = f;
            f = f.next;
        }
        // remove head
        if (q == null) {
            head = head.next;
            if (head == null)
                tail = null;
        } else {
            q.next = p.next;
            if (p == tail)
                tail = q;
        }
        p.next = null;
    }

    // 14. `int [] toArray()` - create and return array containing info of all nodes
    // in the list.
    // 15. Merge two ordered singly linked lists of integers into one ordered list.
    // 16. `void addBefore(Node p, int x)` - add a node with value x before the node
    // p.
    // 17. Attach a singly linked list to the end of another singly linked list.
    // 18. `int max()` - find and return the maximum value in the list.
    public int getMax() {
        if (isEmpty())
            return 0;
        int max = head.info;
        Node p = head;
        while (p != null) {
            if (p.info > max)
                max = p.info;
            p = p.next;
        }
        return max;
    }

    // 19. `int min()` - find and return the minimum value in the list.
    public int getMin() {
        if (isEmpty())
            return 0;
        int min = head.info;
        Node p = head;
        while (p != null) {
            if (p.info < min)
                min = p.info;
            p = p.next;
        }
        return min;
    }

    // 20. `int sum()` - return the sum of all values in the list.
    // 21. `int avg()` - return the average of all values in the list.
    // 22. `boolean sorted()` - check and return true if the list is sorted, return
    // false if the list is not sorted.
    // 23. `void insert(int x)` - insert node with value x into sorted list so that
    // the new list is sorted.
    // 24. Reverse a singly linked list using only one pass through the list.
    public void reverse() {
        int n = size();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            Node pi = getNode(i), pj = getNode(j);
            int t = pi.info;
            pi.info = pj.info;
            pj.info = t;
        }
    }
    // 25. Check whether two singly linked list have the same contents.

}
