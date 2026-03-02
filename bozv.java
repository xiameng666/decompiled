import android.content.Context;
import android.content.Intent;
import com.google.android.gms.findmydevice.spot.locationreporting.LocationReportUploadIntentOperation;

public final class bozv implements glzn {
    public final LocationReportUploadIntentOperation a;
    public final boolean b;
    public final String c;
    public final int d;

    public bozv(LocationReportUploadIntentOperation locationReportUploadIntentOperation0, boolean z, String s, int v) {
        this.a = locationReportUploadIntentOperation0;
        this.b = z;
        this.c = s;
        this.d = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        LocationReportUploadIntentOperation.d(bpkq.a(((boolean)(this.b ^ 1))), this.c, hadu.b, this.d);
        LocationReportUploadIntentOperation locationReportUploadIntentOperation0 = this.a;
        if(!hsxo.e()) {
            bozw bozw0 = new bozw();
            locationReportUploadIntentOperation0.f.a(bozw0);
        }
        if(((gteb)object0).b.isEmpty()) {
            return gmbx.a;
        }
        Context context0 = locationReportUploadIntentOperation0.g;
        Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.SightedDeviceInteractionIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.INTERACT_WITH_SIGHTED_DEVICE");
        if(intent0 == null) {
            return gmbx.a;
        }
        hfxk.l(intent0, "sighted_device_interactions", ((gteb)object0).b);
        context0.startService(intent0);
        return gmbx.a;
    }
}

