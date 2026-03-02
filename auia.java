import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j..util.DesugarCollections;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class auia {
    public final avjh a;
    public final gful_cronetEngineProvider b;
    public final Queue c;
    public final Context d;
    public final ScheduledExecutorService e;
    public final auaj f;
    public final avaa g;
    public final Set h;
    public final Map i;
    public final atxp j;
    public final aulm k;
    public final List l;
    auhs m;
    private final auhn n;
    private final ausg o;

    public auia(Context context0, ScheduledExecutorService scheduledExecutorService0, auaj auaj0, atxp atxp0, aulm aulm0, ausg ausg0, avaa avaa0, auhn auhn0) {
        this.a = new avjh("TcpProbingScheduler");
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new auhz()));
        this.b = gful0;
        this.c = new PriorityQueue();
        this.i = new HashMap();
        this.d = context0;
        this.e = scheduledExecutorService0;
        this.f = auaj0;
        this.j = atxp0;
        this.k = aulm0;
        this.o = ausg0;
        this.g = avaa0;
        this.n = auhn0;
        long v = (long)(((Long)gful0.mr()));
        this.h = ggog.l();
        this.l = DesugarCollections.synchronizedList(new ArrayList(((int)v)));
    }

    public final void a(auhy auhy0) {
        List list0;
        Set set0 = auhy0.b();
        boolean z = auhy0.b;
        if(!set0.isEmpty()) {
            auah auah0 = auhy0.a;
            Context context0 = this.d;
            avjn avjn0 = avjn.d();
            if(avij.e().h()) {
                if(avjn0.d == null) {
                    cjpc cjpc0 = avjn.e(context0);
                    avjn0.m(cjpd.i(cjpc0, "com.google.android.gms.cast.SETTINGS_KEY_DISABLE_TCP_PROBING_FOR_DISCOVERY", false));
                    cjpc0.g(avjn0);
                }
                if(avjn0.d.booleanValue() && auhy0.a() > 1) {
                    Integer integer0 = auhy0.a();
                    this.a.p("TCP probing is skipped for %s with priority %d", auah0, integer0);
                    return;
                }
            }
            String s = this.o.b(null);
            if(s == null) {
                this.a.g("Failed to get the network ID of current network. Skip probing IP %s", new Object[]{auah0});
                return;
            }
            InetSocketAddress inetSocketAddress0 = auah0.b();
            if((inetSocketAddress0.getAddress() instanceof Inet6Address) && !hqsw.d()) {
                this.a.d("IPv6 is disabled.", new Object[0]);
                return;
            }
            if(!set0.contains(gkfz.k)) {
                Iterator iterator0 = this.n.f().values().iterator();
            label_25:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    aujj aujj0 = (aujj)object0;
                    CastDevice castDevice0 = aujj0.d();
                    if(castDevice0.c.equals(inetSocketAddress0.getAddress())) {
                        int v = inetSocketAddress0.getPort();
                        if(castDevice0.g == v) {
                            for(Object object1: this.h) {
                                String s1 = (String)object1;
                                if(aujj0.d.contains(s1) || aujj0.e.contains(s1)) {
                                    continue;
                                }
                                break label_25;
                            }
                            if(!z) {
                                this.j.k.a.j(auah0);
                                return;
                            }
                        }
                        else {
                            continue;
                        }
                        break;
                    }
                }
            }
            list0 = this.l;
            synchronized(list0) {
                Iterator iterator2 = list0.iterator();
                while(true) {
                    if(!iterator2.hasNext()) {
                        goto label_94;
                    }
                    Object object2 = iterator2.next();
                    auhx auhx0 = (auhx)object2;
                    if(auhx0.c(auhy0)) {
                        return;
                    }
                    Set set1 = this.h;
                    if(set1 == null || set1.isEmpty()) {
                    }
                    else if(TextUtils.isEmpty(s)) {
                        auhx0.c.d("networkId can\'t be null or empty.", new Object[0]);
                    }
                    else {
                        aual aual0 = auhx0.m;
                        if(aual0.c.p() && auhx0.A == null) {
                            auhx0.g.clear();
                            auhx0.h.clear();
                            auhx0.i.clear();
                            auhx0.o = null;
                            auhx0.t = null;
                            auhx0.u = null;
                            auhx0.v = null;
                            auhx0.y = null;
                            auhx0.w = null;
                            auhx0.x = false;
                            auhx0.z = null;
                            avjh avjh0 = auhx0.c;
                            avjh0.p("Activate %s, requestRAT=%b", auah0, Boolean.valueOf(auhy0.b));
                            auhx0.g.addAll(set1);
                            auhx0.w = s;
                            auhx0.A = auhy0;
                            auhy auhy1 = auhx0.A;
                            if(auhy1 != null) {
                                try {
                                    avjh0.n("probing device with priority: %d", Integer.valueOf(auhy1.a()));
                                    auhy auhy2 = auhx0.A;
                                    batl.s(auhy2);
                                    boolean z1 = auhy2.d();
                                    aual0.a(null, auhy1.a, z1);
                                }
                                catch(IOException iOException0) {
                                    auhx0.c.e(iOException0, "Exception while connecting socket", new Object[0]);
                                    auhy auhy3 = auhx0.A;
                                    batl.s(auhy3);
                                    auhx0.l.a(auhy3, 2, iOException0.toString(), auhx0.w);
                                    auhx0.a(false);
                                }
                                auho auho0 = new auho(auhx0);
                                long v1 = (long)(((Long)auhx0.b.mr()));
                                auhx0.s = auhx0.k.schedule(auho0, v1, TimeUnit.MILLISECONDS);
                            }
                            this.j.k.c(auah0);
                            break;
                        }
                    }
                }
            }
            return;
        label_94:
            Queue queue0 = this.c;
            synchronized(queue0) {
                for(Object object3: queue0) {
                    auhy auhy4 = (auhy)object3;
                    if(auhy4.a.c(auhy0.a)) {
                        auhy4.c(auhy0);
                        return;
                    }
                }
                this.a.n("schedule probing %s as pending operations", auhy0);
                queue0.add(auhy0);
            }
        }
    }
}

