import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class azxp extends BroadcastReceiver {
    public Context a;
    private final azxo b;

    public azxp(azxo azxo0) {
        this.b = azxo0;
    }

    public final void a() {
        synchronized(this) {
            Context context0 = this.a;
            if(context0 != null) {
                context0.unregisterReceiver(this);
            }
            this.a = null;
        }
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        Uri uri0 = intent0.getData();
        if("com.google.android.gms".equals((uri0 == null ? null : uri0.getSchemeSpecificPart()))) {
            this.b.a();
            this.a();
        }
    }
}

