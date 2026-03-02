import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsSearchOptions;
import com.google.android.gms.mdns.MdnsServiceInfo;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

final class auhh extends augg implements cqsk {
    public final Map a;
    public volatile long b;
    final Set c;
    private final Map k;
    private final MdnsOptions l;
    private int m;
    private String n;
    private boolean o;
    private final gful_cronetEngineProvider p;
    private cqsj q;
    private final Object r;

    public auhh(Context context0, ScheduledExecutorService scheduledExecutorService0, aulm aulm0, ausg ausg0, atxp atxp0) {
        super(context0, scheduledExecutorService0, atxp0, "MDNS", aulm0, ausg0);
        this.p = gfus.a(((gful_cronetEngineProvider)new auhf()));
        this.r = new Object();
        this.a = new ConcurrentHashMap();
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.k = new HashMap();
        this.b = -1L;
        batl.d(gfud.e('.').n("_googlecast._tcp.local").size() == 3, "Invalid service type %s: should include exactly 3 labels", new Object[]{"_googlecast._tcp.local"});
        batl.q("Cast mDNS Scanner");
        this.l = new MdnsOptions("_googlecast._tcp.local", "Cast mDNS Scanner");
    }

    @Override  // augg
    protected final void a(Set set0, int v) {
        if(this.r()) {
            this.a.clear();
        }
        this.q();
        this.d.p("Scan settings updated. New filterCriteria (%s). Scanner flag (%d)", TextUtils.join(",", set0), Integer.valueOf(v));
        Set set1 = this.c;
        HashSet hashSet0 = new HashSet(set1);
        set1.clear();
        set1.addAll(set0);
        Map map0 = this.k;
        map0.clear();
        synchronized(set1) {
            for(Object object0: set1) {
                map0.put(avjn.h(((String)object0)), ((String)object0));
            }
        }
        if(this.m != v) {
            this.m = v;
        }
        HashSet hashSet1 = new HashSet();
        if(!hashSet0.isEmpty()) {
            for(Object object1: hashSet0) {
                String s = (String)object1;
                if(!set0.contains(s)) {
                    hashSet1.add(s);
                }
            }
        }
        if(!hashSet1.isEmpty()) {
            for(Object object2: this.a.values()) {
                auhi auhi0 = (auhi)object2;
                if(!hashSet1.isEmpty()) {
                    auhi0.e.keySet().removeAll(hashSet1);
                }
                if(auhi0.b != null) {
                    this.p(auhi0);
                }
            }
        }
        synchronized(this.r) {
            if(this.q != null) {
                this.d.m("Updating mDNS search options.");
                if(((Boolean)this.p.mr()).booleanValue()) {
                    MdnsSearchOptions mdnsSearchOptions0 = auhh.o(this.k.keySet(), false);
                    cqsj cqsj0 = this.q;
                    gftb.check(cqsj0);
                    cqsj0.c(this);
                    cqsj cqsj1 = this.q;
                    gftb.check(cqsj1);
                    cqsj1.b(this, mdnsSearchOptions0);
                }
                else {
                    cqsh cqsh0 = new cqsh();
                    cqsh0.b(this.k.keySet());
                    MdnsSearchOptions mdnsSearchOptions1 = cqsh0.a();
                    cqsj cqsj2 = this.q;
                    gftb.check(cqsj2);
                    cqsj2.b(this, mdnsSearchOptions1);
                }
            }
        }
    }

    @Override  // augg
    protected final void b() {
        synchronized(this.r) {
            cqsj cqsj0 = this.q;
            if(cqsj0 != null) {
                cqsj0.c(this);
                this.q = null;
            }
        }
        this.a.clear();
    }

    // Detected as a lambda impl.
    public final void c(MdnsServiceInfo mdnsServiceInfo0) {
        CastDevice castDevice0;
        int v2;
        String s = mdnsServiceInfo0.c;
        avjh avjh0 = this.d;
        avjh0.c("Receive MDNS response with service %s", new Object[]{s});
        long v = SystemClock.elapsedRealtime();
        long v1 = this.b == -1L ? -1L : v - this.b;
        if(((Boolean)this.p.mr()).booleanValue() && !this.o && mdnsServiceInfo0.e().isEmpty()) {
            avjh0.m("Ignoring IPv6-only device on non-IPv6-only network.");
            return;
        }
        if(mdnsServiceInfo0.c() != null && mdnsServiceInfo0.b() == null && !hqsw.d()) {
            avjh0.m("IPv6 support is disabled on an IPv6-only network.");
            return;
        }
        Map map0 = this.a;
        auhi auhi0 = (auhi)map0.get(s);
        if(auhi0 == null) {
            auhi0 = new auhi(s, this.k, this.g);
            v2 = auhi0.a(mdnsServiceInfo0, v, v1);
            if(v2 != 1) {
                avjh0.p("Not adding %s. result(%s)", s, auhi.b(v2));
                return;
            }
            avjh0.n("DeviceEntry created for %s", auhi0);
            map0.put(s, auhi0);
            castDevice0 = null;
        }
        else {
            castDevice0 = auhi0.b;
            v2 = auhi0.a(mdnsServiceInfo0, v, v1);
        }
        if(v2 == 0) {
            String s1 = auhi.b(0);
            avjh0.p("Received response from %s with result %s", auhi0.b, s1);
            this.p(auhi0);
            return;
        }
        String s2 = auhi.b(v2);
        avjh0.f("Received response from %s with result %s", new Object[]{auhi0.b, s2});
        switch(v2) {
            case 1: {
                this.g.n(auhi0.b);
                this.p(auhi0);
                return;
            }
            case 0: 
            case 2: {
                this.p(auhi0);
                return;
            }
            case 3: {
                if(castDevice0 != null) {
                    avjh0.n("notifyDeviceOffline: because it\'s a different device; newDevice=%s", auhi0.b);
                    this.e(castDevice0);
                }
                this.p(auhi0);
            }
        }
    }

    @Override  // augg
    protected final boolean d(Set set0, int v) {
        MdnsSearchOptions mdnsSearchOptions0;
        this.d.p("Start scan with criteria (%s). Scanner flags (%d)", TextUtils.join(",", set0), Integer.valueOf(v));
        Set set1 = this.c;
        set1.clear();
        set1.addAll(set0);
        this.m = v;
        if(this.r()) {
            this.a.clear();
        }
        this.q();
        Map map0 = this.k;
        map0.clear();
        synchronized(set1) {
            for(Object object0: set1) {
                map0.put(avjn.h(((String)object0)), ((String)object0));
            }
        }
        synchronized(this.r) {
            this.q = new cqut(this.e, this.l);
            if(((Boolean)this.p.mr()).booleanValue()) {
                mdnsSearchOptions0 = auhh.o(this.k.keySet(), ((boolean)(avjg.a(v) ^ 1)));
            }
            else {
                cqsh cqsh0 = new cqsh();
                cqsh0.b(this.k.keySet());
                cqsh0.a = avjg.a(v) ^ 1;
                mdnsSearchOptions0 = cqsh0.a();
            }
            cqsj cqsj0 = this.q;
            gftb.check(cqsj0);
            cqsj0.b(this, mdnsSearchOptions0);
        }
        if(hqsw.a.c().i()) {
            this.b = SystemClock.elapsedRealtime();
        }
        return true;
    }

    public final void e(CastDevice castDevice0) {
        new auln(this.h.a, this.h.b, castDevice0).b();
    }

    @Override  // cqsk
    public final void f(List list0, int v) {
        auhg auhg0 = new auhg(this, v);
        this.f.execute(auhg0);
    }

    @Override  // cqsk
    public final void g(int v, int v1) {
        auhc auhc0 = new auhc(this, v, v1);
        this.f.execute(auhc0);
    }

    @Override  // cqsk
    public final void h() {
        this.d.d("onSearchFailedToStart", new Object[0]);
        this.g.x();
    }

    @Override  // cqsk
    public final void i(int v) {
        this.d.d("onSearchStoppedWithError: %d", new Object[]{v});
    }

    @Override  // cqsk
    public final void j(MdnsServiceInfo mdnsServiceInfo0) {
        auhe auhe0 = () -> {
            CastDevice castDevice0;
            int v2;
            String s = mdnsServiceInfo0.c;
            avjh avjh0 = this.d;
            avjh0.c("Receive MDNS response with service %s", new Object[]{s});
            long v = SystemClock.elapsedRealtime();
            long v1 = this.b == -1L ? -1L : v - this.b;
            if(((Boolean)this.p.mr()).booleanValue() && !this.o && mdnsServiceInfo0.e().isEmpty()) {
                avjh0.m("Ignoring IPv6-only device on non-IPv6-only network.");
                return;
            }
            if(mdnsServiceInfo0.c() != null && mdnsServiceInfo0.b() == null && !hqsw.d()) {
                avjh0.m("IPv6 support is disabled on an IPv6-only network.");
                return;
            }
            Map map0 = this.a;
            auhi auhi0 = (auhi)map0.get(s);
            if(auhi0 == null) {
                auhi0 = new auhi(s, this.k, this.g);
                v2 = auhi0.a(mdnsServiceInfo0, v, v1);
                if(v2 != 1) {
                    avjh0.p("Not adding %s. result(%s)", s, auhi.b(v2));
                    return;
                }
                avjh0.n("DeviceEntry created for %s", auhi0);
                map0.put(s, auhi0);
                castDevice0 = null;
            }
            else {
                castDevice0 = auhi0.b;
                v2 = auhi0.a(mdnsServiceInfo0, v, v1);
            }
            if(v2 == 0) {
                String s1 = auhi.b(0);
                avjh0.p("Received response from %s with result %s", auhi0.b, s1);
                this.p(auhi0);
                return;
            }
            String s2 = auhi.b(v2);
            avjh0.f("Received response from %s with result %s", new Object[]{auhi0.b, s2});
            switch(v2) {
                case 1: {
                    this.g.n(auhi0.b);
                    this.p(auhi0);
                    return;
                }
                case 0: 
                case 2: {
                    this.p(auhi0);
                    return;
                }
                case 3: {
                    if(castDevice0 != null) {
                        avjh0.n("notifyDeviceOffline: because it\'s a different device; newDevice=%s", auhi0.b);
                        this.e(castDevice0);
                    }
                    this.p(auhi0);
                }
            }
        };
        this.f.execute(auhe0);
    }

    @Override  // cqsk
    public final void k(String s) {
        auhb auhb0 = new auhb(this, s);
        this.f.execute(auhb0);
    }

    @Override  // cqsk
    public final void l(MdnsServiceInfo mdnsServiceInfo0) {
        auhd auhd0 = () -> {
            CastDevice castDevice0;
            int v2;
            String s = mdnsServiceInfo0.c;
            avjh avjh0 = this.d;
            avjh0.c("Receive MDNS response with service %s", new Object[]{s});
            long v = SystemClock.elapsedRealtime();
            long v1 = this.b == -1L ? -1L : v - this.b;
            if(((Boolean)this.p.mr()).booleanValue() && !this.o && mdnsServiceInfo0.e().isEmpty()) {
                avjh0.m("Ignoring IPv6-only device on non-IPv6-only network.");
                return;
            }
            if(mdnsServiceInfo0.c() != null && mdnsServiceInfo0.b() == null && !hqsw.d()) {
                avjh0.m("IPv6 support is disabled on an IPv6-only network.");
                return;
            }
            Map map0 = this.a;
            auhi auhi0 = (auhi)map0.get(s);
            if(auhi0 == null) {
                auhi0 = new auhi(s, this.k, this.g);
                v2 = auhi0.a(mdnsServiceInfo0, v, v1);
                if(v2 != 1) {
                    avjh0.p("Not adding %s. result(%s)", s, auhi.b(v2));
                    return;
                }
                avjh0.n("DeviceEntry created for %s", auhi0);
                map0.put(s, auhi0);
                castDevice0 = null;
            }
            else {
                castDevice0 = auhi0.b;
                v2 = auhi0.a(mdnsServiceInfo0, v, v1);
            }
            if(v2 == 0) {
                String s1 = auhi.b(0);
                avjh0.p("Received response from %s with result %s", auhi0.b, s1);
                this.p(auhi0);
                return;
            }
            String s2 = auhi.b(v2);
            avjh0.f("Received response from %s with result %s", new Object[]{auhi0.b, s2});
            switch(v2) {
                case 1: {
                    this.g.n(auhi0.b);
                    this.p(auhi0);
                    return;
                }
                case 0: 
                case 2: {
                    this.p(auhi0);
                    return;
                }
                case 3: {
                    if(castDevice0 != null) {
                        avjh0.n("notifyDeviceOffline: because it\'s a different device; newDevice=%s", auhi0.b);
                        this.e(castDevice0);
                    }
                    this.p(auhi0);
                }
            }
        };
        this.f.execute(auhd0);
    }

    @Override  // cqsk
    public final void m() {
    }

    @Override  // cqsk
    public final void n() {
    }

    private static MdnsSearchOptions o(Collection collection0, boolean z) {
        cqsh cqsh0 = new cqsh();
        cqsh0.b(collection0);
        cqsh0.a = z;
        cqsh0.c();
        cqsh0.c = 3;
        cqsh0.d();
        cqsh0.e = 351110060L;
        return cqsh0.a();
    }

    private final void p(auhi auhi0) {
        CastDevice castDevice0 = auhi0.b;
        if(castDevice0 == null) {
            return;
        }
        HashSet hashSet0 = new HashSet(auhi0.e.keySet());
        new aulo(this.h.a, this.h.b, castDevice0, hashSet0, auhi0.c, auhi0.d, auhi0.f, System.currentTimeMillis()).b();
    }

    private final void q() {
        if(!((Boolean)this.p.mr()).booleanValue()) {
            return;
        }
        this.o = this.j.k();
    }

    private final boolean r() {
        String s = this.j.b(null);
        if(!aurf.u(this.n, s)) {
            this.n = s;
            return true;
        }
        return false;
    }
}

