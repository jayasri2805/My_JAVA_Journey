package numbers1;

public class Array2D {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		int arr_len=count%2==0?(arr.length+1)/2:arr.length/2;
		for(int j=0;j<arr_len;j++) {
			int temp=arr[j];
			arr[j]=arr[arr_len-j-1];
			arr[arr_len-j-1]=temp;
		}
		for(int num:arr) {
			System.out.println(num);
		}
	}
}
