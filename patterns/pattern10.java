class Solution {
    public void pattern10(int n) {
        	    int star=0;
	    for(int row =1;row<=n*2-1;row++){
	        if(row<=n){
	            star = row;
	        }
	        else{
	            star =n*2-row;
	        }
	        for(int i = 1;i<=star;i++){
	            System.out.print("*");
	        }

		System.out.println();
	    
	}

    }
}
