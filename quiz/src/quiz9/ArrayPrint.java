package quiz9;

public class ArrayPrint {

	
	String printArray(String[] arr) {
		
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		
		return result;
	}
	
	String printArray(int[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		
		return result;
	}
	String printArray(char[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		
		return result;
	}
	
	
	
	
}
