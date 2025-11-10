// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		double sum =0.0;
		for (int i=0; i<n; i++){
			int odd = (i*2)+1;//המספרים האי זוגיים
			if (i%2==0){
				sum = sum+(1.0/odd);
			}
			else{
				sum = sum-(1.0/odd);
			}
		}
		double approx = sum*4;
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated:     " +approx);

	}
}
