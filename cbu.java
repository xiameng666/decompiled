final class cbu extends ibur implements ibtw {
    final boolean a;
    final hfc b;
    final ceq c;
    final cer d;
    final String e;
    final ibtx f;
    final int g;
    final int h;

    public cbu(boolean z, hfc hfc0, ceq ceq0, cer cer0, String s, ibtx ibtx0, int v, int v1) {
        this.a = z;
        this.b = hfc0;
        this.c = ceq0;
        this.d = cer0;
        this.e = s;
        this.f = ibtx0;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ((Number)object1).intValue();
        ccf.b(this.a, this.b, this.c, this.d, this.e, this.f, ((goz)object0), gsc.a(this.g | 1), this.h);
        return ibom.a;
    }
}

