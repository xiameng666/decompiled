import android.content.Context;
import android.content.Intent;
import com.google.android.gms.personalsafety.utils.LocalBroadcastReceiver;

public final class eieq implements eift {
    private final Context a;

    public eieq(Context context0) {
        this.a = context0;
    }

    @Override  // eift
    public final void a(gwgu gwgu0) {
        if(gwgu0 == gwgu.e) {
            Intent intent0 = new Intent("com.google.android.personalsafety.internal.scanners.PRE_RINGING_SCAN_STOPPED");
            LocalBroadcastReceiver.c(this.a, intent0);
        }
    }

    @Override  // eift
    public final void b(gwgx gwgx0, gwgx gwgx1, eigg eigg0) {
        if(gwgx1 != null && (gwgu.b(gwgx1.g) == null ? gwgu.a : gwgu.b(gwgx1.g)) == gwgu.e) {
            Intent intent0 = new Intent("com.google.android.personalsafety.internal.scanners.PRE_RINGING_SCAN_TAG_DETECTED").putExtra("MAC_ADDRESS_INTENT_KEY", gwgx1.c).putExtra("DEVICE_TYPE_INTENT_KEY", gwgx1.h).putExtra("CONNECTION_STATUS_INTENT_KEY", gwgx1.i).putExtra("RSSI_INTENT_KEY", gwgx1.d);
            LocalBroadcastReceiver.c(this.a, intent0);
        }
    }

    @Override  // eift
    public final void d(int v) {
    }
}

