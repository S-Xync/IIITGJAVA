public class Operation {
    private int operand1;
    private String operator;
    private int operand2;
    private double result;

    public Operation(String  operand1, String operator, String  operand2) {
        this.operand1 = Integer.parseInt(operand1);
        this.operator = operator;
        this.operand2 = Integer.parseInt(operand2);
    }
    public void calculateValue(){
        if (this.operator.equals("+")){
            this.result=this.operand1+this.operand2;
        }else if (this.operator.equals("-")){
            this.result=this.operand1-this.operand2;
        }else if (this.operator.equals("x")){
            this.result=(this.operand1 * this.operand2);
        }else if (this.operator.equals("/")){
            this.result=((double) this.operand1)/((double) this.operand2);
        }

    }
    public void displayResult(){
        System.out.println("\n\nThe result of "+this.operand1+" "+this.operator+" "+this.operand2+" is : "+this.result+"\n");
    }
}
