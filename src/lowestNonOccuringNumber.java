import java.util.Arrays;


/**
 * @author Jeffrey Emakpor
 * 
 * 	A Java Application to check for non occuring numbers in an array ; 
 * uses Java Array parallel sort which uses a complexity of O(log n) at its worst case
 * if given more time i could come up with my own sorting algorithm 
 * 
 * our compute method takes O(n) complexity in space and O(n) in time
 * **/
public class lowestNonOccuringNumber {

	
	//global variable numbers for accessing constructor array object
	private int numbers[];
	
	
	public lowestNonOccuringNumber(int numbers[]) {
		this.numbers = numbers;
	}
	
	
	/**
	 * @method compute sorts our array and returns the lowest occurring number 
	 *  our formula for getting our non occurring number is: res = array[lowestBeforeHighIndex - 2] + 1 
	 * **/
	
	
	public int compute() throws Exception {
		Arrays.parallelSort(this.numbers);
		
		int [] newArray = this.numbers;
		
		int arraylength =  newArray.length - 1; //get our index array length and -1 to avoid ArrayIndexOutOfBoundsException
		
		int highestNumber = newArray[arraylength]; //get our highest number
		
		int lowestBeforeHighIndex = arraylength - 1 ; //gets our lowest occurring number position
		
		if(newArray[lowestBeforeHighIndex] + 1 < highestNumber) {
			int result = newArray[lowestBeforeHighIndex] + 1;
			if(result == 0 ) { //check if result is 0  we dont want zero :) so lets increase to the next non occuring number
				result += 1;
			}
			return result;
		}
		else 
			throw new Exception("Array has no non occurring numbers");
	}	
	
	
	public static void main(String[] args) {
		
		
		int[] data = {5,-1,-3};
		int[] data2 = {1,3,6,4,1,2};
		
		lowestNonOccuringNumber lowest = new lowestNonOccuringNumber(data);
		lowestNonOccuringNumber lowest2 = new lowestNonOccuringNumber(data2);
		
		try {
			System.out.println(lowest.compute());
			System.out.println(lowest2.compute());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
