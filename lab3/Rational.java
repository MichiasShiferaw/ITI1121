public class Rational { 

    private int numerator;
    private int denominator;
    // constructors

    public Rational(int numerator) {
	this(numerator, 1);
    }
	
    public Rational(int numerator, int denominator) {
	if (denominator < 0) {
	    denominator = -1 * denominator;
	    numerator = -1 * numerator;
	}
	this.numerator = numerator;
	this.denominator = denominator;
	reduce();
    }
    // getters

    public int getNumerator() {
	return numerator;
    }
    public int getDenominator() {
	return denominator;
    }
    public Rational plus(Rational other) {
	int newDenominator = denominator * other.denominator;
	int newNumerator = numerator * other.denominator;
	int newOtherNumerator = other.numerator * denominator;
	int sum = newNumerator + newOtherNumerator;
	return new Rational(sum, newDenominator);
    }
