class Student{
    String name ="Rahul";
    int age = 20;
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[]args){
        Student S = new Student();
        S.display();
    }
}
