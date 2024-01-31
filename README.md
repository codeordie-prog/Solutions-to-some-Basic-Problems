# Triplet sum problem

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
