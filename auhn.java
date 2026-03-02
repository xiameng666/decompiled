import android.content.IntentFilter;
import com.google.android.gms.cast.CastDevice;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class auhn {
    final Map a;
    private final avjh b;
    private final gful_cronetEngineProvider c;
    private final ScheduledExecutorService d;
    private ScheduledFuture e;
    private final Map f;
    private final Map g;
    private final Set h;
    private final Map i;
    private final Set j;
    private long k;

    public auhn(ScheduledExecutorService scheduledExecutorService0) {
        this.b = new avjh("PublishedDeviceManager");
        this.c = gfus.a(((gful_cronetEngineProvider)new auhk()));
        this.f = new ConcurrentHashMap();
        this.a = new HashMap();
        this.g = new HashMap();
        this.h = new HashSet();
        this.i = new HashMap();
        this.j = new HashSet();
        this.d = scheduledExecutorService0;
    }

    public final CastDevice a(String s) {
        synchronized(this) {
            if(s != null) {
                aujj aujj0 = (aujj)this.f.get(s);
                if(aujj0 != null) {
                    return aujj0.d();
                }
            }
        }
        return null;
    }

    public final aujj b(String s) {
        synchronized(this) {
            String s1 = (String)this.g.get(s);
            if(s1 != null) {
                return (aujj)this.f.get(s1);
            }
        }
        return null;
    }

    public final aujj c(String s) {
        aujj aujj0;
        synchronized(this) {
            aujj0 = (aujj)this.f.get(s);
        }
        return aujj0;
    }

    public final aujk d(String s) {
        synchronized(this) {
            for(Object object0: this.a.values()) {
                aujk aujk0 = (aujk)object0;
                if(aujk0.d().f().equals(s)) {
                    return aujk0;
                }
            }
        }
        return null;
    }

    public final aujk e(String s) {
        aujk aujk0;
        synchronized(this) {
            aujk0 = (aujk)this.a.get(s);
        }
        return aujk0;
    }

    public final Map f() {
        synchronized(this) {
        }
        return this.f;
    }

    public final void g(auhm auhm0) {
        synchronized(this) {
            if(auhm0 == null) {
                return;
            }
            this.h.add(auhm0);
        }
    }

    public final void h(String s, aubi aubi0, String s1) {
        synchronized(this) {
            String s2 = aubi0.e.e();
            this.b.q("Adding reference to session %s on %s by controller %s", s, s2, aubi0);
            Map map0 = this.i;
            if(map0.containsKey(s)) {
                ((Set)map0.get(s)).add(aubi0);
            }
            else {
                HashSet hashSet0 = new HashSet();
                hashSet0.add(aubi0);
                map0.put(s, hashSet0);
            }
            CastDevice castDevice0 = aubi0.a();
            if(castDevice0 == null) {
                castDevice0 = aubi0.e;
            }
            this.q(s, castDevice0, s1, true);
        }
    }

    // Detected as a lambda impl.
    public final void i() {
        boolean z;
        Collection collection0;
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = this.e;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
                this.e = null;
            }
            long v2 = System.currentTimeMillis();
            this.k = v2;
            avjh avjh0 = this.b;
            avjh0.n("publish devices at timestamp: %d", Long.valueOf(v2));
            HashMap hashMap0 = new HashMap();
            for(Object object0: this.j) {
                for(Object object1: ((auwe)object0).k.z()) {
                    String s = ((auwv)object1).a;
                    if(hashMap0.containsKey(s)) {
                        avjh0.d("More than one multizone device with the same deviceId %s", new Object[]{s});
                    }
                    hashMap0.put(s, ((auwv)object1));
                }
            }
            if(hashMap0.isEmpty()) {
                collection0 = this.f.values();
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: this.f.entrySet()) {
                    String s1 = (String)((Map.Entry)object2).getKey();
                    aujj aujj0 = (aujj)((Map.Entry)object2).getValue();
                    auwv auwv0 = (auwv)hashMap0.get(s1);
                    if(auwv0 != null) {
                        aujd aujd0 = aujj0.a;
                        if(aujd0 == null) {
                            z = aujj0.b.l();
                        }
                        else if(aujd0.p == 0) {
                            z = aujd0.c.l();
                        }
                        else {
                            z = aujd0.m;
                        }
                        if(z) {
                            double f = auwv0.a();
                            aujd aujd1 = aujj0.a;
                            if(aujd1 != null) {
                                aujd1.q = f;
                            }
                            aujj0.i = f;
                            if(aujd1 != null) {
                                aujd1.g(2, null, null, null);
                            }
                            aujj0.h = 2;
                            avjh0.r("Published device %s (%s) got updated from Multizone Member, volume: %s, state: %s", aujj0.d().e(), aujj0.d().f(), Double.valueOf(aujj0.b()), Integer.valueOf(aujj0.c()));
                        }
                    }
                    arrayList0.add(aujj0);
                }
                collection0 = arrayList0;
            }
            ArrayList arrayList1 = new ArrayList(this.h);
            int v3 = arrayList1.size();
            for(int v1 = 0; v1 < v3; ++v1) {
                ((auhm)arrayList1.get(v1)).a(collection0, this.a.values());
            }
        }
    }

    public final void j(Map map0, boolean z) {
        Iterator iterator2;
        aujj aujj2;
        boolean z1;
        synchronized(this) {
            Map map1 = this.f;
            Iterator iterator0 = map0.entrySet().iterator();
            if(map0.size() == map1.size()) {
                z1 = false;
                goto label_8;
            }
        alab1:
            while(true) {
                while(true) {
                    z1 = true;
                label_8:
                    if(!iterator0.hasNext()) {
                        break alab1;
                    }
                    Object object0 = iterator0.next();
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    aujj aujj0 = (aujj)map1.get(map$Entry0.getKey());
                    if(aujj0 == null) {
                        break;
                    }
                    aujj aujj1 = (aujj)map$Entry0.getValue();
                    if(aujj1 != null && aujj0.d().equals(aujj1.d()) && aujj0.c() == aujj1.c() && aurf.u(aujj0.c, aujj1.c) && aujj0.j == aujj1.j) {
                        List list0 = aujj0.f;
                        List list1 = aujj1.f;
                        if(list0.size() == list1.size() && aurf.r(aujj0.i, aujj1.i) && aujj0.d.equals(aujj1.d) && aujj0.g.equals(aujj1.g) && aujj0.k == aujj1.k) {
                            Iterator iterator1 = list1.iterator();
                            while(true) {
                                if(!iterator1.hasNext()) {
                                    goto label_8;
                                }
                                Object object1 = iterator1.next();
                                if(avjn.o(list0, ((IntentFilter)object1))) {
                                    continue;
                                }
                                goto label_22;
                            }
                        }
                        else {
                            goto label_22;
                        }
                    }
                    else {
                    label_22:
                        aujj2 = (aujj)map$Entry0.getValue();
                        iterator2 = new HashMap(this.a).entrySet().iterator();
                    }
                label_24:
                    if(!iterator2.hasNext()) {
                        break;
                    }
                    Object object2 = iterator2.next();
                    Map.Entry map$Entry1 = (Map.Entry)object2;
                    Object object3 = map$Entry1.getKey();
                    String s = (String)this.g.get(object3);
                    if(s == null || !s.equals(aujj2.d().f())) {
                        goto label_24;
                    }
                    this.q(((String)map$Entry1.getKey()), aujj2.d(), ((aujk)map$Entry1.getValue()).m, false);
                    goto label_24;
                }
            }
            map1.clear();
            map1.putAll(map0);
            if(!z1 && !this.u() && !z) {
                return;
            }
            this.r();
        }
    }

    public final void k(auwe auwe0) {
        synchronized(this) {
            this.j.add(auwe0);
        }
    }

    public final void l(auhm auhm0) {
        synchronized(this) {
            if(auhm0 == null) {
                return;
            }
            this.h.remove(auhm0);
        }
    }

    public final void m(String s, aubi aubi0) {
        synchronized(this) {
            if(s != null) {
                Set set0 = (Set)this.i.get(s);
                if(set0 != null) {
                    String s1 = aubi0.e.e();
                    this.b.q("Removing reference from session %s on %s by controller %s", s, s1, aubi0);
                    set0.remove(aubi0);
                    if(set0.isEmpty()) {
                        this.t(s);
                    }
                }
            }
        }
    }

    public final void n(auwe auwe0) {
        synchronized(this) {
            this.j.remove(auwe0);
        }
    }

    public final void o(String s, String s1) {
        synchronized(this) {
            Map map0 = this.g;
            if(map0.containsKey(s)) {
                map0.put(s, s1);
                aujj aujj0 = (aujj)this.f.get(s1);
                aujk aujk0 = (aujk)this.a.get(s);
                if(aujk0 != null) {
                    if(aujj0 != null) {
                        this.q(s, aujj0.d(), aujk0.m, true);
                        return;
                    }
                    aujk0.h();
                }
            }
        }
    }

    public final void p(String s, int v) {
        synchronized(this) {
            aujj aujj0 = (aujj)this.f.get(s);
            if(aujj0 != null && aujj0.j != v) {
                aujj0.j = v;
                this.r();
            }
        }
    }

    private final void q(String s, CastDevice castDevice0, String s1, boolean z) {
        synchronized(this) {
            if(s1 != null && !auuv.a.contains(s1) && !avjn.p(s1) && !hqsf.a.b().e().b.contains(s1)) {
                aujj aujj0 = (aujj)this.f().get(castDevice0.f());
                Object object0 = null;
                if(aujj0 != null) {
                    String s2 = UUID.randomUUID().toString();
                    aujk aujk0 = (aujk)this.a.get(s);
                    if(aujk0 != null) {
                        s2 = aujk0.d().f();
                    }
                    atrq atrq0 = new atrq(castDevice0);
                    atrq0.a = s2;
                    CastDevice castDevice1 = atrq0.a();
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: aujj0.f) {
                        IntentFilter intentFilter0 = new IntentFilter();
                        Iterator iterator1 = ((IntentFilter)object1).categoriesIterator();
                        while(iterator1.hasNext()) {
                            Object object2 = iterator1.next();
                            String s3 = (String)object2;
                            if(!auuv.l(s3)) {
                                if(auuv.k(s3, "com.google.android.gms.cast.CATEGORY_CAST")) {
                                    s3 = s3.replace("com.google.android.gms.cast.CATEGORY_CAST", "com.google.android.gms.cast.CATEGORY_CAST_DYNAMIC_SESSION");
                                }
                                else {
                                    s3 = auuv.k(s3, "com.google.android.gms.cast.CATEGORY_CAST_GHA") ? s3.replace("com.google.android.gms.cast.CATEGORY_CAST_GHA", "com.google.android.gms.cast.CATEGORY_CAST_DYNAMIC_SESSION_GHA") : null;
                                }
                            }
                            if(s3 != null) {
                                intentFilter0.addCategory(s3);
                            }
                        }
                        if(intentFilter0.countCategories() > 0) {
                            arrayList0.add(intentFilter0);
                        }
                    }
                    if(!arrayList0.isEmpty()) {
                        object0 = new aujk(castDevice1, aujj0.d, aujj0.e, arrayList0, aujj0.c, aujj0.j, aujj0.c(), aujj0.b(), aujj0.g, s1, s, castDevice0.f());
                    }
                }
                if(object0 != null) {
                    this.a.put(s, object0);
                    this.b.p("add or update session (%s) with endpoint deviceId = %s", s, castDevice0.f());
                    this.g.put(s, castDevice0.f());
                    if(z) {
                        this.s();
                    }
                }
            }
        }
    }

    private final void r() {
        synchronized(this) {
            long v1 = System.currentTimeMillis() - this.k;
            gful_cronetEngineProvider gful0 = this.c;
            if(v1 < ((long)(((Long)gful0.mr())))) {
                if(this.e == null) {
                    long v2 = ((long)(((Long)gful0.mr()))) - v1;
                    this.b.n("delay the device publication by %d ms", Long.valueOf(v2));
                    auhl auhl0 = () -> {
                        boolean z;
                        Collection collection0;
                        synchronized(this) {
                            ScheduledFuture scheduledFuture0 = this.e;
                            if(scheduledFuture0 != null) {
                                scheduledFuture0.cancel(false);
                                this.e = null;
                            }
                            long v2 = System.currentTimeMillis();
                            this.k = v2;
                            avjh avjh0 = this.b;
                            avjh0.n("publish devices at timestamp: %d", Long.valueOf(v2));
                            HashMap hashMap0 = new HashMap();
                            for(Object object0: this.j) {
                                for(Object object1: ((auwe)object0).k.z()) {
                                    String s = ((auwv)object1).a;
                                    if(hashMap0.containsKey(s)) {
                                        avjh0.d("More than one multizone device with the same deviceId %s", new Object[]{s});
                                    }
                                    hashMap0.put(s, ((auwv)object1));
                                }
                            }
                            if(hashMap0.isEmpty()) {
                                collection0 = this.f.values();
                            }
                            else {
                                ArrayList arrayList0 = new ArrayList();
                                for(Object object2: this.f.entrySet()) {
                                    String s1 = (String)((Map.Entry)object2).getKey();
                                    aujj aujj0 = (aujj)((Map.Entry)object2).getValue();
                                    auwv auwv0 = (auwv)hashMap0.get(s1);
                                    if(auwv0 != null) {
                                        aujd aujd0 = aujj0.a;
                                        if(aujd0 == null) {
                                            z = aujj0.b.l();
                                        }
                                        else if(aujd0.p == 0) {
                                            z = aujd0.c.l();
                                        }
                                        else {
                                            z = aujd0.m;
                                        }
                                        if(z) {
                                            double f = auwv0.a();
                                            aujd aujd1 = aujj0.a;
                                            if(aujd1 != null) {
                                                aujd1.q = f;
                                            }
                                            aujj0.i = f;
                                            if(aujd1 != null) {
                                                aujd1.g(2, null, null, null);
                                            }
                                            aujj0.h = 2;
                                            avjh0.r("Published device %s (%s) got updated from Multizone Member, volume: %s, state: %s", aujj0.d().e(), aujj0.d().f(), Double.valueOf(aujj0.b()), Integer.valueOf(aujj0.c()));
                                        }
                                    }
                                    arrayList0.add(aujj0);
                                }
                                collection0 = arrayList0;
                            }
                            ArrayList arrayList1 = new ArrayList(this.h);
                            int v3 = arrayList1.size();
                            for(int v1 = 0; v1 < v3; ++v1) {
                                ((auhm)arrayList1.get(v1)).a(collection0, this.a.values());
                            }
                        }
                    };
                    this.e = this.d.schedule(auhl0, v2, TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            }
            this.i();
        }
    }

    private final void s() {
        synchronized(this) {
            this.u();
            this.r();
        }
    }

    private final void t(String s) {
        synchronized(this) {
            this.a.remove(s);
            this.g.remove(s);
            this.i.remove(s);
            this.s();
        }
    }

    private final boolean u() {
        int v1;
        Map map0;
        synchronized(this) {
            map0 = this.a;
            v1 = map0.size();
            Iterator iterator0 = map0.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)((Map.Entry)object0).getKey();
                Map map1 = this.g;
                String s1 = (String)map1.get(s);
                if(!((aujk)((Map.Entry)object0).getValue()).o && s1 != null && this.a(s1) == null) {
                    this.b.n("the session (%s) is detached and removed", s);
                    iterator0.remove();
                    map1.remove(s);
                }
            }
        }
        return map0.size() != v1;
    }
}

