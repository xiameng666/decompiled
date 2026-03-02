import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import j..util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

final class azvx implements azxu {
    public final azxa a;
    public final azxa b;
    public Bundle c;
    public ConnectionResult d;
    public ConnectionResult e;
    public boolean f;
    public final Lock g;
    private final Context h;
    private final azww i;
    private final Looper j;
    private final Map k;
    private final Set l;
    private final azsz m;
    private int n;

    public azvx(Context context0, azww azww0, Lock lock0, Looper looper0, azpn azpn0, Map map0, Map map1, baqv baqv0, azsy azsy0, azsz azsz0, ArrayList arrayList0, ArrayList arrayList1, Map map2, Map map3) {
        this.l = Collections.newSetFromMap(new WeakHashMap());
        this.d = null;
        this.e = null;
        this.f = false;
        this.n = 0;
        this.h = context0;
        this.i = azww0;
        this.g = lock0;
        this.j = looper0;
        this.m = azsz0;
        this.a = new azxa(context0, azww0, lock0, looper0, azpn0, map1, null, map3, null, arrayList1, new azvv(this));
        this.b = new azxa(context0, azww0, lock0, looper0, azpn0, map0, baqv0, map2, azsy0, arrayList0, new azvw(this));
        bxd bxd0 = new bxd();
        for(Object object0: map1.keySet()) {
            bxd0.put(((azss)object0), this.a);
        }
        for(Object object1: map0.keySet()) {
            bxd0.put(((azss)object1), this.b);
        }
        this.k = DesugarCollections.unmodifiableMap(bxd0);
    }

    @Override  // azxu
    public final azvc a(azvc azvc0) {
        if(this.q(azvc0)) {
            if(this.p()) {
                azvc0.a(new Status(4, null, this.m()));
                return azvc0;
            }
            this.b.a(azvc0);
            return azvc0;
        }
        this.a.a(azvc0);
        return azvc0;
    }

    @Override  // azxu
    public final azvc b(azvc azvc0) {
        if(this.q(azvc0)) {
            if(this.p()) {
                azvc0.a(new Status(4, null, this.m()));
                return azvc0;
            }
            return this.b.b(azvc0);
        }
        return this.a.b(azvc0);
    }

    @Override  // azxu
    public final void c() {
        this.n = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.c();
        this.b.c();
    }

    @Override  // azxu
    public final void d() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.a.d();
        this.b.d();
        this.o();
    }

    @Override  // azxu
    public final void e(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.append(s).append("authClient").println(":");
        this.b.e(s + "  ", fileDescriptor0, printWriter0, arr_s);
        printWriter0.append(s).append("anonClient").println(":");
        this.a.e(s + "  ", fileDescriptor0, printWriter0, arr_s);
    }

    @Override  // azxu
    public final void f() {
        this.g.lock();
        try {
            boolean z = this.i();
            this.b.d();
            this.e = new ConnectionResult(4);
            if(z) {
                new clht(this.j).post(new azvu(this));
            }
            else {
                this.o();
            }
        }
        finally {
            this.g.unlock();
        }
    }

    public final void g() {
        ConnectionResult connectionResult0 = this.d;
        if(azvx.r(connectionResult0)) {
            ConnectionResult connectionResult1 = this.e;
            if(azvx.r(connectionResult1) || this.p()) {
                goto label_11;
            }
            if(connectionResult1 != null) {
                if(this.n == 1) {
                    this.o();
                    return;
                }
                this.n(connectionResult1);
                this.a.d();
                return;
            label_11:
                switch(this.n) {
                    case 1: {
                        this.o();
                        break;
                    }
                    case 2: {
                        this.i.w(this.c);
                        this.o();
                        break;
                    }
                    default: {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    }
                }
                this.n = 0;
            }
        }
        else {
            if(connectionResult0 != null && azvx.r(this.e)) {
                this.b.d();
                ConnectionResult connectionResult2 = this.d;
                batl.s(connectionResult2);
                this.n(connectionResult2);
                return;
            }
            if(connectionResult0 != null) {
                ConnectionResult connectionResult3 = this.e;
                if(connectionResult3 != null) {
                    if(this.b.k < this.a.k) {
                        connectionResult0 = connectionResult3;
                    }
                    this.n(connectionResult0);
                }
            }
        }
    }

    @Override  // azxu
    public final boolean h() {
        this.g.lock();
        boolean z = this.a.h() && (this.j() || this.p() || this.n == 1);
        this.g.unlock();
        return z;
    }

    @Override  // azxu
    public final boolean i() {
        this.g.lock();
        boolean z = this.n == 2;
        this.g.unlock();
        return z;
    }

    public final boolean j() {
        return this.b.h();
    }

    @Override  // azxu
    public final boolean k(aied aied0) {
        Lock lock0 = this.g;
        lock0.lock();
        try {
            if((this.i() || this.h()) && !this.j()) {
                this.l.add(aied0);
                if(this.n == 0) {
                    this.n = 1;
                }
                this.e = null;
                this.b.c();
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable0) {
            this.g.unlock();
            throw throwable0;
        }
    label_12:
        this.g.unlock();
        return true;
    label_14:
        lock0.unlock();
        return false;
    }

    public final void l(int v) {
        this.i.x(v);
        this.e = null;
        this.d = null;
    }

    private final PendingIntent m() {
        azsz azsz0 = this.m;
        if(azsz0 == null) {
            return null;
        }
        Intent intent0 = azsz0.j();
        return cjok.a(this.h, System.identityHashCode(this.i), intent0, 0xA000000);
    }

    private final void n(ConnectionResult connectionResult0) {
        switch(this.n) {
            case 1: {
                this.o();
                break;
            }
            case 2: {
                this.i.v(connectionResult0);
                this.o();
                break;
            }
            default: {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
            }
        }
        this.n = 0;
    }

    private final void o() {
        Set set0 = this.l;
        for(Object object0: set0) {
            ((aied)object0).c.release();
        }
        set0.clear();
    }

    private final boolean p() {
        return this.e != null && this.e.c == 4;
    }

    private final boolean q(azvc azvc0) {
        azxa azxa0 = (azxa)this.k.get(azvc0.b);
        batl.t(azxa0, "GoogleApiClient is not configured to use the API required for this call.");
        return azxa0.equals(this.b);
    }

    private static boolean r(ConnectionResult connectionResult0) {
        return connectionResult0 != null && connectionResult0.d();
    }
}

