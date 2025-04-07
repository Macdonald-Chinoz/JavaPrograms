package classA;
import java.util.Scanner;
public class classA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input the investment Amnt :");
		double investmentAmount = in.nextDouble();
		System.out.print("Enter the Interest rate : ");
		double rate = in.nextDouble();
		System.out.print("Input number of years:");
		int year = in.nextInt();
		classB object1 = new classB();
		double futureInvestmentValue=0;
		rate *= 0.01;
		System.out.println("Years FutureValue");
		for (int i =1;1 <= year ;i++)
		{
		int formatter =19;
		if(i >=10)formatter =18;
		futureInvestmentValue=object1.futureInvestmentValue(investmentAmount, rate/12,i);
		System.out.printf(1+ "%" + formatter + ".2f\n",futureInvestmentValue);
		}
	}

}
