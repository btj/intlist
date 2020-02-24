package intlist;

import java.util.Arrays;

public class IntList {
	
	private int[] elements;
	
	public int getSize() {
		return this.elements.length;
	}
	
	public int get(int index) {
		return this.elements[index];
	}
	
	public int[] getElements() {
		return Arrays.copyOf(this.elements, this.elements.length);
	}
	
	/**
	 * Initializes this IntList object with an empty list of elements.
	 * 
	 * @post This object's size is zero.
	 *     | getSize() == 0
	 */
	public IntList() {
		this.elements = new int[0];
	}
	
	/**
	 * Adds the given element to the front of the list of integers stored by this object.
	 * 
	 * @post This object's list of integers equals the old list of integers with the given element added to the front
	 *     | getSize() == old(getSize()) + 1 &&
	 *     | getElements()[0] == element &&
	 *     | Arrays.equals(getElements(), 1, getSize(), old(getElements()), 0, old(getSize()))
	 */
	public void addFirst(int element) {
		int[] newElements = new int[this.elements.length + 1];
		newElements[0] = element;
		for (int i = 0; i < elements.length; i++)
			newElements[i + 1] = elements[i];
		elements = newElements;
	}

	/**
	 * Adds the given element to the back of the list of integers stored by this object.
	 * 
	 * @post This object's list of integers equals the old list of integers with the given element added to the back
	 *     | getElements().length == old(getSize()) + 1 &&
	 *     | getElements()[getSize() - 1] == element &&
	 *     | Arrays.equals(getElements(), 0, getSize() - 1, old(getElements()), 0, old(getSize()))
	 */
	public void add(int element) {
		int[] newElements = new int[this.elements.length + 1];
		newElements[this.elements.length] = element;
		for (int i = 0; i < elements.length; i++)
			newElements[i] = elements[i];
		elements = newElements;
	}
	
	public void set(int index, int value) {
		this.elements[index] = value;
	}

}
