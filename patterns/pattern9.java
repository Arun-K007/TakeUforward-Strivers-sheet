class Solution {
    public void pattern9(int n) {
        	    for(int row=1;row<=n;row++){
	        for(int i=1;i<=n-row;i++){
	            System.out.print(" ");
	        }
	        for(int i =1;i<=2*row-1;i++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    for(int row=1;row<=n;row++){
	        	        for(int i =1;i<row;i++){
	            System.out.print(" ");
	        }
	        for(int i=1;i<=2*(n-row)+1;i++){
	            System.out.print("*");
	        }

	        System.out.println();
	    }

    }
}
