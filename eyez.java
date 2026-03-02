import j..time.Duration;

public final class eyez {
    private final gfuv a;
    private final ibtw b;
    private final gfug c;
    private boolean d;

    public eyez(gfuv gfuv0, ibtw ibtw0) {
        this.a = gfuv0;
        this.b = ibtw0;
        this.c = gfug.c(gfuv0);
    }

    public final Duration a(Object object0) {
        Duration duration0 = this.c.d();
        ibuq.e(duration0, "elapsed(...)");
        if(!this.d) {
            this.d = true;
            this.c();
            this.b.a(object0, duration0);
        }
        return duration0;
    }

    public final void b() {
        gfug gfug0 = this.c;
        if(gfug0.a) {
            return;
        }
        gfug0.f();
    }

    public final void c() {
        gfug gfug0 = this.c;
        if(!gfug0.a) {
            return;
        }
        gfug0.g();
    }
}

