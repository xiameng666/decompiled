public final class busv implements ibtw {
    public final butr a;
    public final String b;
    public final ibth c;
    public final buty d;
    public final int e;

    public busv(butr butr0, String s, ibth ibth0, buty buty0, int v) {
        this.a = butr0;
        this.b = s;
        this.c = ibth0;
        this.d = buty0;
        this.e = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        this.a.B(this.b, this.c, this.d, ((goz)object0), gsc.a(this.e | 1));
        return ibom.a;
    }
}

