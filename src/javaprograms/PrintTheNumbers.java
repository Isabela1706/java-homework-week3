package javaprograms;

public class PrintTheNumbers {
    public static void main(String[] args) {
        pn();

    }

    public static void pn() {
        //divided by 3
        System.out.println("Number divided by 3 between 1 and 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "");
            }
        }
        System.out.println();//for new line
        //divided by 5
        System.out.println("Number divided by 5 between 1 and 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + "");
            }

            }
        }
    }
