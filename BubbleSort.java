package sort;

public class BubbleSort {
	
	public static void main(String args[]){
		int[] nums = {3,2,4,5,8,1,1,2};
		bubbleSort3(nums);
		System.out.println("Bubble Sort");
		for(int i=0; i < nums.length; i++){
			System.out.print(nums[i]);
			System.out.print(";");
		}
	}
	
	public static void bubbleSort(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[j] < nums[i]) {
					swap(nums, i, j);
				}
			}
		}
	}
	
	//Optimization1
	public static void bubbleSort2(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++){
			boolean flag = true;
			for(int j = i + 1; j < nums.length; j++){
				if(nums[j] < nums[i]) {
					flag = false;
					swap(nums, i, j);
				}
			}
			if(flag) {
				break;
			}
		}
	}
	
	//Optimization2
	public static void bubbleSort3(int[] nums) {
		int k = nums.length - 1;
		for(int i = 0; i < k; i++){
			boolean flag = true;
			for(int j = i + 1; j < nums.length; j++){
				if(nums[i] > nums[j]) {					
					flag = false;
					swap(nums, i, j);
					k = j;
				}
			}
			if(flag) {
				break;
			}
		}
	}
	
	public static void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j]=temp;
	}
}
