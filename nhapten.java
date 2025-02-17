package nhaphovaten_nhapdiem;

import java.util.Scanner;

public class nhapten {public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print("sinhvien\n");
			Scanner banPhim = new Scanner(System.in);
					System.out.println("Họ và tên: ");
					String Hovaten= banPhim.nextLine();
					System.out.println("Điểm TB: ");
					Double diemTB= banPhim.nextDouble();
					System.out.print("Hovaten: \n");
					System.out.print(Hovaten);
					System.out.print("Điểm TB: ");
					System.out.print(diemTB);
}

}
