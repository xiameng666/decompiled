import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public final class azww extends aztw implements azxt {
    public final Lock b;
    public final barm c;
    public azxu d;
    public final Context e;
    public final Looper f;
    final Queue g;
    azxp h;
    final Map i;
    Set j;
    final baqv k;
    final Map l;
    final azzh m;
    final azsy n;
    private final int o;
    private volatile boolean p;
    private long q;
    private long r;
    private final azwu s;
    private final azpm t;
    private final azyg u;
    private final ArrayList v;
    private Integer w;
    private final barl x;

    public azww(Context context0, Lock lock0, Looper looper0, baqv baqv0, azpm azpm0, azsy azsy0, Map map0, List list0, List list1, Map map1, int v, int v1, ArrayList arrayList0) {
        this.d = null;
        this.g = new LinkedList();
        this.q = bbna.d() ? 10000L : 120000L;
        this.r = 5000L;
        this.j = new HashSet();
        this.u = new azyg();
        this.w = null;
        azwt azwt0 = new azwt(this);
        this.x = azwt0;
        this.e = context0;
        this.b = lock0;
        this.c = new barm(looper0, azwt0);
        this.f = looper0;
        this.s = new azwu(this, looper0);
        this.t = azpm0;
        this.o = v;
        if(v >= 0) {
            this.w = v1;
        }
        this.l = map0;
        this.i = map1;
        this.v = arrayList0;
        this.m = new azzh();
        for(Object object0: list0) {
            this.c.b(((aztu)object0));
        }
        for(Object object1: list1) {
            this.c.c(((aztv)object1));
        }
        this.k = baqv0;
        this.n = azsy0;
    }

    @Override  // aztw
    public final Looper a() {
        return this.f;
    }

    @Override  // aztw
    public final azsz b(azss azss0) {
        azsz azsz0 = (azsz)this.i.get(azss0);
        batl.t(azsz0, "Appropriate Api was not requested.");
        return azsz0;
    }

    @Override  // aztw
    public final azvc c(azvc azvc0) {
        batl.c(this.i.containsKey(azvc0.b), a.a((azvc0.c == null ? "the API" : azvc0.c.a), "GoogleApiClient is not configured to use ", " required for this call."));
        Lock lock0 = this.b;
        lock0.lock();
        try {
            azxu azxu0 = this.d;
            if(azxu0 == null) {
                this.g.add(azvc0);
            }
            else {
                azvc0 = azxu0.a(azvc0);
            }
        }
        catch(Throwable throwable0) {
            this.b.unlock();
            throw throwable0;
        }
        lock0.unlock();
        return azvc0;
    }

    @Override  // aztw
    public final azvc d(azvc azvc0) {
        azvc azvc2;
        azxu azxu0;
        batl.c(this.i.containsKey(azvc0.b), a.a((azvc0.c == null ? "the API" : azvc0.c.a), "GoogleApiClient is not configured to use ", " required for this call."));
        Lock lock0 = this.b;
        lock0.lock();
        try {
            azxu0 = this.d;
            if(azxu0 == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if(this.p) {
                Queue queue0 = this.g;
                queue0.add(azvc0);
                while(true) {
                    if(queue0.isEmpty()) {
                        goto label_14;
                    }
                    azvc azvc1 = (azvc)queue0.remove();
                    this.m.a(azvc1);
                    azvc1.a(Status.d);
                }
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
            this.b.unlock();
            throw throwable0;
        }
    label_14:
        lock0.unlock();
        return azvc0;
        try {
        label_16:
            azvc2 = azxu0.b(azvc0);
        }
        catch(Throwable throwable0) {
            this.b.unlock();
            throw throwable0;
        }
        this.b.unlock();
        return azvc2;
    }

    @Override  // aztw
    public final void f() {
        boolean z;
        azww azww0 = this;
        Lock lock0 = azww0.b;
        lock0.lock();
        try {
            if(azww0.o < 0) {
                Integer integer0 = azww0.w;
                if(integer0 == null) {
                    azww0.w = azww.p(azww0.i.values(), false);
                }
                else if(((int)integer0) == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            else {
                batl.m(azww0.w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            }
            Integer integer1 = azww0.w;
            batl.s(integer1);
            int v = (int)integer1;
            lock0.lock();
            switch(v) {
                case 2: {
                    v = 2;
                    z = true;
                    break;
                }
                case 1: 
                case 3: {
                    z = true;
                    break;
                }
                default: {
                    z = false;
                }
            }
            try {
                batl.c(z, "Illegal sign-in mode: " + v);
                Integer integer2 = azww0.w;
                if(integer2 == null) {
                    azww0.w = v;
                }
                else if(((int)integer2) != v) {
                    throw new IllegalStateException("Cannot use sign-in mode: " + azww.r(v) + ". Mode was already set to " + azww.r(azww0.w.intValue()));
                }
                if(azww0.d == null) {
                    Map map0 = azww0.i;
                    int v1 = 0;
                    int v2 = 0;
                    for(Object object0: map0.values()) {
                        v1 |= ((azsz)object0).gb();
                        v2 |= ((azsz)object0).k();
                    }
                    switch(((int)azww0.w)) {
                        case 1: {
                            if(v1 == 0) {
                                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                            }
                            if(v2 != 0) {
                                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                            }
                            azww0.d = new azxa(azww0.e, azww0, lock0, azww0.f, azww0.t, map0, azww0.k, azww0.l, azww0.n, azww0.v, this);
                            break;
                        }
                        case 2: {
                            if(v1 == 0) {
                                azww0.d = new azxa(azww0.e, azww0, lock0, azww0.f, azww0.t, map0, azww0.k, azww0.l, azww0.n, azww0.v, this);
                            }
                            else {
                                Context context0 = azww0.e;
                                Looper looper0 = azww0.f;
                                azpm azpm0 = azww0.t;
                                baqv baqv0 = azww0.k;
                                Map map1 = azww0.l;
                                azsy azsy0 = azww0.n;
                                ArrayList arrayList0 = azww0.v;
                                bxd bxd0 = new bxd();
                                bxd bxd1 = new bxd();
                                azsz azsz0 = null;
                                for(Iterator iterator1 = map0.entrySet().iterator(); iterator1.hasNext(); iterator1 = iterator1) {
                                    Object object1 = iterator1.next();
                                    Map.Entry map$Entry0 = (Map.Entry)object1;
                                    azsz azsz1 = (azsz)map$Entry0.getValue();
                                    if(azsz1.k()) {
                                        azsz0 = azsz1;
                                    }
                                    if(azsz1.gb()) {
                                        bxd0.put(((azss)map$Entry0.getKey()), azsz1);
                                    }
                                    else {
                                        bxd1.put(((azss)map$Entry0.getKey()), azsz1);
                                    }
                                }
                                batl.m(((boolean)(bxd0.isEmpty() ^ 1)), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                                bxd bxd2 = new bxd();
                                azsy azsy1 = azsy0;
                                bxd bxd3 = new bxd();
                                for(Object object2: map1.keySet()) {
                                    azta_api azta0 = (azta_api)object2;
                                    azss azss0 = azta0.c;
                                    if(bxd0.containsKey(azss0)) {
                                        bxd2.put(azta0, ((Boolean)map1.get(azta0)));
                                    }
                                    else {
                                        if(!bxd1.containsKey(azss0)) {
                                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                                        }
                                        bxd3.put(azta0, ((Boolean)map1.get(azta0)));
                                    }
                                    azsy1 = azsy1;
                                }
                                ArrayList arrayList1 = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                int v3 = arrayList0.size();
                                int v4 = 0;
                                while(v4 < v3) {
                                    try {
                                        azvs azvs0 = (azvs)arrayList0.get(v4);
                                        azta_api azta1 = azvs0.a;
                                        if(bxd2.containsKey(azta1)) {
                                            arrayList1.add(azvs0);
                                        }
                                        else {
                                            if(!bxd3.containsKey(azta1)) {
                                                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                                            }
                                            arrayList2.add(azvs0);
                                        }
                                        ++v4;
                                        context0 = context0;
                                    }
                                    catch(Throwable throwable1) {
                                        azww0 = this;
                                        goto label_115;
                                    }
                                }
                                azww0 = this;
                                azww0.d = new azvx(context0, azww0, lock0, looper0, azpm0, bxd0, bxd1, baqv0, azsy1, azsz0, arrayList1, arrayList2, bxd2, bxd3);
                            }
                            break;
                        }
                        default: {
                            azww0.d = new azxa(azww0.e, azww0, lock0, azww0.f, azww0.t, map0, azww0.k, azww0.l, azww0.n, azww0.v, this);
                        }
                    }
                }
                azww0.s();
                goto label_117;
            }
            catch(Throwable throwable1) {
            }
        label_115:
            azww0.b.unlock();
            throw throwable1;
        label_117:
            lock0.unlock();
        }
        catch(Throwable throwable0) {
            azww0.b.unlock();
            throw throwable0;
        }
        lock0.unlock();
    }

    @Override  // aztw
    public final void g() {
        Lock lock0 = this.b;
        lock0.lock();
        try {
            Set set0 = this.m.b;
            BasePendingResult[] arr_basePendingResult = (BasePendingResult[])set0.toArray(new BasePendingResult[0]);
            for(int v = 0; v < arr_basePendingResult.length; ++v) {
                BasePendingResult basePendingResult0 = arr_basePendingResult[v];
                basePendingResult0.q(null);
                synchronized(basePendingResult0.f) {
                    if(((aztw)basePendingResult0.h.get()) == null || !basePendingResult0.k) {
                        basePendingResult0.d();
                    }
                    boolean z = basePendingResult0.o();
                }
                if(z) {
                    set0.remove(basePendingResult0);
                }
            }
            azxu azxu0 = this.d;
            if(azxu0 != null) {
                azxu0.d();
            }
            Set set1 = this.u.a;
            for(Object object1: set1) {
                ((azyf)object1).a();
            }
            set1.clear();
            Queue queue0 = this.g;
            for(Object object2: queue0) {
                ((azvc)object2).q(null);
                ((azvc)object2).d();
            }
            queue0.clear();
            if(this.d != null) {
                this.u();
                this.c.a();
            }
        }
        catch(Throwable throwable0) {
            this.b.unlock();
            throw throwable0;
        }
        lock0.unlock();
    }

    @Override  // aztw
    public final void h(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.append(s).append("mContext=").println(this.e);
        printWriter0.append(s).append("mResuming=").print(this.p);
        printWriter0.append(" mWorkQueue.size()=").print(this.g.size());
        printWriter0.append(" mUnconsumedApiCalls.size()=").println(this.m.b.size());
        azxu azxu0 = this.d;
        if(azxu0 != null) {
            azxu0.e(s, fileDescriptor0, printWriter0, arr_s);
        }
    }

    @Override  // aztw
    public final void i() {
        azxu azxu0 = this.d;
        if(azxu0 != null) {
            azxu0.f();
        }
    }

    @Override  // aztw
    public final void j(aztu aztu0) {
        this.c.b(aztu0);
    }

    @Override  // aztw
    public final void k(aztv aztv0) {
        this.c.c(aztv0);
    }

    @Override  // aztw
    public final boolean l(azta_api azta0) {
        return this.i.containsKey(azta0.c);
    }

    @Override  // aztw
    public final boolean m(azta_api azta0) {
        if(!this.n()) {
            return false;
        }
        azsz azsz0 = (azsz)this.i.get(azta0.c);
        return azsz0 != null && azsz0.A();
    }

    @Override  // aztw
    public final boolean n() {
        return this.d != null && this.d.h();
    }

    @Override  // aztw
    public final boolean o(aied aied0) {
        return this.d != null && this.d.k(aied0);
    }

    public static int p(Iterable iterable0, boolean z) {
        int v = 0;
        int v1 = 0;
        for(Object object0: iterable0) {
            v |= ((azsz)object0).gb();
            v1 |= ((azsz)object0).k();
        }
        if(v != 0) {
            return v1 == 0 || !z ? 1 : 2;
        }
        return 3;
    }

    final String q() {
        StringWriter stringWriter0 = new StringWriter();
        this.h("", null, new PrintWriter(stringWriter0), null);
        return stringWriter0.toString();
    }

    static String r(int v) {
        switch(v) {
            case 1: {
                return "SIGN_IN_MODE_REQUIRED";
            }
            case 2: {
                return "SIGN_IN_MODE_OPTIONAL";
            }
            case 3: {
                return "SIGN_IN_MODE_NONE";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    public final void s() {
        this.c.e = true;
        azxu azxu0 = this.d;
        batl.s(azxu0);
        azxu0.c();
    }

    public final void t() {
        this.b.lock();
        try {
            if(this.p) {
                this.s();
            }
        }
        finally {
            this.b.unlock();
        }
    }

    final boolean u() {
        if(!this.p) {
            return false;
        }
        this.p = false;
        this.s.removeMessages(2);
        this.s.removeMessages(1);
        azxp azxp0 = this.h;
        if(azxp0 != null) {
            azxp0.a();
            this.h = null;
        }
        return true;
    }

    @Override  // azxt
    public final void v(ConnectionResult connectionResult0) {
        if(!azqk.f(this.e, connectionResult0.c)) {
            this.u();
        }
        if(!this.p) {
            barm barm0 = this.c;
            batl.f(barm0.h, "onConnectionFailure must only be called on the Handler thread");
            barm0.h.removeMessages(1);
            synchronized(barm0.i) {
                ArrayList arrayList0 = barm0.d;
                ArrayList arrayList1 = new ArrayList(arrayList0);
                AtomicInteger atomicInteger0 = barm0.f;
                int v1 = atomicInteger0.get();
                for(Object object1: arrayList1) {
                    aztv aztv0 = (aztv)object1;
                    if(!barm0.e || atomicInteger0.get() != v1) {
                        break;
                    }
                    if(arrayList0.contains(aztv0)) {
                        aztv0.onConnectionFailed(connectionResult0);
                    }
                }
            }
            this.c.a();
        }
    }

    @Override  // azxt
    public final void w(Bundle bundle0) {
        while(true) {
            Queue queue0 = this.g;
            if(queue0.isEmpty()) {
                break;
            }
            this.d(((azvc)queue0.remove()));
        }
        barm barm0 = this.c;
        batl.f(barm0.h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized(barm0.i) {
            batl.l(((boolean)(barm0.g ^ 1)));
            barm0.h.removeMessages(1);
            barm0.g = true;
            ArrayList arrayList0 = barm0.c;
            batl.l(arrayList0.isEmpty());
            ArrayList arrayList1 = new ArrayList(barm0.b);
            AtomicInteger atomicInteger0 = barm0.f;
            int v1 = atomicInteger0.get();
            for(Object object1: arrayList1) {
                aztu aztu0 = (aztu)object1;
                if(!barm0.e || !barm0.a.A() || atomicInteger0.get() != v1) {
                    break;
                }
                if(!arrayList0.contains(aztu0)) {
                    aztu0.onConnected(bundle0);
                }
            }
            arrayList0.clear();
            barm0.g = false;
        }
    }

    @Override  // azxt
    public final void x(int v) {
        if(v == 1) {
            if(!this.p) {
                this.p = true;
                if(this.h == null && !bbna.d()) {
                    try {
                        Context context0 = this.e.getApplicationContext();
                        azwv azwv0 = new azwv(this);
                        this.h = this.t.b(context0, azwv0);
                    }
                    catch(SecurityException unused_ex) {
                    }
                }
                Message message0 = this.s.obtainMessage(1);
                this.s.sendMessageDelayed(message0, this.q);
                Message message1 = this.s.obtainMessage(2);
                this.s.sendMessageDelayed(message1, this.r);
            }
            v = 1;
        }
        BasePendingResult[] arr_basePendingResult = (BasePendingResult[])this.m.b.toArray(new BasePendingResult[0]);
        for(int v1 = 0; v1 < arr_basePendingResult.length; ++v1) {
            arr_basePendingResult[v1].k(azzh.a);
        }
        barm barm0 = this.c;
        batl.f(barm0.h, "onUnintentionalDisconnection must only be called on the Handler thread");
        barm0.h.removeMessages(1);
        synchronized(barm0.i) {
            barm0.g = true;
            ArrayList arrayList0 = barm0.b;
            ArrayList arrayList1 = new ArrayList(arrayList0);
            AtomicInteger atomicInteger0 = barm0.f;
            int v3 = atomicInteger0.get();
            for(Object object1: arrayList1) {
                aztu aztu0 = (aztu)object1;
                if(!barm0.e || atomicInteger0.get() != v3) {
                    break;
                }
                if(arrayList0.contains(aztu0)) {
                    aztu0.onConnectionSuspended(v);
                }
            }
            barm0.c.clear();
            barm0.g = false;
        }
        barm0.a();
        if(v == 2) {
            this.s();
        }
    }
}

