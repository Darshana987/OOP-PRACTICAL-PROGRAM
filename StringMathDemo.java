public class StringMathDemo {
    public static void main(String args[])
    {
      String str1= "Darshana";
      String str2= "Chaudhari";

      String str3= str1.concat(str2);

      System.out.println("Concatination :\n" + str3);
      System.out.println("Length of str1 :\n" + str1.length());
      System.out.println("Character at Index 1 :\n" + str1.charAt(1));
      System.out.println("Substring of  str1 (0-5) :\n " +str1.substring(0,5));
      System.out.println("Equals? str1 and str2 :\n" + str1.equals(str2));
      System.out.println("Upparcase str1 :\n" +str1.toUpperCase());
      System.out.println("Upparcase str2 :\n" +str2.toLowerCase());

      double a=10;
      double b=2.0;

      System.out.println("Square root of a :\n" + Math.sqrt(a));
      System.out.println("a raised to b :\n " + Math.pow(a,b));
      System.out.println("Max of a & b :\n " + Math.max(a,b));
      System.out.println("Min of a & b :\n " + Math.min(a,b));
      System.out.println("Random Number(1-20) :\n" + (10 + Math.random()*(1 - 20)));
      System.out.println("Random Number(1-200) :\n" + (12 + Math.random()*(1 - 200)));
      System.out.println(" Ceil of b :\n " + Math.ceil(b));
      System.out.println(" Floor of b :\n " + Math.floor(a));
      System.out.println(" Round of b :\n " + Math.round(b));
    }
}
