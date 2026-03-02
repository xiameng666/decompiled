import android.content.DialogInterface.OnClickListener;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class amj extends lsb {
    private amv B;
    public Executor a;
    public ali b;
    public alm c;
    public alk d;
    public amr e;
    public DialogInterface.OnClickListener f;
    public DialogInterface.OnClickListener g;
    public CharSequence h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public lqi q;
    public lqi r;
    public lqi s;
    public lqi t;
    public lqi u;
    public lqi v;
    public lqi w;
    public int x;
    public lqi y;
    public lqi z;

    public amj() {
        this.x = 0;
    }

    public final ali a() {
        if(this.b == null) {
            this.b = new ali();
        }
        return this.b;
    }

    public final amv b() {
        if(this.B == null) {
            this.B = new amv();
        }
        return this.B;
    }

    public final CharSequence c() {
        return this.c == null ? null : this.c.f;
    }

    public final CharSequence e() {
        alm alm0 = this.c;
        if(alm0 != null) {
            CharSequence charSequence0 = alm0.g;
            return charSequence0 != null ? charSequence0 : "";
        }
        return null;
    }

    public final CharSequence f() {
        return this.c == null ? null : this.c.e;
    }

    public final CharSequence g() {
        return this.c == null ? null : this.c.d;
    }

    public final Executor h() {
        Executor executor0 = this.a;
        return executor0 != null ? executor0 : new amg();
    }

    public final void i(amt amt0) {
        if(this.r == null) {
            this.r = new lqi();
        }
        amj.q(this.r, amt0);
    }

    public final void j(boolean z) {
        if(this.t == null) {
            this.t = new lqi();
        }
        amj.q(this.t, Boolean.valueOf(z));
    }

    public final void k(alj alj0) {
        if(this.q == null) {
            this.q = new lqi();
        }
        amj.q(this.q, alj0);
    }

    final void l(boolean z) {
        if(this.w == null) {
            this.w = new lqi();
        }
        amj.q(this.w, Boolean.valueOf(z));
    }

    final void m(CharSequence charSequence0) {
        if(this.z == null) {
            this.z = new lqi();
        }
        amj.q(this.z, charSequence0);
    }

    final void n(boolean z) {
        if(this.v == null) {
            this.v = new lqi();
        }
        amj.q(this.v, Boolean.valueOf(z));
    }

    final void o(boolean z) {
        if(this.u == null) {
            this.u = new lqi();
        }
        amj.q(this.u, Boolean.valueOf(z));
    }

    public final void p() {
        this.p = ams.a(this.c, this.d, this.o);
    }

    public static void q(lqi lqi0, Object object0) {
        if(Thread.currentThread() == Looper.getMainLooper().getThread()) {
            lqi0.l(object0);
            return;
        }
        lqi0.ii(object0);
    }

    final void r() {
        if(this.y == null) {
            this.y = new lqi();
        }
        amj.q(this.y, Integer.valueOf(1));
    }
}

