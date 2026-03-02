import android.content.Context;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.net.Uri;
import j..util.DesugarCollections;
import j..util.Objects;
import j..util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class fedp implements fduo, ffex, ffmj {
    public final fdpk a;
    public final Context b;
    public final fdvl c;
    public final fdpl d;
    public final Optional e;
    public final boolean f;
    public final String g;
    public final ffew h;
    public final AtomicReference i;
    public final fecw j;
    public final gmcg k;
    public final AtomicBoolean l;
    public final Lock m;
    public static final int n;
    private final Set o;
    private final Lock p;

    static {
        new Uri.Builder().scheme("wear").build();
    }

    public fedp(Context context0, fdvl fdvl0, fdpl fdpl0, Optional optional0, boolean z, String s, ffew ffew0) {
        this.a = new fdpk(50);
        AtomicReference atomicReference0 = new AtomicReference();
        this.i = atomicReference0;
        this.k = new bblp(1, 9);
        this.l = new AtomicBoolean();
        this.m = new ReentrantLock();
        this.o = new HashSet();
        this.p = new ReentrantLock();
        this.b = context0;
        this.c = fdvl0;
        this.d = fdpl0;
        this.e = optional0;
        this.f = z;
        this.g = s;
        this.h = ffew0;
        atomicReference0.set(ggnj.a);
        this.j = new fecw(context0);
    }

    // Detected as a lambda impl.
    public final void a(String s, String s1) {
        ffmn.a("AppCatalogService", "%s - %s", new Object[]{s1, s});
        this.a.b(s1, s);
    }

    @Override  // ffex
    public final void b() {
        gmbu.l(new feda(this), this.k).hB(() -> {
            ffmn.a("AppCatalogService", "%s - %s", new Object[]{"onMutuallyTrustedPeersRecalculated", "Finished"});
            this.a.b("onMutuallyTrustedPeersRecalculated", "Finished");
        }, gmap.a);
    }

    // Detected as a lambda impl.
    public final void c(fduq fduq0) {
        fexg fexg0;
        String s1;
        if(!this.f && !this.h(fduq0)) {
            if(fduq0.c) {
                HashSet hashSet0 = ggog.g(this.j.a(fduq0.e));
                this.j.c.remove(fduq0.e);
                String s = fduq0.e;
                try {
                    ((glyq)this.j.c(s, ggnj.a)).u();
                }
                catch(InterruptedException | ExecutionException exception0) {
                    ffmn.c("AppCatalogData", exception0, "purgeFromDisk - nodeId: %s.", new Object[]{s});
                }
                this.a("AppCatalog for: " + fduq0.e + "  DELETED.", "processAppCatalogDataItem");
                this.g(fduq0.e, new HashSet(), hashSet0);
                return;
            }
            try {
                byte[] arr_b = fduq0.b.c();
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fexc.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                s1 = ((fexc)hftv0).c;
                fexg0 = ((fexc)hftv0).d;
            }
            catch(hfur unused_ex) {
                ffmn.f("AppCatalogService", "Received invalid AppCatalog dataItem payload.", new Object[0]);
                return;
            }
            if(fexg0 == null) {
                fexg0 = fexg.a;
            }
            hfuo hfuo0 = fexg0.b;
            HashSet hashSet1 = new HashSet();
            for(Object object0: hfuo0) {
                hashSet1.add(fedq.b(((fexh)object0)));
            }
            gfsz gfsz0 = new gfsz(s1, hashSet1);
            String s2 = (String)gfsz0.a;
            Set set0 = (Set)gfsz0.b;
            this.j.f(s2, set0);
            this.a("AppCatalog for: " + s2 + " CACHED.", "processAppCatalogDataItem");
            fexe fexe0 = fexe.a;
            try {
                fexe0 = (fexe)((glyq)this.j.b()).u();
            }
            catch(InterruptedException | ExecutionException exception1) {
                ffmn.c("AppCatalogData", exception1, "getAppCatalogForNode - nodeId: %s.", new Object[]{s2});
            }
            Map map0 = DesugarCollections.unmodifiableMap(fexe0.b);
            ggfp ggfp0 = ggnj.a;
            if(map0.containsKey(s2)) {
                ggfp0 = ggfp.G(fedq.d(((fexg)map0.get(s2)).b));
            }
            gfsz gfsz1 = new gfsz(ggog.d(set0, ggfp0), ggog.d(ggfp0, set0));
            Set set1 = (Set)gfsz1.a;
            if(!this.g.equals(s2)) {
                gmcd gmcd0 = gmbu.l(new fecy(this, set1, s2), this.k);
                gmcd0.hB(new fede(this, gmcd0, s2, set1), gmap.a);
            }
            this.g(s2, set1, ((Set)gfsz1.b));
            this.j.g(s2, set0);
            this.a(a.a(s2, "AppCatalog for: ", " PERSISTED."), "processAppCatalogDataItem");
        }
    }

    public final void d() {
        Optional optional0;
        String s = this.g;
        ggfp ggfp0 = this.j.a(s);
        if(ggfp0.isEmpty()) {
            ffmn.b("AppCatalogService", "updateLocalDataItemIfNeeded - Local AppCatalog is empty.", new Object[0]);
            return;
        }
        fexc fexc0 = fexc.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexc0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexc fexc1 = (fexc)hftp0.b_message;
        fexc1.b |= 1;
        fexc1.c = s;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ggfp0) {
            arrayList0.add(fedq.c(((fdpl)object0)));
        }
        fexf fexf0 = (fexf)((ProtoLiteMessage)fexg.a).v_newBuilder();
        fexf0.a(arrayList0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexc fexc2 = (fexc)hftp0.b_message;
        fexg fexg0 = (fexg)((ProtoLiteBuilder)fexf0).N_build();
        fexg0.getClass();
        fexc2.d = fexg0;
        fexc2.b |= 2;
        fexc fexc3 = (fexc)hftp0.N_build();
        Cursor cursor0 = this.c.c(this.d, fedq.a);
        cursor0.moveToFirst();
        while(!cursor0.isAfterLast()) {
            fduq fduq0 = fdur.f(cursor0);
            if(!this.h(fduq0)) {
                continue;
            }
            optional0 = Optional.of(fduq0);
            goto label_36;
        }
        optional0 = Optional.empty();
    label_36:
        if(!optional0.isEmpty()) {
            byte[] arr_b = ((fduq)optional0.get()).b.c();
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fexc0), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                Optional optional1 = Optional.of(((fexc)hftv0));
            }
            catch(hfur unused_ex) {
                ffmn.f("AppCatalogService", "isDataItemOutdated - Could not parse DataItem.", new Object[0]);
                goto label_48;
            }
            if(!((Boolean)optional1.map(new fedg(fexc3)).orElse(Boolean.valueOf(true))).booleanValue()) {
                ffmn.e("AppCatalogService", "updateLocalDataItemIfNeeded - DataItem is already up to date.", new Object[0]);
                return;
            }
        }
    label_48:
        Uri uri0 = fedq.a(fexc3.c);
        String s1 = uri0.getHost();
        batl.s(s1);
        String s2 = uri0.getPath();
        batl.s(s2);
        fdun fdun0 = new fdun(s1, s2);
        fdun0.e = fexc3.toBytesArray();
        gmbu.t(this.c.o(this.d, fdun0), new fedo(this), this.k);
    }

    public final boolean f(String s, fdpl fdpl0) {
        return !this.l.get() || this.f || !this.j.c.containsKey(s) && !DesugarCollections.unmodifiableMap(((fexe)((glyq)this.j.b()).u()).b).containsKey(s) ? true : this.j.a(s).contains(fdpl0);
    }

    private final void g(String s, Set set0, Set set1) {
        this.p.lock();
        try {
            if(!set0.isEmpty()) {
                this.a("ADDED " + set0.size() + " app(s) for nodeId: " + s, "notifyListeners");
            }
            for(Object object0: set0) {
                ffmn.e("AppCatalogService", "notifyListeners - ADDED nodeId: %s, app: %s", new Object[]{s, ((fdpl)object0)});
                for(Object object1: this.o) {
                    ((fecx)object1).a();
                }
            }
            if(!set1.isEmpty()) {
                this.a("REMOVED " + set1.size() + " app(s) for nodeId: " + s, "notifyListeners");
            }
            for(Object object2: set1) {
                ffmn.e("AppCatalogService", "notifyListeners - REMOVED nodeId: %s, app: %s", new Object[]{s, ((fdpl)object2)});
                for(Object object3: this.o) {
                    ((fecx)object3).b();
                }
            }
        }
        finally {
            this.p.unlock();
        }
    }

    private final boolean h(fduq fduq0) {
        Optional optional0 = Optional.ofNullable(fduq0.b.c.getHost());
        Objects.requireNonNull(this.g);
        return ((Boolean)optional0.map(new fedj(this.g)).orElse(Boolean.valueOf(false))).booleanValue();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        this.m.lock();
        try {
            bbpd0.println();
            bbpd0.printf("isEnabled: %s", new Object[]{Boolean.valueOf(this.l.get())});
            bbpd0.print("\n\n");
            bbpd0.println("Events:");
            bbpd0.b();
            bbpd0.println(this.a.toString());
            bbpd0.a();
            bbpd0.println();
            this.j.md(bbpd0, z, z1);
        }
        finally {
            this.m.unlock();
        }
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fduq fduq0 = (fduq)arrayList0.get(v1);
            if(this.d.equals(fduq0.a) && fduq0.b.b.startsWith("/wearable/app_catalog")) {
                gmbu.l(() -> {
                    fexg fexg0;
                    String s1;
                    if(!this.f && !this.h(fduq0)) {
                        if(fduq0.c) {
                            HashSet hashSet0 = ggog.g(this.j.a(fduq0.e));
                            this.j.c.remove(fduq0.e);
                            String s = fduq0.e;
                            try {
                                ((glyq)this.j.c(s, ggnj.a)).u();
                            }
                            catch(InterruptedException | ExecutionException exception0) {
                                ffmn.c("AppCatalogData", exception0, "purgeFromDisk - nodeId: %s.", new Object[]{s});
                            }
                            this.a("AppCatalog for: " + fduq0.e + "  DELETED.", "processAppCatalogDataItem");
                            this.g(fduq0.e, new HashSet(), hashSet0);
                            return;
                        }
                        try {
                            byte[] arr_b = fduq0.b.c();
                            hftc hftc0 = hftc.a();
                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fexc.a), arr_b, 0, arr_b.length, hftc0);
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            s1 = ((fexc)hftv0).c;
                            fexg0 = ((fexc)hftv0).d;
                        }
                        catch(hfur unused_ex) {
                            ffmn.f("AppCatalogService", "Received invalid AppCatalog dataItem payload.", new Object[0]);
                            return;
                        }
                        if(fexg0 == null) {
                            fexg0 = fexg.a;
                        }
                        hfuo hfuo0 = fexg0.b;
                        HashSet hashSet1 = new HashSet();
                        for(Object object0: hfuo0) {
                            hashSet1.add(fedq.b(((fexh)object0)));
                        }
                        gfsz gfsz0 = new gfsz(s1, hashSet1);
                        String s2 = (String)gfsz0.a;
                        Set set0 = (Set)gfsz0.b;
                        this.j.f(s2, set0);
                        this.a("AppCatalog for: " + s2 + " CACHED.", "processAppCatalogDataItem");
                        fexe fexe0 = fexe.a;
                        try {
                            fexe0 = (fexe)((glyq)this.j.b()).u();
                        }
                        catch(InterruptedException | ExecutionException exception1) {
                            ffmn.c("AppCatalogData", exception1, "getAppCatalogForNode - nodeId: %s.", new Object[]{s2});
                        }
                        Map map0 = DesugarCollections.unmodifiableMap(fexe0.b);
                        ggfp ggfp0 = ggnj.a;
                        if(map0.containsKey(s2)) {
                            ggfp0 = ggfp.G(fedq.d(((fexg)map0.get(s2)).b));
                        }
                        gfsz gfsz1 = new gfsz(ggog.d(set0, ggfp0), ggog.d(ggfp0, set0));
                        Set set1 = (Set)gfsz1.a;
                        if(!this.g.equals(s2)) {
                            gmcd gmcd0 = gmbu.l(new fecy(this, set1, s2), this.k);
                            gmcd0.hB(new fede(this, gmcd0, s2, set1), gmap.a);
                        }
                        this.g(s2, set1, ((Set)gfsz1.b));
                        this.j.g(s2, set0);
                        this.a(a.a(s2, "AppCatalog for: ", " PERSISTED."), "processAppCatalogDataItem");
                    }
                }, this.k).hB(new fedi(fduq0), gmap.a);
            }
        }
    }
}

