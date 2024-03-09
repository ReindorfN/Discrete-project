import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner ask_user = new Scanner(System.in);
        System.out.println("Welcome to the Discrete Math Converter");
        System.out.println("Menu:");
        System.out.println("1. Convert expression into dual");
        System.out.println("2. Convert expression using dual notation");
        System.out.println("3. Convert expression into a Boolean");
        System.out.println("Enter your preferred choice from option 1-3:");
        int choice = ask_user.nextInt();
        if (choice == 1) {
            System.out.println("You chose option 1");
            dual_converter();
        } else if (choice == 2) {
            System.out.println("You chose option 2");
            set_notation();
        } else if (choice == 3) {
            System.out.println("You chose option 3");

        } else {
            System.out.println("Error in input");
        }
    }


    public static void dual_converter() {

        Scanner ask = new Scanner(System.in);

        System.out.println("Enter statement you want to dualize:\n NB: \nTo write 'and',enter '&&'\n To write 'or',enter'/' \n Use only p,q,T and F as variables(put them in the " +
                "appopriate brackets). ");
        String operator = ask.nextLine();
        if (operator.equals("(p&&notq)/(q&&F)")) {
            System.out.println("the result is (p/notq)&&(q/T)");
        } else if (operator.equals("(p/notq)&&(q/T)")) {
            System.out.println("Here is your result: (p&&notq)/(q&&F)");

        } else if (operator.equals("(p&&q)/(q&&F)")) {
            System.out.println("Here is your result: (p/q)&&(q/T)");


        } else if (operator.equals("(p/q)&&(q/T)")) {
            System.out.println("Here is your result: (p&&q)/(q&&F)");
        } else {
            System.out.println("Entry not yet initiated in the system");
        }

    }

    public static String set_notation() {
        Scanner set = new Scanner(System.in);
        System.out.println("You chose option 2, Enter the statement you want to change to a set notation,\n Use variables p,q,T and F ONLY.\n" +
                "Use your brackets appopriately");
        String operator1 = set.nextLine();
        if (operator1.equals("(p&&notq)/(q&&F)")) {
            System.out.println("the result is (A&&notB)/0");
        } else if (operator1.equals("(p/notq)&&T)")) {
            System.out.println("Here is your result: (A/notB) && U)");

        } else if (operator1.equals("(p&&q)/(q&&F)")) {
            System.out.println("Here is your result: (A&&B)/0");


        } else if (operator1.equals("(p/q)&&(q/T)")) {
            System.out.println("Here is your result: (A/B)&& U");
        } else {
            System.out.println("Entry not yet initiated in the system");
        }

        return operator1;
    }


}
