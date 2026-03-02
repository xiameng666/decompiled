public final class hxl {
    public final hxn a;
    public final hxn b;
    public long c;

    public hxl() {
        this.a = new hxn(1, 1);
        this.b = new hxn(1, 1);
    }

    public final void a(long v, long v1) {
        this.a.c(v, Float.intBitsToFloat(((int)(v1 >> 0x20))));
        this.b.c(v, Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))));
    }

    public final void b() {
        this.a.d();
        this.b.d();
        this.c = 0L;
    }
}

