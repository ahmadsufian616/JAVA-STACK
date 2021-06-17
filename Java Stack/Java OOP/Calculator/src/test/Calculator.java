package test;

public class Calculator {
	public double OperandOne;
	public double OperandTwo;
    public char  Operation;
	
    public Calculator () {}
    
    public  void setOperandOne(double one ) {
    	this.OperandOne=one;
    	
		
	}
    public  void setOperandTwo(double Two ) {
    	this.OperandTwo=Two;
    	
		
	}
    public void setOperation(char o) {
    	this.Operation=o;
    }
    public double performOperation() {
    	if(this.Operation=='+') {
    	return	(double)OperandOne+OperandTwo;
    		
    	}
    	if(this.Operation=='*') {
        	return	(double)OperandOne*OperandTwo;
        		
        	}
    	if(this.Operation=='-') {
        	return	(double)OperandOne-OperandTwo;
        		
        	}
    	if(this.Operation=='/') {
        	return	(double)OperandOne/OperandTwo;
        		
        	}
		return 0;
    }
	
  public void getResults() {
	  System.out.println(performOperation());
  }
	  
	  
  
	  
	
}

