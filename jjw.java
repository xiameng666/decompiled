public final class jjw {
    public static final jjw a;
    public final float b;
    public final int c;
    public final int d;

    static {
        jjw.a = new jjw(jjt.b, 17, 0);
    }

    public jjw(float f, int v) {
        this(f, v, 0);
    }

    public jjw(float f, int v, int v1) {
        this.b = f;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jjw)) {
            return false;
        }
        return Float.compare(this.b, ((jjw)object0).b) != 0 || this.c != ((jjw)object0).c ? false : jju.b(this.d, ((jjw)object0).d);
    }

    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "LineHeightStyle(alignment=" + jjt.a(this.b) + ", trim=" + jjv.a(this.c) + ",mode=" + jju.a(this.d) + ')';
    }
}

