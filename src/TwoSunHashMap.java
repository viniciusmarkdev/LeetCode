import java.util.HashMap;
import java.util.Map;

public class TwoSunHashMap {
	
	public int[] twoSum(int[] nums , int target) {
		
		Map<Integer , Integer> complementos = new HashMap<>();
		for(int i =0; i<nums.length; i++) {
            
			
		Integer complementoIndex =complementos.get(nums[i]);
	      
		if(complementoIndex !=null ) {
			return new int [] {i,complementoIndex};
		}
		complementos.put( target-nums[i] ,i);
		}
		
		return nums;
	}

}
