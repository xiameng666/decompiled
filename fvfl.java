import j..util.Objects;

final class fvfl implements gmbg {
    final fvfn a;
    final fvfm b;

    public fvfl(fvfm fvfm0, fvfn fvfn0) {
        this.a = fvfn0;
        Objects.requireNonNull(fvfm0);
        this.b = fvfm0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fvfm fvfm0 = this.b;
        fvfm0.j = false;
        ++fvfm0.i;
        fvew fvew0 = fvfm0.g;
        if(fvew0 != null) {
            fvew0.mv();
        }
        if(!this.a.d) {
            fvfm0.h();
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        fvfm fvfm0 = this.b;
        fvfm0.j = false;
        if(((fvfq)object0) != null) {
            fvfm0.i = 0;
            fvew fvew0 = fvfm0.g;
            if(fvew0 != null) {
                fvew0.a(((fvfq)object0));
            }
            if(!this.a.d) {
                fvfm0.h();
            }
        }
    }
}

