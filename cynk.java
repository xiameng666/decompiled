import j..util.Objects;

final class cynk implements gmbg {
    final int a;
    final boolean b;
    final cynl c;

    public cynk(cynl cynl0, int v, boolean z) {
        this.a = v;
        this.b = z;
        Objects.requireNonNull(cynl0);
        this.c = cynl0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(!((cyql)object0).a()) {
            return;
        }
        ((ggtj)this.c.o.d().ar(7918)).x("MultiPointConnectionHelper: SwitchActive to this seeker after SwitchConnection because media was playing on the source seeker before the switch");
        gmbu.t(this.c.c(this.a, true, ((boolean)(this.b ^ 1)), false, this.b, true), new cynj(this), this.c.m);
    }
}

