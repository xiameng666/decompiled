import j..util.Objects;

public final class fmbb {
    private gfsx a;
    private gfsx b;
    private gfsx c;
    private gfsx d;
    private long e;
    private fmaz f;
    private fmaz g;
    private byte h;

    public fmbb() {
        throw null;
    }

    public fmbb(byte[] arr_b) {
        this.a = gfqx.a;
        this.b = gfqx.a;
        this.c = gfqx.a;
        this.d = gfqx.a;
    }

    public final fmbi a() {
        if(this.h == 1) {
            fmaz fmaz0 = this.f;
            if(fmaz0 != null) {
                fmaz fmaz1 = this.g;
                if(fmaz1 != null) {
                    return new fmbi(this.a, this.b, this.c, this.d, this.e, fmaz0, fmaz1);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.h == 0) {
            stringBuilder0.append(" actionTriggeredLogId");
        }
        if(this.f == null) {
            stringBuilder0.append(" actionPayload");
        }
        if(this.g == null) {
            stringBuilder0.append(" eventCallbackFailureActionPayload");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(long v) {
        this.e = v;
        this.h = 1;
    }

    public final void c(String s) {
        Objects.requireNonNull(s);
        this.f = new fmbm(s);
    }

    public final void d(String s) {
        Objects.requireNonNull(s);
        this.f = new fmbo(s);
    }

    public final void e(fmfe fmfe0) {
        Objects.requireNonNull(fmfe0);
        this.f = new fmbp(fmfe0);
    }

    public final void f(fmbc fmbc0) {
        this.d = gfsx.m(fmbc0);
    }

    public final void g(String s) {
        this.g = fmbx.a(s);
    }

    public final void h(String s) {
        this.c = gfsx.m(s);
    }

    public final void i(String s) {
        this.b = gfsx.m(s);
    }

    public final void j(fmbh fmbh0) {
        Objects.requireNonNull(fmbh0);
        this.f = new fmbr(fmbh0);
    }

    public final void k(fmbh fmbh0) {
        Objects.requireNonNull(fmbh0);
        this.f = new fmbs(fmbh0);
    }

    public final void l(String s) {
        this.f = fmbx.a(s);
    }

    public final void m(String s) {
        this.a = gfsx.m(s);
    }

    public final void n(fmhv fmhv0) {
        Objects.requireNonNull(fmhv0);
        this.f = new fmbu(fmhv0);
    }

    public final void o(String s) {
        Objects.requireNonNull(s);
        this.f = new fmbv(s);
    }

    public final void p(fmbf fmbf0) {
        Objects.requireNonNull(fmbf0);
        this.f = new fmbn(fmbf0);
    }

    public final void q() {
        this.g = fmbq.a;
    }

    public final void r() {
        this.f = fmbq.a;
    }
}

