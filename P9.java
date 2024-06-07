import java.util.*;

public class P9 {
	public static void swap(int arr[], int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
	public static void reverse(int arr[], int s, int e) {
		while (s <= e) {
			swap(arr, s,e);
			s++;
			e--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,3,5,1,2};
		int k =3;
		int n=k%arr.length;
		reverse(arr, 0, arr.length-k-1);
		reverse(arr, arr.length-k, arr.length-1);
		reverse(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		int min=arr[0];
		for(int j=1; j<arr.length; j++){
			if(arr[j]<min){
				min=arr[j];
			}
		}
		System.out.print("min element : "+min);
	}
}