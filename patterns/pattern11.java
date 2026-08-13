class Solution {
    public void pattern11(int n) {
        	    int flag=1;
	    for(int row =1;row<=n;row++){

	        for(int i=1;i<=row;i++){
	            if((row+i)%2==0){
	                flag=1;
	            }
	            else{
	                flag=0;
	            }
	            System.out.print(flag+" ");
	            


	        }
	      System.out.println();  
	    }
    }
}
