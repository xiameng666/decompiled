import android.os.SystemClock;
import android.text.TextUtils;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class cqsv implements Runnable {
    final cqsw a;
    private final cqub b;
    private boolean c;

    public cqsv(cqsw cqsw0, cqub cqub0) {
        Objects.requireNonNull(cqsw0);
        this.a = cqsw0;
        super();
        this.c = false;
        this.b = cqub0;
    }

    public final void a() {
        this.c = true;
    }

    @Override
    public final void run() {
        kau kau0;
        if(this.c) {
            cqsw.a.a("Query task was cancelled prior to run: aborting");
            return;
        }
        try {
            cqub cqub0 = this.b;
            List list0 = cqub0.n;
            ArrayList arrayList0 = new ArrayList(list0);
            for(int v = 0; v < arrayList0.size(); ++v) {
                if(((String)arrayList0.get(v)).equals("%9E5E7C8F47989526C9BCD95D24084F6F0B27C5ED")) {
                    arrayList0.set(v, "<CAST_MEDIA>");
                }
            }
            cqsw.a.b("Sending query for subtypes: %s", arrayList0);
            cqrx cqrx0 = new cqrx();
            kau0 = new cqrm(this.a.e, cqrx0, this.a.c, list0, this.a.i, cqub0.p, cqub0.o).a();
        }
        catch(RuntimeException runtimeException0) {
            a.e(cqsw.a.a.i(), "Failed to run EnqueueMdnsQueryCallable for subtype: %s", TextUtils.join(",", this.b.n), runtimeException0);
            kau0 = null;
        }
        cqsw cqsw0 = this.a;
        synchronized(cqsw0.f) {
            cqub cqub1 = this.b;
            if(cqub1.g != cqsw0.j) {
                return;
            }
            if(cqsw0.l == null) {
                return;
            }
            if(kau0 != null) {
                bxe bxe0 = new bxe(((bxf)cqsw0.g));
                while(bxe0.hasNext()) {
                    Object object1 = bxe0.next();
                    ((cqsk)object1).f(((List)kau0.b), ((Integer)kau0.a).intValue());
                }
            }
            if(cqsw0.d()) {
                Iterator iterator0 = cqsw0.h.values().iterator();
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    cqse cqse0 = (cqse)object2;
                    if(cqse0.r() && cqse0.d().c(SystemClock.elapsedRealtime()) == 0L) {
                        iterator0.remove();
                        bxe bxe1 = new bxe(((bxf)cqsw0.g));
                        while(bxe1.hasNext()) {
                            Object object3 = bxe1.next();
                            cqsk cqsk0 = (cqsk)object3;
                            String s = cqse0.f();
                            if(s != null) {
                                cqsk0.k(s);
                            }
                        }
                    }
                }
            }
            int v2 = cqub1.o + 1;
            cqub1.o = v2;
            if(v2 > 0x10000) {
                cqub1.o = 1;
            }
            boolean z = cqub1.f;
            if(z) {
                cqub1.a.a("Using PASSIVE mode");
            }
            else {
                cqub1.a.a("Using ACTIVE mode");
            }
            cqub1.p = false;
            int v3 = cqub1.j + 1;
            cqub1.j = v3;
            if(v3 == cqub1.h) {
                cqub1.j = 0;
                if(((Boolean)cqub1.b.mr()).booleanValue()) {
                    cqub1.p = true;
                }
                if(cqub1.l) {
                    cqub1.l = false;
                    if(z) {
                        cqub1.h = ((Long)cqub1.e.mr()).intValue();
                    }
                }
                cqub1.k = cqub1.i;
                cqwd cqwd0 = cqub1.a;
                cqwd0.b("timetoRunNextTaskInMs is set to timeBetweenBurstsInMs (%d) for next query", Integer.valueOf(cqub1.i));
                gful_cronetEngineProvider gful0 = cqub1.c;
                if(cqub1.i < ((Long)gful0.mr()).intValue()) {
                    cqwd0.d("Raising timeBetweenBurstsInMs from %d to %d (limit %d) for next query", Integer.valueOf(cqub1.i), Integer.valueOf(cqub1.i + cqub1.i), Integer.valueOf(((Long)gful0.mr()).intValue()));
                    cqub1.i = Math.min(cqub1.i + cqub1.i, ((Long)gful0.mr()).intValue());
                }
                else if(cqub1.m) {
                    cqub1.m = false;
                }
            }
            else {
                int v4 = ((Long)cqub1.d.mr()).intValue();
                cqub1.k = v4;
                cqub1.a.b("timetoRunNextTaskInMs is set to timeBetweenQueriesInBurstMs (%d) for next query", Integer.valueOf(v4));
            }
            cqsw0.l = new cqsv(cqsw0, cqub1);
            cqsc cqsc0 = cqsw0.b;
            cqsv cqsv0 = cqsw0.l;
            HashSet hashSet0 = new HashSet(cqsw0.h.values());
            long v5 = SystemClock.elapsedRealtime();
            long v6 = (long)cqub1.k;
            cqsc0.d = v5 + v6;
            if(cqub1.a(true)) {
                long v7 = cqsc.d(hashSet0);
                if(v7 > v6) {
                    cqsc0.a.c("Extending query period from %d to %d mSec", Long.valueOf(v6), Long.valueOf(v7));
                    v6 = v7;
                }
            }
            cqsc0.e = v5 + v6;
            cqsc0.c(cqsc0.a(v6), cqsv0);
        }
    }
}

