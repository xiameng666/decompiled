import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParcel;
import j..util.Objects;

final class cron implements Runnable {
    final boolean a;
    final AppMetadata b;
    final boolean c;
    final EventParcel d;
    final String e;
    final croz f;

    public cron(croz croz0, boolean z, AppMetadata appMetadata0, boolean z1, EventParcel eventParcel0, String s) {
        this.a = z;
        this.b = appMetadata0;
        this.c = z1;
        this.d = eventParcel0;
        this.e = s;
        Objects.requireNonNull(croz0);
        this.f = croz0;
        super();
    }

    @Override
    public final void run() {
        long v3;
        long v2;
        long v1;
        croz croz0 = this.f;
        crii crii0 = croz0.b;
        if(crii0 == null) {
            croz0.aJ().c.a("Discarding data. Failed to send event to service");
            return;
        }
        if(this.a) {
            batl.s(this.b);
            croz0.y(crii0, (this.c ? null : this.d), this.b);
        }
        else {
            boolean z = croz0.am().t(crif.aB);
            try {
                String s = this.e;
                if(TextUtils.isEmpty(s)) {
                    AppMetadata appMetadata0 = this.b;
                    batl.s(appMetadata0);
                    if(z) {
                        long v = System.currentTimeMillis();
                        try {
                            v1 = SystemClock.elapsedRealtime();
                        }
                        catch(RemoteException remoteException0) {
                            v2 = 0L;
                            v3 = v;
                            goto label_40;
                        }
                        v2 = v1;
                        v3 = v;
                    }
                    else {
                        v3 = 0L;
                        v2 = 0L;
                    }
                    try {
                        crii0.i(this.d, appMetadata0);
                        if(z) {
                            croz0.aJ().k.a("Logging telemetry for logEvent");
                            criv.a(croz0.y).b(0, v3, System.currentTimeMillis(), ((int)(SystemClock.elapsedRealtime() - v2)));
                        }
                    }
                    catch(RemoteException remoteException0) {
                        goto label_40;
                    }
                }
                else {
                    String s1 = croz0.aJ().f();
                    crii0.j(this.d, s, s1);
                }
                goto label_44;
            }
            catch(RemoteException remoteException0) {
                v3 = 0L;
                v2 = 0L;
            }
        label_40:
            croz croz1 = this.f;
            croz1.aJ().c.b("Failed to send event to the service", remoteException0);
            if(z && v3 != 0L) {
                criv.a(croz1.y).b(13, v3, System.currentTimeMillis(), ((int)(SystemClock.elapsedRealtime() - v2)));
            }
        }
    label_44:
        this.f.w();
    }
}

