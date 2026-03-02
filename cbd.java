public final class cbd extends cew {
    public clb a;
    public gui b;
    public cbm c;
    private long d;

    public cbd(clb clb0, gui gui0, cbm cbm0) {
        this.a = clb0;
        this.b = gui0;
        this.c = cbm0;
        this.d = 0x8000000080000000L;
    }

    public final long a(long v) {
        return jlk.c(this.d, 0x8000000080000000L) ? v : this.d;
    }

    @Override  // ifk
    public final iav b(iax iax0, ias ias0, long v) {
        long v1;
        ibq ibq0 = ias0.e(v);
        if(iax0.ep()) {
            v1 = ((long)ibq0.a) << 0x20 | ((long)ibq0.b) & 0xFFFFFFFFL;
            return iaw.b(iax0, ((int)(v1 >> 0x20)), ((int)(0xFFFFFFFFL & v1)), new cba(this, ibq0, v1));
        }
        clb clb0 = this.a;
        if(clb0 == null) {
            v1 = ((long)ibq0.a) << 0x20 | ((long)ibq0.b) & 0xFFFFFFFFL;
            this.d = v1;
            return iaw.b(iax0, ((int)(v1 >> 0x20)), ((int)(0xFFFFFFFFL & v1)), new cba(this, ibq0, v1));
        }
        long v2 = ((long)ibq0.b) & 0xFFFFFFFFL | ((long)ibq0.a) << 0x20;
        gui gui0 = clb0.b(new cbb(this, v2), new cbc(this, v2));
        this.c.e = gui0;
        v1 = ((jlk)gui0.a()).a;
        this.d = ((jlk)gui0.a()).a;
        return iaw.b(iax0, ((int)(v1 >> 0x20)), ((int)(0xFFFFFFFFL & v1)), new cba(this, ibq0, v1));
    }

    @Override  // hfb
    public final void dM() {
        this.d = 0x8000000080000000L;
    }
}

