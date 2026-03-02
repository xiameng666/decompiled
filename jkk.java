public final class jkk {
    public static final jkk a;
    public static final jkk b;
    public final int c;
    public final boolean d;

    static {
        jkk.a = new jkk(2, false);
        jkk.b = new jkk(1, true);
    }

    public jkk(int v, boolean z) {
        this.c = v;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jkk)) {
            return false;
        }
        return jkj.a(this.c, ((jkk)object0).c) ? this.d == ((jkk)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return this.d ? this.c * 0x1F + 0x4CF : this.c * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        if(ibuq.m(this, jkk.a)) {
            return "TextMotion.Static";
        }
        return ibuq.m(this, jkk.b) ? "TextMotion.Animated" : "Invalid";
    }
}

