import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Roman {

    static String firstNumRoman;
    static String secondNumRoman;
    static Integer firstNum;
    static Integer secondNum;
    static String oper;
    static Integer intSum;
    static String formatSum;
    static boolean invalid = false;

    public String convert_Int_To_Roman(int result) {

        String convertedRoman = "";

        while (result > 0) {


            if (result / 1000 >= 1) {

                convertedRoman += 'M';
                result -= 1000;

            } else if (result / 500 >= 1) {

                convertedRoman += 'D';
                result -= 500;

            } else if (result / 100 >= 1) {

                convertedRoman += 'C';
                result -= 100;

            } else if (result / 50 >= 1) {

                convertedRoman += 'L';
                result -= 50;

            } else if (result / 10 >= 1) {

                convertedRoman += 'X';
                result -= 10;

            } else if (result / 5 >= 1) {

                convertedRoman += 'V';
                result -= 5;

            } else if (result / 1 > 0) {

                convertedRoman += 'I';
                result -= 1;

            }
        }
        return convertedRoman;

    }


    static Integer convert_Roman_To_Int(String operand) {
        int sum = 0;

        for (int i = 0; i < operand.length(); i++) {
            char c = operand.charAt(i);

            switch (c) {
                case 'M': {
                    sum += 1000;
                    break;
                }

                case 'D': {
                    sum += 500;
                    break;
                }
                case 'C': {
                    sum += 100;
                    break;
                }
                case 'L': {
                    sum += 50;
                    break;
                }
                case 'X': {
                    sum += 10;
                    break;
                }
                case 'V': {
                    sum += 5;
                    break;
                }
                case 'I': {
                    sum += 1;
                    break;
                }
                default: {
                    System.out.println("Error Invalid Numeral: " + operand);
                    invalid = true;
                    break;
                }

            }

        }
        return sum;


    }

    static Integer calc_Romans(int operand1, int operand2, char oper) {
        int result = 0;
        switch (oper) {

            case '+': {
                result = operand1 + operand2;
                break;
            }
            case '-': {
                result = operand1 - operand2;
                break;
            }
            case '*': {
                result = operand1 * operand2;
                break;
            }
            case '/': {
                result = operand1 / operand2;
                break;
            }

            case '%':{
                result = operand1 % operand2;
            }

            default:{
                System.out.println("Error Invalid operator: " + oper);
                invalid = true;
                break;
            }


        }

        return result;
    }

}
