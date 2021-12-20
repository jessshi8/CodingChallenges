package staging;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	static public void main(String[] args) {
//		int i = 0;
//		while (i!=4) {
//			switch(i) {
//			case 0:
//				System.out.println(0);
//				break;
//			case 1:
//				System.out.println(1);
//			default:
//				System.out.println("X");
//				break;
//			}
//			i++;
//		}

//		int i = 0;
//		while(i<5) {
//			if(i==0) System.out.print(0);
//			i++;
//			System.out.print((i>2 ? 1 : 2));
//		}

		List<Integer> grades = new ArrayList<>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		// Write your code here
		for (int g : grades) {
			if (g >= 38) {
				int m = g - (g % 5) + 5;
				if (m - g < 3) {
					g = m;
				}
			}
			System.out.println(g);
		}

	}

}
