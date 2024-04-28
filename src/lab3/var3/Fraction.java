package lab3.var3;

import java.util.Objects;

public class Fraction {
    private Integer numerator;
    private Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" +denominator;
    }

    public boolean equals(Fraction f) {
        if(this.numerator == f.numerator && this.denominator == f.denominator){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public void sum(Fraction f){
        int count = 1;
        while (count < this.denominator * f.denominator){
            if (count % this.denominator == 0 && count % f.denominator == 0){
                break;
            }
            count++;
        }
        this.numerator *= count / this.denominator;
        this.numerator += f.numerator * (count / f.denominator);
        this.denominator = count;
    }

    public void dif(Fraction f){
        int count = 1;
        while (count < this.denominator * f.denominator){
            if (count % this.denominator == 0 && count % f.denominator == 0){
                break;
            }
            count++;
        }
        this.numerator *= count / this.denominator;
        this.numerator -= f.numerator * (count / f.denominator);
        this.denominator = count;
    }

    public void multiplication(Fraction f){
        this.numerator *= f.numerator;
        this.denominator *= f.denominator;
    }

    public void div(Fraction f){
        this.numerator *= f.denominator;
        this.denominator *= f.numerator;
    }
}
