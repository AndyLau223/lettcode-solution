import java.util.HashMap;
import java.util.Map;

public class TwoSum_01 {

    /**
     * Exhaustive search solution：
     *
     * Time complexity: O(N^2)
     * Space complexity: O(N1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1;j<nums.length;j++){
                if(target - nums[i] == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * Hashtable
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_Hash(int[] nums, int target){
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashTable.containsKey(target-nums[i])){
                return new int[]{i,hashTable.get(target-nums[i])};
            }
            hashTable.put(nums[i],i);
        }

        return new int[]{};
    }
}
