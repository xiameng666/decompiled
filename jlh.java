public final class jlh {
    public static final jlh a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        jlh.a = new jlh(0, 0, 0, 0);
    }

    public jlh(int v, int v1, int v2, int v3) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    public final int a() {
        return this.e - this.c;
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return ((long)(this.c + this.a() / 2)) & 0xFFFFFFFFL | ((long)(this.b + this.b() / 2)) << 0x20;
    }

    public final long d() {
        return ((long)this.b) << 0x20 | ((long)this.c) & 0xFFFFFFFFL;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jlh)) {
            return false;
        }
        if(this.b != ((jlh)object0).b) {
            return false;
        }
        if(this.c != ((jlh)object0).c) {
            return false;
        }
        return this.d == ((jlh)object0).d ? this.e == ((jlh)object0).e : false;
    }

    @Override
    public final int hashCode() {
        return ((this.b * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e;
    }

    @Override
    public final String toString() {
        return "IntRect.fromLTRB(" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ')';
    }
}

