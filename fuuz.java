import com.google.android.gms.location.SleepClassifyEvent;
import com.google.android.gms.location.SleepSegmentEvent;
import com.google.android.gms.location.SleepSegmentRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class fuuz implements fwzw {
    public final futd a;
    public long b;
    public long c;
    private final fvwz d;
    private final fuzl e;
    private final fuyj f;
    private final futh g;
    private final fwxt h;
    private final int i;
    private final fuva j;
    private int k;
    private long l;
    private fwvq m;

    public fuuz(fvwz fvwz0, futd futd0, fuyj fuyj0) {
        this.m = null;
        this.k = 0;
        this.b = 0L;
        this.c = 0L;
        this.l = 0L;
        this.d = fvwz0;
        this.a = futd0;
        synchronized(fuzl.a) {
            if(fuzl.b == null) {
                fuzl.b = new fuzl();
            }
        }
        this.e = fuzl.b;
        this.f = fuyj0;
        this.g = futd0.c;
        this.h = futd0.b;
        this.i = (int)huwz.f();
        this.j = new fuva(fvwz0, futd0, fuyj0);
    }

    @Deprecated
    public final List a(boolean z) {
        List list0 = new ArrayList();
        fwxt fwxt0 = this.h;
        if(fwxt0.mL(z) != null) {
            for(Object object0: fwxt0.mL(z)) {
                list0.add(new SleepSegmentEvent(((fuxj)object0).a, ((fuxj)object0).b, ((fuxj)object0).c, -1, -1));
            }
        }
        return list0;
    }

    final void b(PrintWriter printWriter0, boolean z) {
        List list0 = this.a(z);
        fwxt fwxt0 = this.h;
        String s = "without";
        printWriter0.println("Previous sleep " + (z ? "with" : "without") + " window segment time: " + fwxt0.a(z));
        if(z && fwxt0.b() != null) {
            printWriter0.println("User sleep window: " + fwxt0.b());
        }
        if(list0.isEmpty()) {
            if(z) {
                s = "with";
            }
            printWriter0.println("- No previous sleep " + s + " window found");
        }
        else {
            for(Object object0: list0) {
                printWriter0.println("- Sleep segment " + (z ? "with window: " : "without window: ") + ((SleepSegmentEvent)object0).a + " - " + ((SleepSegmentEvent)object0).b + " Status: " + ((SleepSegmentEvent)object0).c);
            }
        }
        fuye fuye0 = this.f.c;
        for(Object object1: fuye0.e()) {
            printWriter0.println("Missing data: " + ((fvuf)object1).a.toString() + " - " + ((fvuf)object1).b);
        }
        printWriter0.println("90th pct sleep confidence=" + fuye0.b());
    }

    public final void c(fuzj fuzj0, long v, long v1, fvsf fvsf0, fvsf fvsf1) {
        if(fvsf0.c >= 50 && fvsf1.c > 0) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put(fvns.d, fvsf0);
            hashMap0.put(fvns.k, fvsf1);
            fuzk fuzk0 = this.e.a(hashMap0, ((int)(v / 1000L)));
            int v2 = fuzj0.a(fuzk0);
            futd futd0 = this.a;
            futd0.V = v1;
            long v3 = v - this.l;
            long v4 = TimeUnit.SECONDS.toMillis(360L);
            this.e(v2, v, fuzk0, Long.compare(v4, 0L) > 0 && v3 <= v4);
            if(this.m == null) {
                this.m = futd0.b.mX();
            }
            fwvq fwvq0 = this.m;
            if(fwvq0.a) {
                fwvq0.b(this);
            }
        }
    }

    public final void d(long v) {
        this.l = v;
        fwvq fwvq0 = this.m;
        if(fwvq0 != null && fwvq0.a) {
            fwvq0.a();
        }
    }

    public final void e(int v, long v1, fuzk fuzk0, boolean z) {
        int v9;
        long v8;
        GregorianCalendar gregorianCalendar0 = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar0.setTimeInMillis(v1);
        int v2 = gregorianCalendar0.get(11);
        long v3 = v1 - this.c;
        huwz huwz0 = huwz.a;
        boolean z1 = v3 >= 0L && v3 <= TimeUnit.MINUTES.toMillis(huwz0.h().s()) && ((double)fuzk0.c) > huwz0.h().b() && (z || ((double)fuzk0.g) > huwz0.h().a());
        int v4 = z1 ? Math.min(v, ((int)huwz0.h().d())) : v;
        if(z) {
            v4 = (v4 + ((int)huwz0.h().t())) / 2;
            fuzk0.g = (float)huwz0.h().c();
        }
        SleepClassifyEvent sleepClassifyEvent0 = new SleepClassifyEvent(((int)(v1 / 1000L)), v4, ((int)fuzh.c.a(fuzk0.g)), ((int)fuzh.a.a(fuzk0.c)), (Float.compare(fuzk0.I, 0.0f) >= 0 ? ((int)fuzh.e.a(fuzk0.I)) : -1), ((int)fuzh.b.a(fuzk0.d)), ((int)fuzh.f.a(fuzk0.L)), z1, ((int)fuzk0.M));
        fuyj fuyj0 = this.f;
        fuyi fuyi0 = new fuyi(new int[]{sleepClassifyEvent0.b, sleepClassifyEvent0.d, sleepClassifyEvent0.c, sleepClassifyEvent0.g, sleepClassifyEvent0.h}, v1);
        long v5 = fuyi0.b;
        fuye fuye0 = fuyj0.c;
        long v6 = fuye0.d;
        if(v6 == -1L) {
            fuye0.d = v5;
            v6 = v5;
        }
        long v7 = (v5 - v6) / 360000L - 1L;
        if(v7 > huwz0.h().e()) {
            v8 = v5;
            fvuf fvuf0 = new fvuf(((long)fuye0.d), v8);
            fuye0.h.add(fvuf0);
            v9 = 1;
        }
        else {
            v8 = v5;
            v9 = 0;
        }
        int v10 = 0;
        while(Long.compare(v10, v7) < 0) {
            fuye0.g();
            fuye0.e[fuye0.a] = v9 == 0 ? fuye0.e[fuye0.b] : new float[]{0.9f, 1.0f, 1.0f, 1.0f, 0.0f};
            ++v10;
            v9 = v9;
        }
        fuyg fuyg0 = fuyj0.d;
        if(v8 < fuye0.d + 360000L) {
            fuyg0.b(fuyi0);
            float[][] arr2_f = fuye0.e;
            int v11 = fuye0.a;
            arr2_f[v11] = fuyg0.a();
        }
        else {
            fuye0.g();
            for(int v12 = 0; v12 < 5; ++v12) {
                fuyg0.a[v12] = 0;
            }
            fuyg0.b = 0;
            fuyg0.b(fuyi0);
            float[][] arr2_f1 = fuye0.e;
            int v13 = fuye0.a;
            arr2_f1[v13] = fuyg0.a();
        }
        int v14 = (int)huwz0.h().f();
        if(fuye0.c >= v14) {
            fvur fvur0 = fuye0.g;
            long v15 = fuye0.d();
            int v16 = fuye0.e[fuye0.a].length;
            gwvl gwvl0 = (gwvl)((ProtoLiteMessage)gwvm.a).v_newBuilder();
            if(!gwvl0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvl0).ensureMutable();
            }
            gwvm gwvm0 = (gwvm)gwvl0.b_message;
            gwvm0.b |= 1;
            gwvm0.c = v15;
            int v17 = fuye0.b;
            if(!gwvl0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvl0).ensureMutable();
            }
            gwvm gwvm1 = (gwvm)gwvl0.b_message;
            gwvm1.b |= 2;
            gwvm1.d = v17;
            boolean z2 = fuye0.f;
            if(!gwvl0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvl0).ensureMutable();
            }
            gwvm gwvm2 = (gwvm)gwvl0.b_message;
            gwvm2.b |= 4;
            gwvm2.e = z2;
            if(!gwvl0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvl0).ensureMutable();
            }
            gwvm gwvm3 = (gwvm)gwvl0.b_message;
            gwvm3.b |= 8;
            gwvm3.f = v16;
            fuye0.c = 0;
            int v18 = fuye0.a();
            for(int v19 = 0; v19 < v18; ++v19) {
                for(int v20 = 0; v20 < v16; ++v20) {
                    float f = fuye0.e[v19][v20];
                    if(!gwvl0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwvl0).ensureMutable();
                    }
                    gwvm gwvm4 = (gwvm)gwvl0.b_message;
                    hfue hfue0 = gwvm4.g;
                    if(!hfue0.c()) {
                        gwvm4.g = ProtoLiteMessage.B(hfue0);
                    }
                    gwvm4.g.h(f);
                }
            }
            if(!fuye0.e().isEmpty()) {
                for(Object object0: fuye0.h) {
                    gwvl0.a(((Long)((fvuf)object0).a).longValue());
                    gwvl0.a(((Long)((fvuf)object0).b).longValue());
                }
            }
            try {
                fvur0.b(fvur0.c(((MessageLite)(((gwvm)((ProtoLiteBuilder)gwvl0).N_build())))));
            }
            catch(IOException unused_ex) {
            }
        }
        int v21 = this.i;
        if(v2 >= v21) {
            if(v4 <= ((int)huwz.a.h().v())) {
                ++this.k;
                goto label_114;
            }
            goto label_112;
        }
        else {
        label_112:
            if(v2 == v21 - 1) {
                this.k = 0;
            }
        }
    label_114:
        fvwx fvwx0 = new fvwx(98, this.d.f(), sleepClassifyEvent0.a, sleepClassifyEvent0.b);
        this.d.a(fvwx0);
        fvut fvut0 = new fvut(null, Arrays.asList(new SleepClassifyEvent[]{sleepClassifyEvent0}));
        fwvn fwvn0 = (fwvn)this.g;
        fwqt fwqt0 = fwvn0.t;
        fwqw fwqw0 = (fwqw)fwqt0.n;
        SleepSegmentRequest sleepSegmentRequest0 = fwqw0.t();
        if(!huwz.m() || sleepSegmentRequest0 != null && sleepSegmentRequest0.b()) {
            fwqw0.F(fwqt0.a, fvut0, null, fwqt0.k);
        }
        fwvn0.x("LAST_SLEEP_CLASSIFY_MILLIS");
        List list0 = this.a(false);
        fuyj fuyj1 = this.f;
        fuxk fuxk0 = this.h.b();
        if(fuxk0 != null) {
            fuva fuva0 = this.j;
            if(!fuva.c(v1, fuva0.d.a(true))) {
                long v22 = huwz.a.h().q() + v1;
                GregorianCalendar gregorianCalendar1 = new GregorianCalendar(TimeZone.getDefault());
                gregorianCalendar1.setTimeInMillis(v22);
                int v23 = gregorianCalendar1.get(11);
                int v24 = gregorianCalendar1.get(12);
                if(v23 > fuxk0.a || v23 == fuxk0.a && v24 >= fuxk0.b || fuxk0.a == 23 && v23 <= 0) {
                    fuye fuye1 = fuva0.b.c;
                    fvsl fvsl0 = fuxk0.a(fuye1.d());
                    fvut fvut1 = fuva0.a(fvsl0);
                    if(fvut1 == null) {
                        SleepSegmentEvent sleepSegmentEvent0 = fuva.d(false, fvsl0, fuye1);
                        fvut1 = new fvut(Arrays.asList(new SleepSegmentEvent[]{sleepSegmentEvent0}), null);
                        futg.c(fuva0.a, sleepSegmentEvent0, sleepSegmentEvent0.c);
                    }
                    fuva0.c.mV(fvut1, true);
                }
            }
        }
        if(v2 >= v21 && (((long)this.k) >= huwz.a.h().i() || ((long)v2) >= huwz.e())) {
            fuye fuye2 = fuyj1.c;
            int v25 = fuye2.f().length - 1;
            long v26 = fuye2.d();
            long v27 = fuye.i(0L, v26, v25);
            long v28 = fuye.i(v25, v26, v25);
            for(Object object1: list0) {
                long v29 = TimeUnit.HOURS.toMillis(huwz.b() / (TimeUnit.HOURS.toMinutes(1L) / TimeUnit.MILLISECONDS.toMinutes(huwz.g())));
                v27 = Math.max(v27, ((SleepSegmentEvent)object1).b + v29);
            }
            if(v27 < v28) {
                fuva fuva1 = this.j;
                fvsl fvsl1 = new fvsl(v27, v28);
                if(!fuva.c(v1, fuva1.d.a(false))) {
                    fuye2.b();
                    fvut fvut2 = fuva1.a(fvsl1);
                    if(fvut2 == null) {
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(TimeZone.getDefault());
                        gregorianCalendar2.setTimeInMillis(v1);
                        if(gregorianCalendar2.get(11) >= fuva1.e) {
                            SleepSegmentEvent sleepSegmentEvent1 = fuva.d(false, fvsl1, fuye2);
                            fvut2 = new fvut(Arrays.asList(new SleepSegmentEvent[]{sleepSegmentEvent1}), null);
                            futg.c(fuva1.a, sleepSegmentEvent1, sleepSegmentEvent1.c);
                        }
                    }
                    if(fvut2 != null) {
                        fuva1.c.mV(fvut2, false);
                    }
                }
            }
        }
    }

    @Override  // fwzw
    public final void q() {
        this.d(this.a.d.c());
    }
}

