package analysis_of_algorithms;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Problem - Given an integer array of N elements, find all the possible triplets that sum to Y. The solution should have a
 * runtime of log n or better.
 * 
 * **/
public class TripletSumProblem {
	
	/*To solve this problem we need :
	 * 
	 * 1. an algorithm that will compare all possible triples in the array with a condition that;
	 * 2. if sum == Y then add the triplets else move to the next triplets.
	 * 3. the trick is in deciding which triplets to compare and how to iterate the loop
	 * 4. also the performance is key.**/
	
	ArrayList<int[]>triplets; // to hold the triplets been found
	
	TripletSumProblem(){
		
		
	}
	
	public ArrayList<int[]> findTriplets(int [] array, int targetSum){
		
		/*The basic idea here is use the first 2 digits and the last one as the triplets to check sum
		 * 
		 * if the sum is lesser than target sum move with the first two digits while the right remains a holder
		 * this will be achieved since i++ moves the first digit then left++ moves the next digit.
		 * 
		 * however if the sum is greater than target sum move the right digit one step to the left using right--;
		 * while the first and left remain holders.
		 * 
		 * if sum == target sum then add the triplets to list and move both to look for other possible triplets.
		 * 
		 * Performance of this algorithm - O(n log n)**/
		
		//initialize the array list that will hold the triplets if found
		
		triplets = new ArrayList<>();
		
		//sort the array
		
		Arrays.sort(array);
		
		//get left and right integers for start
		
		for (int i = 0; i<array.length; i++) {
			
			int left = i+1;
			int right = array.length-1;
			
			while(left<right) {
				
				int currentsum = array[i] + array[left] + array[right];
				
				System.out.println("sum trials : " + array[i] + array[left] + array[right]);
				
				if(currentsum == targetSum) {
					
					int [] sums = {array[i],array[left],array[right]}; //add the triplets to an array
					
					System.out.println("some triplets have been found : " + Arrays.toString(sums));
					
					triplets.add(sums); // add the array to the list
					
					left++; //move left pointer +1 to right
					right--;//move right pointer -1 to the left
				}
				else if(currentsum<targetSum) {
					
					left++; // move left digit
				}
				else {
					right--; //move right digit
				}
				
			}
		}
		return triplets;
			
		
	}
	
	//test
	
	public static void main(String[] args) {
    	
    	TripletSumProblem sm = new TripletSumProblem();
		
		int [] myarray = {1,2,3,4,5,6,7,8,9};
		
		ArrayList<int[]>mylist = sm.findTriplets(myarray, 15);
		
		for(int[] item : mylist) {
			
			System.out.println(Arrays.toString(item));
		}
		
		
	
    }

}
