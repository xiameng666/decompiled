import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.ProvisionWearableDeviceRequest;
import j..time.Duration;
import java.util.concurrent.TimeoutException;

public final class bpsx implements bpnj {
    private final bpvx a;

    public bpsx(bpvx bpvx0) {
        this.a = bpvx0;
    }

    @Override  // bpnj
    public final gmcd a(Object object0) {
        if(!hsxd.d()) {
            return gmbu.h(new aztb(Status.g));
        }
        String s = ((ProvisionWearableDeviceRequest)object0).a;
        Duration duration0 = Duration.ofMillis(hsxd.b());
        bpxd bpxd0 = (bpxd)this.a;
        gdta gdta0 = gdta.g(bpxd0.c.d(s, duration0));
        bpww bpww0 = new bpww();
        gmap gmap0 = gmap.a;
        gdta gdta1 = gdta0.f(TimeoutException.class, bpww0, gmap0);
        gdta gdta2 = bpxd0.g(s);
        if(hsxl.h()) {
            Context context0 = bpxd0.g;
            Intent intent0 = boxr.b(context0);
            if(intent0 != null) {
                context0.startService(intent0);
            }
        }
        return gdta.g(gdtd.h(new gmcd[]{gdta2, gdta1}).b(new bpwx(gdta2), gmap0)).h(new bpsw(), gmap0);
    }
}

