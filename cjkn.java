public final class cjkn implements ibts {
    public final cjkv a;
    public final gjdg b;
    public final String c;

    public cjkn(cjkv cjkv0, gjdg gjdg0, String s) {
        this.a = cjkv0;
        this.b = gjdg0;
        this.c = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        String s = (String)object0;
        ibuq.f(s, "accountName");
        this.a.d().c(this.b, this.c, s);
        return ibom.a;
    }
}

