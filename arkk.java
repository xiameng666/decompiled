import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;

public final class arkk {
    public final aqql a;
    public final ExecutorService b;
    public final ScheduledExecutorService c;
    public final AtomicReference d;
    public final gful_cronetEngineProvider e;
    public final gful_cronetEngineProvider f;
    public volatile sov g;
    private final Context h;
    private final ServiceConnection i;
    private final ExecutorService j;
    private final Queue k;
    private volatile boolean l;
    private final gful_cronetEngineProvider m;

    public arkk(Context context0, ExecutorService executorService0, ExecutorService executorService1, ScheduledExecutorService scheduledExecutorService0) {
        this.a = new aqql(new String[]{"P2PRServiceConnector"});
        this.d = new AtomicReference(null);
        this.k = new ArrayDeque();
        this.m = gfus.a(((gful_cronetEngineProvider)new arjz()));
        this.e = gfus.a(((gful_cronetEngineProvider)new arka()));
        this.f = gfus.a(((gful_cronetEngineProvider)new arkb()));
        this.h = context0;
        gftb.check(executorService0);
        this.b = executorService0;
        gftb.check(executorService1);
        this.j = executorService1;
        gftb.check(scheduledExecutorService0);
        this.c = scheduledExecutorService0;
        this.i = new arkh(this);
    }

    public final void a() {
        if(this.l) {
            this.a.d("#disconnect", new Object[0]);
            this.l = false;
            this.h.unbindService(this.i);
        }
    }

    public final void b(byte[] arr_b, ResultReceiver resultReceiver0, arkj arkj0) {
        synchronized(this) {
            this.a.d("enqueuing find compatible packages request", new Object[0]);
            Bundle bundle0 = new Bundle();
            bundle0.putByteArray("p2pdevicetoken", arr_b);
            bundle0.putParcelable("p2presultreceiver", resultReceiver0);
            bundle0.putString("request_id", "p2pfindcompatiblepackages");
            arki arki0 = new arki(bundle0, arkj0);
            this.k.add(arki0);
            this.c();
        }
    }

    public final void c() {
        synchronized(this) {
            while(true) {
                Queue queue0 = this.k;
                if(queue0.isEmpty() || !this.f()) {
                    break;
                }
                arki arki0 = (arki)queue0.poll();
                Bundle bundle0 = arki0.a;
                arkj arkj0 = arki0.b;
                if(!bundle0.getString("request_id").equals("p2pfindcompatiblepackages")) {
                    this.a.f("Unhandled type" + bundle0.toString(), new Object[0]);
                    return;
                }
                (((Boolean)this.m.mr()).booleanValue() ? this.j : this.b).execute(new arjy(this, bundle0, arkj0));
            }
        }
    }

    public final boolean d() {
        ScheduledFuture scheduledFuture0 = (ScheduledFuture)this.d.getAndSet(null);
        if(scheduledFuture0 == null) {
            return false;
        }
        this.a.d("Cancelling findCompatiblePackages timeout task.", new Object[0]);
        scheduledFuture0.cancel(false);
        return true;
    }

    public final boolean e() {
        Intent intent0 = new Intent();
        intent0.setPackage("com.android.vending");
        intent0.setAction("com.android.vending.setup.IPlayP2pRestoreService.BIND");
        aqql aqql0 = this.a;
        aqql0.d("#connect", new Object[0]);
        try {
            if(this.h.bindService(intent0, this.i, 1)) {
                this.l = true;
                this.c();
                return true;
            }
            this.l = false;
            aqql0.f("Play P2P Service wasn\'t found", new Object[0]);
        }
        catch(SecurityException securityException0) {
            this.l = false;
            this.a.g("Security exception occurred connecting to P2P Service.", securityException0, new Object[0]);
        }
        return false;
    }

    final boolean f() {
        return this.g != null && this.l;
    }
}

