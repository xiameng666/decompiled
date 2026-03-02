import android.content.Context;
import com.google.android.gms.chimera.modules.audit.AppContextProvider;

public final class acro {
    private static acro a;
    private final cljp b;

    private acro(cljp cljp0) {
        this.b = cljp0;
    }

    public static acro a() {
        synchronized(acro.class) {
            if(acro.a == null) {
                AppContextProvider appContextProvider0 = AppContextProvider.c;
                Context context0 = appContextProvider0 == null ? babh.a() : appContextProvider0.a;
                acro acro0 = new acro(cljp.a(context0));
                acro.a = acro0;
                acro0.b();
            }
        }
        return acro.a;
    }

    public final void b() {
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.audit.upload.AuditGcmTaskService";
        clkn0.e(hovz.a.b().e(), hovz.a.b().d());
        clkn0.t("audit_task");
        clkn0.v(1);
        clkn0.p = true;
        clkn0.y(0, 0);
        clkn0.x(0, 0);
        clkn0.i(false);
        clko clko0 = clkn0.a();
        this.b.f(clko0);
    }
}

