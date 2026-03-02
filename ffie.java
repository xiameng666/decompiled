import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import j..util.Objects;

final class ffie extends ffee {
    final String c;
    final fdiy d;
    final fflv e;

    public ffie(fflv fflv0, String s, fdiy fdiy0) {
        this.c = s;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getAppTheme");
    }

    @Override  // ffee
    public final void a() {
        String s1;
        evql evql0 = null;
        fcfw fcfw0 = this.e.B;
        batl.s(fcfw0);
        Context context0 = this.e.I;
        String s = this.c;
        if(hzty.c()) {
            try {
                s1 = fcfw.c(fdpn.a(context0, s));
            }
            catch(PackageManager.NameNotFoundException | IllegalArgumentException exception0) {
                evql0 = evrg.c(exception0);
                goto label_17;
            }
            evqp evqp0 = new evqp();
            gmbu.t(fcfw0.g.a(), new fcfv(fcfw0, s1, evqp0), gmap.a);
            evql0 = evqp0.a;
        }
        else if(Log.isLoggable("ExperienceService", 5)) {
            Log.w("ExperienceService", "Feature is disabled ");
        }
    label_17:
        evql0.z(new ffid(this.d));
    }
}

