
public class Main {
    public static void main(String[] args){

        Calculator calc = new Calculator();
        c_science science = new c_science();
        c_root root = new c_root();

        System.out.println(root.Root(2) + science.COSinus(3) + science.SINus(3) + calc.Addition(1,2)
                            + calc.Division(1,2) + calc.Multiply(1,2) + calc.Subtraction(1,2));

    }
}