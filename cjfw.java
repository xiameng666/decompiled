import j..util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;

public class cjfw extends cjcw {
    public final cjfp d;
    cjft e;
    cjfo f;

    public cjfw(String s, cjfp cjfp0) {
        bboh.c("LocationSettings", bbcu.a, s);
        this.d = cjfp0;
    }

    @Override  // cjcw
    protected final void A() {
        this.e = null;
        this.d.d();
    }

    @Override  // cjcw
    protected final void C(Object object0) {
        Void void0 = (Void)object0;
        gftb.q(this.e == null);
        cjft cjft0 = new cjft(this);
        this.e = cjft0;
        this.d.c(cjft0);
    }

    public final Object h() {
        return this.d.b();
    }

    protected final void i(Object object0, cjfo cjfo0, Executor executor0) {
        this.iv(object0, new cjfv(this, executor0, cjfo0));
    }

    public final void l(cjfo cjfo0) {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(cjfo0 != null) {
            if(this.f == null) {
                this.f = cjfo0;
                this.i(cjfo0, cjfo0, gmap.a);
                goto label_13;
            }
            throw new IllegalStateException();
        }
        cjfo cjfo1 = this.f;
        if(cjfo1 != null) {
            this.iw(cjfo1);
            this.f = null;
        label_13:
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException();
    }

    @Override  // cjcn
    protected final boolean q(cjdf cjdf0) {
        cjfv cjfv0 = (cjfv)cjdf0;
        return true;
    }

    @Override  // cjcw
    protected final Object v(Collection collection0) {
        return null;
    }

    @Override  // cjcw
    public void z(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        Objects.requireNonNull(printWriter0);
        cjfq cjfq0 = new cjfq(printWriter0);
        cjfp cjfp0 = this.d;
        if(cjfp0.e(cjfq0)) {
            printWriter0.print(" (cached)");
        }
        else {
            printWriter0.print(cjfp0.b());
        }
        printWriter0.println();
    }
}

