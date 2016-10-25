import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int result = 0, num1 = 0, num2 = 0;
        char op;
        if (args.length > 1) {
            System.out.println("Only one command line argument is needed\nGive all the characters without spaces");
            return;
        }
        try {
            for (int i = 0; i < args[0].length(); i++) {
                char ch = args[0].charAt(i);
                if (!(Character.isDigit(ch) || ch == '+' || ch == '-')) {

                    throw new IllegalCharacterException();

                }
            }
            String[] addable;
            String[] subtractable;
            ArrayList<String> seperatedStrings = new ArrayList<>();
            addable = args[0].split("[+]");
            for (int i = 0; i < addable.length; i++) {
                subtractable = addable[i].split("[-]");
                for (int j = 0; j < subtractable.length; j++) {
                    seperatedStrings.add(subtractable[j]);
                    if (subtractable.length - j > 1) {
                        seperatedStrings.add("-");
                    }
                }
                if (addable.length - i > 1) {
                    seperatedStrings.add("+");
                }
            }
            for (int i = 1; i < seperatedStrings.size(); i = i + 2) {
                if (!(seperatedStrings.get(i).equals("+") || seperatedStrings.get(i).equals("-"))) {

                    throw new IllegalCharacterException();

                }
            }
            result = Integer.parseInt(seperatedStrings.get(0));
            for (int i = 1; i < seperatedStrings.size(); i = i + 2) {
                switch (seperatedStrings.get(i)) {
                    case "+":
                        result += Integer.parseInt(seperatedStrings.get(i + 1));
                        break;
                    case "-":
                        result -= Integer.parseInt(seperatedStrings.get(i + 1));
                        break;
                    default:

                        throw new IllegalCharacterException();

                }
            }
            System.out.println(result);
        } catch (IllegalCharacterException e) {
            System.out.println(e);
        }
    }
}
