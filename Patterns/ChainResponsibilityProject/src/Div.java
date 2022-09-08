
public class Div implements Chain {
	
	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		nextInChain = nextChain;

		
	}

	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		 
		if(request.getCalcWanted() == "Div")
		{
		System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = "+ (request.getNumber1()*request.getNumber2()));
		} 
		else 
		{
			System.out.println("Only works for add,sub,mul and div");
	
		
		    }
	
		
		    }
}