package analysis_of_algorithms;

import java.util.ArrayList;
import java.util.Arrays;


/*Give a collection of numbers N find all the possible pairs that sum up to Y. **/

public class DoubleSum {
	
	/*To solve this problem i need two pointers located at both ends of the array, then figuring out the
	 * movement condition of these pointers while checking the sum.
	 * 
	 * the first condition is : if sum == targetSum then both pointers need to move
	 * the second condition is: if sum < targetSum then the smart move here is moving last pointer 1 step to left
	 * the third condition here is : if sum > targetSum then the smartest move is to increment the first pointer one to the right
	 * 
	 * each time there is comparison of sum. if doubles are found you add them to the list.
	 * 
	 * **/
	
	int count = 0;
	ArrayList<int[]>list;
	
	DoubleSum(){
		
		
	}
	
	public ArrayList<int[]> findDoubles(int [] array, int targetSum){
		
		list = new ArrayList<>();
		
		int last = array.length-1; //last index pointer
		
		while(count < last) { // this condition keeps the loop going until all numbers are covered
			
			if(array[count] + array[last] == targetSum) { //condition 1
				
				System.out.println("doubles found : " + array[count] + "," + array[last]);
				int [] sums = {array[count], array[last]};
				list.add(sums);
				
				//both pointers move
				last--;
				count++;
				
			}
			
			else if(array[count] + array[last] > targetSum) {
				
				last--; //only last pointer moves 1 step to the left
				
			}
			
			else{
				
				count++; //only first pointer one step to the right
			}
			
			System.out.println("first digit now is : " + array[count]);
			System.out.println("last digit now is : " + array[last]);
			
		}
		
		return list; // return doubles found
		
	}

	public static void main(String[] args) {
		
		DoubleSum sm = new DoubleSum();
		
		int [] myarray = {1,2,3,4,5,6,7,8,9,10};
		
		sm.findDoubles(myarray, 17);
		
		for(int[] item : sm.list) {
			
			System.out.println(Arrays.toString(item));
		}
		
	}
	
	
}
