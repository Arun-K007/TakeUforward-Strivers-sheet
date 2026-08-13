class Solution {
    public void pattern13(int n) {
        int count=1;
	    for(int row=1;row<=n;row++){
	        for(int i=1;i<=row;i++){
	      System.out.print(count+" ");
	      count++;
	        }
	        System.out.println();
	    }

    }
}
