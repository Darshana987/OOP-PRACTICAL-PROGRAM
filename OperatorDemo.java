public class OperatorDemo {
    void add(int a, int b){
        int sum= a+b;
        System.out.println("Addition:"+sum);
    }

    int multiply(int a, int b){
      return a*b;
    }

   public static void main(String[] args) {
       
    byte a=4, b=10;
    int result =a+b;
    System.out.println("Arithmatic Promotion Result :"+result);

    int x=17, y=10;
     System.out.println("x + y="+(x + y));
     System.out.println("x - y="+(x - y));
     System.out.println("x * y="+(x * y));
     System.out.println("x / y="+(x / y));
     System.out.println("x % y="+(x % y));

     OperatorDemo obj = new OperatorDemo();
     obj.add(22,33);
     int product= obj.multiply(5,7);
     System.out.println("Multiplication :"+product);

   } 
}
