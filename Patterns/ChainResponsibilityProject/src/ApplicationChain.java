
public class ApplicationChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain chainCalc1 = new Add();
		Chain chainCalc2 = new Sub();
		Chain chainCalc3 = new Mul();
		Chain chainCalc4 = new Div();
	
		         
	
		        chainCalc1.setNextChain(chainCalc2);
		        chainCalc2.setNextChain(chainCalc3);
		        chainCalc3.setNextChain(chainCalc4);
		   
		
		         
		        System.out.println("Adding Using Chain \n");
		        Numbers adding = new Numbers(55,45,"Add");
		        chainCalc1.calculate(adding);
	
		        
		        System.out.println("\n Substraction Using Chain ");
		        Numbers sub = new Numbers(100,45,"Sub");
		        chainCalc1.calculate(sub);

		        
		        System.out.println("\n Multiplication Using Chain ");
		        Numbers mul = new Numbers(10,2,"Mul");
		        chainCalc1.calculate(mul);

		        
		       /**System.out.println("\n Division Using Chain ");
		        Numbers div = new Numbers(200,100,"Div");
		        chainCalc3.calculate(div);
		        **/
		         


	}

}
