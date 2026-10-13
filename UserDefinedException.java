class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class UserDefinedException {
    public static void main(String[] args) {
        try {
            int age = 15;

            if (age < 18) {
                throw new MyException("Age must be 18 or above");
            }

            System.out.println("Eligible");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}