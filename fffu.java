import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Set;

public final class fffu extends clil {
    public static final Set a;
    final String b;
    final fdpl c;
    final Intent d;
    final ComponentName e;
    public final ArrayDeque f;
    public final ffft g;
    public fdjb h;
    public Intent i;
    public boolean j;
    private final fffp k;

    static {
        fffu.a = ggog.h(new String[]{"com.google.android.gms.wearable.DATA_CHANGED", "com.google.android.gms.wearable.NODE_MIGRATED", "com.google.android.gms.wearable.CHANNEL_EVENT", "com.google.android.gms.wearable.REQUEST_RECEIVED", "com.google.android.gms.wearable.MESSAGE_RECEIVED", "com.google.android.gms.wearable.CAPABILITY_CHANGED"});
    }

    public fffu(ffft ffft0, String s, fffp fffp0) {
        super("wearable");
        this.f = new ArrayDeque();
        this.b = s;
        this.c = ffft0.c;
        ComponentName componentName0 = new ComponentName(ffft0.c.c, s);
        this.e = componentName0;
        this.d = new Intent("com.google.android.gms.wearable.BIND_LISTENER").setComponent(componentName0);
        this.g = ffft0;
        this.k = fffp0;
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "onServiceConnected: " + componentName0);
        }
        if(iBinder0 == null) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "onServiceConnected: Null binding attempted by " + componentName0);
            }
            this.k.b(this, 4).sendToTarget();
            return;
        }
        Message message0 = this.k.b(this, 2);
        message0.getData().putBinder("binder", iBinder0);
        message0.sendToTarget();
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "onServiceDisconnected: " + componentName0);
        }
        this.k.b(this, 3).sendToTarget();
    }

    public final ffgn c() {
        synchronized(this.f) {
        }
        return (ffgn)this.f.peek();
    }

    public final void d(ffgn ffgn0) {
        synchronized(this.f) {
            this.f.addFirst(ffgn0);
        }
    }

    public final void e(Context context0) {
        if(this.j) {
            try {
                context0.unbindService(this);
            }
            catch(IllegalArgumentException noSuchElementException0) {
                if(Log.isLoggable("WearableService", 3)) {
                    Log.d("WearableService", "unbindService: Attempt to unlink an unregistered recipient for binder death", noSuchElementException0);
                }
            }
            catch(NoSuchElementException unused_ex) {
            }
            this.j = false;
        }
        this.h = null;
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        if(Log.isLoggable("WearableService", 5)) {
            Log.w("WearableService", "onBindingDied: " + componentName0);
        }
        this.k.b(this, 3).sendToTarget();
    }

    @Override  // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName0) {
        if(Log.isLoggable("WearableService", 5)) {
            Log.w("WearableService", "onNullBinding: " + componentName0);
        }
        this.k.b(this, 4).sendToTarget();
    }

    @Override
    public final String toString() {
        boolean z;
        synchronized(this.f) {
            z = this.j;
        }
        return "ServiceRecord[" + ffmr.c(this.b, this.c.c) + ", events=" + this.f.size() + ", bound=" + z + ", namedBindIntent=" + this.i + ", " + this.f.toString() + "]";
    }
}

