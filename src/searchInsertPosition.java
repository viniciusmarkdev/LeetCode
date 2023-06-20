public class searchInsertPosition {
	
	public static void main(String[] args) {
		
		int [] b = {1,3,5,6};
		
		int a = searchInsert(b,0);
		System.out.println(a);
		
	}
	
	
	   public static int searchInsert(int[] nums, int target) {
		   
	        int inicio=0;
	        int fim=nums.length-1;
	        while(inicio<=fim)
	        {
	            int mid=(inicio+fim)/2;
	            
	            if(nums[mid]==target ) {
	            	
	            	 return mid;
	            }
	           
	            else if(nums[mid]<target) {
	            	
	            	   inicio=mid+1;
	            }
	         
	            else {
	            	
	            	   fim=mid-1;
	            }
	            

	        }
	        return inicio;
	    }

}
