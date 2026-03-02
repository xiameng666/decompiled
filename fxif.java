import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public final class fxif {
    public final fxhk a;
    public final fxhn b;
    public final fxmt c;
    public final Optional d;
    public fxhw e;
    public fxhw f;
    public static final int g;
    private final fxhy[] h;
    private final fxhr i;
    private final fxhy j;
    private final ibnf k;
    private final ibnf l;

    static {
        bboh.c("EAlert", bbcu.g, "Handler");
    }

    public fxif(fxhk fxhk0, fxhr fxhr0, fxhn fxhn0, fxmt fxmt0, Optional optional0, ibnf ibnf0, ibnf ibnf1) {
        fxid fxid0 = new fxid(this);
        this.j = fxid0;
        this.e = new fxhw(fxid0, -1000000L);
        this.f = new fxhw(fxid0, -1000000L);
        this.a = fxhk0;
        this.i = fxhr0;
        this.b = fxhn0;
        this.c = fxmt0;
        this.d = optional0;
        this.k = ibnf0;
        this.l = ibnf1;
        this.h = new fxhy[]{new fxie(this, fxhr0.a), new fxhz(this, fxhr0.b), new fxia(this, fxhr0.c), new fxic(this, fxhr0.d), new fxib(this, fxhr0.d), fxid0};
    }

    public static LatLng a(hjij hjij0) {
        return new LatLng(hjij0.b, hjij0.c);
    }

    public static List b(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(fxif.a(((hjij)object0)));
        }
        return list1;
    }

    final void c(gxev gxev0, Location location0) {
        int v24;
        boolean z1;
        fxhy fxhy2;
        int v12;
        boolean z;
        fxhu fxhu1;
        int v6;
        int v4;
        int v3;
        int v2;
        int v;
        gxes gxes0 = gxev0.e == null ? gxes.a : gxev0.e;
        switch((gxeu.a(gxev0.c) == 0 ? 1 : gxeu.a(gxev0.c)) - 2) {
            case 1: {
                v = 2;
                break;
            }
            case 2: {
                v = 3;
                break;
            }
            case 3: {
                v = 4;
                break;
            }
            default: {
                v = 1;
            }
        }
        String s = gxes0.c;
        long v1 = hfyn.b((gxes0.m == null ? hfwn.a : gxes0.m));
        switch((gxer.b(gxes0.k) == 0 ? 1 : gxer.b(gxes0.k)) - 2) {
            case 1: {
                v2 = 2;
                break;
            }
            case 2: {
                v2 = 4;
                break;
            }
            case 3: {
                v2 = 3;
                break;
            }
            default: {
                v2 = 1;
            }
        }
        fxhn fxhn0 = this.b;
        fxnb.b(s, v1, v2, v, bbpg.a(fxhn0.a));
        fxmv.b((gxes0.m == null ? hfwn.a : gxes0.m));
        gxer.a((gxer.b(gxes0.k) == 0 ? 1 : gxer.b(gxes0.k)));
        fxmv fxmv0 = fxhn0.b;
        fxmv0.f(2, "%s:%s t=%d m=%d", new Object[]{gxes0.c, fxmv.b((gxes0.m == null ? hfwn.a : gxes0.m)), gxer.a((gxer.b(gxes0.k) == 0 ? 1 : gxer.b(gxes0.k))), ((int)(v - 1))});
        gxes gxes1 = gxev0.e == null ? gxes.a : gxev0.e;
    alab1:
        switch((gxeu.a(gxev0.c) == 0 ? 1 : gxeu.a(gxev0.c)) - 2) {
            case 1: {
                v3 = 3;
                Iterator iterator0 = gfud.e('.').n(gxev0.d).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break alab1;
                    }
                    Object object0 = iterator0.next();
                    if("tst".equals(((String)object0))) {
                        goto label_34;
                    }
                }
            }
            case 2: {
            label_34:
                v3 = 4;
                break;
            }
            default: {
                v3 = 5;
            }
        }
        if(!((ProtoLiteMessage)gxes1).isInitialized()) {
            v4 = 3;
        }
        else if((gxes1.b & 4) == 0) {
            v4 = 4;
        }
        else {
            int v5 = gxes1.k;
            if(gxer.b(v5) == 5) {
                v6 = v5;
            label_46:
                if(gxer.b(v6) != 5 || gxep.a((gxes1.n == null ? gxeq.a : gxes1.n).b) != 5) {
                    int v7 = gxes1.b;
                    if((v7 & 1) == 0) {
                        v4 = 6;
                    }
                    else if((v7 & 2) == 0) {
                        v4 = 7;
                    }
                    else if(location0 == null) {
                        v4 = 10;
                    }
                    else {
                        hfuo hfuo0 = gxes1.h;
                        v4 = hfuo0.size() < 3 || ghau.a(fxif.f(((hjij)hfuo0.get(0))), fxif.f(((hjij)hfuo0.get(1))), fxif.f(((hjij)hfuo0.get(2)))) != 1 ? 8 : 0;
                    }
                }
                else {
                    v4 = 0;
                }
            }
            else {
                v6 = v5;
                if((((double)gxes1.d) < this.i.e)) {
                    v4 = 5;
                }
                else {
                    goto label_46;
                }
            }
        }
        if(v4 == 0) {
            hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
            fxhu fxhu0 = new fxhu();
            fxhu0.d(location0);
            fxhu0.f(hfwn0);
            fxhu0.e(SystemClock.elapsedRealtime());
            fxhu0.c(((Boolean)this.k.get()).booleanValue());
            fxhu0.b(((Boolean)this.l.get()).booleanValue());
            if(gxep.a((gxes1.n == null ? gxeq.a : gxes1.n).b) == 5) {
                fxhs fxhs0 = new fxhs();
                fxhs0.c(0.0f);
                fxhs0.g(false);
                fxhs0.e(false);
                fxhs0.f(false);
                fxhs0.b(hfyf.b);
                fxhs0.d(false);
                fxhu0.a = fxhs0.a();
                fxhu1 = fxhu0;
            }
            else {
                hjij hjij0 = gxes1.e == null ? hjij.a : gxes1.e;
                Location location1 = new Location("xtrn");
                location1.setLatitude(hjij0.b);
                location1.setLongitude(hjij0.c);
                float f = location0.distanceTo(location1);
                hfst hfst0 = hfyn.e((gxes1.l == null ? hfwn.a : gxes1.l), hfwn0);
                fxhs fxhs1 = new fxhs();
                fxhs1.c(f);
                if(hfym.a(hfwn0, (gxes1.l == null ? hfwn.a : gxes1.l)) <= 0) {
                    z = false;
                }
                else {
                    long v8 = (long)Math.hypot(f, gxes1.f);
                    long v9 = (long)gxes1.j;
                    float f1 = gxes1.d;
                    if(v9 <= 0L) {
                        if((((double)f1) < 6.5)) {
                            v9 = 10L;
                        }
                        else {
                            v9 = f1 < 7.0f ? 20L : 30L;
                        }
                    }
                    hfst hfst1 = hfyf.n(v9);
                    hfst hfst2 = hfyf.n(v8 / (((long)gxes1.i) > 0L ? ((long)gxes1.i) : 2500L));
                    hfwn hfwn1 = hfyn.f((gxes1.l == null ? hfwn.a : gxes1.l), hfyf.h(hfst2, hfst1));
                    z = hfym.a(hfwn0, hfwn1) > 0;
                    fxmv.b((gxes1.l == null ? hfwn.a : gxes1.l));
                    hfyf.e(hfyn.e(hfwn0, (gxes1.l == null ? hfwn.a : gxes1.l)));
                    fxmv.b(hfwn0);
                    hfyf.e(hfyn.e(hfwn1, hfwn0));
                    fxmv.b(hfwn1);
                    fxmv0.f(6, "%b:D=%d,O=%s(%s)N=%s(%s)E=%s", new Object[]{Boolean.valueOf(z), v8, fxmv.b((gxes1.l == null ? hfwn.a : gxes1.l)), hfyf.e(hfyn.e(hfwn0, (gxes1.l == null ? hfwn.a : gxes1.l))), fxmv.b(hfwn0), hfyf.e(hfyn.e(hfwn1, hfwn0)), fxmv.b(hfwn1)});
                }
                fxhs1.g(z);
                fxhs1.e(fxif.g(location0, gxes1.g));
                fxhs1.f(fxif.g(location0, gxes1.h));
                fxhs1.b(hfst0);
                fxhs1.d(true);
                fxhu1 = fxhu0;
                fxhu1.a = fxhs1.a();
            }
            fxhv fxhv0 = fxhu1.a();
            String s1 = gxes1.c;
            fxht fxht0 = fxhv0.c;
            long v10 = hfyn.b((gxes1.m == null ? hfwn.a : gxes1.m));
            float f2 = (float)huqb.f();
            float f3 = fxht0.a;
            fxnb.a(s1, v10, ((long)(Math.floor(f3 / f2) * ((double)huqb.f()))), fxht0 != null && fxht0.c, fxht0 != null && fxht0.d, fxht0 != null && fxht0.b);
            fxmv.b((gxes1.m == null ? hfwn.a : gxes1.m));
            fxmv0.f(3, "%s:%s %s", new Object[]{gxes1.c, fxmv.b((gxes1.m == null ? hfwn.a : gxes1.m)), fxhv0});
            int v11 = 11;
            if(gxer.b(gxes1.k) != 5) {
                hfst hfst3 = fxht0.e;
                if(hfyf.q(hfst3) && Math.abs(hfyf.e(hfst3)) > this.i.g) {
                    v12 = 1;
                }
                else {
                    long v13 = hfyf.e(hfst3);
                    fxhr fxhr0 = this.i;
                    if(v13 > fxhr0.f) {
                        v12 = 2;
                    }
                    else if(fxht0.d) {
                        v12 = 0;
                    }
                    else if((f3 > ((float)fxhr0.h))) {
                        v12 = 11;
                    }
                    else {
                        v12 = 12;
                    }
                }
                if(v12 != 0) {
                    fxhn0.b(gxes1, v12);
                    return;
                }
            }
            if(gxer.b(gxes1.k) == 5) {
                fxhr fxhr1 = this.i;
                if(fxhv0.b - this.e.b > fxhr1.i) {
                    v11 = 2;
                }
                else if(gxep.a((gxes1.n == null ? gxeq.a : gxes1.n).b) == 5 || f3 <= ((float)fxhr1.h)) {
                    v11 = 0;
                }
                if(v11 != 0) {
                    fxhn0.b(gxes1, v11);
                    return;
                }
            }
            if(!fxmj.i()) {
                fxhn0.b(gxes1, 9);
                return;
            }
            if(v3 != 5) {
                fxhy[] arr_fxhy = this.h;
                int v14 = 0;
                while(v14 < 6) {
                    fxhy fxhy0 = arr_fxhy[v14];
                    if(!fxhy0.c(fxhv0, gxes1)) {
                        ++v14;
                        continue;
                    }
                    int v15 = fxhy0.a;
                    Integer integer0 = v15;
                    gxer.a((gxer.b(gxes1.k) == 0 ? 1 : gxer.b(gxes1.k)));
                    gxeq gxeq0 = gxes1.n == null ? gxeq.a : gxes1.n;
                    if(gxep.a(gxeq0.b) == 0 || gxep.a(gxeq0.b) == 1) {
                        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                    }
                    long v16 = fxhv0.b;
                    fxhw fxhw0 = gxer.b(gxes1.k) == 5 ? fxhy0.d.f : fxhy0.d.e;
                    fxhy fxhy1 = fxhw0.a;
                    int v17 = fxhy1.a;
                    int v18 = v15 <= v17 ? 0 : 1;
                    long v19 = fxhw0.b;
                    long v20 = v16 - v19;
                    if(v19 > 0L) {
                        fxhy2 = fxhy0;
                        z1 = v20 < fxhy1.b;
                    }
                    else {
                        fxhy2 = fxhy0;
                        z1 = false;
                    }
                    boolean z2 = v18 == 0 && z1;
                    fxif fxif0 = fxhy2.d;
                    fxhn fxhn1 = fxif0.b;
                    fxhn1.b.f(5, "%b: [%b|%b] %s@%d->%s@%d [%d,%d]", new Object[]{Boolean.valueOf(z2), Boolean.valueOf(((boolean)(v18 ^ 1))), Boolean.valueOf(z1), v17, v19, integer0, v16, v20, ((long)fxhy1.b)});
                    if(z2) {
                        fxif0.c.a(gxes1.c, hfyn.b((gxes1.m == null ? hfwn.a : gxes1.m)), v15, 1);
                        return;
                    }
                    Optional optional0 = fxif0.d;
                    if(fxhy2.b(((Supplier)optional0.get()))) {
                        Optional optional1 = optional0.map(new fxhx());
                        fxhn1.c(gxes1.c, hfyn.b((gxes1.m == null ? hfwn.a : gxes1.m)), 13, optional1);
                        return;
                    }
                    long v21 = fxhy2.c;
                    long v22 = hfyn.d((gxes1.l == null ? hfwn.a : gxes1.l));
                    LatLng latLng0 = fxif.a((gxes1.e == null ? hjij.a : gxes1.e));
                    float f4 = gxes1.d;
                    LatLng latLng1 = new LatLng(fxhv0.a.getLatitude(), fxhv0.a.getLongitude());
                    List list0 = fxif.b(gxes1.g);
                    String s2 = gxes1.c;
                    long v23 = hfyn.b((gxes1.m == null ? hfwn.a : gxes1.m));
                    List list1 = fxif.b(gxes1.h);
                    switch(gxes1.o) {
                        case 0: {
                            v24 = 2;
                            break;
                        }
                        case 1: {
                            v24 = 3;
                            break;
                        }
                        case 2: {
                            v24 = 4;
                            break;
                        }
                        case 3: {
                            v24 = 5;
                            break;
                        }
                        case 4: {
                            v24 = 6;
                            break;
                        }
                        default: {
                            v24 = 0;
                        }
                    }
                    if(v24 == 0) {
                        v24 = 1;
                    }
                    fxhy2.a(new EAlertUxArgs(v22, latLng0, f4, latLng1, ((double)f3) / 1000.0, list0, v3 == 4, s2, v23, v21, v15, list1, (v24 - 2 == 1 ? 1 : 2), (((int)huqb.o()) == 1 ? 1 : 2), "", fxhv0.d, fxhv0.e, true));
                    fxif0.c.a(gxes1.c, hfyn.b((gxes1.m == null ? hfwn.a : gxes1.m)), v15, 2);
                    if(gxer.b(gxes1.k) != 5) {
                        fxif0.e = new fxhw(fxhy2, v16);
                        return;
                    }
                    fxif0.f = new fxhw(fxhy2, v16);
                    return;
                }
            }
            return;
        }
        fxhn0.b(gxes1, v4);
    }

    public static boolean d(gxes gxes0) {
        return gxer.b(gxes0.k) == 3 || gxer.b(gxes0.k) == 4;
    }

    public static void e(EAlertUxArgs eAlertUxArgs0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxoo.a).v_newBuilder();
        hfwn hfwn0 = hfyn.h(eAlertUxArgs0.i);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoo gxoo0 = (gxoo)hftp0.b_message;
        hfwn0.getClass();
        gxoo0.d = hfwn0;
        gxoo0.b |= 1;
        hfwn hfwn1 = hfyn.h(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn1.getClass();
        ((gxoo)hftv0).e = hfwn1;
        ((gxoo)hftv0).b |= 2;
        int v = eAlertUxArgs0.k;
        if(v == 3) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gxoo)hftp0.b_message).c = 3;
        }
        else {
            switch(v) {
                case 4: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gxoo)hftp0.b_message).c = 2;
                    break;
                }
                case 5: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gxoo)hftp0.b_message).c = 1;
                    break;
                }
                default: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gxoo)hftp0.b_message).c = 0;
                }
            }
        }
        fxgr.a(((gxoo)hftp0.N_build()));
    }

    private static ghae f(hjij hjij0) {
        return ggzv.i(hjij0.b, hjij0.c).k();
    }

    private static boolean g(Location location0, List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(fxif.f(((hjij)object0)));
        }
        return new ghab(arrayList0).s(ggzv.i(location0.getLatitude(), location0.getLongitude()).k());
    }
}

