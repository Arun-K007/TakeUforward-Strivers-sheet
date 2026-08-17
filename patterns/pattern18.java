class Solution {
    public void pattern18(int n) {
        	    for(int i=n;i>0;i--){
	        for(int j=i;j<=n;j++){
	            System.out.print((char)(j+64)+" ");
	            
	        }
	        System.out.println();
	    }

    }
}
