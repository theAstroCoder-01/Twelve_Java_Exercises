package Thread;

class SumCalculator extends Thread {
	private int[] numbers;
	private int start;
	private int end;
	private int sum;
	
	public SumCalculator(int[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		sum = 0;
		for(int i = start; i < end; i++) {
			sum += numbers[i];
		}
	}
	
	public int getSum() {
		return sum;
	}
}

public class MultiThreadedSumCalculation {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		SumCalculator calc1 = new SumCalculator(numbers, 0, numbers.length / 2);
		SumCalculator calc2 = new SumCalculator(numbers, numbers.length / 2, numbers.length);

			calc1.start();
			calc2.start();
			
		try {
			calc1.join();
			calc2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int totalSum = calc1.getSum() + calc2.getSum();
		
		System.out.println("Total Sum: " + totalSum);
	
	}
}
