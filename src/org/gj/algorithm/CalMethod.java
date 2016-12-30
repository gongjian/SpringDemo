package org.gj.algorithm;

public class CalMethod {
	
	public static int findTarget(Integer[] intArr, int des){
		int low = 0;
		int high = intArr.length-1;
		
		while((low <= high) && (low <= intArr.length-1) && (high <= intArr.length-1)){
			int middle = (low + high) >> 1;
			if(des == intArr[middle]){
				return middle;
			} else if (des < intArr[middle]){
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		
		return -1;		
	}
	

	public static void main(String[] args) {
		Integer[] intArr = {1, 2, 3, 4, 5, 6};
		
		System.out.println(findTarget(intArr, 4));
	}

}
