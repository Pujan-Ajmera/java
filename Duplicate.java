public class Duplicate{
	public static void main(String[] args){
		int[] arr ={1,2,3,4,5,8,6,7,8,9};

		for(i=0;i<arr.length;i++){
			for(j=0;j<(arr.length+1);j++){
				if(a[i] == a[j]){
					System.out.println(a[j]);
				}
			}
		}
	}
}