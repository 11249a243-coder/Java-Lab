public class variablesdemo{
    int instancevar = 10;
    static String staticvar = "i am static";
    public void showvariables()
    {
        int localvar = 5;
        System.out.println("inatance variable:"+instancevar);
        System.out.println("static variable:"+staticvar);
        System.out.println("local variable:"+localvar);

    }
    public static void main(String[]args)
    {
        variablesdemo obj1 = new variablesdemo();
        obj1.showvariables();
        System.out.println("accessing static variable via class:"+variablesdemo.staticvar);

    }
}
