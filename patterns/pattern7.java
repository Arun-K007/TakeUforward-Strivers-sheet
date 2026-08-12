class Solution {
    public void pattern7(int n) {
        		for(int row=1;row<=n;row++){
	    for(int i=1;i<=n-row;i++){
	        System.out.print(" ");
	    }
	    for(int i = 1;i<=(row*2)-1;i++){
	        System.out.print("*");
	    }

	    
	   System.out.println();
	}

    }
}
