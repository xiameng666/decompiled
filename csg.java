final class csg extends hfb implements iew {
    public final dgf a;
    public boolean b;
    public boolean c;
    public boolean d;

    public csg(dgf dgf0) {
        this.a = dgf0;
    }

    @Override  // hfb
    public final void dO() {
        icbb.b(this.J(), null, null, new csf(this, null), 3);
    }

    @Override  // iew
    public final void dU() {
    }

    @Override  // iew
    public final void dW(igb igb0) {
        igb0.p();
        if(this.b) {
            hpc.m(igb0, hll.h(hll.a, 0.3f), 0L, igb0.o(), 0.0f, null, 0x7A);
            return;
        }
        if(!this.c && !this.d) {
            return;
        }
        hpc.m(igb0, hll.h(hll.a, 0.1f), 0L, igb0.o(), 0.0f, null, 0x7A);
    }
}

