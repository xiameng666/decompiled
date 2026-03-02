import j..util.Objects;

final class gpjr extends iapa {
    final gpjs a;
    private iaof_metadata b;

    public gpjr(gpjs gpjs0, iaku iaku0) {
        Objects.requireNonNull(gpjs0);
        this.a = gpjs0;
        super(iaku0);
    }

    @Override  // iapa
    public final void a(iapk iapk0, iaof_metadata iaof0) {
        if(iaof0.c(gphu.b) != null) {
            Object object0 = this.a.a;
            synchronized(object0) {
                this.a.c = this.a.d.a(this.a.e, this.a.f.h(gphu.a, Boolean.valueOf(true)));
                for(Object object1: this.a.b) {
                    ((Runnable)object1).run();
                }
            }
            return;
        }
        iaof_metadata iaof1 = this.b;
        if(iaof1 != null) {
            this.f.b(iaof1);
            this.b = null;
        }
        this.f.a(iapk0, iaof0);
    }

    @Override  // iapa
    public final void b(iaof_metadata iaof0) {
        this.b = iaof0;
    }

    @Override  // iapa
    public final void c(Object object0) {
        iaof_metadata iaof0 = this.b;
        if(iaof0 != null) {
            this.f.b(iaof0);
            this.b = null;
        }
        this.f.c(object0);
    }
}

