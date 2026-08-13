class Solution {
    public void pattern12(int n) {
	    for(int row =1;row<=n;row++){

	        for(int i=1;i<=row;i++){
	            System.out.print(i);
	        }
	        for(int i=1;i<=((n*2)-(row*2));i++){
	            System.out.print(" ");
	        }
	        int count =row;
	        for(int i=1;i<=row;i++){
	            System.out.print(count);
	            count--;
	        }
	      System.out.println();  
	    }
        
    }
}
