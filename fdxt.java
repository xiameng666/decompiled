import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.wearable.node.NodeService.ListenerNotifyHandler.1;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class fdxt extends clht {
    public long a;
    final fdxu c;
    private final PendingIntent d;
    private final bbib e;
    private final Object f;

    public fdxt(fdxu fdxu0, Context context0, Looper looper0) {
        Objects.requireNonNull(fdxu0);
        this.c = fdxu0;
        super(looper0);
        this.f = new Object();
        this.a = -1L;
        this.d = PendingIntent.getBroadcast(context0, 0x8000000, new Intent("com.google.android.gms.wearable.node.ALARM_PROCESS_CONNECTIVITY_CHANGES").setPackage("com.google.android.gms"), 0x4000000);
        this.e = new bbib(context0);
        jwe.b(context0, new NodeService.ListenerNotifyHandler.1(this), new IntentFilter("com.google.android.gms.wearable.node.ALARM_PROCESS_CONNECTIVITY_CHANGES"), 4);
    }

    public final void b(int v, long v1) {
        if(Log.isLoggable("NodeService", 3)) {
            Log.d("NodeService", a.u(v1, "schedule notifying listeners with delay: "));
        }
        synchronized(this.f) {
            long v3 = this.a;
            if(v3 <= 0L || v == 1) {
                v3 = SystemClock.elapsedRealtime();
                this.a = v3;
            }
            this.e.d("NodeService", 2, v1 + v3, this.d, "com.google.android.gms");
        }
    }

    public final void c() {
        this.c.m.obtainMessage(3).sendToTarget();
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        ArrayList arrayList1;
        Set set1;
        Set set0;
        if(message0.what == 3) {
            synchronized(this.f) {
                this.e.a(this.d);
                this.a = -1L;
            }
            fdxu fdxu0 = this.c;
            synchronized(fdxu0.d) {
                ArrayList arrayList0 = fdxu0.i;
                if(arrayList0.isEmpty()) {
                    return;
                }
                gged_interceptors gged0 = gged_interceptors.i(arrayList0);
                fdyq fdyq0 = fdxu0.g;
                set0 = fdyq0.c();
                for(Object object1: arrayList0) {
                    fdxs fdxs0 = (fdxs)object1;
                    if(fdxs0.a) {
                        if(Log.isLoggable("NodeService", 3)) {
                            Log.d("NodeService", "processConnectivityChanges: adding connection to " + fdxs0.b.a);
                        }
                        fdyp fdyp0 = new fdyp(fdxs0.b, fdxs0.c);
                        fdxu0.h.put(fdxs0.b.a, fdyp0);
                    }
                    else {
                        if(Log.isLoggable("NodeService", 3)) {
                            Log.d("NodeService", "processConnectivityChanges: removing connection from " + fdxs0.d);
                        }
                        Map map0 = fdxu0.h;
                        fdyp fdyp1 = (fdyp)map0.get(fdxs0.d);
                        fdxn fdxn0 = fdyp1 == null ? null : fdyp1.a;
                        if(fdxn0 == null) {
                            continue;
                        }
                        map0.remove(fdxn0.a);
                    }
                }
                arrayList0.clear();
                fdxu0.u();
                fdxu0.r();
                fdxn fdxn1 = fdxu0.a();
                Collection collection0 = fdxu0.h.values();
                fdyq0.g(fdxn1, fdxu0.n, collection0);
                set1 = fdyq0.c();
                arrayList1 = new ArrayList(fdxu0.e);
            }
            Set set2 = fdxu0.f;
            if(!set2.isEmpty()) {
                for(Object object2: gged0) {
                    fdxs fdxs1 = (fdxs)object2;
                    boolean z = fdxs1.a;
                    String s = z ? fdxs1.b.a : fdxs1.d;
                    if(!s.equals("cloud")) {
                        if(Log.isLoggable("NodeService", 3)) {
                            Log.d("NodeService", "notifyInternalListeners: onNearbyNodeChanged: nodeId=" + s + ", isNearby=" + z);
                        }
                        for(Object object3: set2) {
                            ((fdui)object3).a(s, z);
                        }
                    }
                }
            }
            fdxu.s(arrayList1, set0, set1);
            ((fdue)fdxu0.k.get()).J();
        }
    }
}

