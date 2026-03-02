import android.util.Log;
import com.google.android.gms.wearable.AppTheme;
import j..util.Objects;

final class ffic extends ffee {
    final AppTheme c;
    final fdiy d;
    final fflv e;

    public ffic(fflv fflv0, AppTheme appTheme0, fdiy fdiy0) {
        this.c = appTheme0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("setThemeForApp");
    }

    @Override  // ffee
    public final void a() {
        evql evql0;
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "Set AppTheme:" + this.c);
        }
        fflv fflv0 = this.e;
        AppTheme appTheme0 = this.c;
        if(hzty.c()) {
            fdpl fdpl0 = fflv0.e;
            fesl fesl0 = fcfw.b(appTheme0);
            if(Log.isLoggable("ExperienceService", 4)) {
                Log.i("ExperienceService", String.format("Setting theme for package %s", ffmr.a(fdpl0.b)));
            }
            fcft fcft0 = new fcft(fdpl0, fesl0);
            evql evql1 = fhqu.a(fflv0.B.g.b(fcft0, gmap.a));
            evql1.z(new fcfu(fflv0.B));
            evql0 = evql1;
        }
        else {
            evql0 = evrg.c(new IllegalStateException("Feature Disabled"));
        }
        evql0.z(new ffib(this.d));
    }
}

