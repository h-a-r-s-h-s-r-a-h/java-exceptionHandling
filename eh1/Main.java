package eh1;

public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    public static void method1(){
        method2();
        System.out.println("Method1 ended");
    }

    public static void method2(){
        try{
            String s = null;
            s.length();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
}
