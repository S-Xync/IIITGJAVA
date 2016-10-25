public class Operations {

    public static void main(String[] args) {
	    Operation operation=new Operation(args[0],args[1],args[2]);
        operation.calculateValue();
        operation.displayResult();
    }
}
