package com.coderscampus.assignment7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_two_items_to_list() {
		//Arrange
		CustomList<Integer> sut = new CustomArrayList<>();

		//Act
		for (int i = 1; i <= 2; i++) {
			sut.add(i);
		}
		for (int i = 0; i < 1; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		Integer expectedSize = sut.getSize();
		
		//Assert
		assertEquals(2, expectedSize);
	}
	
	@Test
	void add_works_with(){
		CustomList<String> sut = new CustomArrayList<>();
		sut.add("First");
		sut.add("Third");
		sut.add(1, "Second");
	
		assertEquals("Third", sut.get(2));
			
	}
	@Test
	void should_throw_exception_when_getting_out_of_bounds () {
		CustomList<Integer> sut = new CustomArrayList<>();
		try {
			sut.get(11);
			fail("Expected an IndexOutOfBoundsException but did not get one.");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("Expected an IndexOutOfBoundsException but did not get one.");
		
	}
	
	@Test
	void should_return_size_of_list() {
		//Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		
		//Act
		sut.add(3);
		sut.add(26);
		sut.add(2);
		sut.add(17);
		sut.add(1);
		sut.add(3);
		
		//Assert
		assertEquals(6, sut.getSize());
	}
	
	@Test
	void should_return_fifth_item_to_list() {
		//Arrange
		CustomList<Integer> sut = new CustomArrayList<Integer>();
		
		//Act
		for (int i = 1; i < 10; i++) {
			sut.add(i);	
		}
		Integer targetNum = sut.get(5);
		assertEquals(6, targetNum);
	}
	
	@Test
	void should_add_100_items_to_list() {
		//Arrange 
		CustomList<Integer> sut = new CustomArrayList<Integer>();
		
		//Act
		for (int i = 1; i < 100; i++) {
			sut.add(i);
		}
		
		for (int i = 0; i < 99; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		
		//Assert
		assertEquals(99, sut.getSize());
	}
	
	@Test
	void should_throw_out_of_bounds_exception() {
		
		//Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		
		//Act
		for (int i = 0; i < 15; i++) {
			sut.add(i);
		}
		
		//Assert
		assertThrows(IndexOutOfBoundsException.class, () -> sut.add(25, 1));
	}
	
	@Test
	void should_add_one_item_to_list_at_specified_index_when_size_reached_max_array_length() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 1; i <= 20; i++) {
			sut.add(i);
		}
		Integer expectedSize = sut.getSize();
		assertEquals(20, expectedSize);

		// Act
		sut.add(20, 50);

		// Assert
		expectedSize = sut.getSize();		
		assertEquals(21, expectedSize);
	}
	@Test
	void delete_from_list(){
		CustomList<String> myCustomList = new CustomArrayList<>();
		myCustomList.add("First");
		myCustomList.add("Third");
		myCustomList.add(1, "Second");
		myCustomList.remove(1);

		assertEquals("Third", myCustomList.get(1));
	}
	
	@Test
	void add_sizeIncrease_works(){
		CustomList<Integer> myCustomList = new CustomArrayList<>();
		myCustomList.add(1);
		myCustomList.add(2);
		myCustomList.add(3);
		myCustomList.add(4);
		myCustomList.add(5);
		myCustomList.add(6);
		myCustomList.add(7);
		myCustomList.add(8);
		myCustomList.add(9);
		myCustomList.add(10);
		myCustomList.add(12);
		myCustomList.add(3 ,4);
		
		assertEquals(4, myCustomList.get(3));	
	}
	
	@Test
	void should_add_one_item_at_specified_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 1; i < 5; i++) {
			sut.add(i);
		}

		Integer expectedSizeBefore = sut.getSize();

		sut.add(3, 8);

		Integer expectedAddedItem = sut.get(3);
		Integer expectedSizeAfter = sut.getSize();

		assertEquals(4, expectedSizeBefore);
		assertEquals(8, expectedAddedItem);
		assertEquals(5, expectedSizeAfter);
	}
	
	@Test
	void should_add_one_item_to_list() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);
		Integer expectedItem = sut.get(0);
		Integer expectedSize = sut.getSize();

		// Assert
		assertEquals(10, expectedItem);
		assertEquals(1, expectedSize);
	}
	
	@Test
	void returns_false() {
		CustomList<String> myCustomList = new CustomArrayList<>();
		myCustomList.add("First");
		myCustomList.add("Third");
		myCustomList.add(1, "Second");
		
	System.out.println(myCustomList.get(2));
	}
}