public class SwipTwoNUM {
    public static void main(String[] args) {
   int x=123;
   int y=321;
        System.out.println("Before swip"+x);
        System.out.println("Before swip"+y);
        
        x=x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("after swip"+x);
        System.out.println("after swip"+y);
        
}
    
}
