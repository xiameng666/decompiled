public final class fmlp {
    public final int a;
    public final float b;

    public fmlp() {
        throw null;
    }

    public fmlp(int v, float f) {
        this.a = v;
        this.b = f;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmlp) && this.a == ((fmlp)object0).a && Float.floatToIntBits(this.b) == Float.floatToIntBits(((fmlp)object0).b);
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) ^ (this.a ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "HorizontalLine{lineColor=" + this.a + ", lineWidth=" + this.b + "}";
    }
}

