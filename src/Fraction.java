public class Fraction {
    private int integer; //целая часть
    private int numerator; //числитель
    private int denominator; // знаменатель

    public int getInteger() {
        return integer;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setInteger(int integer) {
        this.integer = integer;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        if (denominator==0)denominator=1; //фильтрация данных
        this.denominator = denominator;
    }

    public Fraction (int integer, int numerator, int denominator)  //конструктор с тремя параметрами
    {
        this.integer = integer;
        this.numerator = numerator;
        this.denominator =  denominator;
    }

     public void print(){
         System.out.println(this.toString());
    }
    public Fraction add(Fraction other) {
        int addInteger = this.integer + other.integer;
        int addNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int addDenominator = this.denominator * other.denominator;

        if (addNumerator >= addDenominator) {
            addInteger += addNumerator / addDenominator;
            addNumerator = addNumerator % addDenominator;
        }
        return new Fraction(addInteger, addNumerator, addDenominator);
    }

    public Fraction sub(Fraction other) {
        int subInteger = this.integer - other.integer;
        int subNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int subDenominator = this.denominator * other.denominator;

        if (subNumerator >= subDenominator) {
            subInteger += subNumerator / subDenominator;
            subNumerator = subNumerator % subDenominator;
        }
        return new Fraction(subInteger, subNumerator, subDenominator);
    }

    public Fraction mul(Fraction other) { //https://ru.wikihow.com/%D1%83%D0%BC%D0%BD%D0%BE%D0%B6%D0%B0%D1%82%D1%8C-%D1%81%D0%BC%D0%B5%D1%88%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D1%87%D0%B8%D1%81%D0%BB%D0%B0
        int mulThis = this.integer * this.denominator + this.numerator;
        int mulOther = other.integer * other.denominator + other.numerator;
        int mulThisOther = mulThis * mulOther;

        int mulDenominator = this.denominator * other.denominator;
        int mulInteger = mulThisOther/ mulDenominator;
        int mulNumerator = mulThisOther % mulDenominator;

        if (mulNumerator >= mulDenominator) {
            mulInteger += mulNumerator / mulDenominator;
            mulNumerator = mulNumerator % mulDenominator;
        }
        return new Fraction(mulInteger, mulNumerator, mulDenominator);
    }
    public Fraction div(Fraction other) { //https://ru.wikihow.com/%D0%B4%D0%B5%D0%BB%D0%B8%D1%82%D1%8C-%D1%81%D0%BC%D0%B5%D1%88%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%B4%D1%80%D0%BE%D0%B1%D0%B8
        int divThis = this.integer * this.denominator + this.numerator;
        int divOther = other.integer * other.denominator + other.numerator;

        int newNumerator = divThis *  other.denominator;
        int newDenominator = this.denominator * divOther;

        int divInteger =  newNumerator/ newDenominator;
        int divNumerator = newNumerator % newDenominator;

        if (divNumerator >=  newDenominator) {
            divInteger += divNumerator /  newDenominator;
            divNumerator = divNumerator %  newDenominator;
        }

        return new Fraction(divInteger, divNumerator, newDenominator);
    }

    public String toString() {
        return integer + " (" + numerator + "/" + denominator + ")";

    }
}

