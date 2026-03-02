final class eiph {
    final long a;
    final long b;
    final String c;
    final long d;
    final byi e;
    final eipg f;

    public eiph(long v, long v1, String s, long v2) {
        this.e = new byi();
        this.f = new eipg();
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = v2;
    }

    final eipg a(long v) {
        byi byi0 = this.e;
        eipg eipg0 = (eipg)byi0.d(v);
        if(eipg0 == null) {
            eipg0 = new eipg();
            byi0.h(v, eipg0);
        }
        return eipg0;
    }
}

