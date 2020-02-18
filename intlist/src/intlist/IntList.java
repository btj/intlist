package intlist;

import java.util.Arrays;

class Node {
	int element;
	Node next;
}

public class IntList {
	
	
	
	public int getSize() {
		throw new RuntimeException("Not yet implemented");
	}
	
	public int get(int index) {
		throw new RuntimeException("Not yet implemented");
	}
	
	public int[] getElements() {
		throw new RuntimeException("Not yet implemented");
	}
	
	/**
	 * Initializes this IntList object with an empty list of elements.
	 * 
	 * @post This object's size is zero.
	 *     | getSize() == 0
	 */
	public IntList() {
		throw new RuntimeException("Not yet implemented");
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
		throw new RuntimeException("Not yet implemented");
	}

}
