public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            System.out.println(calculator.add("//;\n1;2")); // Expected output: 3
            System.out.println(calculator.add("1\n2,3")); // Expected output: 6
            System.out.println(calculator.add("1,2,3")); // Expected output: 6
            System.out.println(calculator.add("1,-2,3,-4,-5")); // Expected output: Exception
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}