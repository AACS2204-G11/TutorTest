package src.p6;

public class q2_c {
    public static void main(String[] args) {
        Current c1 = new Current("1234",100);
        Current c2 = new Current("5462",100);
        Current c3 = new Current("1234",100);

        System.out.println(c1);
        System.out.println("C1 equal c2:"+c1.equals(c2));
        System.out.println("C1 equal c3:"+c1.equals(c3));
    }
}
