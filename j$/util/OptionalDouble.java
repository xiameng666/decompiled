package j$.util;

import java.util.NoSuchElementException;

public final class OptionalDouble {
    public final boolean a;
    public final double b;
    public static final OptionalDouble c;

    static {
        OptionalDouble.c = new OptionalDouble();
    }

    public OptionalDouble() {
        this.a = false;
        this.b = NaN;
    }

    public OptionalDouble(double f) {
        this.a = true;
        this.b = f;
    }

    public static OptionalDouble empty() {
        return OptionalDouble.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this != object0) {
            if((object0 instanceof OptionalDouble)) {
                boolean z = ((OptionalDouble)object0).a;
                return !this.a || !z ? this.a == z : Double.compare(this.b, ((OptionalDouble)object0).b) == 0;
            }
            return false;
        }
        return true;
    }

    public double getAsDouble() {
        if(this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    @Override
    public final int hashCode() {
        if(this.a) {
            long v = Double.doubleToLongBits(this.b);
            return (int)(v ^ v >>> 0x20);
        }
        return 0;
    }

    public boolean isPresent() {
        return this.a;
    }

    public static OptionalDouble of(double f) {
        return new OptionalDouble(f);
    }

    public double orElse(double f) {
        return this.a ? this.b : f;
    }

    @Override
    public final String toString() {
        return this.a ? "OptionalDouble[" + this.b + "]" : "OptionalDouble.empty";
    }
}

