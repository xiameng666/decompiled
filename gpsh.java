import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Pair;
import com.google.gms.mdns.MdnsSearchOptions;
import com.google.gms.mdns.MdnsServiceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class gpsh {
    public final String a;
    public final String[] b;
    public final gpso c;
    public final ScheduledExecutorService d;
    public final gpsy e;
    public final gpsv f;
    public final Handler g;
    public final gprl h;
    public final gprx i;
    public final gprv j;
    public final gpqz k;
    public final ArrayMap l;
    public MdnsSearchOptions m;
    public long n;
    public long o;
    public final gpsc p;
    public static final int q;
    private final gpro r;

    static {
    }

    public gpsh(String s, gpso gpso0, ScheduledExecutorService scheduledExecutorService0, gpsy gpsy0, gpsv gpsv0, Looper looper0, gprx gprx0, gpqz gpqz0) {
        gptb gptb0 = new gptb();
        super();
        this.p = new gpsc(this);
        this.l = new ArrayMap();
        this.n = 0L;
        this.a = s;
        this.c = gpso0;
        this.d = scheduledExecutorService0;
        String[] arr_s = TextUtils.split(s, "\\.");
        this.b = arr_s;
        this.r = new gpro(gptb0, arr_s);
        this.e = gpsy0;
        this.f = gpsv0;
        this.g = new gpsg(this, looper0);
        this.i = gprx0;
        this.h = new gprl();
        this.j = new gprv(s, gpsy0);
        this.k = gpqz0;
    }

    public static long a(gprk gprk0, long v) {
        return Math.max(gprk0.b - v, 0L);
    }

    public final long b(long v) {
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(Object object0: this.i.d(this.j, false)) {
            gprn gprn0 = (gprn)object0;
            if(!gprn0.s()) {
                continue;
            }
            long v2 = gprn0.b().d(v);
            if(v2 > 0L) {
                if(v2 >= v1) {
                    continue;
                }
                v1 = v2;
                continue;
            }
            return 0L;
        }
        return v1 == 0x7FFFFFFFFFFFFFFFL ? 0L : v1;
    }

    public final List c(gpsy gpsy0) {
        List list0 = new ArrayList();
        for(int v = 0; true; ++v) {
            ArrayMap arrayMap0 = this.l;
            if(v >= arrayMap0.size()) {
                break;
            }
            String s = ((gpsd)arrayMap0.valueAt(v)).a.b;
            if(s != null && !gppz.b(list0, new gpsb(s))) {
                gprn gprn0 = this.i.g(s, this.j);
                if(gprn0 == null) {
                    ArrayList arrayList0 = new ArrayList(this.b.length + 1);
                    arrayList0.add(s);
                    arrayList0.addAll(Arrays.asList(this.b));
                    gprn0 = new gprn(0L, ((String[])arrayList0.toArray(new String[0])), gpsy0.b, gpsy0.a);
                }
                list0.add(gprn0);
            }
        }
        return list0;
    }

    public final Set d() {
        Set set0 = new ArraySet();
        for(int v = 0; true; ++v) {
            ArrayMap arrayMap0 = this.l;
            if(v >= arrayMap0.size()) {
                break;
            }
            set0.addAll(((gpsd)arrayMap0.valueAt(v)).a.a);
        }
        return set0;
    }

    public final void e(gprn gprn0, String s) {
        for(int v = 0; true; ++v) {
            ArrayMap arrayMap0 = this.l;
            if(v >= arrayMap0.size()) {
                break;
            }
            if(gptc.c(gprn0, ((gpsd)arrayMap0.valueAt(v)).a.b, ((gpsd)arrayMap0.valueAt(v)).a.a)) {
                cqrr cqrr0 = (cqrr)arrayMap0.keyAt(v);
                if(gprn0.d() != null) {
                    gpsd gpsd0 = (gpsd)arrayMap0.valueAt(v);
                    String s1 = gpqj.a(gprn0.d());
                    if(gpsd0.b.remove(s1)) {
                        long v1 = SystemClock.elapsedRealtime();
                        MdnsServiceInfo mdnsServiceInfo0 = gptc.a(gprn0, this.b, v1);
                        if(gprn0.s()) {
                            gpqn.d(this.f, s + ". onServiceRemoved: " + mdnsServiceInfo0.toString());
                            cqrr0.a.k(mdnsServiceInfo0.c);
                        }
                        gpqn.d(this.f, s + ". onServiceNameRemoved: " + mdnsServiceInfo0.toString());
                    }
                }
            }
        }
    }

    public final void f(int v, int v1) {
        synchronized(this) {
            gpqo.a(this.g);
            for(int v3 = 0; true; ++v3) {
                ArrayMap arrayMap0 = this.l;
                if(v3 >= arrayMap0.size()) {
                    break;
                }
                ((cqrr)arrayMap0.keyAt(v3)).a.g(v, v1);
            }
        }
    }

    public final void g(gprf gprf0, gpsy gpsy0) {
        Set set2;
        boolean z3;
        Set set1;
        ArrayList arrayList6;
        boolean z1;
        int v11;
        gpqz gpqz1;
        ArrayMap arrayMap2;
        Handler handler1;
        long v6;
        ArrayList arrayList3;
        ArrayMap arrayMap1;
        gpro gpro1;
        int v5;
        synchronized(this) {
            Handler handler0 = this.g;
            gpqo.a(handler0);
            gprx gprx0 = this.i;
            gprv gprv0 = this.j;
            List list0 = gprx0.d(gprv0, false);
            ArrayList arrayList0 = new ArrayList(list0);
            for(Object object0: this.c(gpsy0)) {
                gprn gprn0 = (gprn)object0;
                if(gprx.b(list0, gprn0.d()) == null) {
                    arrayList0.add(gprn0);
                }
            }
            gpro gpro0 = this.r;
            int v1 = gpsy0.b;
            Network network0 = gpsy0.a;
            gpqz gpqz0 = this.k;
            ArrayList arrayList1 = new ArrayList(gprf0.c.size() + gprf0.d.size() + gprf0.e.size() + gprf0.f.size());
            arrayList1.addAll(gprf0.d);
            arrayList1.addAll(gprf0.e);
            arrayList1.addAll(gprf0.f);
            ArraySet arraySet0 = new ArraySet();
            ArrayList arrayList2 = new ArrayList(arrayList0.size());
            ArrayMap arrayMap0 = new ArrayMap();
            for(Object object1: arrayList0) {
                gprn gprn1 = new gprn(((gprn)object1));
                arrayList2.add(gprn1);
                arrayMap0.put(gprn1, ((gprn)object1));
            }
            long v2 = SystemClock.elapsedRealtime();
            int v3 = arrayList1.size();
            int v4 = 0;
            while(v4 < v3) {
                gprm gprm0 = (gprm)arrayList1.get(v4);
                if((gprm0 instanceof gprj)) {
                    String[] arr_s = gprm0.c;
                    v5 = v4;
                    String[] arr_s1 = gpro0.a;
                    if(arr_s1 != null && !gpqj.b(arr_s1, arr_s)) {
                        gpro1 = gpro0;
                        arrayMap1 = arrayMap0;
                        if(arr_s.length != arr_s1.length + 2 || !gpqj.c(arr_s[1], "_sub") || !gprm.h(arr_s1, arr_s)) {
                            arrayList3 = arrayList1;
                            v6 = v2;
                            handler1 = handler0;
                            arrayMap2 = arrayMap1;
                            goto label_77;
                        }
                    }
                    else {
                        gpro1 = gpro0;
                        arrayMap1 = arrayMap0;
                    }
                    gprn gprn2 = gpro.b(arrayList2, ((gprj)gprm0).a);
                    if(gprn2 == null) {
                        arrayList3 = arrayList1;
                        v6 = v2;
                        handler1 = handler0;
                        arrayMap2 = arrayMap1;
                        gprn gprn3 = new gprn(v6, ((gprj)gprm0).a, v1, network0);
                        arrayList2.add(gprn3);
                        arrayList2 = arrayList2;
                        gprn2 = gprn3;
                    }
                    else {
                        arrayList3 = arrayList1;
                        v6 = v2;
                        handler1 = handler0;
                        arrayMap2 = arrayMap1;
                    }
                    if(gprn2.n(((gprj)gprm0))) {
                        arraySet0.add(gprn2);
                    }
                }
                else {
                    v5 = v4;
                    gpro1 = gpro0;
                    arrayList3 = arrayList1;
                    handler1 = handler0;
                    arrayMap2 = arrayMap0;
                    v6 = v2;
                }
            label_77:
                v4 = v5 + 1;
                arrayMap0 = arrayMap2;
                handler0 = handler1;
                v2 = v6;
                v3 = v3;
                arrayList1 = arrayList3;
                gpro0 = gpro1;
            }
            int v7 = arrayList1.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                gprm gprm1 = (gprm)arrayList1.get(v8);
                if((gprm1 instanceof gpsa)) {
                    gprn gprn4 = gpro.b(arrayList2, ((gpsa)gprm1).c);
                    if(gprn4 != null && gprn4.u(((gpsa)gprm1))) {
                        gprn4.w();
                        arraySet0.add(gprn4);
                    }
                }
                else if((gprm1 instanceof gpsp)) {
                    gprn gprn5 = gpro.b(arrayList2, ((gpsp)gprm1).c);
                    if(gprn5 != null && gprn5.v(((gpsp)gprm1))) {
                        arraySet0.add(gprn5);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int v9 = arrayList1.size();
            int v10 = 0;
            while(v10 < v9) {
                gprm gprm2 = (gprm)arrayList1.get(v10);
                if((gprm2 instanceof gpra)) {
                    arrayList4.add(((gpra)gprm2));
                    for(Object object2: gpro.c(arrayList2, ((gpra)gprm2).c)) {
                        gprn gprn6 = (gprn)object2;
                        if(((gpra)gprm2).g()) {
                            boolean z = gpqz0.c;
                            if(z) {
                                gpqz1 = gpqz0;
                                v11 = v9;
                                if(((gpra)gprm2).d == 1) {
                                    goto label_121;
                                }
                            }
                            else {
                                gpqz1 = gpqz0;
                                v11 = v9;
                            label_121:
                                gprn6.j();
                                if(z) {
                                    goto label_123;
                                }
                                goto label_126;
                            }
                        label_123:
                            if(((gpra)gprm2).d == 28) {
                                gprn6.k();
                                goto label_127;
                            label_126:
                                gprn6.k();
                            }
                        label_127:
                            v9 = v11;
                            gpqz0 = gpqz1;
                        }
                    }
                }
                ++v10;
                v9 = v9;
                gpqz0 = gpqz0;
            }
            int v12 = arrayList4.size();
            int v13 = 0;
            while(v13 < v12) {
                gpra gpra0 = (gpra)arrayList4.get(v13);
                for(Object object3: gpro.c(arrayList2, gpra0.c)) {
                    gprn gprn7 = (gprn)object3;
                    if(gpra0.b == null) {
                        if(gpra0.a == null) {
                            continue;
                        }
                        z1 = gprn7.m(gpra0);
                    }
                    else {
                        z1 = gprn7.l(gpra0);
                    }
                    if(z1) {
                        gprn gprn8 = (gprn)arrayMap0.get(gprn7);
                        if(gprn8 == null) {
                            arraySet0.add(gprn7);
                        }
                        else {
                            int v14 = gprn8.a.indexOf(gpra0);
                            if(v14 < 0 || !gprn.x(gpra0, ((gprm)gprn8.a.get(v14)))) {
                                arraySet0.add(gprn7);
                            }
                        }
                    }
                }
                ++v13;
            }
            for(int v15 = 0; v15 < arrayMap0.size(); ++v15) {
                gprn gprn9 = (gprn)arrayMap0.keyAt(v15);
                gprn gprn10 = (gprn)arrayMap0.valueAt(v15);
                if(gprn9.h().size() != gprn10.h().size()) {
                    arraySet0.add(gprn9);
                }
            }
            Pair pair0 = Pair.create(arraySet0, arrayList2);
            Set set0 = (Set)pair0.first;
            ArrayList arrayList5 = (ArrayList)pair0.second;
            int v16 = arrayList5.size();
            int v17 = 0;
            while(v17 < v16) {
                gprn gprn11 = (gprn)arrayList5.get(v17);
                String s = gprn11.d();
                if(!set0.contains(gprn11)) {
                    arrayList6 = arrayList5;
                    set1 = set0;
                    if(gprx.b(list0, s) != null) {
                        gprx0.e(gprv0, gprn11);
                    }
                }
                else if(gprn11.t()) {
                    gprn gprn12 = gprx0.c(s, gprv0);
                    if(gprn12 != null) {
                        this.e(gprn12, "Goodbye received");
                    }
                    arrayList6 = arrayList5;
                    set1 = set0;
                }
                else {
                    String s1 = gprn11.d();
                    gprn gprn13 = gprx0.g(s1, gprv0);
                    if(gprn13 != null) {
                        boolean z2 = gprn13.s();
                        gprx0.e(gprv0, gprn11);
                        if(!z2 && gprn11.s()) {
                            z3 = true;
                            goto label_192;
                        }
                    }
                    else if(s1 != null) {
                        gprx0.e(gprv0, gprn11);
                    }
                    z3 = false;
                label_192:
                    gpsv gpsv0 = this.f;
                    gpqn.c(gpsv0, String.format("Handling response from service: %s, newInCache: %b, serviceBecomesComplete: %b, responseIsComplete: %b", s1, Boolean.valueOf(gprn13 == null), Boolean.valueOf(z3), Boolean.valueOf(gprn11.s())));
                    long v18 = SystemClock.elapsedRealtime();
                    MdnsServiceInfo mdnsServiceInfo0 = gptc.a(gprn11, this.b, v18);
                    int v19 = 0;
                    while(true) {
                        ArrayMap arrayMap3 = this.l;
                        if(v19 >= arrayMap3.size()) {
                            break;
                        }
                        if(gptc.c(gprn11, ((gpsd)arrayMap3.valueAt(v19)).a.b, ((gpsd)arrayMap3.valueAt(v19)).a.a)) {
                            cqrr cqrr0 = (cqrr)arrayMap3.keyAt(v19);
                            boolean z4 = ((gpsd)arrayMap3.valueAt(v19)).a(s1);
                            if(z4) {
                                set2 = set0;
                                gpqn.d(gpsv0, "onServiceNameDiscovered: " + mdnsServiceInfo0.toString());
                            }
                            else {
                                set2 = set0;
                            }
                            if(gprn11.s()) {
                                if(!z4 && !z3) {
                                    gpqn.d(gpsv0, "onServiceUpdated: " + mdnsServiceInfo0.toString());
                                    com.google.android.gms.mdns.MdnsServiceInfo mdnsServiceInfo1 = cqrr.a(mdnsServiceInfo0);
                                    cqrr0.a.l(mdnsServiceInfo1);
                                }
                                else {
                                    gpqn.d(gpsv0, "onServiceFound: " + mdnsServiceInfo0.toString());
                                    cqrr0.b(mdnsServiceInfo0);
                                }
                            }
                        }
                        else {
                            set2 = set0;
                        }
                        ++v19;
                        arrayList5 = arrayList5;
                        set0 = set2;
                    }
                    arrayList6 = arrayList5;
                    set1 = set0;
                }
                ++v17;
                arrayList5 = arrayList6;
                set0 = set1;
            }
            if(handler0.hasMessages(1)) {
                long v20 = SystemClock.elapsedRealtime();
                long v21 = this.b(v20);
                gprl gprl0 = this.h;
                long v22 = this.o;
                long v23 = this.n + 1L;
                int v24 = this.m.e;
                gprk gprk0 = gprl0.a;
                gprk gprk1 = null;
                if(gprk0 != null) {
                    gpst gpst0 = gprk0.a;
                    int v25 = gpst0.b;
                    int v26 = gpst0.c;
                    if(gprl.e(v25, v26, v24)) {
                        long v27 = gprl.a(gprk0, v25, v26, v20, v21, v22, v24, false);
                        if(v27 > gprl0.a.b) {
                            gprl0.a = new gprk(gpst0, v27, v21 + v20, v23);
                            gprk1 = gprl0.a;
                        }
                    }
                }
                if(gprk1 != null) {
                    this.h();
                    long v28 = gpsh.a(gprk1, v20);
                    gpqn.d(this.f, String.format("Reschedule a query. Next run: sessionId: %d, in %d ms", ((long)gprk1.d), v28));
                    handler0.sendMessageDelayed(handler0.obtainMessage(1, gprk1), v28);
                }
            }
        }
    }

    public final void h() {
        this.g.removeMessages(1);
        gpqn.d(this.f, "Remove EVENT_START_QUERYTASK, current session: " + this.n);
        ++this.n;
    }

    public static boolean i(ArrayMap arrayMap0) {
        for(int v = 0; v < arrayMap0.size(); ++v) {
            if(((gpsd)arrayMap0.valueAt(v)).a.b == null) {
                return true;
            }
        }
        return false;
    }
}

