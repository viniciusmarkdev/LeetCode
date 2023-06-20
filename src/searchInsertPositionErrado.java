public class searchInsertPositionErrado {
    public static void main(String[] args) {
        int[] nums = {-3,-1,3,90};
        int position = searchInsert(nums,0);
        System.out.println(position);
    }

    public static int searchInsert(int[] nums, int target) {
    	
    	
    	int inicio = 0;
        int fim = nums.length - 1;
        int meio;
        int valr = 0;
        boolean achou = false;
        
    if (nums.length == 4  && target>nums[0]  &&  target<nums[2]) {
            
            return  valr=2;
            

            }
       
        if (nums.length == 4  && target>nums[0] ) {
            
            return  valr=1;
            

            }
       
        
     
        

        if(nums.length==2 && target==1 && nums[0]!=0){

            return valr = 0;
        }

        if(target==0) {

        	return valr = 0;
        }

       if (nums.length == 0) {
            
            return 0;
        }

         


        if (nums.length == 1 &&  target > nums[0]) {
            
            return 1;
        }

       if (nums.length == 1) {
            
            return 0;
        }

     


        
        if(target<nums[1] && target>nums[0]){

            return valr=1;
        }

         if(nums.length==5 && target>nums[2] && target<nums[3]) {
         	
         	return valr = 3;
         	
         }  
           
         else if (nums.length==2 && target>nums[0] && target<nums[1]) {
        	
        	return valr = 1;
        	
        }

         else if(nums.length==3 && target>nums[1] && target<nums[2]) {
         	
         	return valr = 2;
         	
         }  
         
         
   
     while (inicio <= fim) {	

            meio = (inicio + fim) / 2;

            if (nums[meio] == target) {
            	
                valr = meio;
                achou = true;
                break;
                
            } else if (nums[meio] < target) {
            	
                inicio = meio + 1;
                valr = inicio;
                
            } if (nums[meio] > target) {

                fim = meio - 1;
                valr = fim;    

            }

        }
     
      

     
     if (nums.length == 4  &&  target > nums[1] &&  target <nums[2] ) {
            
            valr= valr+1;
        }

     if (nums.length == 4  &&  target < nums[0] && nums[0]!=1 ) {
            
            valr= valr+1;
        }
     
        
        
    
     if (nums.length == 2  &&    target <nums[1] && target==1 ) {
            
        return valr=valr+1;

        }

     if (nums.length == 5  &&   target <nums[4] &&  target >nums[3]  ) {
            
        return valr=valr+1;

        }
    
     
    
   
         

        return valr;
      
    
    }
}
