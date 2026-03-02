final class cbtn extends ibuo implements ibts {
    public cbtn(Object object0) {
        super(1, object0, cbuo.class, "onAccountSelected", "onAccountSelected(Lcom/google/common/base/Optional;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gfsx gfsx0 = (gfsx)object0;
        ibuq.f(gfsx0, "p0");
        cbuo cbuo0 = (cbuo)this.e;
        ibuq.f(gfsx0, "account");
        ((ggtj)cbuo.a.h()).x("Candidate selected.");
        cbuo0.aj();
        String s = ((fntm)gfsx0.d()).c;
        ibuq.c(s);
        cbuo0.ay(s);
        icbb.b(lpt.a(cbuo0), null, null, new cbtx(cbuo0, s, null), 3);
        return ibom.a;
    }
}

