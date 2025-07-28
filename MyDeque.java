package leet;
//GPT HELP IMPLEMENT IT AS GENEREIC

public class MyDeque<T> {
	private static class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;
        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Constructs an empty deque.
     */
    public MyDeque() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Inserts the specified element at the front of this deque.
     */
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    /**
     * Inserts the specified element at the end of this deque.
     */
    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    /**
     * Retrieves and removes the first element of this deque.
     */
    public T removeFirst() {
        if (head == null) throw new RuntimeException("Deque is empty");
        T val = head.value;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        size--;
        return val;
    }

    /**
     * Retrieves and removes the last element of this deque.
     */
    public T removeLast() {
        if (tail == null) throw new RuntimeException("Deque is empty");
        T val = tail.value;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        size--;
        return val;
    }

    /**
     * Retrieves, but does not remove, the first element of this deque.
     */
    public T peekFirst() {
        if (head == null) return null;
        return head.value;
    }

    /**
     * Retrieves, but does not remove, the last element of this deque.
     */
    public T peekLast() {
        if (tail == null) return null;
        return tail.value;
    }
    
    /**
     * Retrieves, but does not remove, the element at the specified 0-based index.
     * @param index position from front (0-based)
     * @return the element, or null if index out of range
     */
    public T peekAt(int index) {
        if (index < 0 || index >= size) {
            return null;  // or throw IndexOutOfBoundsException
        }
        Node<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.value;
    }

    /**
     * Returns the number of elements in this deque.
     */
    public int size() {
        return size;
    }

    /**
     * Returns true if this deque contains no elements.
     */
    public boolean isEmpty() {
        return size == 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
