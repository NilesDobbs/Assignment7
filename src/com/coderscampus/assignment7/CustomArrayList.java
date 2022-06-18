package com.coderscampus.assignment7;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Integer LengthofArray = 10;
	Object[] items = new Object[LengthofArray];
	Integer itemCounter = 0;
	
	@Override
	public boolean add(T item) {
		if (getSize() == (LengthofArray)) {
			items = Arrays.copyOf(items, getSize() * 2);
			LengthofArray = getSize() * 2;
		}
		items[itemCounter++] = item;
		return true;
	}
	
//	private Object[] growBackingObjectArray() {
//		Object[] newItems = Arrays.copyOf(items, size * 2);
//		items = newItems;
//		return newItems;
//	}
	
	@Override
	public int getSize() {
		//Return the size of the counter
		return itemCounter;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		//Return the element of the array.
		return (T) items[index];
	}
	
	@Override
	public boolean add(int index, T item) throws ArrayIndexOutOfBoundsException, IndexOutOfBoundsException {
		if (getSize() == (LengthofArray)) {
			items = Arrays.copyOf(items, getSize() * 2);
			LengthofArray = getSize() * 2;
		}
			/* We need to add a for loop to shift one by one all elements from 
			 	the end to right by 1 position while i > index */

			for(int i = itemCounter; i > index; i--) {
				items[i] = items[i-1];
			}
			items[index] = item;
			itemCounter++;
			return true;
		}
	
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if(index > LengthofArray && index >= 0) {
			throw new IndexOutOfBoundsException(index);
		}
		/* Similar to as above. We need to add a for loop to items*/
		for(int i = index; i < items.length-1; i++) {
			items[i] = items[i + 1];
		}
			itemCounter--;
		return null;
	}
}