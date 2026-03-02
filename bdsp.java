public final class bdsp implements ibtw {
    public final bdtu a;
    public final ibth b;
    public final ibth c;
    public final ibth d;
    public final ibth e;
    public final ibth f;
    public final ibth g;
    public final ibth h;
    public final ibth i;
    public final ibth j;
    public final int k;

    public bdsp(bdtu bdtu0, ibth ibth0, ibth ibth1, ibth ibth2, ibth ibth3, ibth ibth4, ibth ibth5, ibth ibth6, ibth ibth7, ibth ibth8, int v) {
        this.a = bdtu0;
        this.b = ibth0;
        this.c = ibth1;
        this.d = ibth2;
        this.e = ibth3;
        this.f = ibth4;
        this.g = ibth5;
        this.h = ibth6;
        this.i = ibth7;
        this.j = ibth8;
        this.k = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        bdtp.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ((goz)object0), gsc.a(this.k | 1));
        return ibom.a;
    }
}

