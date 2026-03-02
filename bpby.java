import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

public final class bpby implements Callable {
    public final bpce a;
    public final gmcd b;
    public final gmcd c;
    public final gsyz d;
    public final bpjm e;
    public final fqus f;
    public final gszr g;
    public final gfsx h;

    public bpby(bpce bpce0, gmcd gmcd0, gmcd gmcd1, gsyz gsyz0, bpjm bpjm0, fqus fqus0, gszr gszr0, gfsx gfsx0) {
        this.a = bpce0;
        this.b = gmcd0;
        this.c = gmcd1;
        this.d = gsyz0;
        this.e = bpjm0;
        this.f = fqus0;
        this.g = gszr0;
        this.h = gfsx0;
    }

    @Override
    public final Object call() {
        Object object0 = Boolean.valueOf(false);
        if(((Boolean)gmbu.r(this.b)).booleanValue() && !((Boolean)gmbu.r(this.c)).booleanValue()) {
            bpjm bpjm0 = this.e;
            gsyz gsyz0 = this.d;
            bpce bpce0 = this.a;
            Context context0 = bpce0.q;
            gfsx gfsx0 = this.f.g;
            Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.e2ee.RotateDeviceKeysIntentOperation", "com.google.android.gms.findmydevice.spot.e2ee.ROTATE_DEVICE_KEYS");
            if(intent0 != null) {
                intent0.putExtra("device_id", gsyz0.b);
                intent0.putExtra("sighted_eid", bpjm0.a.toByteArray());
                intent0.putExtra("trackable_components", this.g.a());
                if(gfsx0.i()) {
                    intent0.putExtra("component_set", ((fquo)gfsx0.d()).f);
                }
                gfsx gfsx1 = this.h;
                if(gfsx1.i()) {
                    intent0.putExtra("ble_mac_address", ((String)gfsx1.d()));
                }
            }
            if(intent0 == null) {
                ((ggtj)((ggtj)bpce0.b.j()).ar(4902)).B("Failed creating a secrets rotation intent for %s", gsyz0.b);
                return object0;
            }
            context0.startService(intent0);
            return Boolean.valueOf(true);
        }
        return object0;
    }
}

