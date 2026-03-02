import java.util.function.Supplier;

final class fxdq extends fxpd {
    public final Supplier a;
    public final Supplier b;
    public bhnd c;
    public long d;

    static {
        bboh.c("EQMon", bbcu.g, "RTDrgrd");
    }

    public fxdq(Supplier supplier0, Supplier supplier1) {
        super("RTDrgrd");
        this.a = supplier0;
        this.b = supplier1;
    }

    @Override  // fxpd
    public final void a() {
        this.h.i();
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        this.f();
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        if(fxpj0.a == 13) {
            long v = (long)(((Long)this.b.get()));
            if(this.d + huwe.c() <= v) {
                this.f();
                return true;
            }
            this.e();
            return true;
        }
        return false;
    }

    final void e() {
        this.h.f(13, null, huwe.c());
    }

    private final void f() {
        bhnd bhnd0 = this.c;
        if(bhnd0 != null) {
            bhnd0.close();
            this.c = null;
            this.d = 0L;
        }
    }
}

