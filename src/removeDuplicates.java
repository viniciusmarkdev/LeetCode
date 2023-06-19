public class removeDuplicates {
	
	public static void main(String[] args) {
		
	
    	
    	int [] nums = {1,1,2};
    	
    	removeDuplicates1(nums);
	}
	public static int  removeDuplicates1(int[] nums) {
		
		int length = nums.length;
        int index = 0;
   
        for (int i = 0; i < length; i++) {
        	
        	
        	
        	if (i==0 || nums[i] != nums[i - 1]) {
               
        
            	nums[index++] = nums[i];
            
            
            
            }
            

            
            
        }
     
     
		return index;
       
     
	
	
     
        	 
       
    }

}
