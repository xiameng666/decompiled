import android.text.TextUtils;
import com.google.android.gms.mdns.MdnsSearchOptions;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;

public final class cqrq implements cqro, cqtm {
    private static final cqwd a;
    private final cqrn b;
    private final cqtn c;
    private final Map d;

    static {
        cqrq.a = new cqwd("MdnsDiscoveryManager");
    }

    public cqrq(cqrn cqrn0, cqtn cqtn0) {
        this.d = new bxd();
        this.b = cqrn0;
        this.c = cqtn0;
    }

    @Override  // cqro
    public final void a(String s, cqsk cqsk0, MdnsSearchOptions mdnsSearchOptions0) {
        synchronized(this) {
            String s1 = TextUtils.join(",", mdnsSearchOptions0.a);
            cqrq.a.b("Registering listener for subtypes: %s", s1);
            if(this.d.isEmpty()) {
                try {
                    this.c.g();
                }
                catch(IOException iOException0) {
                    a.ae(cqrq.a.a.i(), "Failed to start discover.", iOException0);
                    return;
                }
            }
            Map map0 = this.d;
            cqsw cqsw0 = (cqsw)map0.get(s);
            if(cqsw0 == null) {
                bbll bbll0 = new bbll(1, 10);
                this.b.a.add(bbll0);
                cqsw cqsw1 = new cqsw(s, this.c, bbll0);
                map0.put(s, cqsw1);
                cqsw0 = cqsw1;
            }
            Object object0 = cqsw0.f;
            synchronized(object0) {
                cqsw0.i = mdnsSearchOptions0;
                if(cqsw0.g.add(cqsk0)) {
                    for(Object object1: cqsw0.h.values()) {
                        cqse cqse0 = (cqse)object1;
                        if(cqse0.r()) {
                            cqsk0.j(cqsw.a(cqse0, cqsw0.d));
                        }
                    }
                }
                long v2 = cqsw0.j + 1L;
                cqsw0.j = v2;
                cqsw0.k = new cqub(mdnsSearchOptions0.a, mdnsSearchOptions0.b, v2);
                cqsv cqsv0 = cqsw0.l;
                if(cqsv0 != null) {
                    cqsv0.a();
                }
                cqub cqub0 = cqsw0.k;
                if(cqub0 != null) {
                    cqsw0.l = new cqsv(cqsw0, cqub0);
                    cqsv cqsv1 = cqsw0.l;
                    cqsw0.b.a.a("Scheduling the initial query");
                    cqsw0.b.b(true);
                    cqsw0.b.c(0L, cqsv1);
                }
            }
        }
    }

    @Override  // cqro
    public final void b(String s, cqsk cqsk0) {
        synchronized(this) {
            cqwd cqwd0 = cqrq.a;
            cqwd0.b("Unregistering listener for service type: %s", s);
            cqsw cqsw0 = (cqsw)this.d.get(s);
            if(cqsw0 != null) {
                Object object0 = cqsw0.f;
                synchronized(object0) {
                    Set set0 = cqsw0.g;
                    set0.remove(cqsk0);
                    cqsw0.k = null;
                    if(set0.isEmpty()) {
                        cqsw.a.a("Canceling pending mDNS query due to STOP");
                        cqsv cqsv0 = cqsw0.l;
                        if(cqsv0 != null) {
                            cqsv0.a();
                            cqsw0.l = null;
                        }
                        cqsw0.b.b(false);
                    }
                }
                if(set0.isEmpty()) {
                    this.d.remove(s);
                    if(this.d.isEmpty()) {
                        cqwd0.a("All service type listeners unregistered; stopping discovery");
                        cqtn cqtn0 = this.c;
                        cqtn.a.a("Stop discovery.");
                        if(cqtn0.l != null || cqtn0.m != null) {
                            synchronized(cqtn0.w) {
                                cqtn0.w.clear();
                            }
                            synchronized(cqtn0.x) {
                                cqtn0.x.clear();
                            }
                            cqtn0.g.release();
                            cqtn0.k = true;
                            cqwd cqwd1 = cqtn.a;
                            cqwd1.a("wait For Send Thread To Stop");
                            if(cqtn0.t == null) {
                                ((ggtj)cqwd1.a.j()).x("socket thread is already dead.");
                            }
                            else {
                                cqtn0.h(cqtn0.t);
                                cqtn0.t = null;
                                if(cqtn0.o != null) {
                                    Timer timer0 = cqtn0.n;
                                    if(timer0 != null) {
                                        timer0.cancel();
                                        cqtn0.n = null;
                                        AtomicInteger atomicInteger0 = cqtn0.o;
                                        batl.s(atomicInteger0);
                                        cqtn0.b(atomicInteger0.getAndSet(0));
                                    }
                                }
                            }
                            Thread thread0 = cqtn0.u;
                            if(thread0 != null) {
                                cqtn0.h(thread0);
                                cqtn0.u = null;
                            }
                            Thread thread1 = cqtn0.v;
                            if(thread1 != null) {
                                cqtn0.h(thread1);
                                cqtn0.v = null;
                            }
                            synchronized(cqtn0.h) {
                                cqtn0.l = null;
                                cqtn0.m = null;
                            }
                            Object object1 = cqtn0.i;
                            synchronized(object1) {
                                Timer timer1 = cqtn0.p;
                                if(timer1 != null) {
                                    timer1.cancel();
                                    cqtn0.p = null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // cqtm
    public final void c(int v, int v1) {
        synchronized(this) {
            for(Object object0: this.d.values()) {
                ((cqsw)object0).b(v, v1);
            }
        }
    }

    @Override  // cqtm
    public final void d(cqse cqse0) {
        synchronized(this) {
            List list0 = cqse0.g();
            String[] arr_s = list0.isEmpty() ? null : ((cqry)list0.get(0)).c;
            if(arr_s != null) {
                for(Object object0: this.d.values()) {
                    cqsw cqsw0 = (cqsw)object0;
                    if(Arrays.equals(arr_s, cqsw0.d) || arr_s.length == cqsw0.d.length + 2 && arr_s[1].equals("_sub") && cqsd.e(cqsw0.d, arr_s)) {
                        cqsw0.c(cqse0);
                        return;
                    }
                }
            }
        }
    }
}

