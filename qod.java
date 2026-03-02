public final class qod extends hfb implements ifk {
    public int a;
    public int b;

    public qod(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // ifk
    public final iav b(iax iax0, ias ias0, long v) {
        long v6;
        ibuq.f(ias0, "measurable");
        int v1 = this.a;
        int v2 = this.b;
        long v3 = jkq.e(v, ((long)v1) << 0x20 | ((long)v2) & 0xFFFFFFFFL);
        if(jkp.a(v) == 0x7FFFFFFF && jkp.b(v) != 0x7FFFFFFF) {
            int v4 = (int)(v3 >> 0x20);
            int v5 = v2 * v4 / v1;
            v6 = jkq.d(v4, v4, v5, v5);
        }
        else {
            int v7 = (int)(v3 & 0xFFFFFFFFL);
            if(jkp.b(v) == 0x7FFFFFFF && jkp.a(v) != 0x7FFFFFFF) {
                int v8 = v1 * v7 / v2;
                v6 = jkq.d(v8, v8, v7, v7);
            }
            else {
                int v9 = (int)(v3 >> 0x20);
                v6 = jkq.d(v9, v9, v7, v7);
            }
        }
        ibq ibq0 = ias0.e(v6);
        return iaw.b(iax0, ibq0.a, ibq0.b, new qoc(ibq0));
    }

    @Override  // ifk
    public final int e(hzg hzg0, hzf hzf0, int v) {
        return ifj.a(this, hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int f(hzg hzg0, hzf hzf0, int v) {
        return ifj.b(this, hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int g(hzg hzg0, hzf hzf0, int v) {
        return ifj.c(this, hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int h(hzg hzg0, hzf hzf0, int v) {
        return ifj.d(this, hzg0, hzf0, v);
    }
}

