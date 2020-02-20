package Calculate;
import java.util.*;
public class Calculate {
	public static void main(String[] z)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.format("Principal:");
		double PrincipalAmount=sc.nextDouble();
		System.out.format("Rate of Intrest:");
		double InterestRate=sc.nextDouble();
		System.out.format("Time:");
		int nfYears=sc.nextInt();
		double SimpleIntrest,CompoundIntrest;
		SimpleIntrest=PrincipalAmount*nfYears*(InterestRate/100);
		CompoundIntrest=PrincipalAmount*(Math.pow(1+(InterestRate/100),nfYears))-PrincipalAmount;//compounded annually
		System.out.format("SimpleIntrest is:%.2f\n",SimpleIntrest);
		System.out.format("CompoundIntrest is:%.2f\n",CompoundIntrest);
	}
}