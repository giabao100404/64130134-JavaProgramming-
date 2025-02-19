/**
 * 
 */
package ntu.tlgb;

/**
 * 
 */
import java.util.Scanner;


public class delta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
