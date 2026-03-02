import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;

public final class azwc extends azvh {
    public final bxf a;
    private final azxm f;

    private azwc(azxy azxy0, azxm azxm0) {
        super(azxy0, azpm.a);
        this.a = new bxf();
        this.f = azxm0;
        this.e.c("ConnectionlessLifecycleHelper", this);
    }

    @Override  // azvh
    protected final void b(ConnectionResult connectionResult0, int v) {
        this.f.g(connectionResult0, v);
    }

    @Override  // azvh
    protected final void c() {
        this.f.h();
    }

    @Override  // azvh
    public final void d() {
        super.d();
        this.r();
    }

    @Override  // azvh
    public final void e() {
        super.e();
        Object object0 = azxm.c;
        azxm azxm0 = this.f;
        synchronized(object0) {
            if(azxm0.l == this) {
                azxm0.l = null;
                azxm0.m.clear();
            }
        }
    }

    public static void l(Activity activity0, azxm azxm0, azux azux0) {
        azwc.m(azwc.p(activity0), azxm0, azux0);
    }

    public static void m(azxy azxy0, azxm azxm0, azux azux0) {
        azwc azwc0 = (azwc)azxy0.b("ConnectionlessLifecycleHelper", azwc.class);
        if(azwc0 == null) {
            azwc0 = new azwc(azxy0, azxm0);
        }
        azwc0.a.add(azux0);
        azxm0.j(azwc0);
    }

    @Override  // azxx
    public final void n() {
        this.r();
    }

    private final void r() {
        if(!this.a.isEmpty()) {
            this.f.j(this);
        }
    }
}

