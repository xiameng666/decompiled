import android.location.Location;
import com.google.android.gms.location.WifiScan;

public final class fvxv {
    final Location a;
    final boolean b;
    final boolean c;
    final boolean d;

    public fvxv(Location location0, boolean z) {
        this.a = location0;
        WifiScan wifiScan0 = cmol.c(location0);
        boolean z1 = false;
        boolean z2 = cmol.a(location0) == 1;
        this.c = !z2 && wifiScan0 != null && wifiScan0.c() > 0;
        if(!z2 && wifiScan0 == null) {
            z1 = true;
        }
        this.b = z1;
        this.d = z;
    }

    final boolean a() {
        return this.b() == 2;
    }

    final int b() {
        int v = cmol.a(this.a);
        if(v != 1) {
            switch(v) {
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                default: {
                    return 1;
                }
            }
        }
        return 2;
    }
}

