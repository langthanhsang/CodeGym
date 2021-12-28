package bt1.string;

public class Main {
   public  static void reverse(StringBuffer str) {
       int n = str.length();
       Stack obj = new Stack(n);

       int i;
       for (int j = 0; j < n; j++) {
           obj.push(str.charAt(j));
       }
       for( i = 0; i < n; i++) {
           char ch = obj.pop();
           str.setCharAt(i,ch);
       }
   }

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("wStack");

        reverse(s);

        System.out.println("Reversed string is " + s);
    }

}
