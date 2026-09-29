class Square {
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = Square.square(n);

        System.out.println("Number = " + n);
        System.out.println("Square = " + result);
    }
}
