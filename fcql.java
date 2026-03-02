import android.app.backup.RestoreSession;
import java.util.concurrent.TimeUnit;

public final class fcql implements glzn {
    public final fcrb a;
    public final long b;

    public fcql(fcrb fcrb0, long v) {
        this.a = fcrb0;
        this.b = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        fcrb fcrb0 = this.a;
        fcrt fcrt0 = fcrb0.d;
        RestoreSession restoreSession0 = fcrt0.b.c();
        if(restoreSession0 == null) {
            fcrt.a.m("Cannot begin restore session.", new Object[0]);
            return gmbu.q(gmbu.i(Boolean.valueOf(false)), hzyp.a.b().g(), TimeUnit.SECONDS, fcrb0.i);
        }
        return gmbu.q(jqy.a(new fcrq(fcrt0, restoreSession0, this.b)), hzyp.a.b().g(), TimeUnit.SECONDS, fcrb0.i);
    }
}

