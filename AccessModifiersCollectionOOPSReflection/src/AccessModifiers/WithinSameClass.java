package DefaultAccessModifiers;

public class WithinSameClass {

    public int publicVariable = 10;
    private int privateVariable = 20;
    protected int protectedVariable = 30;
     int defaultVariable = 40;

    public static void main(String[] args) {
        WithinSameClass obj= new WithinSameClass();
        System.out.println(obj.publicVariable);
        System.out.println(obj.privateVariable);
        System.out.println(obj.protectedVariable);
        System.out.println(obj.defaultVariable);
    }
}
