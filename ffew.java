import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri.Builder;
import android.net.Uri;
import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ffew implements fduo, ffmj {
    static final Uri a;
    public static final AtomicReference b;
    public final fdpl c;
    public final PackageManager d;
    public final AtomicBoolean e;
    public final CountDownLatch f;
    public final AtomicReference g;
    public final List h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public final ConcurrentHashMap k;
    public final Set l;
    public final fdye m;
    private final Context n;
    private final ConcurrentHashMap o;
    private final ConcurrentHashMap p;
    private final ConcurrentHashMap q;
    private final ConcurrentLinkedQueue r;

    static {
        ffew.a = new Uri.Builder().scheme("wear").path("/trusted_packages").build();
        ffew.b = new AtomicReference();
    }

    public ffew(Context context0, fdye fdye0, fdpl fdpl0) {
        this.e = new AtomicBoolean(false);
        this.f = new CountDownLatch(1);
        this.g = new AtomicReference();
        this.h = new ArrayList();
        this.l = ggog.l();
        batl.s(context0);
        this.n = context0;
        this.m = fdye0;
        this.c = fdpl0;
        this.d = context0.getPackageManager();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.r = new ConcurrentLinkedQueue();
        this.o = new ConcurrentHashMap();
        this.p = new ConcurrentHashMap();
        this.q = new ConcurrentHashMap();
    }

    public final fdpl a(String s, fdpl fdpl0) {
        ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)this.k.get(s);
        if(concurrentHashMap0 != null) {
            for(Object object0: concurrentHashMap0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(fdpl0.equals(map$Entry0.getValue())) {
                    return (fdpl)map$Entry0.getKey();
                }
            }
        }
        return fdpl0;
    }

    final fdpl b(PackageInfo packageInfo0) {
        try {
            fdpl fdpl0 = fdpn.b(this.n, packageInfo0.packageName, packageInfo0);
            if(packageInfo0.applicationInfo.metaData != null && packageInfo0.applicationInfo.metaData.containsKey("wear-trusted-peer-packages")) {
                String s = packageInfo0.applicationInfo.metaData.getString("wear-trusted-peer-packages");
                batl.s(s);
                HashSet hashSet0 = new HashSet();
                gfud gfud0 = gfud.g(":").i();
                for(Object object0: gfud.g(",").i().l(s)) {
                    List list0 = gfud0.n(((String)object0));
                    if(list0.size() == 2) {
                        hashSet0.add(fdpn.c(((String)list0.get(0)), ((String)list0.get(1)).toLowerCase(Locale.ROOT)));
                    }
                    else {
                        ffmn.f("TrustedPeersAdapter", "Read invalid package string (%s) from line: %s", new Object[]{list0, s});
                    }
                }
                Set set0 = (Set)this.i.put(fdpl0, hashSet0);
                if(set0 == null && hashSet0.isEmpty()) {
                    return null;
                }
                return hashSet0.equals(set0) ? null : fdpl0;
            }
            if(this.i.remove(fdpl0) != null) {
                return fdpl0;
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ffmn.g("TrustedPeersService", packageManager$NameNotFoundException0, "Package not found.", new Object[0]);
            return null;
        }
        return null;
    }

    public static ffew c() {
        return (ffew)ffew.b.get();
    }

    public final ggfp d() {
        if(this.e.get()) {
            ggfn ggfn0 = new ggfn();
            for(Object object0: this.k.values()) {
                ggfn0.k(((Map)object0).values());
            }
            return ggfn0.h();
        }
        return ggnj.a;
    }

    public static String f(fduq fduq0) {
        return hzzf.d() ? fduq0.b.a : fduq0.e;
    }

    public final Set g(fdpl fdpl0) {
        Set set0 = (Set)this.i.get(fdpl0);
        return set0 != null ? set0 : new HashSet();
    }

    public final void h() {
        Runnable runnable0;
        while((runnable0 = (Runnable)this.r.poll()) != null) {
            runnable0.run();
        }
    }

    public final void i(String s) {
        boolean z;
        fdpl fdpl1;
        try {
            PackageInfo packageInfo0 = this.d.getPackageInfo(s, 0xC0);
            fdpl fdpl0 = this.b(packageInfo0);
            if(hzzf.c()) {
                this.p(packageInfo0);
            }
            if(fdpl0 != null) {
                ConcurrentHashMap concurrentHashMap0 = this.i;
                if(concurrentHashMap0.containsKey(fdpl0)) {
                    ConcurrentHashMap concurrentHashMap1 = new ConcurrentHashMap();
                    Set set0 = (Set)MoreObjects.firstNonNull(((Set)concurrentHashMap0.get(fdpl0)), ggnj.a);
                    ConcurrentHashMap concurrentHashMap2 = this.j;
                    Iterator iterator1 = concurrentHashMap2.keySet().iterator();
                label_18:
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        String s1 = (String)object1;
                        Map map0 = (Map)concurrentHashMap2.get(s1);
                        Iterator iterator2 = set0.iterator();
                        do {
                            if(!iterator2.hasNext()) {
                                continue label_18;
                            }
                            Object object2 = iterator2.next();
                            fdpl1 = (fdpl)object2;
                            Set set1 = (Set)map0.get(fdpl1);
                        }
                        while(set1 == null || !set1.contains(fdpl0));
                        concurrentHashMap1.put(s1, fdpl1);
                    }
                    ConcurrentHashMap concurrentHashMap3 = this.k;
                    z = false;
                    for(Object object3: concurrentHashMap3.keySet()) {
                        String s2 = (String)object3;
                        ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap)concurrentHashMap3.get(s2);
                        fdpl fdpl2 = (fdpl)concurrentHashMap1.get(s2);
                        if(fdpl2 != null) {
                            if(concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                                concurrentHashMap3.put(s2, concurrentHashMap4);
                            }
                            if(!fdpl2.equals(((fdpl)concurrentHashMap4.put(fdpl0, fdpl2)))) {
                                ((fdvl)this.g.get()).S(this.c, s2, fdpl2, fdpl0);
                            }
                            goto label_47;
                        }
                        else if(concurrentHashMap4 != null) {
                            concurrentHashMap4.remove(fdpl0);
                        label_47:
                            z = true;
                        }
                        concurrentHashMap1.remove(s2);
                    }
                    for(Object object4: concurrentHashMap1.keySet()) {
                        fdpl fdpl3 = (fdpl)concurrentHashMap1.get(((String)object4));
                        ConcurrentHashMap concurrentHashMap5 = new ConcurrentHashMap();
                        concurrentHashMap5.put(fdpl0, fdpl3);
                        concurrentHashMap3.put(((String)object4), concurrentHashMap5);
                        ((fdvl)this.g.get()).S(this.c, ((String)object4), fdpl3, fdpl0);
                        z = true;
                    }
                }
                else {
                    z = false;
                    for(Object object0: this.k.values()) {
                        ((Map)object0).remove(fdpl0);
                        z = true;
                    }
                }
                if(z) {
                    this.j();
                }
                this.l();
            }
            hzzf.c();
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ffmn.g("TrustedPeersService", packageManager$NameNotFoundException0, "Name not found.", new Object[0]);
        }
    }

    public final void j() {
        for(Object object0: this.h) {
            ((ffex)object0).b();
        }
    }

    public final void k(fduq fduq0) {
        if(this.q(fduq0)) {
            String s = ffew.f(fduq0);
            ffmn.a("TrustedPeersService", "onIncomingDataItemFromTransport: %s", new Object[]{fduq0});
            this.m(fduq0);
            if(this.n(s)) {
                this.j();
            }
        }
    }

    public final void l() {
        Uri uri0 = ffew.a.buildUpon().authority(this.m.a().a).build();
        String s = uri0.getHost();
        batl.s(s);
        String s1 = uri0.getPath();
        batl.s(s1);
        fdun fdun0 = new fdun(s, s1);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffce.a).v_newBuilder();
        for(Object object0: this.i.entrySet()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffcf.a).v_newBuilder();
            fexh fexh0 = ffer.b(((fdpl)((Map.Entry)object0).getKey()));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffcf ffcf0 = (ffcf)hftp1.b_message;
            fexh0.getClass();
            ffcf0.c = fexh0;
            ffcf0.b |= 1;
            for(Object object1: ((Set)((Map.Entry)object0).getValue())) {
                fexh fexh1 = ffer.b(((fdpl)object1));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffcf ffcf1 = (ffcf)hftp1.b_message;
                fexh1.getClass();
                hfuo hfuo0 = ffcf1.d;
                if(!hfuo0.c()) {
                    ffcf1.d = ProtoLiteMessage.E(hfuo0);
                }
                ffcf1.d.add(fexh1);
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffce ffce0 = (ffce)hftp0.b_message;
            ffcf ffcf2 = (ffcf)hftp1.N_build();
            ffcf2.getClass();
            hfuo hfuo1 = ffce0.b;
            if(!hfuo1.c()) {
                ffce0.b = ProtoLiteMessage.E(hfuo1);
            }
            ffce0.b.add(ffcf2);
        }
        fdun0.e = ((ffce)hftp0.N_build()).toBytesArray();
        ((fdvl)this.g.get()).o(this.c, fdun0);
    }

    public final void m(fduq fduq0) {
        ConcurrentHashMap concurrentHashMap0;
        String s = ffew.f(fduq0);
        if(fduq0.c) {
            this.j.remove(s);
            this.l.remove(s);
            return;
        }
        byte[] arr_b = fduq0.b.c();
        gfsx gfsx0 = gfqx.a;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffce.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gfsx0 = gfsx.m(((ffce)hftv0));
        }
        catch(hfur unused_ex) {
            ffmn.f("TrustedPeersAdapter", "Received invalid TrustedPackages dataItem payload.", new Object[0]);
        }
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            concurrentHashMap0 = new ConcurrentHashMap();
            for(Object object1: ((ffce)object0).b) {
                HashSet hashSet0 = new HashSet();
                for(Object object2: ((ffcf)object1).d) {
                    hashSet0.add(ffer.a(((fexh)object2)));
                }
                fexh fexh0 = ((ffcf)object1).c;
                if(fexh0 == null) {
                    fexh0 = fexh.a;
                }
                concurrentHashMap0.put(ffer.a(fexh0), hashSet0);
            }
        }
        else {
            concurrentHashMap0 = new ConcurrentHashMap();
        }
        this.j.put(s, concurrentHashMap0);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Trusted Peers Feature: enabled");
        bbpd0.print("Use Host For Id: ");
        bbpd0.println((hzzf.d() ? "enabled" : "disabled"));
        ConcurrentHashMap concurrentHashMap0 = this.k;
        for(Object object0: concurrentHashMap0.keySet()) {
            String s = (String)object0;
            Map map0 = (Map)concurrentHashMap0.get(s);
            if(!map0.isEmpty()) {
                bbpd0.println(a.a(s, "Trusted Apps with Node: ", "; (local app -> remote app)"));
                bbpd0.b();
                for(Object object1: map0.entrySet()) {
                    bbpd0.print(((Map.Entry)object1).getKey());
                    bbpd0.print(" -> ");
                    bbpd0.print(((Map.Entry)object1).getValue());
                    bbpd0.println();
                }
                bbpd0.a();
                bbpd0.println();
            }
        }
        bbpd0.println("======= Additional Debug Information =======");
        bbpd0.println("Local Trusted Peer Map Size: " + this.i.size());
        bbpd0.b();
        for(Object object2: this.i.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object2;
            if(!((Set)map$Entry0.getValue()).isEmpty()) {
                bbpd0.print(map$Entry0.getKey());
                bbpd0.print(" - Trusted Peers: ");
                for(Object object3: ((Set)map$Entry0.getValue())) {
                    bbpd0.print(((fdpl)object3));
                    bbpd0.print(", ");
                }
                bbpd0.println();
            }
        }
        bbpd0.a();
        bbpd0.println("=================");
        bbpd0.println("Nodes with trusted peers data processed:");
        bbpd0.b();
        for(Object object4: this.l) {
            bbpd0.print(((String)object4));
        }
        bbpd0.a();
        bbpd0.println("=================");
        bbpd0.println("Remote Peer Maps");
        ConcurrentHashMap concurrentHashMap1 = this.j;
        for(Object object5: concurrentHashMap1.keySet()) {
            bbpd0.b();
            bbpd0.println("Remote Peer Map for node: " + ((String)object5) + "; Size: " + ((ConcurrentHashMap)concurrentHashMap1.get(((String)object5))).size());
            for(Object object6: ((ConcurrentHashMap)concurrentHashMap1.get(((String)object5))).entrySet()) {
                Map.Entry map$Entry1 = (Map.Entry)object6;
                if(!((Set)map$Entry1.getValue()).isEmpty()) {
                    bbpd0.print(map$Entry1.getKey());
                    bbpd0.print(" - Trusted Peers: ");
                    for(Object object7: ((Set)map$Entry1.getValue())) {
                        bbpd0.print(((fdpl)object7));
                        bbpd0.print(", ");
                    }
                    bbpd0.println();
                }
            }
            bbpd0.a();
        }
    }

    public final boolean n(String s) {
        fdpl fdpl1;
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap1 = (ConcurrentHashMap)this.j.get(s);
        ffmn.a("TrustedPeersService", "recalculateTrustedPairsForNode(%s)", new Object[]{s});
        if(concurrentHashMap1 == null) {
            this.k.remove(s);
            return true;
        }
        boolean z = false;
        Iterator iterator0 = this.i.entrySet().iterator();
    label_8:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            fdpl fdpl0 = (fdpl)((Map.Entry)object0).getKey();
            Iterator iterator1 = ((Set)((Map.Entry)object0).getValue()).iterator();
            do {
                if(!iterator1.hasNext()) {
                    continue label_8;
                }
                Object object1 = iterator1.next();
                fdpl1 = (fdpl)object1;
                Set set0 = (Set)concurrentHashMap1.get(fdpl1);
            }
            while(set0 == null || !set0.contains(fdpl0));
            concurrentHashMap0.put(fdpl0, fdpl1);
            z = true;
        }
        if(concurrentHashMap0.isEmpty()) {
            this.k.remove(s);
            return true;
        }
        ConcurrentHashMap concurrentHashMap2 = this.k;
        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap)concurrentHashMap2.get(s);
        if(concurrentHashMap3 == null) {
            concurrentHashMap3 = new ConcurrentHashMap();
        }
        for(Object object2: concurrentHashMap0.entrySet()) {
            fdpl fdpl2 = (fdpl)((Map.Entry)object2).getKey();
            fdpl fdpl3 = (fdpl)((Map.Entry)object2).getValue();
            if(!fdpl3.equals(((fdpl)concurrentHashMap3.get(fdpl2)))) {
                ffes ffes0 = new ffes(this, s, fdpl3, fdpl2);
                this.r.add(ffes0);
            }
        }
        ffmn.a("TrustedPeersService", "All renames enqueued. Enqueueing onNodeTrustedPeersUpdated", new Object[0]);
        ffet ffet0 = new ffet(this, s);
        this.r.add(ffet0);
        concurrentHashMap2.put(s, concurrentHashMap0);
        return z;
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.q(((fduq)arrayList0.get(v1)))) {
                this.h();
            }
        }
    }

    public final void p(PackageInfo packageInfo0) {
        fdpl fdpl0;
        String s = this.m.a().a;
        String s1 = packageInfo0.packageName;
        ApplicationInfo applicationInfo0 = packageInfo0.applicationInfo;
        if(applicationInfo0 != null && applicationInfo0.metaData != null && applicationInfo0.metaData.containsKey("wear-trusted-peer-prefix-map")) {
            try {
                fdpl0 = fdpn.b(this.n, s1, packageInfo0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                ffmn.g("TrustedPeersService", packageManager$NameNotFoundException0, "Package not found.", new Object[0]);
                return;
            }
            ffeb ffeb0 = new ffeb();
            String s2 = applicationInfo0.metaData.getString("wear-trusted-peer-prefix-map");
            if(!gfta.c(s2)) {
                ConcurrentHashMap concurrentHashMap0 = this.q;
                if(!s2.equals(concurrentHashMap0.get(ffeb0))) {
                    concurrentHashMap0.put(ffeb0, s2);
                    ConcurrentHashMap concurrentHashMap1 = new ConcurrentHashMap();
                    gfud gfud0 = gfud.g(",").i();
                    gfud gfud1 = gfud.g(":").i();
                    for(Object object0: gfud0.l(s2)) {
                        String s3 = (String)object0;
                        List list0 = gfud1.n(s3);
                        if(list0.size() == 3) {
                            concurrentHashMap1.put(((String)list0.get(0)), fdpn.c(((String)list0.get(1)), ((String)list0.get(2))));
                        }
                        else {
                            ffmn.f("TrustedPeersAdapter", "parseAppKeysWithPrefix - %s has an invalid entry: %s", new Object[]{s1, s3});
                        }
                    }
                    ffmn.a("TrustedPeersAdapter", "parseAppKeysWithPrefix: metaDataValue: %s , result: %s", new Object[]{s2, concurrentHashMap1});
                    ConcurrentHashMap concurrentHashMap2 = this.o;
                    Set set0 = (Set)concurrentHashMap2.get(s);
                    if(set0 == null) {
                        set0 = new HashSet();
                    }
                    set0.add(ffeb0);
                    concurrentHashMap2.put(s, set0);
                    this.p.put(ffeb0, concurrentHashMap1);
                    gfsx.m(fdpl0);
                }
            }
        }
    }

    private final boolean q(fduq fduq0) {
        String s = fduq0.b.c.getHost();
        if(this.m.a().a.equals(s)) {
            return false;
        }
        return this.c.equals(fduq0.a) ? fduq0.b.b.startsWith("/trusted_packages") : false;
    }
}

