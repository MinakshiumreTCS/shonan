package Variables;

public class STATIC_and_NON_STATIC_Global1_variable1 extends STATIC_Global_Variable {
static int j=25;//static global variable
int i=20;// non static global variable
public static void main(String[] args) {
	System.out.println(j);
	STATIC_and_NON_STATIC_Global1_variable1 g=new STATIC_and_NON_STATIC_Global1_variable1();//object creation
	System.out.println(g.i);
	
}
}
