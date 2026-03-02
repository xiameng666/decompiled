public final class fuaf implements ibts {
    public final fuat a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public fuaf(fuat fuat0, String s, String s1, String s2, String s3) {
        this.a = fuat0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ivj)object0), "$this$semantics");
        fuat fuat0 = this.a;
        boolean z = ((fubu)fuat0.d).b;
        String s = z ? this.b : this.c;
        if(z) {
            ivf.s(((ivj)object0), this.d);
            ivf.m(((ivj)object0), 0);
        }
        else {
            ivf.s(((ivj)object0), this.e);
        }
        ivf.f(((ivj)object0), s, new fuaj(fuat0, z));
        return ibom.a;
    }
}

