public final class delb implements jqe {
    final int a;
    final int b;

    public delb(int v, int v1) {
        this.a = v;
        this.b = v1;
        super();
    }

    @Override  // jqe
    public final long a(jlh jlh0, long v, jlm jlm0, long v1) {
        ibuq.f(jlm0, "layoutDirection");
        int v2 = jlh0.b;
        int v3 = (jlh0.b() - ((int)(v1 >> 0x20))) / 2 + v2;
        if(v3 < 0) {
            return ((long)(jlh0.e + this.b)) & 0xFFFFFFFFL | ((long)(v2 + jlh0.b() / 2 - this.a)) << 0x20;
        }
        if(v3 + ((int)(v1 >> 0x20)) > ((int)(v >> 0x20))) {
            v3 = jlh0.d - jlh0.b() / 2 + this.a - ((int)(v1 >> 0x20));
        }
        return ((long)(jlh0.e + this.b)) & 0xFFFFFFFFL | ((long)v3) << 0x20;
    }
}

