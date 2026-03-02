import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class crcf extends BroadcastReceiver {
    public final crkt a;

    public crcf(crkt crkt0) {
        this.a = crkt0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            this.a.aJ().f.a("App receiver called with null intent");
            return;
        }
        String s = intent0.getAction();
        if(s == null) {
            this.a.aJ().f.a("App receiver called with null action");
            return;
        }
        switch(s) {
            case "com.google.android.gms.measurement.BATCHES_AVAILABLE": {
                this.a.aJ().k.a("[sgtm] App Receiver notified batches are available");
                this.a.aK().f(new crce(this));
                return;
            }
            case "com.google.android.gms.measurement.TRIGGERS_AVAILABLE": {
                crkt crkt0 = this.a;
                hvhs.c();
                if(!crkt0.d.t(crif.aD)) {
                    return;
                }
                crkt0.aJ().k.a("App receiver notified triggers are available");
                crkt0.aK().f(new crcd(crkt0));
                return;
            }
            default: {
                this.a.aJ().f.a("App receiver called with unknown action");
            }
        }
    }
}

