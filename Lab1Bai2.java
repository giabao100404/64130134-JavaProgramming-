package tinhhinhchunhat;

import java.util.Scanner;

public class Lab1Bai2 {public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print("hinhchunhat\n");
			Scanner banPhim = new Scanner(System.in);
					System.out.println("Chiều dài: ");
					Double dai= banPhim.nextDouble();
					System.out.println("Chiều rộng: ");
					Double rong= banPhim.nextDouble();
					Double cv = (dai + rong)*2;
					Double dt = dai * rong;
					Double canhnhonhat = Math.min(dai, rong);
					System.out.print("chu vi hình chữ nhật: /n");
					System.out.print(cv);
					System.out.print("diện tích hình chữ nhật: ");
					System.out.print(dt);
					System.out.print("cạnh nhỏ nhất hình chữ nhật: ");
					System.out.print(canhnhonhat);
}
}
