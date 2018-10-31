/*import java.util.Scanner;

public class Utils {

    static Scanner sc = new Scanner((System.in));

    public static String getInput(String prompt) {
        System.out.print(prompt);
        String response = sc.nextLine();
        return response;
    }


    public static int getNumber(String prompt) { //A message to be printed to the console telling the user what to enter.

        int number = 0;
        do {
            String response = getInput(prompt);
            try {
                number = Integer.parseInt(response);
                break;
            } catch (NumberFormatException e) {
                System.out.println(response + " Is not a number");
                continue;
            }
        } while (true);
        return number;
    }

    public static int getNumber(String prompt, int max) {
        int number;
        do {
            number = getNumber(prompt);
        } while (number > max);
        return number;
    }

    public static void main(String[] args) {
        int menuOption = 0;
        outterloop:
        while (menuOption != 6)
        {
            menuOption= getNumber("Enter menu option: ", 6);
            switch (menuOption) {

                case 1:
                    System.out.println("Your're #1");
                    break;
                case 2:
                case 3:
                    for (int i = 0; i < menuOption; i++) {
                        System.out.println("Yipee! i'm in a loop" + menuOption);
                    }
                    break;
                case 4:
                case 5:
                    System.out.println(menuOption);
                    break;
                case 6:
                    System.out.println("Exit");
                    break outterloop;
            }
        }

    }
}*/



import java.util.Scanner;

public class Utils {

    static Scanner sc = new Scanner((System.in));

    /**
     * 		getInput	-	Prompt the user to type something in the console window
     * @param prompt		String - The message telling the user what to enter
     * @return				String - The users response
     */
    public static String getInput(String prompt) {
        String response;					//	will hold the response from the user
        System.out.print(prompt);			//	hey user - give me some information
        response = sc.nextLine();			//	I will wait here until you type something
        return response;					//	much thanks I will return this to the calling method
    }

    /**
     * 	getNumber		-	Prompt the user to respond with a number
     * @param prompt		String - The message telling the user what to enter
     * @return				int - The users response converted to a number
     */
    public static int getNumber(String prompt) {
        int number = 0;							//	will hold the numeric response from the user
        String response;						//	the String user response that needs to be converted to a number
        do {									//	infinite do-while until the user enters a number
            response = getInput(prompt);		//	ask user for a response
            try {								//	protect the code from dieing if we don't get a number from the user
                number = Integer.parseInt(response);	//	convert to a number
                break;							//	Yay! The user gave us a valid number
            } catch (NumberFormatException e) {			//	bad news. We did not get a number
                System.out.println( response + " Is not a number");		//	warn the user and continue prompting
            }
        } while(true);							//	stay in the loop until we get a number from the user
        return number;							//	yes this could go after the parseInt, I like all methods to end at the bottom
    }

    /**
     *
     * 	getNumber		-	Prompt the user to respond with a number less than or equal to max
     * @param prompt		String - The message telling the user what to enter
     * @param max			int - max number the user can enter
     * @return				int - The users response converted to a number
     */
    public static int getNumber(String prompt, int max) {
        int number = 0;							//	will hold the numeric response from the user
        do {									//	infinite do-while until the user enters a number
            number = getNumber(prompt);			//	ask user for a response
        } while (number < 0 || number > max);	//	stay at it until the user enters a proper number
        return number;							//	yay, we have our number
    }

    public static void main(String[] args) {
        int max, number;
        do {
            max = getNumber("Enter Maximum number: ");						//	ask user for a maximum number
            number = getNumber("Enter a number <= to " + max + ": ", max);	//	test code to see if we can only enter numbers < max
            //	yay, here is the users response
            System.out.println("User entered: " + number + " which is less than " + max);
        }	while (number != 0);
    }
}