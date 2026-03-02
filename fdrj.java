final class fdrj {
    final String a;
    final long b;
    final boolean c;

    public fdrj(String s, long v, boolean z) {
        batl.s(s);
        this.a = s;
        this.b = v;
        this.c = z;
    }

    static fdrj a(fdrq fdrq0) {
        return new fdrj(fdrq0.a, fdrq0.c, fdrq0.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fdrj) ? this.b == ((fdrj)object0).b && this.c == ((fdrj)object0).c && this.a.equals(((fdrj)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + this.c;
    }
}

