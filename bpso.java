import android.content.Context;

public final class bpso {
    public static final bboh a;
    public final Context b;
    public final cczf c;
    public final fqxe d;
    public final fquu e;
    public final gmch f;

    static {
        bpso.a = bboh.b("FMDModuleSettingsLogger", bbcu.eD);
    }

    public bpso(Context context0, cczf cczf0, fqxe fqxe0, fquu fquu0, gmch gmch0) {
        this.b = context0;
        this.c = cczf0;
        this.d = fqxe0;
        this.e = fquu0;
        this.f = gmch0;
    }

    public static hfwn a(hfwn hfwn0) {
        return hfyn.m(hfwn0, hfyf.h(hfyf.n(hfwn0.b % 3600L), hfyf.m(hfwn0.c)));
    }
}

