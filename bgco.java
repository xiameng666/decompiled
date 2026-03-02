public final class bgco implements ibtw {
    public final String a;
    public final boolean b;
    public final ibth c;
    public final ibth d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public bgco(String s, boolean z, ibth ibth0, ibth ibth1, String s1, String s2, String s3, int v) {
        this.a = s;
        this.b = z;
        this.c = ibth0;
        this.d = ibth1;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        this.h = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        bgdq.l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((goz)object0), gsc.a(this.h | 1));
        return ibom.a;
    }
}

