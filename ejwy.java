class ejwy extends Exception {
    public final int c;

    public ejwy(iapl iapl0) {
        int v = iapk.d(iapl0).t.r;
        this.c = v;
        ((ggtj)((ggtj)((ggtj)ejxc.a.i()).s(iapl0)).ar(13403)).H("Network error, status code %d %s", v, ejxg.a());
    }

    public final boolean a() {
        return this.c == iaph.f.r || this.c == iaph.d.r;
    }
}

