public class removeDuplicateBruterForce{
	
	public static void main(String[] args) {
		
	
    	
    	int [] nums = {1,1};
    	
    	removeDuplicates1(nums);
    	 
    	 
    
	}
	
	   static int k;
	  
	public static  int removeDuplicates1(int[] nums) {
		
	        boolean a = false;
		    for(int i:nums) {
		    	
		    	if(i==0) {
		    		
		    		 a=true;
		    	}
		    }
		 
		 
		   if(a) {
			   
			   k=0;
		   }else {
			   
			   k=1;
		   }
		        for(int i=0 ; i<nums.length ; i++) {
					
					
		        	
		        	
					for(int j=i+1 ; j<nums.length ; j++) {
						
						if(nums[i]==nums[j]) {
							
							nums[i]=0;
							k++;
						
						}
					
					}
					
					
					
				}
				
			 for(int i=1 ; i<nums.length ; i++) {
				   
				   int aux = nums[i];
				   int j = i-1;
				   
				   while(j>=0 && nums[j]<aux) {
					   
					   nums[j+1] = nums[j];
					   j--;
				   }
				   
				   nums[j+1] = aux;
				   
			   }
				
			 for(int i=1 ; i<k; i++) {
				   
				   int aux = nums[i];
				   int j = i-1;
				   
				   while(j>=0 && nums[j]>aux) {
					   
					   nums[j+1] = nums[j];
					   j--;
				   }
				   
				   nums[j+1] = aux;
				   
			   }
			 
			 int l=0;
			 
			 for(int i :nums) {
				 
				 if(i!=0) {
					 
					 l++;
					
				 }
			 }
		 
			 for(int i=0; i<l; i++) {
				   
				   int aux = nums[i];
				   int j = i-1;
				   
				   while(j>=0 && nums[j]>aux) {
					   
					   nums[j+1] = nums[j];
					   j--;
				   }
				   
				   nums[j+1] = aux;
				   
			   }
		   for(int i : nums) {
				
				System.out.println(i);
			}
				
		   System.out.println(k);
		   return k;
	      	
       
    }

}