public final class bgcn implements ibts {
    public final boolean a;
    public final String b;
    public final String c;

    public bgcn(boolean z, String s, String s1) {
        this.a = z;
        this.b = s;
        this.c = s1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ivj)object0), "$this$clearAndSetSemantics");
        ivf.j(((ivj)object0), (this.a ? this.b : this.c));
        return ibom.a;
    }
}

