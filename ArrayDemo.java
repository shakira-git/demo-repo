class ArrayDemo{
public static void main(String args[])
{

/*	//datatype array_name[] ;    //declaration
	//array_name = new datatype[size]; //instantiation
	
	//datatype array_name[] = new datatype[size];

	
	//int arr[];
	//int []arr;
	//int[] arr;
	//arr = new int[5];
	
	//int[] arr;
	
	
	arr[0] = 100;   //initialization
	arr[1] = 200;
	arr[2] = 300;
	arr[3] = 400;
	arr[4] = 500;
	
	int arr[] = {10,20,30,40,50};
	
	// int arr[] = {10,30,80}; 
	
	System.out.println(arr.length);
	
	System.out.println(arr[1]);
	 
	for(int i=0; i<arr.length; i++){
		
		System.out.print(arr[i] + "   ");  // 100 200 300..
			
	} 
	System.out.println();
	
	
	//for(data_type variable : array){  
	//	body of the loop  
	//}  
	
	
	for(int y : arr){		
		System.out.print(y + "   ");
	}
	
*/



	//datatype array_name[][] ; 
	//data_type[][] array_name;
	//data_type [][]array_name;
	//data_type []array_name[];
	//array_name = new datatype[row_size][column_size];
	
	//datatype array_name[][] = new datatype[row_size][column_size];

int mulArr[][] = new int[3][4];


mulArr[0][0] = 1;
mulArr[0][1] = 2;
mulArr[0][2] = 3;
mulArr[0][3] = 3;

mulArr[1][0] = 6;
mulArr[1][1] = 5;
mulArr[1][2] = 4;
mulArr[1][3] = 4;

mulArr[2][0] = 7;
mulArr[2][1] = 8;
mulArr[2][2] = 9;
mulArr[2][3] = 9;



//int mulArr[][] = {{1,2,3},{6,5,4},{7,8,9}};


System.out.println(mulArr.length); 

for(int i =0; i<3; i++){  //row
	
	for(int j=0; j<4; j++){  //column
		
		System.out.print(mulArr[i][j] + "   ");
	}
	System.out.println();
}


System.out.println("For-Each");

for(int y[] : mulArr){
	for(int x : y){
		System.out.print(x + "   ");
	}
	System.out.println();
}


}



}