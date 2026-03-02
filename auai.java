import j..util.Objects;

final class auai implements auad {
    final aual a;

    public auai(aual aual0) {
        Objects.requireNonNull(aual0);
        this.a = aual0;
        super();
    }

    @Override  // auad
    public final void a() {
        auad auad0 = this.a.b;
        if(auad0 != null) {
            auad0.a();
        }
    }

    @Override  // auad
    public final void b() {
        auad auad0 = this.a.b;
        if(auad0 != null) {
            auad0.b();
        }
    }

    @Override  // auad
    public final void c(int v) {
        aual aual0 = this.a;
        aubc aubc0 = aual0.d;
        if(aubc0 != null) {
            int v1 = aual0.f;
            if(v1 == 1) {
                if(aubc0.e != 3) {
                    goto label_9;
                }
                aual0.f(v);
                aual0.a.m("Retried wakeup Cast socket connection");
                return;
            }
            else if(v1 == 1) {
            label_9:
                if(aubc0.e == 2) {
                    aual0.f = 2;
                    aual0.e = v;
                    aual0.a.m("Retried wakeup Cast socket connection");
                    return;
                }
            }
        }
        aual0.e(v);
    }

    @Override  // auad
    public final void d(int v) {
        auad auad0 = this.a.b;
        if(auad0 != null) {
            auad0.d(v);
        }
    }

    @Override  // auad
    public final void e(gehl gehl0) {
        auad auad0 = this.a.b;
        if(auad0 != null) {
            auad0.e(gehl0);
        }
    }
}

