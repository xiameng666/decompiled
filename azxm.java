import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class azxm implements Handler.Callback {
    public static final Status a;
    public static final Status b;
    public static final Object c;
    public static azxm d;
    public long e;
    public boolean f;
    public final Context g;
    public final azpm h;
    public final barv i;
    public final AtomicInteger j;
    public final Map k;
    public azwc l;
    public final Set m;
    public final Handler n;
    public volatile boolean o;
    private static volatile boolean p;
    private TelemetryData q;
    private batw r;
    private final AtomicInteger s;
    private final Set t;

    static {
        azxm.a = new Status(4, "Sign-out occurred while this API call was in progress.");
        azxm.b = new Status(4, "The user must be signed in to make this API call.");
        azxm.c = new Object();
        azxm.p = false;
    }

    private azxm(Context context0, Looper looper0, azpm azpm0) {
        this.e = 10000L;
        this.f = false;
        this.s = new AtomicInteger(1);
        this.j = new AtomicInteger(0);
        this.k = new ConcurrentHashMap(5, 0.75f, 1);
        this.l = null;
        this.m = new bxf();
        this.t = new bxf();
        this.o = true;
        this.g = context0;
        clht clht0 = new clht(looper0, this);
        this.n = clht0;
        this.h = azpm0;
        this.i = new barv(azpm0);
        clht0.sendMessage(clht0.obtainMessage(6));
    }

    public final int a() {
        return this.s.getAndIncrement();
    }

    public static Status b(azux azux0, ConnectionResult connectionResult0) {
        return new Status(connectionResult0, "API: " + azux0.a() + " is not available on this device. Connection failed with: " + connectionResult0);
    }

    final azxi c(azux azux0) {
        return (azxi)this.k.get(azux0);
    }

    public static azxm d(Context context0) {
        synchronized(azxm.c) {
            if(azxm.d == null) {
                Looper looper0 = baro.a().getLooper();
                azxm.d = new azxm(context0.getApplicationContext(), looper0, azpm.a);
            }
        }
        return azxm.d;
    }

    public final evql e(azts azts0, azyl azyl0, azzi azzi0, Runnable runnable0) {
        evqp evqp0 = new evqp();
        this.f(evqp0, azyl0.c, azts0);
        azyk azyk0 = new azyk(new azus(new azym(azyl0, azzi0, runnable0), evqp0), this.j.get(), azts0);
        Message message0 = this.n.obtainMessage(8, azyk0);
        this.n.sendMessage(message0);
        return evqp0.a;
    }

    public final void f(evqp evqp0, int v, azts azts0) {
        azxm azxm0;
        String s1;
        long v4;
        long v3;
        if(v != 0) {
            azux azux0 = azts0.A;
            evpz evpz0 = null;
            if(this.l()) {
                RootTelemetryConfiguration rootTelemetryConfiguration0 = batr.a().a;
                boolean z = true;
                if(rootTelemetryConfiguration0 == null) {
                label_29:
                    long v1 = 0L;
                    azvq azvq0 = azvr.a();
                    if(azvq0 == null || !azvq0.b) {
                        long v2 = z ? System.currentTimeMillis() : 0L;
                        if(z) {
                            v1 = SystemClock.elapsedRealtime();
                        }
                        String s = azvq0 == null ? null : azvq0.a;
                        if(azvq0 == null) {
                            v3 = v1;
                            v4 = v2;
                            s1 = null;
                        }
                        else {
                            v3 = v1;
                            v4 = v2;
                            s1 = azvq0.c;
                        }
                        azxm0 = this;
                        evpz0 = new azyh(azxm0, v, azux0, v4, v3, s, s1);
                    }
                    else {
                        azxm0 = this;
                    }
                }
                else if(rootTelemetryConfiguration0.b) {
                    boolean z1 = rootTelemetryConfiguration0.c;
                    azxi azxi0 = this.c(azux0);
                    if(azxi0 == null) {
                        z = z1;
                        goto label_29;
                    }
                    else {
                        azsz azsz0 = azxi0.b;
                        if(!(azsz0 instanceof baqp)) {
                            azxm0 = this;
                        }
                        else if(((baqp)azsz0).T() && !((baqp)azsz0).B()) {
                            ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = azyh.b(azxi0, ((baqp)azsz0), v);
                            if(connectionTelemetryConfiguration0 == null) {
                                azxm0 = this;
                            }
                            else {
                                ++azxi0.j;
                                z = connectionTelemetryConfiguration0.c;
                                goto label_29;
                            }
                        }
                        else {
                            z = z1;
                            goto label_29;
                        }
                    }
                }
                else {
                    azxm0 = this;
                }
            }
            else {
                azxm0 = this;
            }
            if(evpz0 != null) {
                Objects.requireNonNull(azxm0.n);
                azxc azxc0 = new azxc(azxm0.n);
                evqp0.a.s(azxc0, evpz0);
            }
        }
    }

    public final void g(ConnectionResult connectionResult0, int v) {
        if(!this.m(connectionResult0, v)) {
            Message message0 = this.n.obtainMessage(5, v, 0, connectionResult0);
            this.n.sendMessage(message0);
        }
    }

    public final void h() {
        Message message0 = this.n.obtainMessage(3);
        this.n.sendMessage(message0);
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        long v = 300000L;
        azxi azxi0 = null;
        switch(message0.what) {
            case 1: {
                if(((Boolean)message0.obj).booleanValue()) {
                    v = 10000L;
                }
                this.e = v;
                Handler handler0 = this.n;
                handler0.removeMessages(12);
                for(Object object0: this.k.keySet()) {
                    handler0.sendMessageDelayed(handler0.obtainMessage(12, ((azux)object0)), this.e);
                }
                return true;
            }
            case 2: {
                azva azva0 = (azva)message0.obj;
                for(Object object1: azva0.a.keySet()) {
                    azux azux0 = (azux)object1;
                    azxi azxi1 = (azxi)this.k.get(azux0);
                    if(azxi1 == null) {
                        azva0.a(azux0, new ConnectionResult(13), null);
                        return true;
                    }
                    azsz azsz0 = azxi1.b;
                    if(azsz0.A()) {
                        String s = azsz0.u();
                        azva0.a(azux0, ConnectionResult.a, s);
                    }
                    else {
                        Handler handler1 = azxi1.k.n;
                        batl.e(handler1);
                        ConnectionResult connectionResult0 = azxi1.i;
                        if(connectionResult0 == null) {
                            batl.e(handler1);
                            azxi1.d.add(azva0);
                            azxi1.b();
                        }
                        else {
                            azva0.a(azux0, connectionResult0, null);
                        }
                    }
                }
                return true;
            }
            case 3: {
                for(Object object2: this.k.values()) {
                    ((azxi)object2).a();
                    ((azxi)object2).b();
                }
                return true;
            }
            case 5: {
                int v1 = message0.arg1;
                ConnectionResult connectionResult1 = (ConnectionResult)message0.obj;
                for(Object object3: this.k.values()) {
                    azxi azxi3 = (azxi)object3;
                    if(azxi3.f == v1) {
                        azxi0 = azxi3;
                        break;
                    }
                }
                if(azxi0 != null) {
                    if(connectionResult1.c == 13) {
                        azxi0.d(new Status(17, "Error resolution was canceled by the user, original error message: CANCELED: " + connectionResult1.e));
                        return true;
                    }
                    azxi0.d(azxm.b(azxi0.c, connectionResult1));
                    return true;
                }
                Log.wtf("GoogleApiManager", a.f(v1, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                return true;
            }
            case 6: {
                Context context0 = this.g;
                if((context0.getApplicationContext() instanceof Application)) {
                    Application application0 = (Application)context0.getApplicationContext();
                    azvb azvb0 = azvb.a;
                    synchronized(azvb0) {
                        if(!azvb0.e) {
                            application0.registerActivityLifecycleCallbacks(azvb0);
                            application0.registerComponentCallbacks(azvb0);
                            azvb0.e = true;
                        }
                    }
                    azvb azvb1 = azvb.a;
                    azxd azxd0 = new azxd(this);
                    synchronized(azvb1) {
                        azvb1.d.add(azxd0);
                    }
                    AtomicBoolean atomicBoolean0 = azvb1.c;
                    if(atomicBoolean0.get()) {
                    label_106:
                        if(!azvb1.b.get()) {
                            this.e = 300000L;
                            return true;
                        }
                    }
                    else if(!bbqc.h()) {
                        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
                        if(!atomicBoolean0.getAndSet(true) && activityManager$RunningAppProcessInfo0.importance > 100) {
                            azvb1.b.set(true);
                        }
                        goto label_106;
                    }
                }
                return true;
            }
            case 7: {
                this.n(((azts)message0.obj));
                return true;
            }
            case 9: {
                Map map0 = this.k;
                if(map0.containsKey(message0.obj)) {
                    azxi azxi4 = (azxi)map0.get(message0.obj);
                    batl.e(azxi4.k.n);
                    if(azxi4.g) {
                        azxi4.b();
                        return true;
                    }
                }
                return true;
            }
            case 10: {
                Set set0 = this.t;
                bxe bxe0 = new bxe(((bxf)set0));
                while(bxe0.hasNext()) {
                    Object object4 = bxe0.next();
                    azxi azxi5 = (azxi)this.k.remove(((azux)object4));
                    if(azxi5 != null) {
                        azxi5.j();
                    }
                }
                set0.clear();
                return true;
            }
            case 11: {
                Map map1 = this.k;
                if(map1.containsKey(message0.obj)) {
                    azxi azxi6 = (azxi)map1.get(message0.obj);
                    azxm azxm0 = azxi6.k;
                    batl.e(azxm0.n);
                    if(azxi6.g) {
                        azxi6.k();
                        azxi6.d((azxm0.h.m(azxm0.g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error.")));
                        azxi6.b.y("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            }
            case 12: {
                Map map2 = this.k;
                if(map2.containsKey(message0.obj)) {
                    ((azxi)map2.get(message0.obj)).m(true);
                    return true;
                }
                return true;
            }
            case 4: 
            case 8: 
            case 13: {
                azyk azyk0 = (azyk)message0.obj;
                azts azts0 = azyk0.c;
                azxi azxi2 = (azxi)this.k.get(azts0.A);
                if(azxi2 == null) {
                    azxi2 = this.n(azts0);
                }
                if(azxi2.l() && this.j.get() != azyk0.b) {
                    azyk0.a.c(azxm.a);
                    azxi2.j();
                    return true;
                }
                azxi2.c(azyk0.a);
                return true;
            }
            case 14: {
                azwd azwd0 = (azwd)message0.obj;
                azux azux1 = azwd0.a;
                Map map3 = this.k;
                if(!map3.containsKey(azux1)) {
                    azwd0.b.b(Boolean.valueOf(false));
                    return true;
                }
                boolean z = ((azxi)map3.get(azux1)).m(false);
                azwd0.b.b(Boolean.valueOf(z));
                return true;
            }
            case 15: {
                azxj azxj0 = (azxj)message0.obj;
                Map map4 = this.k;
                if(map4.containsKey(null)) {
                    azxi azxi7 = (azxi)map4.get(null);
                    if(azxi7.h.contains(azxj0) && !azxi7.g) {
                        if(!azxi7.b.A()) {
                            azxi7.b();
                            return true;
                        }
                        azxi7.e();
                        return true;
                    }
                }
                return true;
            }
            case 16: {
                azxj azxj1 = (azxj)message0.obj;
                Map map5 = this.k;
                if(map5.containsKey(null)) {
                    azxi azxi8 = (azxi)map5.get(null);
                    if(azxi8.h.remove(azxj1)) {
                        azxi8.k.n.removeMessages(15, azxj1);
                        azxi8.k.n.removeMessages(16, azxj1);
                        throw null;
                    }
                }
                return true;
            }
            case 17: {
                this.p();
                return true;
            }
            case 18: {
                azyi azyi0 = (azyi)message0.obj;
                long v3 = azyi0.c;
                if(v3 == 0L) {
                    List list0 = Arrays.asList(new MethodInvocation[]{azyi0.a});
                    TelemetryData telemetryData0 = new TelemetryData(azyi0.b, list0);
                    this.o().b(telemetryData0);
                    return true;
                }
                TelemetryData telemetryData1 = this.q;
                if(telemetryData1 != null) {
                    if(telemetryData1.a == azyi0.b && (telemetryData1.b == null || telemetryData1.b.size() < azyi0.d)) {
                        TelemetryData telemetryData2 = this.q;
                        MethodInvocation methodInvocation0 = azyi0.a;
                        if(telemetryData2.b == null) {
                            telemetryData2.b = new ArrayList();
                        }
                        telemetryData2.b.add(methodInvocation0);
                    }
                    else {
                        this.n.removeMessages(17);
                        this.p();
                    }
                }
                if(this.q == null) {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(azyi0.a);
                    this.q = new TelemetryData(azyi0.b, arrayList0);
                    Message message1 = this.n.obtainMessage(17);
                    this.n.sendMessageDelayed(message1, v3);
                    return true;
                }
                return true;
            }
            case 19: {
                this.f = false;
                return true;
            }
            default: {
                Log.w("GoogleApiManager", a.aG(message0, "Unknown message id: "));
                return false;
            }
        }
    }

    public final void i(azts azts0) {
        Message message0 = this.n.obtainMessage(7, azts0);
        this.n.sendMessage(message0);
    }

    public final void j(azwc azwc0) {
        synchronized(azxm.c) {
            if(this.l != azwc0) {
                this.l = azwc0;
                this.m.clear();
            }
            this.m.addAll(azwc0.a);
        }
    }

    public static void k() {
        synchronized(azxm.c) {
            azxm azxm0 = azxm.d;
            if(azxm0 != null) {
                azxm0.j.incrementAndGet();
                Message message0 = azxm0.n.obtainMessage(10);
                azxm0.n.sendMessageAtFrontOfQueue(message0);
            }
        }
    }

    final boolean l() {
        if(this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration0 = batr.a().a;
        if(rootTelemetryConfiguration0 != null && !rootTelemetryConfiguration0.b) {
            return false;
        }
        switch(this.i.c(203400000)) {
            case -1: 
            case 0: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    final boolean m(ConnectionResult connectionResult0, int v) {
        Context context0 = this.g;
        if(bbsp.a(context0)) {
            return false;
        }
        azpm azpm0 = this.h;
        PendingIntent pendingIntent0 = connectionResult0.c() ? connectionResult0.d : azpm0.l(context0, connectionResult0.c, null);
        if(pendingIntent0 != null) {
            PendingIntent pendingIntent1 = cjok.a(context0, 0, GoogleApiActivity.a(context0, pendingIntent0, v, true), 0xA000000);
            azpm0.g(context0, connectionResult0.c, null, pendingIntent1);
            return true;
        }
        return false;
    }

    private final azxi n(azts azts0) {
        Map map0 = this.k;
        azux azux0 = azts0.A;
        azxi azxi0 = (azxi)map0.get(azux0);
        if(azxi0 == null) {
            azxi0 = new azxi(this, azts0);
            map0.put(azux0, azxi0);
        }
        if(azxi0.l()) {
            this.t.add(azux0);
        }
        azxi0.b();
        return azxi0;
    }

    private final batw o() {
        if(this.r == null) {
            this.r = new baul(this.g, batx.a);
        }
        return this.r;
    }

    private final void p() {
        TelemetryData telemetryData0 = this.q;
        if(telemetryData0 != null) {
            if(telemetryData0.a > 0 || this.l()) {
                this.o().b(telemetryData0);
            }
            this.q = null;
        }
    }
}

