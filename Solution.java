import java.util.List;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        List<Integer> list = new ArrayList<Integer>();
        int j=0;
        for(int i:nums){
           list.add(j,i);
            if(list.contains(target-i)&&list.indexOf(target-i)!=j)
               return new int[]{list.indexOf(target-i),j};
            j++;
        }
        
     return null;     
    }
}
