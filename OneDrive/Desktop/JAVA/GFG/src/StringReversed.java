
public class StringReversed {

    public static void main(String[] args) {
        String stk = "Hello World";
        String reversed = " ";
        for (int i = stk.length() - 1; i >= 0; i--) {
            reversed += stk.charAt(i);
        }
        System.out.println(reversed);
    }

}
