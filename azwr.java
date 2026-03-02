import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class azwr implements azwx {
    public final azxa a;
    public final Lock b;
    public final Context c;
    public final azpn d;
    public boolean e;
    public boolean f;
    public bary g;
    public boolean h;
    public boolean i;
    public final baqv j;
    public epui k;
    private ConnectionResult l;
    private int m;
    private int n;
    private int o;
    private final Bundle p;
    private final Set q;
    private boolean r;
    private final Map s;
    private final ArrayList t;
    private final azsy u;

    public azwr(azxa azxa0, baqv baqv0, Map map0, azpn azpn0, azsy azsy0, Lock lock0, Context context0) {
        this.n = 0;
        this.p = new Bundle();
        this.q = new HashSet();
        this.t = new ArrayList();
        this.a = azxa0;
        this.j = baqv0;
        this.s = map0;
        this.d = azpn0;
        this.u = azsy0;
        this.b = lock0;
        this.c = context0;
    }

    @Override  // azwx
    public final azvc a(azvc azvc0) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override  // azwx
    public final void b() {
        azxa azxa0 = this.a;
        azxa0.g.clear();
        this.e = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.f = false;
        this.h = false;
        HashMap hashMap0 = new HashMap();
        Map map0 = this.s;
        int v = 0;
        for(Object object0: map0.keySet()) {
            azss azss0 = ((azta_api)object0).c;
            azsz azsz0 = (azsz)azxa0.f.get(azss0);
            batl.s(azsz0);
            v |= (((azta_api)object0).b.d() == 1 ? 1 : 0);
            boolean z = ((Boolean)map0.get(((azta_api)object0))).booleanValue();
            if(azsz0.gb()) {
                this.e = true;
                if(z) {
                    this.q.add(azss0);
                }
                else {
                    this.r = false;
                }
            }
            hashMap0.put(azsz0, new azwi(this, ((azta_api)object0), z));
        }
        if(v != 0) {
            this.e = false;
        }
        if(this.e) {
            batl.s(this.j);
            batl.s(this.u);
            this.j.h = System.identityHashCode(azxa0.l);
            azwp azwp0 = new azwp(this);
            this.k = (epui)this.u.b(this.c, azxa0.l.f, this.j, this.j.g, azwp0, azwp0);
        }
        this.o = ((bzs)azxa0.f).d_num;
        azwl azwl0 = new azwl(this, hashMap0);
        Future future0 = azxb.a.submit(azwl0);
        this.t.add(future0);
    }

    @Override  // azwx
    public final void c() {
    }

    @Override  // azwx
    public final void d(Bundle bundle0) {
        if(this.m(1)) {
            if(bundle0 != null) {
                this.p.putAll(bundle0);
            }
            if(this.n()) {
                this.r();
            }
        }
    }

    @Override  // azwx
    public final void e(ConnectionResult connectionResult0, azta_api azta0, boolean z) {
        if(this.m(1)) {
            this.k(connectionResult0, azta0, z);
            if(this.n()) {
                this.r();
            }
        }
    }

    @Override  // azwx
    public final void f(int v) {
        this.j(new ConnectionResult(8, null));
    }

    @Override  // azwx
    public final void g(azvc azvc0) {
        this.a.l.g.add(azvc0);
    }

    @Override  // azwx
    public final void h() {
        this.p();
        this.q(true);
        this.a.j();
    }

    public final void i() {
        this.e = false;
        azxa azxa0 = this.a;
        azxa0.l.j = Collections.EMPTY_SET;
        for(Object object0: this.q) {
            azss azss0 = (azss)object0;
            Map map0 = azxa0.g;
            if(!map0.containsKey(azss0)) {
                map0.put(azss0, new ConnectionResult(17, null));
            }
        }
    }

    public final void j(ConnectionResult connectionResult0) {
        this.p();
        this.q(((boolean)(connectionResult0.c() ^ 1)));
        this.a.j();
        this.a.m.v(connectionResult0);
    }

    public final void k(ConnectionResult connectionResult0, azta_api azta0, boolean z) {
        int v = azta0.b.d();
        if((!z || connectionResult0.c() || this.d.k(null, connectionResult0.c, null) != null) && (this.l == null || v < this.m)) {
            this.l = connectionResult0;
            this.m = v;
        }
        this.a.g.put(azta0.c, connectionResult0);
    }

    public final void l() {
        if(this.o == 0 && (!this.e || this.f)) {
            ArrayList arrayList0 = new ArrayList();
            this.n = 1;
            azxa azxa0 = this.a;
            Map map0 = azxa0.f;
            this.o = ((bzs)map0).d_num;
            for(Object object0: map0.keySet()) {
                azss azss0 = (azss)object0;
                if(!azxa0.g.containsKey(azss0)) {
                    arrayList0.add(((azsz)map0.get(azss0)));
                }
                else if(this.n()) {
                    this.r();
                }
            }
            if(!arrayList0.isEmpty()) {
                azwm azwm0 = new azwm(this, arrayList0);
                Future future0 = azxb.a.submit(azwm0);
                this.t.add(future0);
            }
        }
    }

    public final boolean m(int v) {
        if(this.n != v) {
            Log.w("GACConnecting", this.a.l.q());
            Log.w("GACConnecting", "Unexpected callback in " + this.toString());
            Log.w("GACConnecting", "mRemainingConnections=" + this.o);
            Log.e("GACConnecting", "GoogleApiClient connecting is in step " + azwr.s(this.n) + " but received callback for step " + azwr.s(v), new Exception());
            this.j(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    public final boolean n() {
        int v = this.o - 1;
        this.o = v;
        if(v > 0) {
            return false;
        }
        if(v < 0) {
            Log.w("GACConnecting", this.a.l.q());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            this.j(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult0 = this.l;
        if(connectionResult0 != null) {
            this.a.k = this.m;
            this.j(connectionResult0);
            return false;
        }
        return true;
    }

    public final boolean o(ConnectionResult connectionResult0) {
        return this.r && !connectionResult0.c();
    }

    private final void p() {
        ArrayList arrayList0 = this.t;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Future)arrayList0.get(v1)).cancel(true);
        }
        arrayList0.clear();
    }

    private final void q(boolean z) {
        epui epui0 = this.k;
        if(epui0 != null) {
            if(epui0.A() && z) {
                try {
                    epue epue0 = (epue)epui0.H();
                    batl.s(epui0.a);
                    epue0.b(epui0.a.intValue());
                }
                catch(RemoteException unused_ex) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            epui0.m();
            batl.s(this.j);
            this.g = null;
        }
    }

    private final void r() {
        this.a.a.lock();
        try {
            this.a.l.u();
            this.a.j = new azwg(this.a);
            this.a.j.b();
            this.a.b.signalAll();
        }
        finally {
            this.a.a.unlock();
        }
        azwh azwh0 = new azwh(this);
        azxb.a.execute(azwh0);
        epui epui0 = this.k;
        if(epui0 != null) {
            if(this.h) {
                bary bary0 = this.g;
                batl.s(bary0);
                boolean z = this.i;
                try {
                    epue epue0 = (epue)epui0.H();
                    batl.s(epui0.a);
                    epue0.h(bary0, epui0.a.intValue(), z);
                }
                catch(RemoteException unused_ex) {
                    Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                }
            }
            this.q(false);
        }
        azxa azxa0 = this.a;
        for(Object object0: azxa0.g.keySet()) {
            azsz azsz0 = (azsz)azxa0.f.get(((azss)object0));
            batl.s(azsz0);
            azsz0.m();
        }
        azxa0.m.w((this.p.isEmpty() ? null : this.p));
    }

    private static final String s(int v) {
        return v == 0 ? "STEP_SERVICE_BINDINGS_AND_SIGN_IN" : "STEP_GETTING_REMOTE_SERVICE";
    }
}

