import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Collection.-EL;
import j..util.Optional;
import j..util.function.Consumer.-CC;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class fxig implements Consumer {
    public final fxix a;
    public final Location b;

    public fxig(fxix fxix0, Location location0) {
        this.a = fxix0;
        this.b = location0;
    }

    @Override
    public final void accept(Object object0) {
        boolean z2;
        int v22;
        int v20;
        boolean z3;
        long v15;
        int v6;
        boolean z1;
        boolean z;
        int v2;
        int v;
        hguc hguc0 = (hguc)object0;
        switch((hgtv.a(hguc0.d) == 0 ? 1 : hgtv.a(hguc0.d)) - 2) {
            case 1: {
                v = 4;
                break;
            }
            case 2: {
                v = 3;
                break;
            }
            case 3: {
                v = 2;
                break;
            }
            default: {
                v = 1;
            }
        }
        hgtu hgtu0 = hguc0.c == null ? hgtu.a : hguc0.c;
        fxix fxix0 = this.a;
        fxnb.b((hguc0.c == null ? hgtu.a : hguc0.c).c, hfyn.b((hgtu0.d == null ? hfwn.a : hgtu0.d)), 2, v, bbpg.a(fxix0.d.a));
        hgtu hgtu1 = hguc0.c == null ? hgtu.a : hguc0.c;
        fxmv.b((hgtu1.d == null ? hfwn.a : hgtu1.d));
        Integer integer0 = (int)1;
        Integer integer1 = (int)(v - 1);
        fxmv fxmv0 = fxix0.d.b;
        hgtu hgtu2 = hguc0.c;
        String s = (hgtu2 == null ? hgtu.a : hgtu2).c;
        if(hgtu2 == null) {
            hgtu2 = hgtu.a;
        }
        fxmv0.f(2, "%s:%s t=%d m=%d", new Object[]{s, fxmv.b((hgtu2.d == null ? hfwn.a : hgtu2.d)), integer0, integer1});
        int v1 = hgtv.a(hguc0.d) == 0 ? 1 : hgtv.a(hguc0.d);
        Location location0 = this.b;
        if((hgto.b(hguc0.e) == null ? hgto.i : hgto.b(hguc0.e)).equals(hgto.f)) {
            hgtp hgtp0 = hguc0.n == null ? hgtp.a : hguc0.n;
            if((((double)(hgtp0.b == null ? hgtq.a : hgtp0.b).c) < fxix0.c.e)) {
                v2 = 5;
            }
            else {
                hgtp hgtp1 = hguc0.n;
                hgtp hgtp2 = hgtp1 == null ? hgtp.a : hgtp1;
                if(((hgtp2.b == null ? hgtq.a : hgtp2.b).b & 1) == 0) {
                    v2 = 6;
                }
                else {
                    if(hgtp1 == null) {
                        hgtp1 = hgtp.a;
                    }
                    if(((hgtp1.b == null ? hgtq.a : hgtp1.b).b & 2) == 0) {
                        v2 = 7;
                    }
                    else if(location0 == null) {
                        v2 = 10;
                    }
                    else {
                        hgtx hgtx0 = hguc0.g == null ? hgtx.a : hguc0.g;
                        hfuo hfuo0 = (hgtx0.d == null ? hgty.a : hgtx0.d).b;
                        v2 = !hfuo0.isEmpty() && !Collection.-EL.stream(hfuo0).anyMatch(new fxih()) && !Collection.-EL.stream(hfuo0).anyMatch(new fxii()) ? 0 : 8;
                    }
                }
            }
        }
        else {
            v2 = 3;
        }
        if(v2 == 0) {
            hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
            hgtp hgtp3 = hguc0.n == null ? hgtp.a : hguc0.n;
            hgtq hgtq0 = hgtp3.b == null ? hgtq.a : hgtp3.b;
            float f = location0.distanceTo(fxix.a((hgtq0.d == null ? hjij.a : hgtq0.d)));
            hfst hfst0 = hfyn.e((hgtq0.f == null ? hfwn.a : hgtq0.f), hfwn0);
            fxhu fxhu0 = new fxhu();
            fxhu0.d(location0);
            fxhu0.f(hfwn0);
            fxhu0.e(SystemClock.elapsedRealtime());
            fxhu0.c(((Boolean)fxix0.g.get()).booleanValue());
            fxhu0.b(((Boolean)fxix0.h.get()).booleanValue());
            fxhs fxhs0 = new fxhs();
            fxhs0.c(f);
            if(hfym.a(hfwn0, (hgtq0.f == null ? hfwn.a : hgtq0.f)) <= 0) {
                z = false;
            }
            else {
                long v3 = (long)Math.hypot(f, hgtq0.e);
                long v4 = (long)hgtq0.h;
                float f1 = hgtq0.c;
                if(v4 <= 0L) {
                    if((((double)f1) < 6.5)) {
                        v4 = 10L;
                    }
                    else {
                        v4 = f1 < 7.0f ? 20L : 30L;
                    }
                }
                hfst hfst1 = hfyf.n(v4);
                hfst hfst2 = hfyf.n(v3 / (((long)hgtq0.g) > 0L ? ((long)hgtq0.g) : 2500L));
                hfwn hfwn1 = hfyn.f((hgtq0.f == null ? hfwn.a : hgtq0.f), hfyf.h(hfst2, hfst1));
                z = hfym.a(hfwn0, hfwn1) > 0;
                fxmv.b((hgtq0.f == null ? hfwn.a : hgtq0.f));
                hfyf.e(hfyn.e(hfwn0, (hgtq0.f == null ? hfwn.a : hgtq0.f)));
                fxmv.b(hfwn0);
                hfyf.e(hfyn.e(hfwn1, hfwn0));
                fxmv.b(hfwn1);
                fxmv0.f(6, "%b:D=%d,O=%s(%s)N=%s(%s)E=%s", new Object[]{Boolean.valueOf(z), v3, fxmv.b((hgtq0.f == null ? hfwn.a : hgtq0.f)), hfyf.e(hfyn.e(hfwn0, (hgtq0.f == null ? hfwn.a : hgtq0.f))), fxmv.b(hfwn0), hfyf.e(hfyn.e(hfwn1, hfwn0)), fxmv.b(hfwn1)});
            }
            fxhs0.g(z);
            fxhs0.e(fxix.f(location0, hguc0, 3));
            fxhs0.f(fxix.f(location0, hguc0, 5));
            fxhs0.b(hfst0);
            if(((hguc0.g == null ? hgtx.a : hguc0.g).b & 1) != 0) {
                hgtx hgtx1 = hguc0.g == null ? hgtx.a : hguc0.g;
                z1 = ggyq.c(((Iterable)Collection.-EL.stream((hgtx1.c == null ? hguh.a : hgtx1.c).b).map(new fxij()).collect(ggaf.a))).g(fxix.d(location0));
            }
            else if((hguc0.g == null ? hgtx.a : hguc0.g).e.size() == 0) {
                z1 = true;
            }
            else {
                try {
                    z1 = ghas.d((hguc0.g == null ? hgtx.a : hguc0.g).e.newInput()).e(ggzv.i(location0.getLatitude(), location0.getLongitude()).k());
                }
                catch(IOException unused_ex) {
                    z1 = false;
                }
            }
            fxhs0.d(z1);
            fxhu0.a = fxhs0.a();
            fxhv fxhv0 = fxhu0.a();
            fxhq fxhq0 = fxix0.d;
            hgtu hgtu3 = hguc0.c;
            String s1 = (hgtu3 == null ? hgtu.a : hgtu3).c;
            if(hgtu3 == null) {
                hgtu3 = hgtu.a;
            }
            fxht fxht0 = fxhv0.c;
            long v5 = hfyn.b((hgtu3.d == null ? hfwn.a : hgtu3.d));
            float f2 = (float)huqb.f();
            float f3 = fxht0.a;
            fxnb.a(s1, v5, ((long)(Math.floor(f3 / f2) * ((double)huqb.f()))), fxht0 != null && fxht0.c, fxht0 != null && fxht0.d, fxht0 != null && fxht0.b);
            hgtu hgtu4 = hguc0.c == null ? hgtu.a : hguc0.c;
            fxmv.b((hgtu4.d == null ? hfwn.a : hgtu4.d));
            fxmv fxmv1 = fxhq0.b;
            hgtu hgtu5 = hguc0.c;
            String s2 = (hgtu5 == null ? hgtu.a : hgtu5).c;
            if(hgtu5 == null) {
                hgtu5 = hgtu.a;
            }
            fxmv1.f(3, "%s:%s %s", new Object[]{s2, fxmv.b((hgtu5.d == null ? hfwn.a : hgtu5.d)), fxhv0});
            hfst hfst3 = fxht0.e;
            if(hfyf.q(hfst3) && Math.abs(hfyf.e(hfst3)) > fxix0.c.g) {
                v6 = 1;
            }
            else {
                long v7 = hfyf.e(hfst3);
                fxhr fxhr0 = fxix0.c;
                if(v7 > fxhr0.f) {
                    v6 = 2;
                }
                else if(fxht0.c || fxht0.d) {
                    v6 = fxht0.f ? 0 : 14;
                }
                else if((f3 > ((float)fxhr0.h))) {
                    v6 = 11;
                }
                else {
                    v6 = 12;
                }
            }
            if(v6 != 0) {
                fxhq0.a(hguc0, v6);
                return;
            }
            if(!fxmj.i()) {
                fxhq0.a(hguc0, 9);
                return;
            }
            if(v1 != 3) {
                fxis[] arr_fxis = fxix0.b;
                int v8 = 0;
                while(v8 < 4) {
                    fxis fxis0 = arr_fxis[v8];
                    switch(v1) {
                        case 3: {
                            break;
                        }
                        case 4: {
                            z2 = 1;
                        label_151:
                            if(fxis0.c(fxhv0)) {
                                int v9 = fxis0.a;
                                Integer integer2 = v9;
                                hgtu hgtu6 = hguc0.c == null ? hgtu.a : hguc0.c;
                                hfyn.b((hgtu6.d == null ? hfwn.a : hgtu6.d));
                                long v10 = fxhv0.b;
                                fxix fxix1 = fxis0.d;
                                fxis fxis1 = fxix1.i.a;
                                int v11 = fxis1.a;
                                int v12 = v9 <= v11 ? 0 : 1;
                                long v13 = fxix1.i.b;
                                long v14 = v10 - v13;
                                if(v13 > 0L) {
                                    v15 = v13;
                                    z3 = v14 < fxis1.b ? 1 : false;
                                }
                                else {
                                    v15 = v13;
                                    z3 = false;
                                }
                                boolean z4 = v12 == 0 && z3 ? 1 : false;
                                fxhq fxhq1 = fxix1.d;
                                fxhq1.b.f(5, "%b: [%b|%b] %s@%d->%s@%d [%d,%d]", new Object[]{Boolean.valueOf(z4), Boolean.valueOf(((boolean)(v12 ^ 1))), Boolean.valueOf(z3), v11, v15, integer2, v10, v14, ((long)fxis1.b)});
                                if(z4) {
                                    fxmt fxmt0 = fxix1.e;
                                    hgtu hgtu7 = hguc0.c;
                                    String s3 = (hgtu7 == null ? hgtu.a : hgtu7).c;
                                    if(hgtu7 == null) {
                                        hgtu7 = hgtu.a;
                                    }
                                    fxmt0.a(s3, hfyn.b((hgtu7.d == null ? hfwn.a : hgtu7.d)), v9, 1);
                                    return;
                                }
                                Optional optional0 = fxix1.f;
                                if(fxis0.b(((Supplier)optional0.get()))) {
                                    Optional optional1 = optional0.map(new fxir());
                                    hgtu hgtu8 = hguc0.c;
                                    String s4 = (hgtu8 == null ? hgtu.a : hgtu8).c;
                                    if(hgtu8 == null) {
                                        hgtu8 = hgtu.a;
                                    }
                                    fxhq1.b(s4, hfyn.b((hgtu8.d == null ? hfwn.a : hgtu8.d)), 13, optional1);
                                    return;
                                }
                                long v16 = fxis0.c;
                                hgtp hgtp4 = hguc0.n == null ? hgtp.a : hguc0.n;
                                hgtq hgtq1 = hgtp4.b == null ? hgtq.a : hgtp4.b;
                                long v17 = hfyn.d((hgtq1.f == null ? hfwn.a : hgtq1.f));
                                LatLng latLng0 = fxix.b((hgtq1.d == null ? hjij.a : hgtq1.d));
                                float f4 = hgtq1.c;
                                LatLng latLng1 = new LatLng(fxhv0.a.getLatitude(), fxhv0.a.getLongitude());
                                List list0 = fxix.e(hguc0, 3);
                                hgtu hgtu9 = hguc0.c;
                                String s5 = (hgtu9 == null ? hgtu.a : hgtu9).c;
                                if(hgtu9 == null) {
                                    hgtu9 = hgtu.a;
                                }
                                long v18 = hfyn.b((hgtu9.d == null ? hfwn.a : hgtu9.d));
                                List list1 = fxix.e(hguc0, 5);
                                int v19 = hgtq1.i;
                                if(v19 == 0) {
                                    v20 = 2;
                                }
                                else {
                                    switch(v19) {
                                        case 1: {
                                            v20 = 3;
                                            break;
                                        }
                                        case 2: {
                                            v20 = 4;
                                            break;
                                        }
                                        default: {
                                            v20 = 0;
                                        }
                                    }
                                }
                                if(v20 == 0) {
                                    v20 = 1;
                                }
                                int v21 = ((int)huqb.o()) == 1 ? 1 : 2;
                                boolean z5 = fxhv0.d;
                                boolean z6 = fxhv0.e;
                                hgtp hgtp5 = hguc0.n == null ? hgtp.a : hguc0.n;
                                switch((hgtp5.b == null ? hgtq.a : hgtp5.b).j) {
                                    case 0: {
                                        v22 = 2;
                                        break;
                                    }
                                    case 1: {
                                        v22 = 3;
                                        break;
                                    }
                                    case 2: {
                                        v22 = 4;
                                        break;
                                    }
                                    default: {
                                        v22 = 0;
                                    }
                                }
                                fxis0.a(new EAlertUxArgs(v17, latLng0, f4, latLng1, ((double)f3) / 1000.0, list0, z2, s5, v18, v16, v9, list1, (v20 - 2 == 1 ? 1 : 2), v21, "", z5, z6, v22 == 3));
                                fxmt fxmt1 = fxix1.e;
                                hgtu hgtu10 = hguc0.c;
                                String s6 = (hgtu10 == null ? hgtu.a : hgtu10).c;
                                if(hgtu10 == null) {
                                    hgtu10 = hgtu.a;
                                }
                                fxmt1.a(s6, hfyn.b((hgtu10.d == null ? hfwn.a : hgtu10.d)), v9, 2);
                                fxix1.i = new fxiq(fxis0, v10);
                                return;
                            }
                            break;
                        }
                        default: {
                            z2 = false;
                            goto label_151;
                        }
                    }
                    ++v8;
                }
            }
            return;
        }
        fxix0.d.a(hguc0, v2);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

