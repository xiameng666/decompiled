import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.mdns.MdnsSearchOptions;
import com.google.android.gms.mdns.MdnsServiceInfo.TextEntry;
import com.google.android.gms.mdns.MdnsServiceInfo;
import j..util.DesugarCollections;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class cqsw {
    public static final cqwd a;
    public final cqsc b;
    public final String c;
    public final String[] d;
    public final cqtn e;
    public final Object f;
    public final Set g;
    public final Map h;
    public MdnsSearchOptions i;
    public long j;
    public cqub k;
    public cqsv l;
    private final gful_cronetEngineProvider m;

    static {
        cqsw.a = new cqwd("MdnsServiceTypeClient");
    }

    public cqsw(String s, cqtn cqtn0, ScheduledExecutorService scheduledExecutorService0) {
        this.f = new Object();
        this.g = new bxf();
        this.m = gfus.a(((gful_cronetEngineProvider)new cqsu()));
        this.j = 0L;
        this.k = null;
        this.l = null;
        this.b = new cqsc(scheduledExecutorService0);
        cqwc.b();
        this.c = s;
        this.e = cqtn0;
        this.h = DesugarCollections.synchronizedMap(new HashMap());
        this.d = TextUtils.split(s, "\\.");
    }

    public static MdnsServiceInfo a(cqse cqse0, String[] arr_s) {
        String s1;
        String[] arr_s1 = cqse0.d().b;
        int v = cqse0.d().a;
        String s = null;
        if(cqse0.o()) {
            Inet4Address inet4Address0 = cqse0.b().b;
            s1 = inet4Address0 == null ? null : inet4Address0.getHostAddress();
        }
        else {
            s1 = null;
        }
        if(cqse0.p()) {
            Inet6Address inet6Address0 = cqse0.c().a;
            if(inet6Address0 != null) {
                s = inet6Address0.getHostAddress();
            }
        }
        if(s1 == null && s == null) {
            throw new IllegalArgumentException("Either ipv4Address or ipv6Address must be non-null");
        }
        String s2 = cqse0.f();
        if(s2 == null) {
            throw new IllegalStateException("mDNS response must have non-null service instance name");
        }
        List list0 = cqse0.h();
        cqto cqto0 = cqse0.e();
        ggdy ggdy0 = gged_interceptors.e(cqto0.a.size());
        for(Object object0: cqto0.a) {
            ggdy0.i(((MdnsServiceInfo.TextEntry)object0).toString());
        }
        return new MdnsServiceInfo(s2, arr_s, list0, arr_s1, v, s1, s, ggdy0.h(), DesugarCollections.unmodifiableList(cqse0.e().a), cqse0.a());
    }

    public final void b(int v, int v1) {
        synchronized(this) {
            bxe bxe0 = new bxe(((bxf)this.g));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                ((cqsk)object0).g(v, v1);
            }
        }
    }

    public final void c(cqse cqse0) {
        synchronized(this) {
            if(this.d()) {
                Object object0 = this.f;
                synchronized(object0) {
                    if(cqse0.s()) {
                        this.e(cqse0.f());
                    }
                    else {
                        this.f(cqse0);
                    }
                }
            }
            else if(cqse0.s()) {
                this.e(cqse0.f());
            }
            else {
                this.f(cqse0);
            }
            if(cqse0.q()) {
                int v2 = (int)cqse0.d().c(SystemClock.elapsedRealtime());
                String s = cqse0.f();
                cqsw.a.c("Service record %s has remaining TTL of %d mSec", s, Integer.valueOf(v2));
                Object object1 = this.f;
                synchronized(object1) {
                    if(this.k != null && this.k.a(false)) {
                        cqsc cqsc0 = this.b;
                        cqsv cqsv0 = new cqsv(this, this.k);
                        HashSet hashSet0 = new HashSet(this.h.values());
                        long v4 = SystemClock.elapsedRealtime();
                        long v5 = cqsc0.e - v4;
                        cqwd cqwd0 = cqsc0.a;
                        cqwd0.b("nextQueryDelayInMs = %d", Long.valueOf(v5));
                        gful_cronetEngineProvider gful0 = cqsc0.b;
                        long v6 = (long)(((Long)gful0.mr()));
                        if(v5 >= v6 + v6) {
                            long v7 = cqsc.d(hashSet0);
                            long v8 = v7 + v4;
                            if(v8 >= cqsc0.d && Math.abs(v8 - cqsc0.e) > ((long)(((Long)gful0.mr())))) {
                                long v9 = cqsc0.a(v7);
                                cqwd0.c("Rescheduling query delay from %d to %d mSec", Long.valueOf(cqsc0.e - v4), Long.valueOf(v9));
                                Future future0 = cqsc0.f;
                                if(future0 != null) {
                                    future0.cancel(true);
                                }
                                cqsc0.f = ((bbll)cqsc0.c).g(cqsv0, v9, TimeUnit.MILLISECONDS);
                                cqsc0.e = v9 + v4;
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean d() {
        return ((Boolean)this.m.mr()).booleanValue() ? true : this.i != null && this.i.c;
    }

    private final void e(String s) {
        if(s != null) {
            this.h.remove(s);
            bxe bxe0 = new bxe(((bxf)this.g));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                ((cqsk)object0).k(s);
            }
        }
    }

    private final void f(cqse cqse0) {
        String s = cqse0.f();
        cqsw.a.b("Handling response from service: %s", s);
        Map map0 = this.h;
        cqse cqse1 = (cqse)map0.get(cqse0.f());
        boolean z = true;
        boolean z1 = false;
        if(cqse1 == null) {
            String s1 = cqse0.f();
            if(s1 != null) {
                map0.put(s1, cqse0);
            }
        }
        else if(cqse1.t(cqse0)) {
            z1 = true;
            z = false;
            cqse0 = cqse1;
        }
        else {
            cqse0 = cqse1;
            z = false;
        }
        if(cqse0.r() && (z || z1)) {
            MdnsServiceInfo mdnsServiceInfo0 = cqsw.a(cqse0, this.d);
            bxe bxe0 = new bxe(((bxf)this.g));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                cqsk cqsk0 = (cqsk)object0;
                if(z) {
                    cqsk0.j(mdnsServiceInfo0);
                }
                else {
                    cqsk0.l(mdnsServiceInfo0);
                }
            }
        }
    }
}

