import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;

public final class aqit extends asau implements cjug {
    private static final baun a;
    private final cjts b;
    private final String c;
    private final String d;
    private final Context e;

    static {
        aqit.a = aqql.a("GmsRestoreStub");
    }

    public aqit(Context context0, cjts cjts0, String s, String s1) {
        this.c = s;
        this.d = s1;
        this.b = cjts0;
        this.e = context0;
    }

    @Override  // asav
    public final void a(asas asas0, ApiMetadata apiMetadata0) {
        azug azug0 = this.f(apiMetadata0);
        aqip aqip0 = new aqip(new aqee(this.e), aqwe.a(this.e), asas0, null, azug0);
        this.b.b(aqip0);
    }

    @Override  // asav
    public final void c(asas asas0, Account account0, ApiMetadata apiMetadata0) {
        azug azug0 = this.f(apiMetadata0);
        aqip aqip0 = new aqip(new aqee(this.e), aqwe.a(this.e), asas0, account0, azug0);
        this.b.b(aqip0);
    }

    @Override  // asav
    public final void d(asba asba0, String s, ApiMetadata apiMetadata0) {
        azug azug0 = this.f(apiMetadata0);
        aqiq aqiq0 = new aqiq(new aqjv(this.e), new aqys(this.e), s, asba0, azug0);
        this.b.b(aqiq0);
    }

    @Override  // asav
    public final void e(azxs azxs0, long v, String s, ApiMetadata apiMetadata0) {
        if(hqjw.d()) {
            String s1 = this.c;
            if(!s1.equals("com.google.android.gms")) {
                aqit.a.f("Skipping on-demand restore.Unexpected calling package. Expected: %s  Actual: %s", new Object[]{"com.google.android.gms", s1});
                return;
            }
            String s2 = hqjw.a.b().i();
            ggfp ggfp0 = s2.isEmpty() ? ggnj.a : ggfp.H(s2.split(","));
            if(!ggfp0.contains(s)) {
                throw new SecurityException("Requesting on demand restore for a module that does not support on demand restore. Do not proceed. Module name: " + s);
            }
        }
        azug azug0 = this.f(apiMetadata0);
        aqix aqix0 = new aqix(new aqjk(this.e), azxs0, v, s, azug0);
        this.b.b(aqix0);
    }

    private final azug f(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aa);
        azuf0.g(bbdq.l);
        azuf0.d(this.c);
        azuf0.c(this.d);
        return azuf0.a();
    }
}

