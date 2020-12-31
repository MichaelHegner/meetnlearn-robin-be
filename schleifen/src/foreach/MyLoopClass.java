package foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyLoopClass {

	public static void main(String[] args) {
		new MyLoopClass().foreachWithArray();
//		new MyLoopClass().foreachWithArrayList();
//		new MyLoopClass().foreachWithHashmap();
	}
	
	
	/**
	 * Iterate through an array and take each element.
	 * 
	 * for ( elementInArray : array) {
	 *   // do something 'elementInArray'
	 * }
	 */
	public void foreachWithArray() {
		
		int[] numberArray = {1, 2, 3};
			
		for (int element : numberArray) {
			int number = multiplyWithTwo(element);
			System.out.println(number);
		}
		
	}
	
	
	/**
	 * Iterate through an array list and take each element.
	 * 
	 * for ( elementInArrayList : arrayList) {
	 *   // do something with 'elementInArrayList'
	 * }
	 */
	public void foreachWithArrayList() {
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		
		for (Integer element : numberList) {
			int number = multiplyWithTwo(element);
			System.out.println(number);
		}
		
	}
	
	
	/**
	 * Iterate through an hash map key set and take each key.
	 * With the key we can take then each element by key
	 * 
	 * for ( key : hashMap.keySet) {
	 *   // do something with 'hashMap.get(key)'
	 * }
	 */
	public void foreachWithHashmap() {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Key-1", 1);
		map.put("Key-2", 2);
		map.put("Key-3", 3);
		
		for (String key : map.keySet()) {
			int number = multiplyWithTwo(map.get(key));
			System.out.println(number);
		}
		
	}
	

	/**
	 * Helper method which takes an integer element and returns the double value.
	 * 
	 * @param number the number to multiply
	 * @return the multiplied result
	 */
	private int multiplyWithTwo(Integer number) {
		int result = number * 2;
		return result;
	}
}
