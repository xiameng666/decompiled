public final class aueq implements gmbg {
    final String a;
    final String b;

    public aueq(String s, String s1) {
        this.a = s;
        this.b = s1;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        ((ggtj)((ggtj)auez.b.h()).s(throwable0)).R("%s: %s failed", this.a, this.b);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ibuq.f(((ibom)object0), "result");
        ((ggtj)auez.b.h()).R("%s: %s success", this.a, this.b);
    }
}

