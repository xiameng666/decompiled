final class eipg {
    final byi a;
    final bxf b;
    public long c;

    public eipg() {
        this.a = new byi();
        this.b = new bxf(0);
        this.c = -1L;
    }

    final eipf a(long v) {
        byi byi0 = this.a;
        eipf eipf0 = (eipf)byi0.d(v);
        if(eipf0 == null) {
            eipf0 = new eipf();
            byi0.h(v, eipf0);
        }
        return eipf0;
    }
}

