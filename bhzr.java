import android.app.BackgroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public final class bhzr extends BroadcastReceiver {
    public bhzr() {
    }

    public bhzr(byte[] arr_b) {
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        String s = intent0.getStringExtra("com.google.android.gms.dtdi.core.extra.SERVICE_COMPONENT");
        ComponentName componentName0 = s == null ? null : ComponentName.unflattenFromString(s);
        if(componentName0 == null) {
            Log.e("Dtdi.RoutingReceiver", "No component found in intent; not starting service");
            return;
        }
        try {
            Log.i("Dtdi.RoutingReceiver", "Starting service: " + componentName0);
            Intent intent1 = new Intent().setComponent(componentName0).addFlags(4);
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                intent1.putExtras(bundle0);
            }
            ibuq.e(intent1, "apply(...)");
            ibuq.f(context0, "context");
            ibuq.f(intent1, "intent");
            context0.startService(intent1);
        }
        catch(SecurityException securityException0) {
            Log.e("Dtdi.RoutingReceiver", "Failed to start service due to security exception", securityException0);
        }
        catch(IllegalStateException illegalStateException0) {
            if((illegalStateException0 instanceof BackgroundServiceStartNotAllowedException)) {
                Log.e("Dtdi.RoutingReceiver", "Failed to start service due to background service start not allowed", illegalStateException0);
            }
        }
    }
}

