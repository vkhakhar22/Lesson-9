interface Myinterface{
    public void method1();
    public void method2();
}
class Interface1 implements Myinterface{
public void method1(){
        System.out.println("implementation of method 1");
}
public void method2(){
    System.out.println("implementation of method 2");
} 
public static void main(String[] args){
    Myinterface obj=new Interface1();
    obj.method1();
    obj.method2();
}
}