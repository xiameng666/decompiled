final class cav extends ibur implements ibts {
    final ibq[] a;
    final caw b;
    final int c;
    final int d;

    public cav(ibq[] arr_ibq, caw caw0, int v, int v1) {
        this.a = arr_ibq;
        this.b = caw0;
        this.c = v;
        this.d = v1;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        for(int v = 0; true; ++v) {
            ibq[] arr_ibq = this.a;
            if(v >= arr_ibq.length) {
                break;
            }
            ibq ibq0 = arr_ibq[v];
            if(ibq0 != null) {
                long v1 = this.b.a.b.a(((long)ibq0.a) << 0x20 | ((long)ibq0.b) & 0xFFFFFFFFL, ((long)this.d) & 0xFFFFFFFFL | ((long)this.c) << 0x20, jlm.a);
                ibp.y(((ibp)object0), ibq0, jlf.a(v1), jlf.b(v1));
            }
        }
        return ibom.a;
    }
}

