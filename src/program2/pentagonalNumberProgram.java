package program2;

public class pentagonalNumberProgram {

	public static void main(String[] args) {
		int count =1;
		for(int x=1;x<=50;x++){
		System.out.printf("%-6d",getPentagonalNumber(x));
		if(count % 10==0) System.out.println();
		count++;
		}
		}
		public static int getPentagonalNumber(int x){
		return(x*(3*x-1))/2;
		}

	}
