package ss15_exception_debug.demo;

public class demo_1 {
    public static void main(String[] args) {
//        try         {
//            badMethod();
//            System.out.print("A");
//        }  catch (Exception ex)  {
//            System.out.print("B");
//        } finally {
//            System.out.print("C");
//        }
//        System.out.print("D");
//        try {
//            badMethod();
//            System.out.print("A");
//        }catch (RuntimeException ex){
//            System.out.print("B");
//        }catch (Exception ex1){
//            System.out.print("C");
//        }finally{
//            System.out.print("D");
//        }
//        System.out.print("E");
//    }
//    public static void badMethod(){
//        throw new RuntimeException();
//    }
//        try {
//            System.out.print("Hello world ");
//        } finally {
//            System.out.println("Finally executing ");
//        }
        try {
            return;
        }
        finally{
            System.out.println( "Finally" );
        }

    }
}
