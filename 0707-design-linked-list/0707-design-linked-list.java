class MyLinkedList {

    class Node {
        int val;
        Node prev, next;
        Node(int val) {
            this.val = val;
        }
    }

    private Node head, tail;
    private int size;

    public MyLinkedList() {
        head = new Node(0);   // dummy head
        tail = new Node(0);   // dummy tail
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size)
            return null;

        Node curr;
        if (index < size / 2) {
            curr = head.next;
            for (int i = 0; i < index; i++)
                curr = curr.next;
        } else {
            curr = tail.prev;
            for (int i = size - 1; i > index; i--)
                curr = curr.prev;
        }
        return curr;
    }

    public int get(int index) {
        Node node = getNode(index);
        return node == null ? -1 : node.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;

        Node prev, next;
        if (index == size) {
            prev = tail.prev;
            next = tail;
        } else {
            next = getNode(index);
            prev = next.prev;
        }

        Node newNode = new Node(val);
        newNode.prev = prev;
        newNode.next = next;
        prev.next = newNode;
        next.prev = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {
        Node node = getNode(index);
        if (node == null)
            return;

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }
}