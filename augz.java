import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.cast.discovery.DiscoveryManager.DiscoveryManagerReceiver;

public final class augz implements Runnable {
    public final DiscoveryManager.DiscoveryManagerReceiver a;
    public final Intent b;

    public augz(DiscoveryManager.DiscoveryManagerReceiver discoveryManager$DiscoveryManagerReceiver0, Intent intent0) {
        this.a = discoveryManager$DiscoveryManagerReceiver0;
        this.b = intent0;
    }

    @Override
    public final void run() {
        Intent intent0 = this.b;
        if(intent0 != null) {
            auha auha0 = this.a.a;
            if(!auha0.r && (TextUtils.equals("android.intent.action.SCREEN_OFF", intent0.getAction()) || TextUtils.equals("android.intent.action.SCREEN_ON", intent0.getAction()))) {
                auha0.e(false);
            }
        }
    }
}

