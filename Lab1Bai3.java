package lapphuong;

import java.util.Scanner;

public class Lab1Bai3 {public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print("sinhvien\n");
			Scanner banPhim = new Scanner(System.in);
					System.out.println("Chiều dài cạnh lập phương: ");
					Double a = banPhim.nextDouble();
					System.out.print("Thể tích : ");
					Double thetich = Math.pow(a, 3);
					System.out.print(thetich);
}


}
