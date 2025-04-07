package classA;

public class classB {
	private double investment;
	private double rate;
	private int year;
	public double getInvestment(){
	return investment;
	}
	public double getRate() {
		return rate;
		}
		public int getYear(){
		return year;
		}
		public void setYear(int year) {
		this.year = year;
		}
		public double futureInvestmentValue(double investmentAmount,double
		monthlyinterestRate,int year)
		{
		return investmentAmount = Math.pow(1 + monthlyinterestRate,year +12);
		}
}
