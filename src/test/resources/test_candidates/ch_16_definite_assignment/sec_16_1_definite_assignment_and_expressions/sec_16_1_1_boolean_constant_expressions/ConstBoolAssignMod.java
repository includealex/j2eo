public class ConstBoolAssignMod {
    public static void main(String[] args) {
        int k = 200;
		boolean b = (k %= 18) > 0;
		System.out.println(b);
		System.out.println(k);
        System.out.println("passed");
    }    
}
