package fourth;

public class Lambda1 {

	public static void main(String[] args) {
		
		ArithmaticOp addition = (int op1,int op2) -> op1+op2;
		ArithmaticOp subtraction = (int op1,int op2) -> op1-op2;
		ArithmaticOp multiplication = (int op1,int op2) -> op1*op2;
		ArithmaticOp division = (int op1,int op2) -> op1/op2;
		
		System.out.println("Addition :" +addition.operation(20, 5));
		System.out.println("Subtraction :" + subtraction.operation(20, 5));
		System.out.println("Multiplication : " + multiplication.operation(20, 5));
		System.out.println("Division :" + division.operation(20, 5));
		
	}

}

@FunctionalInterface
interface ArithmaticOp{
	int operation(int op1,int op2);
}
