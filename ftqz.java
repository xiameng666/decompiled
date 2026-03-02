import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.nfc.Tag;
import android.os.IBinder;
import j..time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ftqz implements ServiceConnection, AutoCloseable {
    public final Context a;
    public final ibts b;
    public final icgv c;
    public final AtomicBoolean d;
    private final ibrt e;

    public ftqz(Context context0, ibrt ibrt0, ibts ibts0) {
        ibuq.f(ibrt0, "coroutineContext");
        super();
        this.a = context0;
        this.e = ibrt0;
        this.b = ibts0;
        this.c = icgx.a(1, 0, null, 6);
        this.d = new AtomicBoolean(false);
    }

    public final Object a(Tag tag0, ftra ftra0, ibrl ibrl0) {
        ftqv ftqv0;
        if((ibrl0 instanceof ftqv)) {
            ftqv0 = (ftqv)ibrl0;
            int v = ftqv0.c;
            if((v & 0x80000000) == 0) {
                ftqv0 = new ftqv(this, ibrl0);
            }
            else {
                ftqv0.c = v - 0x80000000;
            }
        }
        else {
            ftqv0 = new ftqv(this, ibrl0);
        }
        Object object0 = ftqv0.a;
        Object object1 = ibrx.a;
        switch(ftqv0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    Duration duration0 = Duration.ofSeconds((ftra0.e == null ? hfst.a : ftra0.e).b, (ftra0.e == null ? hfst.a : ftra0.e).c);
                    ibuq.e(duration0, "ofSeconds(...)");
                    if(duration0.compareTo(Duration.ZERO) <= 0) {
                        throw new IllegalArgumentException("request.timeout must be positive, because we need to ensure that the isolated service cannot hold on the ability to perform NFC I/O indefinitely.");
                    }
                    ftqx ftqx0 = new ftqx(this, tag0, duration0, ftra0, null);
                    ftqv0.c = 1;
                    object0 = icto.a(duration0, ftqx0, ftqv0);
                    if(object0 == object1) {
                        return object1;
                    label_23:
                        ibnx.b(object0);
                    }
                    return (ftrc)object0;
                }
                catch(icfl unused_ex) {
                    break;
                }
            }
            case 1: {
                goto label_23;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ftre ftre0 = ftrd.a(((ProtoLiteMessage)ftrc.a).v_newBuilder());
        ftre0.c(ftrb.l);
        return ftre0.a();
    }

    @Override
    public final void close() {
        this.a.unbindService(this);
        icbb.b(iccl.b(this.e), null, null, new ftqu(this, null), 3);
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
        this.d.set(false);
    }

    @Override  // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
        this.d.set(false);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        ibuq.f(componentName0, "name");
        ibuq.f(iBinder0, "service");
        icbb.b(iccl.b(this.e), null, null, new ftqy(this, iBinder0, null), 3);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
        this.d.set(false);
    }
}

