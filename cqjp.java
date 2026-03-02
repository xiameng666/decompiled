import android.location.Location;
import com.google.android.gms.location.LocationRequest;

public final class cqjp implements evpz {
    public final cqjq a;

    public cqjp(cqjq cqjq0) {
        this.a = cqjq0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        Location location0 = evql0.n() ? ((Location)evql0.j()) : null;
        cqjq cqjq0 = this.a;
        if(location0 != null) {
            if(System.currentTimeMillis() - location0.getTime() < 600000L) {
                cqjq0.d = true;
                cqqr.a().b(location0);
                cqjq0.a(hltz.a, location0);
            }
            if((((double)location0.getAccuracy()) < 25.0) && System.currentTimeMillis() - location0.getTime() < 60000L) {
                cqjq0.e();
                return;
            }
        }
        if(!cqjq0.d) {
            cqjq0.a(hltz.a, null);
        }
        cmoc cmoc0 = new cmoc(100, 0L);
        cmoc0.b(60000L);
        cmoc0.h(10);
        cmoc0.l(2);
        LocationRequest locationRequest0 = cmoc0.a();
        cqjq0.g.n(locationRequest0, cqjq0, cqjq0.c.getLooper());
    }
}

