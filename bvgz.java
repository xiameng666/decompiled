public final class bvgz implements ibts {
    public final clob a;
    public final String b;

    public bvgz(clob clob0, String s) {
        this.a = clob0;
        this.b = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((cmgf)object0), "$this$veConfig");
        ((cmgf)object0).c(this.a.a);
        ((cmgf)object0).b(this.a.b.b);
        String s = this.b;
        if(s != null) {
            ((cmgf)object0).e(s);
        }
        return ibom.a;
    }
}

