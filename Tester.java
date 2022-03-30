public class Tester{

    
    public static void main(String args[]) {
        System.out.println("S1");
        Taxes s1 = new Taxes(1,54000); //Full-Arg
        s1.calculate();
        System.out.println();
        System.out.println("S2");
        Taxes s2 = new Taxes();
        s2.needInfo();
        System.out.println();
        System.out.println("M1");
        Taxes m1 = new Taxes(1,72000); //Full-Arg
        m1.calculate();
        System.out.println();
        System.out.println("M2");
        Taxes m2 = new Taxes();
        m2.needInfo();
    }

    
}
