import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.pay.ProtoSafeParcelable;
import j..time.Duration;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class dtwm implements evqf {
    public final dtwp a;
    public final Set b;
    public final Set c;

    public dtwm(dtwp dtwp0, Set set0, Set set1) {
        this.a = dtwp0;
        this.b = set0;
        this.c = set1;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        hwkn.d();
        dtwp dtwp0 = this.a;
        if(hwkn.c()) {
            fshs fshs0 = (fshs)ftqe.c(((ProtoSafeParcelable)object0), ((MessageLite)fshs.a));
            long v = System.currentTimeMillis();
            long v1 = v - Duration.ofSeconds(hwly.b()).toMillis();
            long v2 = Duration.ofSeconds(hwmp.d()).toMillis();
            HashSet hashSet0 = new HashSet();
            for(Object object1: fshs0.c) {
                fshr fshr0 = (fshr)object1;
                int v3 = fshr0.e.size();
                if(v3 != 0) {
                    fshq fshq0 = (fshq)fshr0.e.get(0);
                    long v4 = fshq0.c;
                    if(((long)v3) >= hwly.g() || v4 >= v1) {
                        hashSet0.add(fshr0.c);
                    }
                    if((fshp.b(fshq0.e) == null ? fshp.h : fshp.b(fshq0.e)) == fshp.b && v < v4 + v2) {
                        hashSet0.add(fshr0.c);
                    }
                    v = v;
                }
            }
            for(Object object2: this.b) {
                gtxg gtxg0 = (gtxg)object2;
                if(!hashSet0.contains(gtxg0.b)) {
                    gtxb gtxb0 = gtxb.b(dual.b(gtxg0).c);
                    if(gtxb0 == null) {
                        gtxb0 = gtxb.n;
                    }
                    if(gtxb0 == gtxb.f) {
                        Context context0 = dtwp0.k;
                        String s = dtwp0.b.name;
                        String s1 = gtxg0.b;
                        hwkn.d();
                        if(!hwkn.c()) {
                            continue;
                        }
                        long v5 = new SecureRandom().nextLong() % hwmp.d();
                        clkn clkn0 = new clkn();
                        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
                        clkn0.q("mdoc.versionsync");
                        clkn0.v(0);
                        clkn0.y(0, 1);
                        clkn0.e(v5, 1L + v5);
                        Bundle bundle0 = new Bundle();
                        bundle0.putString("extra_account_name", s);
                        bundle0.putString("extra_provisioning_id", s1);
                        clkn0.u = bundle0;
                        clko clko0 = clkn0.a();
                        cljp.a(context0).f(clko0);
                        ((ggtj)((ggtj)dtus.a.h()).ar(0x29F9)).A("MRTO: Scheduled mdoc refresh task to execute in %d seconds", v5);
                    }
                    else {
                        dtwp0.d(gtxg0.b);
                    }
                }
            }
            return;
        }
        fshs fshs1 = (fshs)ftqe.c(((ProtoSafeParcelable)object0), ((MessageLite)fshs.a));
        long v6 = System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(hwly.b());
        Iterator iterator2 = fshs1.c.iterator();
        while(true) {
            Set set0 = this.c;
            if(!iterator2.hasNext()) {
                break;
            }
            Object object3 = iterator2.next();
            fshr fshr1 = (fshr)object3;
            int v7 = fshr1.e.size();
            if(v7 != 0) {
                long v8 = ((fshq)fshr1.e.get(0)).c;
                if(((long)v7) >= hwly.g() || v8 >= v6) {
                    set0.remove(fshr1.c);
                }
            }
        }
        for(Object object4: set0) {
            dtwp0.d(((String)object4));
        }
    }
}

