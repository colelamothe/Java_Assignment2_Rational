/*
Cole Lamothe - 100711084
 */

public class Main {

    public static void main(String[] args){

        // creating the fraction objects
        Rational a = new Rational(1,3);
        Rational b = new Rational(2,6);
        Rational c = new Rational(1,2);
        Rational d = new Rational(1,4);

        // output of fractions
        System.out.println(a.toString());
        System.out.println(b.toString());

        // Comparing fractions
        System.out.println(a.compareTo(b)); // 0
        System.out.println(a.compareTo(c)); // -1
        System.out.println(a.compareTo(d)); // 1
    }
}
