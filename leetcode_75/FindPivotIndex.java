package leetcode_75;
/*
given an array of integers nums, calculate the pivot index of this array
the pivot index is the index where the sum
of all the numbers strictly to the left of the index
is equal to the sum of all the numbers strictly to the index's right
if the index is on the left edge of the array, then the left sum is 0 because
there are no elements to the left.
This also applies to the right edge of the array

Return the leftmost pivot index. If no such index exists, return -1

constraints:
    1 <= nums.length <= 10^4
    -1000 <= nums[i] <= 1000
 */

import java.util.ArrayList;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums){
        int sum = 0, leftSum = 0;

        //calculate the sum of the entire array
        for(int num:nums){
            sum += num;
        }

        //iterate through the array and calculate the sum of everything to the left of the array
        for(int i = 0; i < nums.length; i++){
            //check sums before iterating through the list
            if(leftSum == sum - leftSum - nums[i]) //if the left and right sum are equal we have found our index
                return i;
            leftSum += nums[i]; //iterate to the next index
        }
        return -1; //if nothing is found return -1
    }

    public static void getPivotPointSolution(){
        int[] arr1 = new int[] {2,1,-1};
        int[] arr2 = new int[] {1,7,3};
        int[] arr3 = new int[] {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(FindPivotIndex.pivotIndex(arr1));
        ans.add(FindPivotIndex.pivotIndex(arr2));
        ans.add(FindPivotIndex.pivotIndex(arr3));

        for(Integer pivotIndex:ans){
            System.out.println(String.valueOf(pivotIndex));
        }
    }
}
