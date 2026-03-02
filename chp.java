public final class chp extends cht {
    public float a;

    public chp(float f) {
        this.a = f;
    }

    @Override  // cht
    public final float a(int v) {
        return v == 0 ? this.a : 0.0f;
    }

    @Override  // cht
    public final int b() {
        return 1;
    }

    @Override  // cht
    public final cht c() {
        return new chp(0.0f);
    }

    @Override  // cht
    public final void d() {
        this.a = 0.0f;
    }

    @Override  // cht
    public final void e(int v, float f) {
        if(v == 0) {
            this.a = f;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof chp) && ((chp)object0).a == this.a;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override
    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}

