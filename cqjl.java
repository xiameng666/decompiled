import android.content.Context;
import android.content.Intent;
import com.google.android.gms.mdm.receivers.RetryAfterAlarmChimeraReceiver;
import j..util.Objects;

public final class cqjl implements Runnable {
    final Context a;

    public cqjl(RetryAfterAlarmChimeraReceiver retryAfterAlarmChimeraReceiver0, Context context0) {
        this.a = context0;
        Objects.requireNonNull(retryAfterAlarmChimeraReceiver0);
        super();
    }

    @Override
    public final void run() {
        hlud hlud0 = hlud.b(((Integer)cqix.k.c()).intValue());
        Context context0 = this.a;
        boolean z = cqqa.k(context0);
        boolean z1 = cqqg.a(context0);
        Intent intent0 = cqjv.b(context0, false, hlud0, hlud.l, z, z1);
        if(intent0 != null) {
            context0.startService(intent0);
        }
    }
}

