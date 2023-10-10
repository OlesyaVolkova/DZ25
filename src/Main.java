public class Main {
    public static void main(String[] args) {

        Fraction A = new Fraction(2,3,4);
        A.print();

        Fraction B = new Fraction(3,4,5);
        B.print();

        Fraction C = A.add(B); //add складывает дроби. должно быть 6 (11/20)+
        System.out.println("Add: " + C);

        Fraction D = B.sub(A);   //sub вычитает дроби. должно быть 1 (1/20)+
        System.out.println("Sub: " + D);

        Fraction E = A.mul(B); //mul умножает дроби. должно быть 10 (9/20)+
        System.out.println("Mul: " + E);

        Fraction F = A.div(B); //div делит дроби. должно быть 55/76 +
        System.out.println("Div: " + F);

    }
}


