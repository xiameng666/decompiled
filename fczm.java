import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import jeb.synthetic.FIN;

public class fczm extends Service implements fceb, fcef, fcep, fcfb, fcfd {
    private IBinder a;
    private Looper b;
    public ComponentName n;
    public fcyy o;
    public Intent p;
    public final Object q;
    public boolean r;
    public final fdfs s;

    public fczm() {
        this.q = new Object();
        this.s = new fdfs(new fceg(this));
    }

    @Override  // fcef
    public final void D(Channel channel0) {
    }

    @Override  // fcef
    public final void E(Channel channel0) {
    }

    @Override  // fcef
    public final void F(Channel channel0) {
    }

    @Override  // fcef
    public final void G(Channel channel0) {
    }

    @Override  // fcfb
    public void a(MessageEventParcelable messageEventParcelable0) {
    }

    @Override  // fceb
    public void b(fcee fcee0) {
    }

    public void c(NodeParcelable nodeParcelable0) {
    }

    public void d(NodeParcelable nodeParcelable0) {
    }

    @Override  // fcep
    public void gu(fcet fcet0) {
    }

    @Override  // fcfd
    public evql k(String s, String s1, byte[] arr_b) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        if(intent0 != null) {
            String s = intent0.getAction();
            if(s != null) {
                switch(s) {
                    case "com.google.android.gms.wearable.BIND_LISTENER": {
                        return this.a;
                    }
                    case "com.google.android.gms.wearable.CAPABILITY_CHANGED": {
                        return this.a;
                    }
                    case "com.google.android.gms.wearable.CHANNEL_EVENT": {
                        return this.a;
                    }
                    case "com.google.android.gms.wearable.DATA_CHANGED": {
                        return this.a;
                    }
                    case "com.google.android.gms.wearable.MESSAGE_RECEIVED": {
                        return this.a;
                    }
                    case "com.google.android.gms.wearable.NODE_MIGRATED": {
                        return this.a;
                    }
                    case "com.google.android.gms.wearable.REQUEST_RECEIVED": {
                        return this.a;
                    }
                }
                if(Log.isLoggable("WearableLS", 3)) {
                    Log.d("WearableLS", a.b(intent0, "onBind: Provided bind intent (", ") is not allowed"));
                    return null;
                }
            }
        }
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public void onCreate() {
        super.onCreate();
        this.n = avyl.a() >= 0x83 ? new ComponentName(this, this.getContainerServiceClassName()) : new ComponentName(this, this.getContainerService().getClass().getName());
        if(Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: " + this.n);
        }
        if(this.b == null) {
            HandlerThread handlerThread0 = new HandlerThread("WearableListenerService");
            handlerThread0.start();
            this.b = handlerThread0.getLooper();
        }
        this.o = new fcyy(this, this.b);
        Intent intent0 = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.p = intent0;
        intent0.setComponent(this.n);
        this.a = new fczl(this);
    }

    @Override  // com.google.android.chimera.Service
    public void onDestroy() {
        if(Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: " + this.n);
        }
        Object object0 = this.q;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        this.r = true;
        fcyy fcyy0 = this.o;
        if(fcyy0 != null) {
            fcyy0.getLooper().quit();
            fcyy0.b("quit");
            FIN.finallyCodeBegin$NT(v);
            super.onDestroy();
            return;
        }
        throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + this.n);
    }
}

