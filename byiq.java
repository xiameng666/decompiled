public final class byiq implements ibth {
    public final gra a;
    public final ibts b;

    public byiq(gra gra0, ibts ibts0) {
        this.a = gra0;
        this.b = ibts0;
    }

    @Override  // ibth
    public final Object a() {
        Boolean boolean0 = Boolean.valueOf(((boolean)(((Boolean)this.a.a()).booleanValue() ^ 1)));
        this.a.b(boolean0);
        Object object0 = this.a.a();
        this.b.a(object0);
        return ibom.a;
    }
}

