package tuan05;

import java.util.Arrays;
import java.util.Collections;

public class Bai2 {
	    public static void main(String[] args) {
	    	// Sử dụng một mảng Integer thay vì int, vì Collections.reverse() yêu cầu một danh sách (list) thay vì mảng.
	        Integer[] originalArray = {0,2,4,6}; 
	        // Hàm Collections.reverse() sẽ đảo ngược danh sách (list) của mảng originalArray.
	        Collections.reverse(Arrays.asList(originalArray));
	        // In mảng đã đảo ngược
	        System.out.println("Mảng đã đảo ngược: " + Arrays.toString(originalArray));
	    }
}
