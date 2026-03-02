import android.app.ActivityManager;
import android.telecom.Call;
import com.google.android.gms.chimera.modules.security.nonwearable.AppContextProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class atou {
    public static final atos a;
    public static final bboh b;
    public static atou c;
    private final ibrt d;
    private final Set e;
    private atpb f;
    private final icck g;

    static {
        atou.a = new atos();
        atou.b = bboh.b("BankScamMitigationMgr", bbcu.gX);
    }

    public atou(ibrt ibrt0) {
        this.d = ibrt0;
        this.e = new LinkedHashSet();
        this.g = iccl.b(ibrt0);
    }

    public final void a(Call call0) {
        synchronized(this) {
            ((ggtj)atou.b.h()).x("addCall called");
            this.e.add(call0);
        }
    }

    public final void b() {
        synchronized(this) {
            ((ggtj)atou.b.h()).z("clearAllCalls called. Clearing %d active calls", this.e.size());
            this.e.clear();
        }
    }

    public final void c(String s, boolean z) {
        bboh bboh0;
        synchronized(this) {
            bboh0 = atou.b;
            ((ggtj)bboh0.h()).B("endCallAndScreenSharing called, force stop permission granted during UI rendering: %b", Boolean.valueOf(z));
            if(s == null) {
                ((ggtj)bboh0.h()).x("NULL projectionAppPackage, so not stopping screen sharing");
            }
            else if(z) {
                atou.h(s);
            }
            else {
                ((ggtj)bboh0.h()).x("Skipping stopScreenSharing: UI was rendered assuming FORCE_STOP permission was not granted.");
            }
            Set set0 = this.e;
            if(!set0.isEmpty()) {
                List list0 = ibpo.ar(set0);
                ((ggtj)bboh0.h()).z("Attempting to end %d active calls", list0.size());
                Iterator iterator0 = list0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return;
                    }
                    Object object0 = iterator0.next();
                    Call call0 = (Call)object0;
                    ((ggtj)bboh0.h()).x("Disconnecting call");
                    try {
                        call0.disconnect();
                    }
                    catch(IllegalStateException illegalStateException0) {
                        a.ae(atou.b.i(), "IllegalStateException while disconnecting call", illegalStateException0);
                    }
                    catch(SecurityException securityException0) {
                        a.ae(atou.b.i(), "SecurityException while disconnecting call", securityException0);
                    }
                }
            }
            goto label_29;
        }
        return;
    label_29:
        ((ggtj)bboh0.h()).x("No active calls to end");
    }

    public final void d(String s, String s1) {
        synchronized(this) {
            atot atot0 = new atot(this.f, s, s1, null);
            icbb.b(this.g, null, null, atot0, 3);
        }
    }

    public final void e(Call call0) {
        synchronized(this) {
            if(call0 != null) {
                ((ggtj)atou.b.h()).x("removeCall called");
                this.e.remove(call0);
            }
        }
    }

    public final void f(atpb atpb0) {
        synchronized(this) {
            ((ggtj)atou.b.h()).x("setBankAppScamDetectionManager called");
            this.f = atpb0;
        }
    }

    public final void g() {
        synchronized(this) {
            ((ggtj)atou.b.h()).x("unsetBankAppScamDetectionManager called");
            this.f = null;
        }
    }

    private static final void h(String s) {
        try {
            if(cjmf.b(AppContextProvider.a(), "android.permission.FORCE_STOP_PACKAGES") != 0) {
                ((ggtj)atou.b.h()).x("FORCE_STOP_PACKAGE permission not granted, hence can\'t stop screen sharing.");
                return;
            }
            ((ggtj)atou.b.h()).x("Stopping screen sharing");
            Object object0 = AppContextProvider.a().getSystemService(ActivityManager.class);
            ibuq.d(object0, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager)object0).forceStopPackage(s);
        }
        catch(SecurityException securityException0) {
            a.e(atou.b.i(), "SecurityException while trying to stop screen sharing for package %s", s, securityException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.e(atou.b.i(), "IllegalArgumentException while trying to stop screen sharing for package %s", s, illegalArgumentException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            a.e(atou.b.i(), "NoSuchMethodException while trying to stop screen sharing for package %s", s, noSuchMethodException0);
        }
        catch(NoSuchMethodError noSuchMethodError0) {
            a.e(atou.b.i(), "NoSuchMethodError while trying to stop screen sharing for package %s", s, noSuchMethodError0);
        }
        catch(IllegalStateException illegalStateException0) {
            a.e(atou.b.i(), "IllegalStateException while trying to stop screen sharing for package %s", s, illegalStateException0);
        }
    }
}

