import j..util.Objects;
import java.util.Iterator;

final class iazi implements ibbr {
    final iavn a;
    boolean b;
    final iazk c;

    public iazi(iazk iazk0, iavn iavn0) {
        Objects.requireNonNull(iazk0);
        this.c = iazk0;
        super();
        this.b = false;
        this.a = iavn0;
    }

    @Override  // ibbr
    public final void a(boolean z) {
        this.c.g(this.a, z);
    }

    @Override  // ibbr
    public final void b() {
        this.c.d.a(2, "READY");
        iazf iazf0 = new iazf(this);
        this.c.g.execute(iazf0);
    }

    @Override  // ibbr
    public final void c(iapk iapk0) {
        Object[] arr_object = {this.a.c(), iazk.k(iapk0)};
        this.c.d.b(2, "{0} SHUTDOWN with {1}", arr_object);
        this.b = true;
        iazg iazg0 = new iazg(this, iapk0);
        this.c.g.execute(iazg0);
    }

    @Override  // ibbr
    public final void d() {
        gftb.r(this.b, "transportShutdown() must be called before transportTerminated().");
        iavn iavn0 = this.a;
        Object[] arr_object = {iavn0.c()};
        iazk iazk0 = this.c;
        iazk0.d.b(2, "{0} Terminated", arr_object);
        iamg.b(iazk0.c.e, iavn0);
        iazk0.g(iavn0, false);
        Iterator iterator0 = iazk0.f.iterator();
        if(!iterator0.hasNext()) {
            iazh iazh0 = new iazh(this);
            iazk0.g.execute(iazh0);
            return;
        }
        Object object0 = iterator0.next();
        iald iald0 = (iald)object0;
        iavn0.r();
        throw null;
    }

    @Override  // ibbr
    public final void e() {
        Iterator iterator0 = this.c.f.iterator();
        if(!iterator0.hasNext()) {
            return;
        }
        Object object0 = iterator0.next();
        iald iald0 = (iald)object0;
        throw null;
    }
}

