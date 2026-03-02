final class ccu extends ibur implements ibtw {
    final Object a;
    final hfc b;
    final cii c;
    final String d;
    final ibtx e;
    final int f;
    final int g;

    public ccu(Object object0, hfc hfc0, cii cii0, String s, ibtx ibtx0, int v, int v1) {
        this.a = object0;
        this.b = hfc0;
        this.c = cii0;
        this.d = s;
        this.e = ibtx0;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ((Number)object1).intValue();
        cdd.a(this.a, this.b, this.c, this.d, this.e, ((goz)object0), gsc.a(this.f | 1), this.g);
        return ibom.a;
    }
}

