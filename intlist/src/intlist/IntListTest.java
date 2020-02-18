package intlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void testAddFirst() {
		IntList myList = new IntList();
		myList.addFirst(42);
		myList.addFirst(7);
		assert myList.getSize() == 2;
		assert myList.get(0) == 7;
		assert myList.get(1) == 42;
	}

	@Test
	void testAdd() {
		IntList myList = new IntList();
		myList.add(42);
		myList.add(7);
		assert myList.getSize() == 2;
		assert myList.get(0) == 42;
		assert myList.get(1) == 7;
	}

}
