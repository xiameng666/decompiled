import j..util.Objects;

final class tya implements unf {
    final tyb a;
    private final unt b;

    public tya(tyb tyb0, unt unt0) {
        Objects.requireNonNull(tyb0);
        this.a = tyb0;
        super();
        this.b = unt0;
    }

    @Override  // unf
    public final void a(boolean z) {
        if(z) {
            tyb tyb0 = this.a;
            synchronized(tyb0) {
                unt unt0 = this.b;
                for(Object object0: uqq.f(unt0.a)) {
                    uot uot0 = (uot)object0;
                    if(!uot0.l() && !uot0.k()) {
                        uot0.c();
                        if(unt0.c) {
                            unt0.b.add(uot0);
                        }
                        else {
                            uot0.b();
                        }
                    }
                }
            }
        }
    }
}

