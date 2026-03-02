import android.content.Context;
import j..util.DesugarCollections;
import j..util.Optional;
import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ConcurrentMap.-EL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class fecw implements ffmj {
    public final Context a;
    public Optional b;
    public final ConcurrentHashMap c;
    public final Lock d;
    public final Lock e;

    public fecw(Context context0) {
        this.c = new ConcurrentHashMap();
        this.d = new ReentrantLock();
        this.e = new ReentrantLock();
        this.a = context0;
        this.b = Optional.empty();
    }

    public final ggfp a(String s) {
        return (ggfp)ConcurrentMap.-EL.getOrDefault(this.c, s, ggnj.a);
    }

    public final gmcd b() {
        return gmbu.m(new fect(this), gmap.a);
    }

    public final gmcd c(String s, Set set0) {
        return gmbu.l(new fecs(this, set0, s), gmap.a);
    }

    public final Set d(String s) {
        return ggog.g(this.a(s));
    }

    public final void f(String s, Set set0) {
        ggfp ggfp0 = ggfp.G(set0);
        this.c.put(s, ggfp0);
    }

    public final void g(String s, Set set0) {
        try {
            ((glyq)this.c(s, set0)).u();
        }
        catch(InterruptedException | ExecutionException exception0) {
            ffmn.c("AppCatalogData", exception0, "replaceAppCatalogInDisk - nodeId: %s.", new Object[]{s});
        }
    }

    private static final void h(bbpd bbpd0, boolean z, Map map0) {
        bbpd0.b();
        if(map0.isEmpty()) {
            bbpd0.println("Map is empty.");
        }
        bbpd0.printf("Number of nodes: %d. nodeIds: %s\n", new Object[]{map0.size(), map0.keySet()});
        for(Object object0: map0.keySet()) {
            ggfp ggfp0 = (ggfp)map0.get(((String)object0));
            bbpd0.printf("nodeId: %s. Number of apps: %d\n", new Object[]{((String)object0), ggfp0.size()});
            if(z) {
                bbpd0.b();
                ggqj ggqj0 = ggfp0.om();
                while(ggqj0.hasNext()) {
                    Object object1 = ggqj0.next();
                    bbpd0.println(((fdpl)object1));
                }
                bbpd0.a();
            }
        }
        bbpd0.a();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("AppCatalogData");
        bbpd0.b();
        bbpd0.println("DataStore Contents: ");
        bbpd0.b();
        this.d.lock();
        boolean z2 = this.b.isPresent();
        this.d.unlock();
        fexe fexe0 = null;
        if(z2) {
            try {
                fexe0 = (fexe)((glyq)this.b()).u();
            }
            catch(InterruptedException | ExecutionException exception0) {
                ffmn.c("AppCatalogData", exception0, "dumpState - failed to get data from disk.", new Object[0]);
                bbpd0.println("There was an issue getting data from the DataStore. Check logs for details.");
            }
        }
        else {
            bbpd0.println("DataStore is not initialized.");
        }
        bbpd0.a();
        if(fexe0 != null) {
            Map map0 = DesugarCollections.unmodifiableMap(fexe0.b);
            HashMap hashMap0 = new HashMap();
            for(Object object0: map0.keySet()) {
                hashMap0.put(((String)object0), ggfp.G(fedq.d(((fexg)map0.get(((String)object0))).b)));
            }
            fecw.h(bbpd0, z1, hashMap0);
        }
        bbpd0.println();
        bbpd0.println("Cache Contents: ");
        fecw.h(bbpd0, z1, this.c);
        bbpd0.a();
    }
}

