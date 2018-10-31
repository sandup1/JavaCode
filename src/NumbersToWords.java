public class NumbersToWords {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String word = convertToWords(i);
            System.out.println("The number " + i + " = " + word);
        }
    }

    public static String convertToWords(int num) {
        String word = "";

        switch (num%10) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
        }
        switch (num){
            case 10:
                word = "Ten";
                break;
            case 11:
                word = "Eleven";
                break;
            case 12:
                word = "Twelve";
                break;
            case 13:
                word = "Thirteen";
                break;
            case 14:
                word = "Fourteen";
                break;
            case 15:
                word = "Fifteen";
                break;
            case 16:
                word = "Sixteen";
                break;
            case 17:
                word = "Seventeen";
                break;
            case 18:
                word = "Eighteen";
                break;
            case 19:
                word = "Nineteen";
                break;
        }


        if (num >= 20 && num < 30) {
            word = "Twenty " + word;
        } else if (num > 30 && num < 40) {
            word += "Thirty";
        } else if (num > 40 && num < 50) {
            word += "Fourty";
            num = num - 40;
        } else if (num > 50 && num < 60) {
            word += "Fifty";
            num = num - 50;
        } else if (num > 60 && num < 70) {
            word += "Sixty";
            num = num - 60;
        } else if (num > 70 && num < 80) {
            word += "Seventy";
            num = num - 70;
        } else if (num > 80 && num < 90) {
            word += "Eighty";
            num = num - 80;
        } else if (num > 90 && num < 100) {
            word += "Ninety";
            num = num - 90;
        }
        return  word;

    }
}

