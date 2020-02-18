package intlist;

import java.util.Arrays;

class Node {
	int element;
	Node next;
}

public class IntList {
	
	private Node firstNode;
	
	public int getSize() {
		int count = 0;
		for (Node n = firstNode; n != null; n = n.next)
			count++;
		return count;
	}
	
	public int get(int index) {
		Node n = firstNode;
		for (; index != 0; n = n.next, index--);
		return n.element;
	}
	
	public int[] getElements() {
		int[] elements = new int[getSize()];
		Node n = firstNode;
		int i = 0;
		for (; n != null; n = n.next, i++)
			elements[i] = n.element;
		return elements;
	}
	
	/**
	 * Initializes this IntList object with an empty list of elements.
	 * 
	 * @post This object's size is zero.
	 *     | getSize() == 0
	 */
	public IntList() {
	}
	
	/**
	 * Adds the given element to the front of the list of integers stored by this object.
	 * 
	 * @post This object's list of integers equals the old list of integers with the given element added to the front
	 *     | getElements().length == old(getElements()).length + 1 &&
	 *     | getElements()[0] == element &&
	 *     | Arrays.equals(getElements(), 1, getElements().length, old(getElements()), 0, old(getElements()).length)
	 */
	public void addFirst(int element) {
		Node n = new Node();
		n.element = element;
		n.next = firstNode;
		firstNode = n;
	}

	/**
	 * Adds the given element to the back of the list of integers stored by this object.
	 * 
	 * @post This object's list of integers equals the old list of integers with the given element added to the back
	 *     | getElements().length == old(getElements()).length + 1 &&
	 *     | getElements()[getElements().length - 1] == element &&
	 *     | Arrays.equals(getElements(), 0, getElements().length - 1, old(getElements()), 0, old(getElements()).length)
	 */
	public void add(int element) {
		if (firstNode == null) {
			firstNode = new Node();
			firstNode.element = element;
		} else {
			Node lastNode = firstNode;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = new Node();
			lastNode.next.element = element;
		}
	}

}
