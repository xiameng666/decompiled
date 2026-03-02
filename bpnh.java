import android.content.Context;
import android.content.Intent;

@ibnh
public final class bpnh {
    public final Context a;

    public bpnh(Context context0) {
        this.a = context0;
    }

    public final void a() {
        if(hsww.a.b().f() && !bpsq.h(this.a)) {
            return;
        }
        Intent intent0 = new Intent().setClassName(this.a, "com.google.android.gms.findmydevice.spot.bleadvertising.OfflineBeaconService_Persistent");
        this.a.startService(intent0);
    }
}

