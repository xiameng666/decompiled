public final class abk implements ibts {
    public final abi a;
    public final acw b;
    public final String c;
    public final adc d;
    public final gui e;

    public abk(abi abi0, acw acw0, String s, adc adc0, gui gui0) {
        this.a = abi0;
        this.b = acw0;
        this.c = s;
        this.d = adc0;
        this.e = gui0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gqb gqb0 = (gqb)object0;
        abl abl0 = new abl(this.e);
        this.a.a = this.b.b(this.c, this.d, abl0);
        return new abm(this.a);
    }
}

