import java.util.ArrayList;
import java.util.List;  

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        print(nums, 0, ans);
        System.out.println(ans);  
    }

    public static void print(int[] nums, int idx, List<List<Integer>> ans) {
        int n=nums.length;
        if(idx==n){
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(nums[i]);
                }
            ans.add(arr);
            return;
        }
        for(int i=idx;i<n;i++){
            swap(i, idx, nums);
            print(nums, idx+1, ans);
            swap(i, idx, nums);
        }
    }

    public static void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
