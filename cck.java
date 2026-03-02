final class cck extends ibur implements ibts {
    final ccl a;
    final hka b;
    final hka c;

    public cck(ccl ccl0, hka hka0, hka hka1) {
        this.a = ccl0;
        this.b = hka0;
        this.c = hka1;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return ((Boolean)object0).booleanValue() == ((Boolean)this.a.a.g()).booleanValue() ? this.b : this.c;
    }
}

