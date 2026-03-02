final class fcoq {
    public final float a;
    public final float b;
    public final float c;

    public fcoq() {
        throw null;
    }

    public fcoq(float f, float f1, float f2) {
        this.a = f;
        this.b = f1;
        this.c = f2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fcoq) && Float.floatToIntBits(this.a) == Float.floatToIntBits(((fcoq)object0).a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(((fcoq)object0).b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(((fcoq)object0).c);
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.c) ^ ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003;
    }

    @Override
    public final String toString() {
        return "PaddingFractions{topPaddingFraction=" + this.a + ", bottomPaddingFraction=" + this.b + ", horizontalPaddingFraction=" + this.c + "}";
    }
}

