import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.location.reporting.collectors.HomeWorkNearbyAlertsHelper.NearbyAlertReceiver;
import java.util.HashSet;
import java.util.List;

public final class fxpw {
    public final fxts a;
    public final fxrk b;
    public final Context c;
    public String d;
    public String e;
    public HomeWorkNearbyAlertsHelper.NearbyAlertReceiver f;
    public boolean g;
    public fxsv h;
    private final fxpv i;

    public fxpw(Context context0, fxts fxts0, fxpv fxpv0, fxrk fxrk0) {
        this.c = context0;
        this.a = fxts0;
        this.i = fxpv0;
        this.b = fxrk0;
    }

    public final void a() {
        if(this.g) {
            HomeWorkNearbyAlertsHelper.NearbyAlertReceiver homeWorkNearbyAlertsHelper$NearbyAlertReceiver0 = this.f;
            if(homeWorkNearbyAlertsHelper$NearbyAlertReceiver0 != null) {
                this.c.unregisterReceiver(homeWorkNearbyAlertsHelper$NearbyAlertReceiver0);
                this.f = null;
            }
            PendingIntent pendingIntent0 = fxva.b(this.c, "com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE");
            fxrh fxrh0 = new fxrh(this.b, pendingIntent0);
            this.b.a.execute(fxrh0);
            this.a.i = false;
            this.a.j = false;
            this.g = false;
        }
    }

    public final boolean b(List list0, fxtt fxtt0) {
        boolean z;
        if(!list0.isEmpty()) {
            hzek hzek0 = hzek.a;
            String s = hzek0.i().Y();
            if(s != null && !s.isEmpty()) {
                fxtt0.h(s);
                z = true;
            }
            else {
                z = false;
            }
            String s1 = hzek0.i().Z();
            if(s1 != null && !s1.isEmpty()) {
                fxtt0.j(s1);
            }
            else if(!z) {
                long v = System.currentTimeMillis();
                long v1 = fxtt0.c.getLong("lastInferredPlacesRefreshTime", -1L);
                if(v1 == -1L || v1 + hzek0.i().K() <= v) {
                    if(!fxva.n(this.c)) {
                        return false;
                    }
                    fxtt0.i(v);
                    String s2 = null;
                    String s3 = null;
                    String s4 = null;
                    for(Object object0: list0) {
                        new HashSet();
                        new HashSet();
                        String[] arr_s = fxql.a(((Account)object0), this.i.a);
                        if(arr_s != null) {
                            String s5 = arr_s[0];
                            if(s5 != null) {
                                if(s3 == null) {
                                    s3 = s5;
                                }
                                else if(!s3.equals(s5)) {
                                    return false;
                                }
                            }
                            String s6 = arr_s[1];
                            if(s6 == null) {
                                continue;
                            }
                            if(s4 == null) {
                                s4 = s6;
                                continue;
                            }
                            if(s4.equals(s6)) {
                                continue;
                            }
                            return false;
                        }
                        return false;
                    }
                    if(s3 != null) {
                        s2 = s3;
                    }
                    else if(s4 == null) {
                        return false;
                    }
                    fxtt0.h(s2);
                    fxtt0.j(s4);
                }
                fxtt0.c();
                fxtt0.d();
                if(fxtt0.c() != null && fxtt0.d() != null) {
                    fxqw.c("GCoreUlr", "can enable home and work placefences");
                    return true;
                }
                if(fxtt0.c() != null) {
                    fxqw.c("GCoreUlr", "can enable home placefence");
                    return true;
                }
                if(fxtt0.d() != null) {
                    fxqw.c("GCoreUlr", "can enable work placefence");
                }
                return true;
            }
            fxtt0.i(-1L);
            return true;
        }
        return false;
    }

    public static final boolean c() {
        return hzek.n() || hzek.o();
    }
}

