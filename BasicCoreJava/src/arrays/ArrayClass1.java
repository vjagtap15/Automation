package arrays;

public class ArrayClass1 {

	public static void main(String[] args) {
		
		String user= "ArrayClass";
		
		String[] arr= new String[10];
		
		arr[0]="A";
		arr[1]="B";
		arr[2]="C";
		arr[3]="D";
		arr[4]="E";
		arr[5]="F";
		arr[6]="G";
		arr[7]="H";
		arr[8]="I";
		arr[9]="J";
	
		System.out.println(arr.length);
	
		for(int i=0; i<10; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
