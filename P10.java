public class P10 {
	public static boolean IndexJump(int[] arr) {
		int idx = 1;
		int jump = arr[idx];
		while(jump!=0 && idx<arr.length-1){
			idx+=jump;
		}
		if(idx==arr.length-1) return true;
		else return false;
	}
	public static void main(String[] args) {
		int[] arr1={2,3,1,1,4};
		int[] arr2 = {3,2,1,0,4};
		System.out.println(IndexJump(arr1));
		System.out.println(IndexJump(arr2));
	}
}