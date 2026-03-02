import j..util.Objects;

final class ezkg implements gmbg {
    final boolean a;
    final ezki b;

    public ezkg(ezki ezki0, boolean z) {
        this.a = z;
        Objects.requireNonNull(ezki0);
        this.b = ezki0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(ezki.a.j(), "Failed to read shouldEnable", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((Boolean)object0) == null) {
            ((ggtj)ezki.a.j()).x("Failed to read shouldEnable");
            return;
        }
        if(!this.a) {
            if(((Boolean)object0).booleanValue()) {
                this.b.f(true);
            }
        }
        else if(!((Boolean)object0).booleanValue()) {
            this.b.f(false);
        }
    }
}

