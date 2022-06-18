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
}