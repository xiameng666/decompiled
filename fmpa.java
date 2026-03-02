import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

public class fmpa {
    private gfsx a;
    public final Handler e;
    protected final Set f;

    public fmpa() {
        this.e = new Handler(Looper.getMainLooper());
        this.f = new HashSet();
        this.a = gfqx.a;
    }

    public fmpa(Object object0) {
        this.e = new Handler(Looper.getMainLooper());
        this.f = new HashSet();
        this.a = gfsx.m(object0);
    }

    protected void a() {
        synchronized(this) {
        }
    }

    protected void b() {
        synchronized(this) {
        }
    }

    protected void c(Object object0) {
        synchronized(this) {
            if(this.a.i() && object0.equals(this.a.d())) {
                return;
            }
            this.a = gfsx.m(object0);
            this.h(object0);
        }
    }

    private final void d(int v) {
        synchronized(this) {
            Set set0 = this.f;
            int v2 = set0.size() - v;
            if(v2 != 0) {
                if(set0.size() == v2) {
                    this.a();
                    return;
                }
                if(set0.isEmpty()) {
                    this.b();
                }
            }
        }
    }

    public final gfsx e() {
        synchronized(this) {
        }
        return this.a;
    }

    protected final void f() {
        synchronized(this) {
            this.a = gfqx.a;
        }
    }

    public final void g() {
        this.j(new fmoy(this));
    }

    protected final void h(Object object0) {
        synchronized(this) {
            this.i(new fmow(ggfp.G(this.f), object0));
        }
    }

    protected final void i(Runnable runnable0) {
        this.e.post(runnable0);
    }

    public final void j(fmoz fmoz0) {
        synchronized(this) {
            int v1 = this.f.size();
            this.f.add(fmoz0);
            if(this.a.i()) {
                this.i(new fmov(fmoz0, this.a.d()));
            }
            this.d(v1);
        }
    }

    public final void k(fmoz fmoz0) {
        this.j(new fmox(this, fmoz0));
    }

    public final void l(fmoz fmoz0) {
        synchronized(this) {
            this.f.remove(fmoz0);
            this.d(this.f.size());
        }
    }
}

