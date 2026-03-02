import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import j..util.Objects;

final class crpp {
    final crpq a;

    public crpp(crpq crpq0) {
        Objects.requireNonNull(crpq0);
        this.a = crpq0;
        super();
    }

    final void a() {
        crpq crpq0 = this.a;
        crpq0.n();
        if(crpq0.ap().j(System.currentTimeMillis())) {
            crpq0.ap().k.a(true);
            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
            if(activityManager$RunningAppProcessInfo0.importance == 100) {
                crpq0.aJ().k.a("Detected application was in foreground");
                this.b(System.currentTimeMillis(), (crpq0.am().t(crif.aT) ? SystemClock.elapsedRealtime() : 0L));
            }
        }
    }

    final void b(long v, long v1) {
        crpq crpq0 = this.a;
        crpq0.n();
        if(crpq0.y.v()) {
            crpq0.ap().o.b(v);
            long v2 = SystemClock.elapsedRealtime();
            crpq0.aJ().k.b("Session started, time", Long.valueOf(v2));
            Long long0 = (long)(v / 1000L);
            crpq0.h().F("auto", "_sid", long0, v);
            crju crju0 = crpq0.ap().p;
            long0.getClass();
            crju0.b(v / 1000L);
            crpq0.ap().k.a(false);
            Bundle bundle0 = new Bundle();
            long0.getClass();
            bundle0.putLong("_sid", v / 1000L);
            crpq0.h().x("auto", "_s", v, v1, bundle0);
            String s = crpq0.ap().u.a();
            if(!TextUtils.isEmpty(s)) {
                Bundle bundle1 = new Bundle();
                bundle1.putString("_ffr", s);
                crpq0.h().x("auto", "_ssr", v, v1, bundle1);
            }
        }
    }

    final void c(long v, long v1) {
        crpq crpq0 = this.a;
        crpq0.n();
        crpq0.q();
        if(crpq0.ap().j(v)) {
            crpq0.ap().k.a(true);
            crpq0.f().w();
        }
        crpq0.ap().o.b(v);
        if(crpq0.ap().k.b()) {
            this.b(v, v1);
        }
    }
}

