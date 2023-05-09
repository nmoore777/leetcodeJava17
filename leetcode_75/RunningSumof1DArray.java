package leetcode_75;
//given an array nums
//we define a running sum of an array as:
//runningSum[i] = sum(nums[0]...nums[i]
//return the running sum of nums

//constraints:
// 1 <= nums.length <=1000
//-10^6 <= nums[i] <= 10^6

public class RunningSumof1DArray {

    public static int[] runningSum(int[] nums){
        int[] runningSum = new int[nums.length]; //create a new array with size equal to imput array to store running sum
        runningSum[0] = nums[0]; //populate the first index with the first element of nums
        for(int i=1; i < nums.length; i++){
            runningSum[i] = runningSum[i-1]+nums[i]; //loop through the provided nums list and add each number to the previous element of running sum then store that in the current index of running sum
        }
        return runningSum;
    }

    public static void get1DArraySolution(){
        int[] arr = new int[] {1,2,3,};
        int[] sum = RunningSumof1DArray.runningSum(arr);
        for(int num:sum)
            System.out.println(String.valueOf(num));
    }
}
