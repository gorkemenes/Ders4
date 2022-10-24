package githubdeneme;

public class deneme {

	public static void main(String[] args) {
	int [] array = {32,27,64,18,98,14,90,70,60,37};
	System.out.printf("%s %8s %n", "Index","Value");
/*	for (int counter =0 ; counter < array.length; counter++)
	{
System.out.printf("%5d%8d%n\n\n",counter,array [counter]);
	} */
	int temp; 
	temp=array[0];
	array[0]=array[9];
	array[9]=temp;
	temp=array[1];
	array[1]=array[8];
	temp=array[2];
	array[2]=array[7];
	temp=array[3];
	array[3]=array[6];
	temp=array[4];
	array[4]=array[5]; 
	for (int counter =0 ; counter < array.length; counter++)
	{
System.out.printf("%5d%8d%n",counter,array [counter]);
	}
	 
	
}
}