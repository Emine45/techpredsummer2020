package deneme;

public class MinAndMax {

	   public static void main(String args[]) {
	      int[] arr = {23, 92, 16, 39, 93};
	      int max = 0;
		     
	     for(int i =0;i<arr.length;i++) {
	    	 if(arr[i]>max) {
	    		 max=arr[i];
	    	 }
	     }
	     System.out.println(max);
	     
	     int min = arr[0];
	     for(int i =0;i<arr.length;i++) {
	    	 if(arr[i]<min) {
	    		 min=arr[i];
	    	 }
	     }
	     System.out.println(min);
	   }   
}