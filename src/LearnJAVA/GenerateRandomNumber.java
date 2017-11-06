package LearnJAVA;


public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		System.out.println(getRandomNumber(55));
		

	}
	
	public static int getRandomNumber(int intLimit){
		int rndNumber = 0;
		double random = 0;
		
		
		
		
		while (rndNumber !=0 & rndNumber <= intLimit){
			random = Math.random() * 100;
			rndNumber = (int) random;
		}
		
		return rndNumber;
		
	}

}
