public class Main {
    public static void main(String [] dsa){
        System.out.println("Welcome to my revision on DS and Algorithms");
        Main main = new Main();
        System.out.println(main.avg(2, 3, 4));
    }


    /**
     * Calculates the average of three integers.
     * @param a The first integer to average
     * @param b The second integer to average
     * @param c The third integer to average
     * @return The average of the three integers
     */
    public int avg(int a, int b, int c){
        return (a + b + c) / 3;
    }
}

