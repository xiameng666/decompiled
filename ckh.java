public final class ckh implements cii {
    public final float a;
    public final float b;
    public final Object c;

    public ckh() {
        this(null, 7);
    }

    public ckh(float f, float f1, Object object0) {
        this.a = f;
        this.b = f1;
        this.c = object0;
    }

    public ckh(Object object0, int v) {
        if((v & 4) != 0) {
            object0 = null;
        }
        this((1 == (v & 1) ? 1.0f : 0.0f), ((v & 2) == 0 ? 0.0f : 1500.0f), object0);
    }

    @Override  // chl
    public final cmx a(cmc cmc0) {
        return this.b(cmc0);
    }

    public final cnm b(cmc cmc0) {
        Object object0 = this.c;
        if(object0 == null) {
            return new cnm(this.a, this.b, null);
        }
        cht cht0 = (cht)cmc0.a.a(object0);
        return new cnm(this.a, this.b, cht0);
    }

    @Override  // cii
    public final cnd c(cmc cmc0) {
        return this.b(cmc0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ckh) && ((ckh)object0).a == this.a && ((ckh)object0).b == this.b && ibuq.m(((ckh)object0).c, this.c);
    }

    @Override
    public final int hashCode() {
        return this.c == null ? Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b) : (this.c.hashCode() * 0x1F + Float.floatToIntBits(this.a)) * 0x1F + Float.floatToIntBits(this.b);
    }
}

