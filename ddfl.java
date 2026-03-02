public final class ddfl implements ibts {
    public final ibva a;
    public final ges b;
    public final ibva c;

    public ddfl(ibva ibva0, ges ges0, ibva ibva1) {
        this.a = ibva0;
        this.b = ges0;
        this.c = ibva1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((chk)object0), "$this$animateDecay");
        float f = ((Number)((chk)object0).a()).floatValue() - this.a.a;
        float f1 = this.b.c();
        this.b.e(f1 + f);
        float f2 = Math.abs(f1 - this.b.c());
        this.a.a = ((Number)((chk)object0).a()).floatValue();
        this.c.a = ((Number)((chk)object0).b()).floatValue();
        if((Math.abs(f - f2) > 0.5f)) {
            ((chk)object0).c();
        }
        return ibom.a;
    }
}

