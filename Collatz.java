// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed = 1;
		int step = 0;
		for(int i=0; i<n;i++){
			step=0;
			seed = i+1;
			do {
			if(mode.equals("v")){
				System.out.print(seed + " ");
			}
			if (seed%2==0){
				seed=seed/2;
			}
			else {
				seed=seed*3+1;
			}
			step++;
			}
			while(seed!=1);
			if (mode.equals("v")){
			System.out.println("1 (" + (step+1)+ ")");
		}
	}
		System.out.println("Every one of the first "+ n + " hailstone sequences reached 1.");
}
}
