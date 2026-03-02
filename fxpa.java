import j..util.Optional;
import java.io.PrintWriter;

public final class fxpa extends fxpd {
    public fxou a;
    private final fxov b;
    private final Optional c;
    private final boolean d;

    public fxpa(String s, fxov fxov0) {
        this(s, fxov0, Optional.empty());
    }

    public fxpa(String s, fxov fxov0, Optional optional0) {
        super(s);
        this.d = hsbu.c();
        this.a = fxou.a;
        this.b = fxov0;
        this.c = optional0;
    }

    @Override  // fxpd
    public final void a() {
        this.b.f();
        this.b.i.a();
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        this.b.g();
        this.a = fxou.a;
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        fxov fxov0 = this.b;
        if(fxpj0.a == fxov0.i.a) {
            fxou fxou0 = fxov0.b();
            int v = fxou0.c;
            if(v != this.a.c) {
                switch(v) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        int v1 = fxou0.d;
                        fxph fxph0 = new fxph(v1);
                        fxpk fxpk0 = this.h;
                        fxpk0.a(fxpk0.a, fxph0);
                        fxpk0.b.shutdownNow();
                        fxpk0.c.clear();
                        if(fxpk0.e) {
                            fxpp fxpp0 = fxpk0.d;
                            if(fxpp0 != null) {
                                fxpp0.a(fxph0.a);
                            }
                        }
                        if(!this.d) {
                            fxpp fxpp1 = this.h.d;
                            if(fxpp1 != null) {
                                fxpp1.a(v1);
                            }
                        }
                        break;
                    }
                    case 2: {
                        int v2 = fxou0.d;
                        this.g(new fxph(v2));
                        if(!this.d) {
                            fxpp fxpp2 = this.h.d;
                            if(fxpp2 != null) {
                                fxpp2.c(v2);
                            }
                        }
                        break;
                    }
                    default: {
                        this.j();
                    }
                }
                this.a = fxou0;
                fxoz fxoz0 = new fxoz(this);
                this.c.ifPresent(fxoz0);
            }
        }
        return false;
    }

    @Override  // fxpd
    protected final void d(PrintWriter printWriter0) {
        this.i(printWriter0);
        this.b.hJ(printWriter0);
        this.h(printWriter0);
    }
}

