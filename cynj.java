import j..util.Objects;

final class cynj implements gmbg {
    final cynk a;

    public cynj(cynk cynk0) {
        Objects.requireNonNull(cynk0);
        this.a = cynk0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ((ggtj)this.a.c.o.d().ar(7916)).x("MultiPointConnectionHelper: SwitchActive failed after SwitchConnection");
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ((ggtj)this.a.c.o.d().ar(7917)).B("MultiPointConnectionHelper: SwitchActive finished with result=%s after SwitchConnection", ((cyql)object0).a.name());
    }
}

