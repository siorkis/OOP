package main.Lab4;
import main.Lab2.Queue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Boolean checkPair(String c1, String c2) {
        return Objects.equals(c1, "(") && Objects.equals(c2, ")");
    }

    static Boolean checkBalance(String expression) throws Exception {
        Queue<String> q = new Queue<String>();

        for (int i = 0; i < expression.length(); ++i) {
            if (expression.charAt(i) == '(') {
                q.add(String.valueOf(expression.charAt(i)));
            }
            if (expression.charAt(i) == ')') {
                if (q.getLength() == 0) {
                    return false;
                }
                else if (!checkPair(q.pop(), String.valueOf(expression.charAt(i)))) {
                    return false;
                }
            }
        }
        return q.getLength() == 0;
    }

    public static void checkFile(String filePath) throws Exception {
        File expressionsFile = new File(filePath);
        Scanner Reader = new Scanner(expressionsFile);
        while (Reader.hasNextLine()) {
            String data = Reader.nextLine();
            System.out.println(data + " - " + (checkBalance(data) ? "BALANCED" : "UNBALANCED"));
        }
        Reader.close();
    }

    public static void main(String []args) throws Exception {

        String oneExpression = "src/main/lab04/one_expression.txt";
        String threeExpression = "src/main/lab04/three_expression.txt";

        checkFile(oneExpression);
        checkFile(threeExpression);
    }

}
