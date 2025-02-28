import java.util.HashMap;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num,num);
        }


        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.hasDuplicate(new int[]{1,2,3,3}));
    }
}
