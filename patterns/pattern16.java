class Solution {
    public void pattern16(int n) {
        	char ch='A';
		for(int row=1;row<=n;row++){
		    for(int i=1;i<=row;i++){
		        System.out.print(ch);
		    }
		    ch++;
		    System.out.println();
	}
    }
}
