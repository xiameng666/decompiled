import j..util.Objects;

final class cjft implements cjfo {
    public boolean a;
    final cjfw b;

    public cjft(cjfw cjfw0) {
        Objects.requireNonNull(cjfw0);
        this.b = cjfw0;
        super();
        this.a = false;
    }

    @Override  // cjfo
    public final void a(Object object0, Object object1) {
        cjfw cjfw0 = this.b;
        synchronized(cjfw0.a) {
            if(cjfw0.e != this) {
                return;
            }
            cjfo cjfo0 = cjfw0.f;
            if(cjfo0 != null) {
                cjfo0.a(object0, object1);
            }
            cjfw0.x(new cjfs(cjfo0, object0, object1));
        }
    }

    @Override  // cjfo
    public final void b(Object object0) {
        cjfw cjfw0 = this.b;
        synchronized(cjfw0.a) {
            if(cjfw0.e != this) {
                return;
            }
            cjfo cjfo0 = cjfw0.f;
            if(cjfo0 != null) {
                cjfo0.b(object0);
            }
            cjfw0.x(new cjfr(cjfo0, object0));
            this.a = true;
        }
    }
}

