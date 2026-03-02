import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;
import java.util.concurrent.TimeoutException;

final class blth implements gmbg {
    final blti a;
    final bltc b;

    public blth(blti blti0, bltc bltc0) {
        this.b = bltc0;
        Objects.requireNonNull(blti0);
        this.a = blti0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        blti blti0 = this.a;
        TracingBroadcastReceiver tracingBroadcastReceiver0 = blti0.g;
        if(tracingBroadcastReceiver0 != null) {
            blti0.a.unregisterReceiver(tracingBroadcastReceiver0);
            blti0.g = null;
        }
        if((throwable0 instanceof TimeoutException)) {
            blti0.c.a();
            this.b.a(Integer.valueOf(16));
            return;
        }
        this.b.a(Integer.valueOf(8));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.b.a(((Integer)object0));
    }
}

