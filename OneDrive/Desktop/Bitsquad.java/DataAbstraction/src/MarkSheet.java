public class MarkSheet {

    private int rno;
    private String name;
    private int per;
    private static int totalPassStudent;
    private static int totalFailStudent;

    public void setData(int a, String b, int c) {

        rno = a;
        name = b;
        per = c;

    }

    public void printData() {
        System.out.println("Student Rno :" + rno);
        System.out.println("student Name :" + name);
        System.out.println("student per :" + per);

        if (per >= 35) {
            System.out.println("student pass....");
            totalPassStudent++;
        } else {
            System.out.println("student fail...");
            totalFailStudent++;
        }
    }

    public void passRecord() {
        System.out.println("totalPass :" + totalPassStudent);
        System.out.println("totalPass :" + totalFailStudent);
    }

}
