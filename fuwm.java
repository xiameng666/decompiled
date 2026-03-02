public final class fuwm implements Comparable {
    public final Comparable a;
    private final float b;

    public fuwm(Comparable comparable0, float f) {
        if(Float.floatToIntBits(f) < 0 || ((double)f) > 1.0 || Float.isNaN(f)) {
            throw new IllegalArgumentException("confidence " + f + " outside range 0..1");
        }
        this.a = comparable0;
        this.b = f;
    }

    public final int a() {
        return Math.round(this.b * 100.0f);
    }

    @Override
    public final int compareTo(Object object0) {
        int v = Float.compare(this.b, ((fuwm)object0).b);
        return v == 0 ? this.a.compareTo(((fuwm)object0).a) : -v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fuwm) ? Float.compare(((fuwm)object0).b, this.b) == 0 && this.a.equals(((fuwm)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override
    public final String toString() {
        return "ClassAndConfidence{class=" + this.a + ", confidence=" + this.a() + "}";
    }
}

