package EXCEPTION002;

import java.util.Scanner;

public class Main {

    public static void checkFile(String fileName) throws NotJavaFileException {
        if (fileName == null || fileName.equals("")) {
            throw new NotJavaFileException("Not java file exception.Mark is -1");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String fileName = scanner.nextLine();
            try {
                checkFile(fileName);
                if (fileName.endsWith(".java")) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } catch (NotJavaFileException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
