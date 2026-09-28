class LinkedList {
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        private Node head;

        public LinkedList() {
            head = null;
        }

    public int get(int index) {
        Node curr = head;

        for(int i = 0; i < index; i++){
            if (curr == null){
                return -1;
            }
            curr = curr.next;
        }

        if (curr == null){
            return -1;
        }
        return curr.data;
    }

    public void insertHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
    }

    public void insertTail(int val) {
        Node newTail = new Node(val);
        if(head == null) {
            head = newTail;
            return;
        }
        Node curr = head;
        
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newTail;
    }

    public boolean remove(int index) {
        if(head == null) {
            return false;
        }
        if(index == 0) {
            head = head.next;
            return true;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            if (curr.next == null) {
                return false;
            }
            curr = curr.next;
        }
        if(curr.next == null) {
            return false;
        }
        curr.next = curr.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();

        Node curr = head;
        while(curr != null) {
            values.add(curr.data);
            curr = curr.next;
        }
        return values;
    }
}
