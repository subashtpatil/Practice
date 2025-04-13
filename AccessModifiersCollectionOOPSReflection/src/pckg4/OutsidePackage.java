package pckg4;

import DefaultAccessModifiers.WithinSameClass;
import pckg3.Sample;
import pckg3.Test;

public class OutsidePackage {

	public static void main(String[] args) {


		WithinSameClass obj= new WithinSameClass();


		System.out.println(obj.publicVariable);  //Outside Package only public is accessible
		//System.out.println(obj.privateVariable);
		//System.out.println(obj.protectedVariable);
		//System.out.println(obj.defaultVariable);
		

		
	
		

	}

}
