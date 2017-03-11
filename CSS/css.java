package CSS;

public class css {
	
	public static boolean isEquilateral(int a, int b, int c){
		if(a==b&&b==c)
			return true;
		else 
			return false;
	}
	public static boolean isIsosceles(int a, int b, int c){
		if((a+b>c&&a+c>b&&b+c>a)&&(a==b||a==c||b==c))
			return true;
		else
			return false;
	}
	public static boolean isScalene(int a, int b, int c){
		if((a+b>c&&a+c>b&&b+c>a)&&(a!=b&&b!=c&&a!=c))
			return true;
		else 
			return false;
	}

}
