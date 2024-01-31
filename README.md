# A. Triplet sum problem

In this problem you are given an array of integers and a target sum = Y.
The requirement is to find all possible triplets that sum to the target sum.
The performance of the algorithm should be n log n or better.

# solution

1. sort the array
2. select pointers to one digit on the left(at the beginning of the array after the first element) and on the right(at the end)
3. iterate the array with a for loop.
4. at each point get the current sum of - array[i] + array[left] + array[right]
5. if the sum == targetsum - add the triplets to an arraylist that holds these triplets
6. else if sum < targetsum - logic is to move the left and first digit one step to the right
7. else move right digit one step to the left.
8. return the triplets

# note

1. if you find the first triplets, how do you keep on looking for others? inorder to keep the process going, a while loop is necessary
2. this while loop will compare left < right.


# B. Double sum problem

In this problem, the idea is given a collection of numbers, find all possible pairs that sum to Y. 

# solution

1. one way to solve this is nesting a for loop from j = i+1 into another for loop from i = 0. This will solve the problem but will have a O(n^2)
runtime which is not the most efficient.

2. the other approach is to select to pointers at the beginning and the end, then writing conditions that determine the logic of movement based
on the sum.

3. condition 1 : is if sum == targetSum then the logic is move both pointers one step to the right for the left pointer and one step left for the right pointer

4. condition 2 ; is if sum < target sum then we agree the smartest move here is one step to the left for the right pointer.

5. condition 3 : is if sum > targetSum then move the left pointer one step to the right.

The run time performance for this solution assuming the array is sorted is O(n) linear time which is very acceptable.