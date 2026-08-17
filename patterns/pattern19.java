class Solution {
    public void pattern19(int n) {
        	    for(int i=0;i<n ;i++){
	        for(int j=n;j>i;j--){
	            System.out.print("*");
	        }
	       for(int j=1;j<=(i*2);j++){
	           System.out.print(" ");
	       }
	       for(int j =n;j>i;j--){
	           System.out.print("*");
	       }
	        System.out.println();
	    }
	    for(int i=n;i>0;i--){
	        for(int j=n;j>=i;j--){
	            System.out.print("*");
	        }
	        for(int j=1;j<=(i*2)-2;j++){
	            System.out.print(" ");
	        }
	        for(int j=n;j>=i;j--){
	            System.out.print("*");
	        }
	        System.out.println();
	    }

    }
}
