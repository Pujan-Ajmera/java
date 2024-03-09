public class ArraRevNoExeSpace{
	public static void main(String[] args) {
		int[]  arr = {1,2,5,6,7,8};
		int temp;
		for(int i=0;i<arr.length/2;i++){
			temp = arr[arr.length-i-1];//8
			arr[arr.length-i-1] = arr[i];//1
			arr[i]= temp;//8
		}
		for (int j=0;j<arr.length ;j++) {
		System.out.println(arr[j]);		
		}
	}
}