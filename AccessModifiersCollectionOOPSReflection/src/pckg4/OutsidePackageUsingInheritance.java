package pckg4;

import DefaultAccessModifiers.WithinSameClass;

public class OutsidePackageUsingInheritance extends WithinSameClass {

    public static void main(String[] args) {

        /*
         * Inheritance - one class object will inherit other class properties
         * extends, implements
         * A, B
         * A extends B
         *
         */

        WithinSameClass obj= new WithinSameClass();


        System.out.println(obj.publicVariable);  //Outside Package only public is accessible
        System.out.println(obj.privateVariable);
        System.out.println(obj.protectedVariable);
        System.out.println(obj.defaultVariable);






    }

}
