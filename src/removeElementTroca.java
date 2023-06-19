
public class removeElementTroca {
	
	
	  public int removeElement(int[] nums, int val) {

          
	        int x=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]!=val){

	                int aux = nums[i];
	                nums[i] =nums[x];
	                nums[x]= aux;
	                x++;

	            }

	           

	        }
	        return x;
	  }
	
	

}
