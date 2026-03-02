import java.util.List;

public final class fcln extends lsb {
    public static final fcgf a;
    public static final lub b;
    public final fcjs c;
    public final fcfl d;
    public final String e;
    public final boolean f;
    public final lqi g;
    public final lqi h;
    public final lqi i;
    public String j;
    public fcll k;
    private static final ggeo l;
    private final String m;
    private final boolean n;

    static {
        fcln.a = new fcgf(new String[]{"RestoreFlowViewModel"});
        fclk fclk0 = new fclk();
        fcln.b = new lub(fcln.class, fclk0);
        fcln.l = ggeo.o(Integer.valueOf(2), "Failed to fetch devices.", Integer.valueOf(3), "Failed to decrypt backup.", Integer.valueOf(4), "Failed to start restore.", Integer.valueOf(5), "Failed to cancel backup decryption.");
    }

    public fcln(fcjs fcjs0, fcfl fcfl0, String s, String s1, boolean z, boolean z1) {
        this.g = new lqi();
        this.h = new lqi();
        this.i = new lqi();
        this.j = null;
        this.k = null;
        this.c = fcjs0;
        this.d = fcfl0;
        this.e = s;
        this.m = s1;
        this.f = z;
        this.n = z1;
    }

    public final String a() {
        String s = this.j;
        gftb.check(s);
        return s;
    }

    public final void b(fclm fclm0) {
        fcgf fcgf0 = fcln.a;
        fcgf0.h("Moving to state: " + fclm0, new Object[0]);
        this.h.l(fclm0);
        switch(fclm0.ordinal()) {
            case 0: {
                fcgf0.h("Fetching devices.", new Object[0]);
                evql evql0 = this.c.b();
                evql0.b((List list0) -> {
                    this.g.ii(list0);
                    if(list0.isEmpty()) {
                        this.b(fclm.i);
                        return;
                    }
                    this.b(fclm.c);
                });
                evql0.A(new fclj(this, null, 2));
                return;
            }
            case 1: {
                String s = this.m;
                if(s == null) {
                    fcgf0.m("accountName shouldn\'t be null", new Object[0]);
                    return;
                }
                evql evql1 = this.d.e(this.e, s);
                evql1.b(new fcle(this));
                evql1.A(new fclj(this, null, 2));
                return;
            }
            case 3: {
                aqfl aqfl0 = (aqfl)this.i.ij();
                gftb.check(aqfl0);
                if((aqfl0.b & 0x200) != 0) {
                    this.b(fclm.e);
                    return;
                }
                this.b(fclm.f);
                return;
            }
            case 4: {
                fcgf0.h("Starting key recovery", new Object[0]);
                aqfl aqfl1 = (aqfl)this.i.ij();
                gftb.check(aqfl1);
                evql evql2 = this.c.c(aqfl1);
                evql2.b(new fckz(this));
                evql2.A(new fclj(this, null, 3));
                return;
            }
            case 5: {
                fcgf0.h("Starting restore, requireCharing=%s", new Object[]{Boolean.valueOf(this.n)});
                aqfl aqfl2 = (aqfl)this.i.ij();
                gftb.check(aqfl2);
                evql evql3 = this.c.f(aqfl2.c, this.n);
                evql3.b(new fcld(this));
                evql3.A(new fclj(this, null, 4));
                return;
            }
            case 7: {
                this.h(-1);
                return;
            }
            case 8: {
                this.h(0);
            }
        }
    }

    public final void c() {
        fcln.a.h("Notifying wear backup service", new Object[0]);
        evql evql0 = this.d.h(this.e);
        evql0.b(new fclh(this));
        evql0.A(new fclj(this, null, 4));
    }

    public final void e(int v, Exception exception0) {
        String s = (String)fcln.l.getOrDefault(Integer.valueOf(v), "Unknown error code: " + v);
        if(exception0 == null) {
            fcln.a.f(s, new Object[0]);
        }
        else {
            fcln.a.g(s, exception0, new Object[0]);
        }
        this.h(v);
        this.b(fclm.j);
    }

    // Detected as a lambda impl.
    public final void f(List list0) {
        this.g.ii(list0);
        if(list0.isEmpty()) {
            this.b(fclm.i);
            return;
        }
        this.b(fclm.c);
    }

    public final void g() {
        fcln.a.h("Skipping restore.", new Object[0]);
        this.b(fclm.i);
    }

    public final void h(int v) {
        fcll fcll0 = this.k;
        if(fcll0 == null) {
            fcln.a.m(a.f(v, "Trying to set result ", " in a null client"), new Object[0]);
            return;
        }
        fcll0.setResult(v);
    }

    public final void i(int v) {
        this.c.g(v);
        this.g();
    }
}

