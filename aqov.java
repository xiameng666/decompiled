import android.content.Context;
import android.net.Uri.Builder;

public final class aqov implements aqox {
    private final Context a;
    private final aqnl b;

    public aqov(Context context0) {
        this.a = context0;
        this.b = new aqnl(context0, aqxr.a());
    }

    public static Uri.Builder a() {
        return new Uri.Builder().scheme("https").encodedAuthority(hqje.o()).appendPath("v1");
    }

    @Override  // aqox
    public final hisf b(hisk hisk0) {
        aqor aqor0 = new aqor(this, aqov.l(), hisk0);
        String s = this.b.a();
        return (hisf)aqor0.c(this.a, new byte[0], s);
    }

    @Override  // aqox
    public final hisf c(hisq hisq0) {
        aqop aqop0 = new aqop(this, aqov.l(), hisq0);
        String s = this.b.a();
        return (hisf)aqop0.c(this.a, s, "application/x-protobuf");
    }

    @Override  // aqox
    public final hisu d(hiss hiss0) {
        aqoq aqoq0 = new aqoq(this, aqov.l(), hiss0);
        String s = this.b.a();
        return (hisu)aqoq0.c(this.a, s, "application/x-protobuf");
    }

    @Override  // aqox
    public final hisw e(hisv hisv0) {
        aqos aqos0 = new aqos(this, aqov.l(), hisv0);
        String s = this.b.a();
        return (hisw)aqos0.c(this.a, s, "application/x-protobuf");
    }

    @Override  // aqox
    public final hisy f(hisx hisx0) {
        aqon aqon0 = new aqon(this, aqov.l(), hisx0);
        String s = this.b.a();
        return (hisy)aqon0.c(this.a, new byte[0], s);
    }

    @Override  // aqox
    public final void g(hisi hisi0) {
        aqoo aqoo0 = new aqoo(this, aqov.l(), hisi0);
        String s = this.b.a();
        aqoo0.c(this.a, new byte[0], s);
    }

    @Override  // aqox
    public final void h(hism hism0) {
        aqou aqou0 = new aqou(this, aqov.l(), hism0);
        String s = this.b.a();
        aqou0.b(this.a, new byte[0], s);
    }

    @Override  // aqox
    public final void i(hisn hisn0) {
        aqot aqot0 = new aqot(this, aqov.l(), hisn0);
        String s = this.b.a();
        aqot0.b(this.a, new byte[0], s);
    }

    @Override  // aqox
    public final void j(hiso hiso0) {
        throw new RuntimeException("Unimplemented");
    }

    public static void k(Uri.Builder uri$Builder0, hise hise0) {
        uri$Builder0.appendQueryParameter("request_header.experiment_overrides", hise0.d);
        if((hise0.b & 1) != 0) {
            uri$Builder0.appendQueryParameter("request_header.client_info.version", (hise0.c == null ? hish.a : hise0.c).b).appendQueryParameter("request_header.client_info.client_id", String.valueOf((hise0.c == null ? hish.a : hise0.c).c));
        }
    }

    static aqwm l() {
        return new aqwm(((gful_cronetEngineProvider)new aqol()), ((gful_cronetEngineProvider)new aqom()));
    }
}

