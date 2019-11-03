//**
//  RationalNumber.java       Author: Lewis/Loftus
//
//  Represents one rational number with a numerator and denominator.
//**

public class Rational implements Comparable<Rational>{
    private int numerator, denominator;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the rational number by ensuring a nonzero
    //  denominator and making only the numerator signed.
    //-----------------------------------------------------------------

    // Compares the value of two fractions and returns -1,0,1 depending on result
    public int compareTo(Rational o) {

        // checks if the two fractions are equal
        if( Math.abs((this.getNumerator()/this.getDenominator()) - (o.getNumerator()/o.getDenominator())) < 0.0001 ){
            return 0;
        }
        // checks if current fraction is larger than fraction being compared
        else if( (this.getNumerator()/this.getDenominator()) > (o.getNumerator()/o.getDenominator()) ) {
            return 1;
        }
        // if all else is false the current fraction must be smaller
        else {
            return -1;
        }
    }

    public Rational(int num, int denom) {
        if (denom == 0)
            denom = 1;

        // Make the numerator "store" the sign
        if (denom < 0) {
            num = num * -1;
            denom = denom * -1;
        }
        numerator = num;
        denominator = denom;

        //reduce();
    }


    //-----------------------------------------------------------------
    //  Returns the numerator of this rational number.
    //-----------------------------------------------------------------
    public float getNumerator() {
        return numerator;
    }

    //-----------------------------------------------------------------
    //  Returns the denominator of this rational number.
    //-----------------------------------------------------------------
    public float getDenominator() {
        return denominator;
    }

    //-----------------------------------------------------------------
    //  Determines if this rational number is equal to the one passed
    //  as a parameter. Assumes they are both reduced.
    //-----------------------------------------------------------------
    public boolean isLike(Rational op2) {
        return (numerator == op2.getNumerator() &&
                denominator == op2.getDenominator());
    }



// Returns this rational number as a string.

    //-----------------------------------------------------------------
    //  Returns this rational number as a string.
    //-----------------------------------------------------------------
    public String toString() {
        String result;
        if (numerator == 0)
            result = "0";
        else if (denominator == 1)
            result = numerator + "";
        else
            result = numerator + "/" + denominator;
        return result;
    }

}