package DataStructure;

public class HowToMeasureTimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double now = System.currentTimeMillis();
		//HowToMeasureTimeComplexity demo = new HowToMeasureTimeComplexity();
		System.out.println(findSum(99999));
		System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " millisec.");
	}

	public static int findSum(int n) {
		return n * (n + 1) / 2;
	}

//	public static int findSum(int n) {
//		int sum = 0;
//		for(int i=0; i<n; i++) {
//			sum += i;
//		}
//		return sum;
//	}
}
