class Box{

double width, height, length;
double volume;

Box(double w, double l, double h){
	
	width = w;
	length =l;
	height = h;
	
	calcVolume();
	System.out.println(volume);
	
	
}

Box(double l){
	
	this(12.0, 5.0, 5.0);
	width= height= length=l;
	
	calcVolume();
	System.out.println(volume);
}


Box(){
	
	this(10.0);
	width= height= length=5;
	
	calcVolume();
	System.out.println(volume);
	System.out.println(volume);
}
	

public void calcVolume(){
	
	volume = width*length*height;
	
}

public static void main(String arg[]){

	Box b1= new Box();
	b1.calcVolume();
	
	Box b2 = new Box(10.0);
	b2.calcVolume();
	
	Box b3 = new Box();
//	b3.calcVolume();
}

}
