package leetCodeJava;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int [] answers = new int [2];
        for(int i=0;i<nums.length;i++){
            for(int j = 1;j<nums.length-1;j++){
                if(nums[i] + nums[j] == target){
                    answers[0] = i;
                    answers[1] = j;
                }
            } 
        }
        return answers;
    }
}
