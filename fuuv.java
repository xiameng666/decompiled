import android.os.SystemClock;
import java.util.Calendar;
import java.util.Locale;

public final class fuuv extends fuvb {
    boolean a;
    private long b;
    private final futo c;
    private final fuuw j;
    private final long k;

    public fuuv(futd futd0) {
        this(futd0, 0L);
    }

    public fuuv(futd futd0, long v) {
        super(futd0);
        this.a = false;
        this.b = 0L;
        this.j = futd0.m;
        this.c = new fuuf(futd0, this.g);
        SystemClock.elapsedRealtime();
        this.k = SystemClock.elapsedRealtime() + v;
    }

    @Override  // fuvb
    public final void M() {
        this.q();
    }

    @Override  // fuvb
    public final void N() {
        this.d.P = 0x7FFFFFFFFFFFFFFFL;
        this.q();
    }

    @Override  // fuvb
    public final void O() {
        this.q();
    }

    @Override  // fuvb
    public final void P() {
        this.q();
    }

    @Override  // fuvb
    public final void Q() {
        this.d.h();
        this.o();
    }

    @Override  // fuvb
    protected final void T() {
        this.c.a = SystemClock.elapsedRealtime();
        this.q();
    }

    @Override  // fuvb
    protected final void U() {
        futd futd0 = this.d;
        if(futd0.aa == -1L) {
            futd0.x(SystemClock.elapsedRealtime());
            if(futd0.O && futd0.M()) {
                fuud fuud0 = new fuud(futd0);
                if(this.B(fuud0)) {
                    this.L(fuud0);
                    return;
                }
            }
        }
        this.q();
    }

    @Override  // fuvb
    protected final void V(fvuu fvuu0, fvuu fvuu1) {
        boolean z;
        futd futd0 = this.d;
        if(!futd0.u.h() && fvuu0 != null) {
            int v = fvuu0.b;
            if(v != 3) {
                int v1 = fvuu1.b;
                if(v1 != 3 && v != v1) {
                    int v2 = futd0.o == null ? 4 : futd0.o.d().a();
                    int v3 = 0;
                    if(v2 == 4) {
                        z = true;
                    }
                    else {
                        switch(v2) {
                            case 3: {
                                v2 = 3;
                                z = true;
                                break;
                            }
                            case 5: {
                                z = true;
                                break;
                            }
                            default: {
                                z = false;
                            }
                        }
                    }
                    if(v1 != 2 || !z) {
                        if(v2 == 3) {
                            v3 = 1;
                        }
                        if((v1 == 1 ? 1 : 0) != v3) {
                            goto label_22;
                        }
                    }
                    else {
                    label_22:
                        if(SystemClock.elapsedRealtime() - futd0.R > 10000L) {
                            this.z(39L);
                        }
                    }
                }
            }
        }
    }

    @Override  // fuvb
    protected final void W(fwzf fwzf0) {
        if(fwzf0 != fwzf.a && fwzf0 != fwzf.v) {
            return;
        }
        this.q();
    }

    @Override  // fuvb
    public final String Y() {
        return "ScheduledState";
    }

    protected final void o() {
        long v = this.b;
        if(v == 2L) {
            v = 39L;
            this.b = 39L;
        }
        this.A(v);
    }

    private final void q() {
        long v2;
        futn futn0 = this.c.d();
        long v = futn0.a;
        this.b = v;
        if(this.a) {
            long v1 = fxbi.e();
            Calendar calendar0 = Calendar.getInstance(Locale.US);
            calendar0.setTimeInMillis(fyaw.b(Math.max(0L, futn0.b.a - ((v == 2L ? 450L : 36000L) + 1500L)), v1));
            calendar0.set(14, 0);
            calendar0.set(13, 0);
            v2 = calendar0.getTimeInMillis() - v1;
            if(v2 - SystemClock.elapsedRealtime() <= 10000L) {
                v2 = -1L;
            }
        }
        else {
            v2 = -1L;
        }
        if(v2 != -1L) {
            this.a = true;
            futd futd0 = this.d;
            futd0.v(new fvsx(v2 - 1000L, 2000L));
            futd0.B(true);
            return;
        }
        if(this.a) {
            this.d.B(false);
        }
        this.a = false;
        this.d.v(futn0.b);
    }

    @Override  // fuvb
    public final void u() {
        super.u();
        futd futd0 = this.d;
        if(futd0.R == -1L) {
            futd0.R = SystemClock.elapsedRealtime();
        }
        if(futd0.S == -1L) {
            futd0.S = SystemClock.elapsedRealtime();
        }
        if(futd0.T == -1L) {
            futd0.T = SystemClock.elapsedRealtime();
        }
        if(futd0.U == -1L) {
            futd0.U = SystemClock.elapsedRealtime();
        }
        if(Math.min(futd0.H, futd0.I) != 0x7FFFFFFFFFFFFFFFL && (!futd0.u.h() && SystemClock.elapsedRealtime() >= this.k && futd0.u.f() && futd0.D())) {
            futd0.B(false);
        }
        this.q();
    }

    @Override  // fuvb
    protected final void w() {
        if(this.a) {
            this.d.B(false);
            this.a = false;
            this.q();
            return;
        }
        this.z(this.b);
    }

    @Override  // fuvb
    protected final void x(boolean z) {
        futd futd0 = this.d;
        fwyt fwyt0 = futd0.u;
        if(fwyt0.h()) {
            if(futd0.M()) {
                if(z) {
                    this.o();
                    return;
                }
                this.L(new fuuv(futd0));
                return;
            }
            fwyt0.j();
            return;
        }
        this.q();
        if(z) {
            this.o();
        }
    }
}

