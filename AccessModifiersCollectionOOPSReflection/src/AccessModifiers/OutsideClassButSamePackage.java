package DefaultAccessModifiers;

public class OutsideClassButSamePackage {

    public static void main(String[] args) {
        WithinSameClass obj= new WithinSameClass();
        System.out.println(obj.publicVariable);
        //System.out.println(obj.privateVariable);  //Not accessible outside its class
        System.out.println(obj.protectedVariable);
        System.out.println(obj.defaultVariable);
    }
}
