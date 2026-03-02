import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class atss extends aurm {
    final atst a;

    public atss(atst atst0) {
        Objects.requireNonNull(atst0);
        this.a = atst0;
        super();
    }

    @Override  // aurn
    public final void a(ApplicationMetadata applicationMetadata0, String s, String s1, boolean z) {
        atst atst0 = this.a;
        atst0.i = applicationMetadata0;
        atst0.j = s;
        auqw auqw0 = new auqw(new Status(0), applicationMetadata0, s1);
        synchronized(atst0.h) {
            evqp evqp0 = atst0.e;
            if(evqp0 != null) {
                evqp0.b(auqw0);
            }
            atst0.e = null;
        }
    }

    @Override  // aurn
    public final void c(int v) {
        this.a.h(v);
    }

    @Override  // aurn
    public final void d(int v) {
        atst atst0 = this.a;
        atst0.k(v);
        if(atst0.s != null) {
            atst0.e().post(new atsq(this));
        }
    }

    @Override  // aurn
    public final void e(int v) {
        this.a.k(v);
    }

    @Override  // aurn
    public final void f(ApplicationStatus applicationStatus0) {
        this.a.e().post(new atsm(this, applicationStatus0));
    }

    @Override  // aurn
    public final void g(int v) {
        this.a.k(v);
    }

    @Override  // aurn
    public final void h(String s, byte[] arr_b) {
        atst.a.c("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[]{s, ((int)arr_b.length)});
    }

    @Override  // aurn
    public final void i(int v) {
        this.a.e().post(new atso(this, v));
    }

    @Override  // aurn
    public final void j(DeviceStatus deviceStatus0) {
        this.a.e().post(new atsl(this, deviceStatus0));
    }

    @Override  // aurn
    public final void k(int v) {
        this.a.e().post(new atsn(this));
    }

    @Override  // aurn
    public final void l(String s, long v) {
        this.a.i(v, 0);
    }

    @Override  // aurn
    public final void m(String s, long v, int v1) {
        this.a.i(v, v1);
    }

    @Override  // aurn
    public final void n(String s, double f, boolean z) {
        atst.a.c("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override  // aurn
    public final void o(int v) {
        this.a.e().post(new atsr(this));
    }

    @Override  // aurn
    public final void p(String s, String s1) {
        atst.a.c("Receive (type=text, ns=%s) %s", new Object[]{s, s1});
        this.a.e().post(new atsp(this, s, s1));
    }
}

