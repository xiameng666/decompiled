import android.content.Context;
import android.os.Handler;
import com.google.android.gms.personalsafety.ars.utils.LockStateMonitor.LockStateReceiver;

public final class ehtz {
    public final Context a;
    public final LockStateMonitor.LockStateReceiver b;
    public final Handler c;
    public ehrl d;

    public ehtz(Context context0, Handler handler0) {
        this.a = context0;
        this.c = handler0;
        this.b = new LockStateMonitor.LockStateReceiver(this);
    }
}

