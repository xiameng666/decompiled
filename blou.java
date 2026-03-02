import android.content.Context;
import com.google.android.gms.fido.authenticator.autoenroll.UserPresenceBroadcastReceiver.1;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;

public final class blou {
    public static final bboh a;
    public final Context b;
    public final TracingBroadcastReceiver c;

    static {
        blou.a = bnaa.a("UserPresenceBroadcastReceiver");
    }

    public blou(Context context0, blot blot0) {
        this.b = context0;
        this.c = new UserPresenceBroadcastReceiver.1(this, blot0);
    }
}

