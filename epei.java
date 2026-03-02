import android.content.Context;
import android.os.UserManager;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

public final class epei extends epeg {
    public static final bboh a;
    public final epfc b;
    public final epet c;
    private final boolean e;

    static {
        epei.a = bboh.b("UsageReportingOptIn", bbcu.dR);
    }

    public epei(Context context0, epfc epfc0, boolean z, epet epet0) {
        super(context0);
        this.b = epfc0;
        this.e = z;
        this.c = epet0;
    }

    @Override  // epeg
    protected final void a(boolean z) {
        ccmp ccmp0 = new ccmp();
        Context context0 = this.d;
        ccmp0.a((z ? bbdg.dQ : bbdg.dR));
        faih.a(context0).cs(new UsageReportingOptInOptions((z ? 1 : 2))).A(new epeh());
    }

    public final boolean c() {
        if(this.e) {
            if(hydh.a.c().X() && bbqa.d() && UserManager.isHeadlessSystemUserMode()) {
                UserManager userManager0 = (UserManager)this.d.getSystemService(UserManager.class);
                return !userManager0.isSystemUser() && !userManager0.isGuestUser() && !userManager0.isProfile() && !userManager0.isRestrictedProfile() && !userManager0.isDemoUser();
            }
            return hycl.a.b().a() ? bbmn.s(this.d) : bbmn.u(this.d);
        }
        return false;
    }
}

