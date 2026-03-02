import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.easyunlock.userpresence.UserPresenceUpdateIntentOperation;
import j..util.Objects;

public final class ajlv extends erzp {
    public final Context a;

    static {
        ajlr.a("DeviceStateChangeReceiver");
    }

    public ajlv(Context context0) {
        this.a = context0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        int v;
        String s = intent0.getAction();
        if(Objects.equals(s, "android.intent.action.SCREEN_ON")) {
            v = 1;
        }
        else if(Objects.equals(s, "android.intent.action.SCREEN_OFF")) {
            v = 2;
        }
        else {
            v = Objects.equals(s, "android.intent.action.USER_PRESENT") ? 3 : 0;
        }
        if(v != 0) {
            lnw.a(context0, UserPresenceUpdateIntentOperation.a(context0, v));
        }
    }
}

