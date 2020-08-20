package com;

public class HarryAndPotter {
	
	public int solveTheMystery(String input, int harry, int potter) {
		int result=0;			
		boolean flag = true;
		String resultString = "";
		String copyOfinput = input;
		
		while(!resultString.equals(input)) {
			if(flag) {
				resultString =  getSubStringResult(copyOfinput, harry);
				flag = false;
				result++;
				copyOfinput = resultString;
			} else {
				resultString = getSubStringResult(copyOfinput, potter);
				flag = true;
				result++;
				copyOfinput = resultString;
			}
		};
		
		return result;
	}

	public String getSubStringResult(String input, int conditionalCount) {
		String subString = input.substring(input.length()-conditionalCount, input.length());
		
		StringBuilder sb = new StringBuilder(input);
		sb.delete(input.length()-conditionalCount, input.length());
		
		String resultString = subString+sb.toString();
		return resultString;
	}
	public static void main(String[] args) {
		HarryAndPotter hp = new HarryAndPotter();
		System.out.println(hp.solveTheMystery("abcdef", 1, 2));
	}
}
