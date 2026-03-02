import android.os.SystemClock;
import java.util.Map;

public abstract class fuvb {
    protected final futd d;
    protected final fwxt e;
    protected final futh f;
    protected final fwyd g;
    protected final fvwz h;
    protected final fwzm i;

    public fuvb(futd futd0) {
        this.d = futd0;
        this.e = futd0.b;
        this.f = futd0.c;
        this.g = futd0.d;
        this.h = futd0.e;
        this.i = futd0.g;
    }

    protected final void A(long v) {
        fwyt fwyt0 = this.d.u;
        if(fwyt0.h()) {
            fwyt0.j();
        }
        this.z(v);
    }

    protected final boolean B(futv futv0) {
        futd futd0 = this.d;
        fuuw fuuw0 = futd0.m;
        if(!fuuw0.a) {
            return false;
        }
        if(SystemClock.elapsedRealtime() - fuuw0.g <= futv0.i() / 1000000L + 1500L) {
            return false;
        }
        fusr fusr0 = futv0.m();
        return SystemClock.elapsedRealtime() - futd0.R > (fusr0 == null ? 3200000000L : fusr0.a) / 1000000L;
    }

    protected final boolean C() {
        return ((fxbg)this.d.s).c || this.d.u.h();
    }

    protected void K() {
        if(!(this instanceof fuul)) {
            this.L(new fuul(this.d));
        }
    }

    protected void L(fuvb fuvb0) {
        futd futd0 = this.d;
        futd0.l.Y();
        SystemClock.elapsedRealtime();
        futd0.l.v();
        Class class0 = futd0.l.getClass();
        if(!fuvb0.getClass().equals(class0)) {
            String s = fuvb0.Y();
            Map map0 = futd0.w;
            Integer integer0 = (Integer)map0.get(s);
            if(integer0 == null) {
                integer0 = (int)0;
            }
            map0.put(s, Integer.valueOf(((int)integer0) + 1));
        }
        futd0.l = fuvb0;
        futd0.l.Y();
        SystemClock.elapsedRealtime();
        fuvb0.u();
    }

    public void M() {
    }

    public void N() {
    }

    public void O() {
    }

    protected void P() {
    }

    public void Q() {
    }

    protected void R() {
        this.K();
    }

    protected void S() {
    }

    protected void T() {
    }

    protected void U() {
    }

    protected void V(fvuu fvuu0, fvuu fvuu1) {
    }

    protected void W(fwzf fwzf0) {
    }

    public abstract String Y();

    protected void a(boolean z) {
    }

    private final void o(futu futu0, futv futv0) {
        if(this.B(futv0)) {
            this.L(futv0);
            return;
        }
        this.L(futu0);
    }

    public void u() {
        futd futd0 = this.d;
        if(futd0.M != futd0.C()) {
            int v = futd0.M;
            futd0.M = v ^ 1;
            if(v == 0) {
                futd0.e.g(0x3F);
            }
            else {
                futd0.e.g(62);
            }
        }
        futd0.B(futd0.l instanceof fuul);
        if(!futd0.E.isEmpty()) {
            fwvq fwvq0 = futd0.af;
            if(fwvq0.a) {
                if(futd0.M) {
                    fwvq0.a();
                    return;
                }
                fwvq0.b(futd0);
            }
        }
    }

    public void v() {
        this.d.h();
    }

    protected void w() {
    }

    protected void x(boolean z) {
    }

    protected final void z(long v) {
        if(v == 2L) {
            this.o(new fuvd(this.d), new fuve(this.d));
            return;
        }
        if((8L & v) != 0L) {
            this.o(new fuua(this.d), new fuub(this.d));
            return;
        }
        futd futd0 = this.d;
        if(futd0.C()) {
            if(this.C()) {
                this.L(new fuux(futd0));
                return;
            }
            this.L(new fuug(futd0));
            return;
        }
        if(v == 39L) {
            this.o(new fuuc(futd0), new fuud(futd0));
            return;
        }
        if(v == 4L) {
            this.o(new fuun(futd0), new fuud(futd0));
            return;
        }
        if(v == 0x20L) {
            this.o(new fuuc(futd0), new fuud(futd0));
        }
    }
}

