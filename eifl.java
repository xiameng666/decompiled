import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.personalsafety.scanners.ActivityRecognitionScanner.ActivityRecognitionBroadcastReceiver;
import j..util.Comparator.-CC;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class eifl {
    final PendingIntent a;
    public final eicb b;
    public final Map c;
    public final NavigableMap d;
    public int e;
    public gfsx f;
    private static eifl g;
    private final cmmn h;
    private final ActivityRecognitionScanner.ActivityRecognitionBroadcastReceiver i;

    public eifl(Context context0, cmmn cmmn0, eicb eicb0) {
        this.c = new HashMap();
        this.d = new TreeMap();
        this.e = 0;
        this.f = gfqx.a;
        this.h = cmmn0;
        this.b = eicb0;
        this.i = new ActivityRecognitionScanner.ActivityRecognitionBroadcastReceiver(this);
        Intent intent0 = new Intent("com.google.android.gms.personalsafety.scanners.ACTION_ACTIVITY_DETECTED");
        intent0.setPackage("com.google.android.gms");
        this.a = PendingIntent.getBroadcast(context0, 0, intent0, 0x2000000);
    }

    public static eifl a() {
        if(eifl.g == null) {
            Context context0 = AppContextProvider.a();
            eifl.g = new eifl(context0, new cniy(context0), eicb.a(context0));
        }
        return eifl.g;
    }

    public final void b(eifk eifk0, eigm eigm0) {
        eifk0.getClass();
        Map map0 = this.c;
        if(map0.isEmpty()) {
            this.d(eigm0);
        }
        else if(this.f.i() && ((eigm)this.f.d()).a > eigm0.a) {
            this.d(eigm0);
        }
        map0.put(eifk0, eigm0);
    }

    public final void c(eifk eifk0) {
        synchronized(this) {
            eifk0.getClass();
            Map map0 = this.c;
            if(map0.containsKey(eifk0)) {
                eigm eigm0 = (eigm)map0.get(eifk0);
                map0.remove(eifk0);
                if(map0.isEmpty()) {
                    this.e();
                    return;
                }
                if(this.f.i() && eigm0 == this.f.d()) {
                    this.d(((eigm)Collections.min(map0.values(), Comparator.-CC.comparingInt(new eifj()))));
                }
            }
        }
    }

    final void d(eigm eigm0) {
        this.e();
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("com.google.android.gms.personalsafety.scanners.ACTION_ACTIVITY_DETECTED");
        jwe.b(AppContextProvider.a(), this.i, intentFilter0, 4);
        cmmo cmmo0 = new cmmo();
        cmmo0.e = "PersonalSafety";
        cmmo0.c(((long)eigm0.a));
        ActivityRecognitionRequest activityRecognitionRequest0 = cmmo0.a();
        evql evql0 = this.h.f(activityRecognitionRequest0, this.a);
        evql0.b(new eiff(this, eigm0));
        evql0.A(new eifg());
    }

    final void e() {
        evql evql0 = this.h.d(this.a);
        evql0.b(new eifh(this));
        evql0.A(new eifi());
        try {
            AppContextProvider.a().unregisterReceiver(this.i);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        this.d.clear();
    }
}

