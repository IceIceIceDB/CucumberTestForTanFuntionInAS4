package general;

public class Maths {
	   public static final double E = 2.7182818284590452354;	//approx. value of e
	    
	   public static final double PI = 3.14159265358979323846;	//approx. value of pi
	   
	   /**
	    * Get a power n
	    * @param a - base
	    * @param n - power
	    * @return a^n
	    */
	   public static double power(double a, int n) {
	       double result=1;
	       for(int i=0;i<n;i++) {
	           result=result*a;
	       }
	       return result;
	   }
	   
	   /***
	    * Gets a! 
	    * @param a - value to find factorial of (ex. a = 5, factorial returns 5!)
	    * @return a!
	    */
	   public static double factorial(int a) {
	       double result=1;
	       for(double i=1;i<=a;i++) {
	           result=result*i;
	       }
	       return result;
	   }
	   
	   
	   /***
	    *
	    * @return Bernoulli numbers Bn
	    */
	   public static double[] Bernoulli() {
	       double[] result= {0.0,1.0/6.0,1.0/30.0,1.0/42.0,1.0/30.0,5.0/66.0,691.0/2730.0,7.0/6.0,3617.0/510.0,43867.0/798.0,174611.0/330.0};        
	       return result;
	   }

}

