import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import java.util.ArrayDeque;
import java.util.Queue;

public final class erke implements erju {
    private final Queue a;
    private erju b;

    public erke() {
        this.a = new ArrayDeque();
    }

    public final void a(erju erju0) {
        this.b = erju0;
        while(true) {
            Queue queue0 = this.a;
            if(queue0.isEmpty() || erju0 == null) {
                break;
            }
            erkf.a.j("Consuming %d queued actions", new Object[]{queue0.size()});
            Runnable runnable0 = (Runnable)queue0.poll();
            if(runnable0 != null) {
                runnable0.run();
            }
        }
    }

    @Override  // erju
    public final void e() {
        erju erju0 = this.b;
        if(erju0 == null) {
            erka erka0 = new erka(this);
            this.a.add(erka0);
            return;
        }
        erju0.e();
    }

    @Override  // erju
    public final void f() {
        erju erju0 = this.b;
        if(erju0 == null) {
            erjv erjv0 = new erjv(this);
            this.a.add(erjv0);
            return;
        }
        erju0.f();
    }

    @Override  // erju
    public final void g() {
        erju erju0 = this.b;
        if(erju0 == null) {
            erjw erjw0 = new erjw(this);
            this.a.add(erjw0);
            return;
        }
        erju0.g();
    }

    @Override  // erju
    public final void h(String s) {
        erju erju0 = this.b;
        if(erju0 == null) {
            erjz erjz0 = new erjz(this, s);
            this.a.add(erjz0);
            return;
        }
        erju0.h(s);
    }

    @Override  // erju
    public final void i(String s) {
        erju erju0 = this.b;
        if(erju0 == null) {
            erjx erjx0 = new erjx(this, s);
            this.a.add(erjx0);
            return;
        }
        erju0.i(s);
    }

    @Override  // erju
    public final void j(VerificationInfo verificationInfo0) {
        erju erju0 = this.b;
        if(erju0 == null) {
            erjy erjy0 = new erjy(this, verificationInfo0);
            this.a.add(erjy0);
            return;
        }
        erju0.j(verificationInfo0);
    }

    @Override  // erju
    public final void k(BootstrapProgressResult bootstrapProgressResult0) {
        erju erju0 = this.b;
        if(erju0 == null) {
            erkc erkc0 = new erkc(this, bootstrapProgressResult0);
            this.a.add(erkc0);
            return;
        }
        erju0.k(bootstrapProgressResult0);
    }

    @Override  // erju
    public final void l(int v) {
        erju erju0 = this.b;
        if(erju0 == null) {
            erkb erkb0 = new erkb(this, v);
            this.a.add(erkb0);
            return;
        }
        erju0.l(v);
    }

    @Override  // erju
    public final void m() {
        erju erju0 = this.b;
        if(erju0 == null) {
            erkd erkd0 = new erkd(this);
            this.a.add(erkd0);
            return;
        }
        erju0.m();
    }
}

