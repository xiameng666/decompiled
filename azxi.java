import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class azxi implements aztu, aztv, azvt {
    public final Queue a;
    public final azsz b;
    public final azux c;
    public final Set d;
    public final Map e;
    public final int f;
    public boolean g;
    public final List h;
    public ConnectionResult i;
    public int j;
    final azxm k;
    private final azwb l;
    private final azyv m;

    public azxi(azxm azxm0, azts azts0) {
        Objects.requireNonNull(azxm0);
        this.k = azxm0;
        super();
        this.a = new LinkedList();
        this.d = new HashSet();
        this.e = new HashMap();
        this.h = new ArrayList();
        this.i = null;
        this.j = 0;
        Looper looper0 = azxm0.n.getLooper();
        baqv baqv0 = azts0.iE().a();
        batl.s(azts0.y.b);
        azsz azsz0 = azts0.y.b.b(azts0.v, looper0, baqv0, azts0.z, this, this);
        bbso bbso0 = azts0.x;
        if(bbso0 == null) {
            String s = azts0.w;
            if(s != null) {
                ((baqp)azsz0).D = s;
            }
        }
        else {
            ((baqp)azsz0).E = bbso0;
        }
        this.b = azsz0;
        this.c = azts0.A;
        this.l = new azwb();
        this.f = azts0.C;
        if(azsz0.gb()) {
            baqv baqv1 = azts0.iE().a();
            this.m = new azyv(azxm0.g, azxm0.n, baqv1);
            return;
        }
        this.m = null;
    }

    public final void a() {
        batl.e(this.k.n);
        this.i = null;
    }

    public final void b() {
        azxm azxm0 = this.k;
        batl.e(azxm0.n);
        azsz azsz0 = this.b;
        if(!azsz0.A() && !azsz0.B()) {
            try {
                int v = azxm0.i.a(azxm0.g, azsz0);
                if(v != 0) {
                    ConnectionResult connectionResult0 = new ConnectionResult(v, null);
                    Log.w("GoogleApiManager", "The service for " + azsz0.getClass().getName() + " is not available: " + connectionResult0.toString());
                    this.onConnectionFailed(connectionResult0);
                    return;
                }
            }
            catch(IllegalStateException illegalStateException0) {
                this.g(new ConnectionResult(10), illegalStateException0);
                return;
            }
            azsz azsz1 = this.b;
            azxl azxl0 = new azxl(this.k, azsz1, this.c);
            if(azsz1.gb()) {
                azyv azyv0 = this.m;
                batl.s(azyv0);
                epui epui0 = azyv0.e;
                if(epui0 != null) {
                    epui0.m();
                }
                azyv0.d.h = System.identityHashCode(azyv0);
                Handler handler0 = azyv0.b;
                Looper looper0 = handler0.getLooper();
                azyv0.e = (epui)azyv0.g.b(azyv0.a, looper0, azyv0.d, azyv0.d.g, azyv0, azyv0);
                azyv0.f = azxl0;
                if(azyv0.c != null && !azyv0.c.isEmpty()) {
                    azyv0.e.s();
                }
                else {
                    handler0.post(new azyt(azyv0));
                }
            }
            try {
                azsz1.x(azxl0);
            }
            catch(SecurityException securityException0) {
                this.g(new ConnectionResult(10), securityException0);
            }
        }
    }

    public final void c(azuv azuv0) {
        batl.e(this.k.n);
        if(this.b.A()) {
            this.t(azuv0);
            this.r();
            return;
        }
        this.a.add(azuv0);
        ConnectionResult connectionResult0 = this.i;
        if(connectionResult0 != null && connectionResult0.c()) {
            this.onConnectionFailed(connectionResult0);
            return;
        }
        this.b();
    }

    public final void d(Status status0) {
        batl.e(this.k.n);
        this.q(status0, null, false);
    }

    public final void e() {
        Queue queue0 = this.a;
        ArrayList arrayList0 = new ArrayList(queue0);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            azuv azuv0 = (azuv)arrayList0.get(v1);
            if(!this.b.A()) {
                break;
            }
            this.t(azuv0);
            queue0.remove(azuv0);
        }
    }

    public final void f() {
        this.a();
        this.p(ConnectionResult.a);
        this.k();
        Iterator iterator0 = this.e.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            azyl azyl0 = ((azym)object0).a;
            if(this.n(azyl0.b) == null) {
                try {
                    evqp evqp0 = new evqp();
                    azyl0.b(this.b, evqp0);
                    continue;
                }
                catch(DeadObjectException unused_ex) {
                    this.onConnectionSuspended(3);
                    this.b.y("DeadObjectException thrown while calling register listener method.");
                }
                catch(RuntimeException | RemoteException exception0) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", exception0);
                    iterator0.remove();
                    continue;
                }
                break;
            }
            iterator0.remove();
        }
        this.e();
        this.r();
    }

    public final void g(ConnectionResult connectionResult0, Exception exception0) {
        azxm azxm0 = this.k;
        Handler handler0 = azxm0.n;
        batl.e(handler0);
        azyv azyv0 = this.m;
        if(azyv0 != null) {
            epui epui0 = azyv0.e;
            if(epui0 != null) {
                epui0.m();
            }
        }
        this.a();
        azxm0.i.b();
        this.p(connectionResult0);
        if((this.b instanceof baum) && connectionResult0.c != 24) {
            azxm0.f = true;
            handler0.sendMessageDelayed(handler0.obtainMessage(19), 300000L);
        }
        int v = connectionResult0.c;
        switch(v) {
            case 4: {
                this.d(azxm.b);
                return;
            }
            case 25: {
                this.d(this.o(connectionResult0));
                return;
            }
            default: {
                Queue queue0 = this.a;
                if(queue0.isEmpty()) {
                    this.i = connectionResult0;
                    return;
                }
                if(exception0 != null) {
                    batl.e(handler0);
                    this.q(null, exception0, false);
                    return;
                }
                if(!azxm0.o) {
                    this.d(this.o(connectionResult0));
                    return;
                }
                this.q(this.o(connectionResult0), null, true);
                if(!queue0.isEmpty()) {
                    synchronized(azxm.c) {
                        if(azxm0.l != null && azxm0.m.contains(this.c)) {
                            azxm0.l.f(connectionResult0, this.f);
                            return;
                        }
                    }
                    if(!azxm0.m(connectionResult0, this.f)) {
                        if(v == 18) {
                            this.g = true;
                        }
                        if(this.g) {
                            handler0.sendMessageDelayed(Message.obtain(handler0, 9, this.c), 5000L);
                            return;
                        }
                        this.d(this.o(connectionResult0));
                    }
                }
            }
        }
    }

    public final void h(int v) {
        this.a();
        this.g = true;
        String s = this.b.v();
        StringBuilder stringBuilder0 = new StringBuilder("The connection to Google Play services was lost");
        if(v == 1) {
            stringBuilder0.append(" due to service disconnection.");
        }
        else if(v == 3) {
            stringBuilder0.append(" due to dead object exception.");
        }
        if(s != null) {
            stringBuilder0.append(" Last reason for disconnect: ");
            stringBuilder0.append(s);
        }
        this.l.a(true, new Status(20, stringBuilder0.toString()));
        Message message0 = Message.obtain(this.k.n, 9, this.c);
        this.k.n.sendMessageDelayed(message0, 5000L);
        Message message1 = Message.obtain(this.k.n, 11, this.c);
        this.k.n.sendMessageDelayed(message1, 120000L);
        this.k.i.b();
        for(Object object0: this.e.values()) {
            ((azym)object0).c.run();
        }
    }

    public final void i(ConnectionResult connectionResult0) {
        batl.e(this.k.n);
        String s = this.b.getClass().getName();
        this.b.y("onSignInFailed for " + s + " with " + connectionResult0);
        this.onConnectionFailed(connectionResult0);
    }

    public final void j() {
        batl.e(this.k.n);
        this.d(azxm.a);
        this.l.a(false, azxm.a);
        azyd_linstner[] arr_azyd = (azyd_linstner[])this.e.keySet().toArray(new azyd_linstner[0]);
        for(int v = 0; v < arr_azyd.length; ++v) {
            this.c(new azuu(arr_azyd[v], new evqp()));
        }
        this.p(new ConnectionResult(4));
        azsz azsz0 = this.b;
        if(azsz0.A()) {
            azsz0.E(new azxh(this));
        }
    }

    public final void k() {
        if(this.g) {
            this.k.n.removeMessages(11, this.c);
            this.k.n.removeMessages(9, this.c);
            this.g = false;
        }
    }

    public final boolean l() {
        return this.b.gb();
    }

    public final boolean m(boolean z) {
        batl.e(this.k.n);
        azsz azsz0 = this.b;
        if(azsz0.A() && this.e.isEmpty()) {
            if(this.l.a.isEmpty() && this.l.b.isEmpty()) {
                azsz0.y("Timing out service connection.");
                return true;
            }
            if(z) {
                this.r();
            }
        }
        return false;
    }

    private final Feature n(Feature[] arr_feature) {
        if(arr_feature != null && arr_feature.length != 0) {
            Feature[] arr_feature1 = this.b.D();
            int v = 0;
            if(arr_feature1 == null) {
                arr_feature1 = new Feature[0];
            }
            bxd bxd0 = new bxd(arr_feature1.length);
            for(int v1 = 0; v1 < arr_feature1.length; ++v1) {
                Feature feature0 = arr_feature1[v1];
                bxd0.put(feature0.a, Long.valueOf(feature0.a()));
            }
            while(v < arr_feature.length) {
                Feature feature1 = arr_feature[v];
                Long long0 = (Long)bxd0.get(feature1.a);
                if(long0 != null && ((long)long0) >= feature1.a()) {
                    ++v;
                    continue;
                }
                return feature1;
            }
        }
        return null;
    }

    private final Status o(ConnectionResult connectionResult0) {
        return azxm.b(this.c, connectionResult0);
    }

    @Override  // azvy
    public final void onConnected(Bundle bundle0) {
        Looper looper0 = Looper.myLooper();
        Handler handler0 = this.k.n;
        if(looper0 == handler0.getLooper()) {
            this.f();
            return;
        }
        handler0.post(new azxe(this));
    }

    @Override  // azyj
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        this.g(connectionResult0, null);
    }

    @Override  // azvy
    public final void onConnectionSuspended(int v) {
        Looper looper0 = Looper.myLooper();
        Handler handler0 = this.k.n;
        if(looper0 == handler0.getLooper()) {
            this.h(v);
            return;
        }
        handler0.post(new azxf(this, v));
    }

    private final void p(ConnectionResult connectionResult0) {
        Set set0 = this.d;
        for(Object object0: set0) {
            String s = bata.b(connectionResult0, ConnectionResult.a) ? this.b.u() : null;
            ((azva)object0).a(this.c, connectionResult0, s);
        }
        set0.clear();
    }

    private final void q(Status status0, Exception exception0, boolean z) {
        batl.e(this.k.n);
        if((status0 == null ? 1 : 0) == (exception0 == null ? 1 : 0)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator iterator0 = this.a.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            azuv azuv0 = (azuv)object0;
            if(!z || azuv0.c == 2) {
                if(status0 == null) {
                    azuv0.d(exception0);
                }
                else {
                    azuv0.c(status0);
                }
                iterator0.remove();
            }
        }
    }

    private final void r() {
        this.k.n.removeMessages(12, this.c);
        Message message0 = this.k.n.obtainMessage(12, this.c);
        this.k.n.sendMessageDelayed(message0, this.k.e);
    }

    private final void s(azuv azuv0) {
        boolean z = this.l();
        azuv0.f(this.l, z);
        try {
            azuv0.e(this);
        }
        catch(DeadObjectException unused_ex) {
            this.onConnectionSuspended(1);
            this.b.y("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void t(azuv azuv0) {
        if(!(azuv0 instanceof azup)) {
            this.s(azuv0);
            return;
        }
        Feature feature0 = this.n(((azup)azuv0).a(this));
        if(feature0 == null) {
            this.s(azuv0);
            return;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + feature0.a + ", " + feature0.a() + ").");
        ((azup)azuv0).d(new azuo(feature0));
    }
}

