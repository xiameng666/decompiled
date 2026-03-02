import android.content.Context;
import android.util.Log;
import j..time.Duration;

final class azgr extends azgt {
    public azgr(Context context0, bbng bbng0, gful_cronetEngineProvider gful0) {
        super(context0, gful0);
    }

    @Override  // azgt
    public final boolean a(boolean z, azdl azdl0) {
        int v = azib.a(this.a);
        if(this.c()) {
            Log.i("BatteryAwareTC-CC", "2: charging, allowed");
            azdl0.b("BatteryAwareArm2IsCharging");
            return true;
        }
        hraz hraz0 = hraz.a;
        if(((long)v) > hraz0.e().d()) {
            Log.i("BatteryAwareTC-CC", "2: over level 1, allowed");
            azdl0.b("BatteryAwareArm2L1Allowed");
            return true;
        }
        long v1 = this.b();
        long v2 = azgr.e() - v1;
        if(v2 >= Duration.ofHours(hraz.c()).toMillis()) {
            Log.i("BatteryAwareTC-CC", "2: day complete, allowed");
            azdl0.b("BatteryAwareArm2EODAllowed");
            return true;
        }
        boolean z1 = this.d();
        if(Long.compare(v, hraz0.e().e()) > 0 && !z1) {
            if(v2 >= Duration.ofHours(hraz0.e().a()).toMillis()) {
                Log.i("BatteryAwareTC-CC", "2: over level 2, allowed");
                azdl0.b("BatteryAwareArm2L2Allowed");
                return true;
            }
            Log.i("BatteryAwareTC-CC", "2: over level 2, in backoff, not allowed");
            azdl0.b("BatteryAwareArm2L2Backoff");
            return false;
        }
        if(((long)v) > hraz0.e().f() && !z1) {
            if(v2 >= Duration.ofHours(hraz0.e().b()).toMillis()) {
                Log.i("BatteryAwareTC-CC", "2: over level 3, allowed");
                azdl0.b("BatteryAwareArm2L3Allowed");
                return true;
            }
            Log.i("BatteryAwareTC-CC", "2: over level 3, in backoff, not allowed");
            azdl0.b("BatteryAwareArm2L3Backoff");
            return false;
        }
        if(z1) {
            Log.i("BatteryAwareTC-CC", "2: power save mode");
            azdl0.b("BatteryAwareArm2PowerSave");
        }
        if(v2 >= Duration.ofHours(hraz0.e().c()).toMillis()) {
            Log.i("BatteryAwareTC-CC", "2: over level 4, allowed");
            azdl0.b("BatteryAwareArm2L4Allowed");
            return true;
        }
        Log.i("BatteryAwareTC-CC", "2: over level 4, in backoff, not allowed");
        azdl0.b("BatteryAwareArm2L4Backoff");
        return false;
    }
}

