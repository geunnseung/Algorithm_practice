package Recursion;

public class RecursionCall {
    public static void printTO100(int num) {
        System.out.println(num);
        printTO100(num);
    }

    public static void main(String[] args) {
        printTO100(100);
    }

}

