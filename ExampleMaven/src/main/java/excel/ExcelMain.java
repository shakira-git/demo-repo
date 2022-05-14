package excel;

import java.io.IOException;

public class ExcelMain {
	
	public static void main(String[] args) throws IOException {
		ExcelRead er = new ExcelRead();
		
//		String value = er.readData(0, 1);
//		System.out.println(value);
//		
		for (int i = 0; i < er.rowsize(); i++) {   //row

			for (int j = 0; j < 3; j++) {  			//cell
				String value = er.readData(i, j);
				System.out.print(value + "  ");
			}
			System.out.println();
		}

	}

}
