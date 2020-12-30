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
	
	
	public void foreachWithArray() {
		
		int[] numberArray = {1, 2, 3};
			
		for (int element : numberArray) {
			int number = multiplyWithTwo(element);
			System.out.println(number);
		}
		
	}
	
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
	
	private int multiplyWithTwo(Integer element) {
		int result = element * 2;
		return result;
	}


	public void foreachWithHashmap() {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hello");
		
		for (Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
	}
	
}
