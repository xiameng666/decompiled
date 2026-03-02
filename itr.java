public final class itr {
    public static final itr a;
    public final float b;
    public final ibwh c;
    private final int d;

    static {
        itr.a = new itr(0.0f, new ibwh(0.0f));
    }

    public itr(float f, ibwh ibwh0) {
        this.b = f;
        this.c = ibwh0;
        this.d = 0;
        if(!Float.isNaN(f)) {
            return;
        }
        throw new IllegalArgumentException("current must not be NaN");
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof itr)) {
            return false;
        }
        return this.b == ((itr)object0).b ? ibuq.m(this.c, ((itr)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 0x1F + this.c.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.b + ", range=" + this.c + ", steps=0)";
    }
}

