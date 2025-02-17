package lapphuong;

import java.util.Scanner;

public class Lab1Bai4 {public static void main(String[] args) {
	System.out.print("Delta\n");
	Scanner banPhim = new Scanner(System.in);
			System.out.println("moinhapa: ");
			Double a= banPhim.nextDouble();
			System.out.println("moinhapb: ");
			Double b= banPhim.nextDouble();
			System.out.println("moinhapc: ");
			Double c= banPhim.nextDouble();
			Double Delta = Math.pow(b, 2) - 4 * a *c ;
			if(Delta >=0)
			{
			Double candelta = Math.sqrt(Delta) ;
			System.out.print("canDelta =  ");
			System.out.print(candelta);
			}else System.out.print("canDelta âm, không thể tính căn bậc hai ");
}

}
