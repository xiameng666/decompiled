import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.chimera.android.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
public final class aztt {
    public Account a;
    public final Set b;
    public String c;
    private final Set d;
    private final String e;
    private final Map f;
    private final Context g;
    private final Map h;
    private azxw i;
    private int j;
    private aztv k;
    private final Looper l;
    private final azpm m;
    private final ArrayList n;
    private final ArrayList o;
    private final azsy p;

    public aztt(Context context0) {
        this.b = new HashSet();
        this.d = new HashSet();
        this.f = new bxd();
        this.h = new bxd();
        this.j = -1;
        this.m = azpm.a;
        this.p = eppr.g;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.g = context0;
        this.l = context0.getMainLooper();
        this.c = "com.google.android.gms";
        this.e = context0.getClass().getName();
    }

    public final aztw a() {
        Map map0 = this.h;
        batl.c(((boolean)(map0.isEmpty() ^ 1)), "must call addApi() to add at least one API");
        baqv baqv0 = this.b();
        Map map1 = baqv0.d;
        bxd bxd0 = new bxd();
        bxd bxd1 = new bxd();
        ArrayList arrayList0 = new ArrayList();
        azta_api azta0 = null;
        boolean z = false;
        for(Object object0: map0.keySet()) {
            Object object1 = map0.get(((azta_api)object0));
            boolean z1 = map1.get(((azta_api)object0)) != null;
            bxd0.put(((azta_api)object0), Boolean.valueOf(z1));
            azvs azvs0 = new azvs(((azta_api)object0), z1);
            arrayList0.add(azvs0);
            batl.s(((azta_api)object0).b);
            azsz azsz0 = ((azta_api)object0).b.b(this.g, this.l, baqv0, object1, azvs0, azvs0);
            bxd1.put(((azta_api)object0).c, azsz0);
            if(((azta_api)object0).b.d() == 1) {
                z = object1 != null;
            }
            if(!azsz0.k()) {
                continue;
            }
            if(azta0 != null) {
                throw new IllegalStateException(((azta_api)object0).a + " cannot be used with " + azta0.a);
            }
            azta0 = (azta_api)object0;
            continue;
        }
        if(azta0 != null) {
            if(z) {
                throw new IllegalStateException("With using " + azta0.a + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
            }
            batl.n(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[]{azta0.a});
            batl.n(this.b.equals(this.d), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[]{azta0.a});
        }
        boolean z2 = true;
        int v = azww.p(bxd1.values(), true);
        ReentrantLock reentrantLock0 = new ReentrantLock();
        aztw aztw0 = new azww(this.g, reentrantLock0, this.l, baqv0, this.m, this.p, bxd0, this.n, this.o, bxd1, this.j, v, arrayList0);
        synchronized(aztw.a) {
            aztw.a.add(aztw0);
        }
        if(this.j >= 0) {
            azxy azxy0 = azuz.q(this.i);
            azuz azuz0 = (azuz)azxy0.b("AutoManageHelper", azuz.class);
            if(azuz0 == null) {
                azuz0 = new azuz(azxy0);
            }
            int v2 = this.j;
            aztv aztv0 = this.k;
            SparseArray sparseArray0 = azuz0.a;
            if(sparseArray0.indexOfKey(v2) >= 0) {
                z2 = false;
            }
            batl.m(z2, "Already managing a GoogleApiClient with id " + v2);
            azve azve0 = (azve)azuz0.c.get();
            azuy azuy0 = new azuy(azuz0, v2, aztw0, aztv0);
            aztw0.k(azuy0);
            sparseArray0.put(v2, azuy0);
            if(azuz0.b && azve0 == null) {
                aztw0.f();
            }
        }
        return aztw0;
    }

    public final baqv b() {
        eppt eppt0 = eppt.a;
        Map map0 = this.h;
        azta_api azta0 = eppr.c;
        if(map0.containsKey(azta0)) {
            eppt0 = (eppt)map0.get(azta0);
        }
        return new baqv(this.a, this.b, this.f, this.c, this.e, eppt0);
    }

    public final void c(azta_api azta0) {
        batl.t(azta0, "Api must not be null");
        this.h.put(azta0, null);
        batl.t(azta0.b, "Base client builder must not be null");
        List list0 = azta0.b.c(null);
        this.d.addAll(list0);
        this.b.addAll(list0);
    }

    public final void d(azta_api azta0, azsu azsu0) {
        batl.t(azta0, "Api must not be null");
        this.h.put(azta0, azsu0);
        batl.t(azta0.b, "Base client builder must not be null");
        List list0 = azta0.b.c(azsu0);
        this.d.addAll(list0);
        this.b.addAll(list0);
    }

    public final void e(aztu aztu0) {
        this.n.add(aztu0);
    }

    public final void f(aztv aztv0) {
        this.o.add(aztv0);
    }

    public final void g(Activity activity0, int v, aztv aztv0) {
        azxw azxw0 = new azxw(activity0.getContainerActivity());
        this.j = v;
        this.k = aztv0;
        this.i = azxw0;
    }
}

