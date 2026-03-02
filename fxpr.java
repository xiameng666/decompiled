import j..util.Optional;

public final class fxpr extends fxpd {
    private final Optional a;
    private final Optional b;

    public fxpr(Optional optional0, Optional optional1) {
        super("SysStarted");
        this.a = optional0;
        this.b = optional1;
    }

    @Override  // fxpd
    public final void a() {
        this.h.d.b();
        fxpq fxpq0 = new fxpq();
        this.a.ifPresent(fxpq0);
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        fxpq fxpq0 = new fxpq();
        this.b.ifPresent(fxpq0);
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        return false;
    }
}

