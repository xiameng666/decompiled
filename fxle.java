import android.content.Context;
import android.location.Location;
import android.media.AudioManager;
import android.os.SystemClock;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..lang.Iterable.-EL;
import j..util.Optional;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

public final class fxle extends fxpd {
    public final AudioManager a;
    private static final bboh b;
    private final Context c;
    private final Supplier d;
    private final esaa i;
    private final Optional j;
    private final fxhn k;
    private fxif l;
    private fxix m;
    private fxjk n;
    private fxjm o;
    private final fxhk p;

    static {
        fxle.b = bboh.c("EAlert", bbcu.g, "NotRcv");
    }

    public fxle(Context context0, Supplier supplier0, Optional optional0, fxhk fxhk0) {
        super("EANotification");
        this.c = context0;
        this.d = supplier0;
        this.i = new esaa(context0, 1, "EalertNotRcv");
        this.k = new fxhn(context0);
        this.j = optional0;
        this.a = (AudioManager)context0.getSystemService("audio");
        this.p = fxhk0;
    }

    @Override  // fxpd
    public final void a() {
        long v = huqb.m();
        huqb huqb0 = huqb.a;
        long v1 = huqb0.s().m();
        double f = huqb0.s().a();
        long v2 = huqb0.s().x();
        long v3 = huqb0.s().A();
        long v4 = huqb0.s().D();
        long v5 = huqb0.s().P();
        long v6 = huqb0.s().p();
        long v7 = huqb0.s().y();
        fxhr fxhr0 = new fxhr(v5, v3, v4, huqb0.s().q(), v, f, v2, v1, v6, v7);
        if(!huqb.N()) {
            fxmt fxmt0 = fxmt.d();
            fxkz fxkz0 = new fxkz();
            fxla fxla0 = new fxla(this);
            this.l = new fxif(this.p, fxhr0, this.k, fxmt0, this.j, fxkz0, fxla0);
        }
        Context context0 = this.c;
        fxhq fxhq0 = new fxhq(context0);
        fxmt fxmt1 = fxmt.d();
        fxkz fxkz1 = new fxkz();
        fxlb fxlb0 = new fxlb(this);
        this.m = new fxix(this.p, fxhr0, fxhq0, fxmt1, this.j, fxkz1, fxlb0);
        if(fxmj.e()) {
            fxjb fxjb0 = new fxjb(huqb0.s().l(), huqb0.s().k());
            fxja fxja0 = new fxja();
            this.o = new fxjm(context0);
            this.n = new fxjk(fxja0, fxjb0, this.o, fxmt.d());
        }
        fxmj.a(context0, gxol.a);
        this.j();
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        boolean z2;
        boolean z;
        fxjm fxjm1;
        int v8;
        int v7;
        int v5;
        int v2;
        fxlc fxlc0;
        switch(fxpj0.a) {
            case 4: {
                try {
                    this.k.a();
                    try {
                        fxlc0 = (fxlc)fxpj0.b;
                        if(fxlc0 != null) {
                            goto label_5;
                        }
                    }
                    catch(hfur unused_ex) {
                    }
                    goto label_187;
                }
                catch(Throwable throwable0) {
                    this.i.g();
                    throw throwable0;
                }
            label_5:
                String s = fxlc0.a;
                if(s != null) {
                    try {
                        byte[] arr_b = bbmu.f(s);
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gxev.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        if(huqb.x()) {
                            int v = ((gxev)hftv0).g;
                            if(gxet.a(v) != 4) {
                                if(gxet.a(v) == 2 || gxet.a(v) == 3) {
                                    if(huqb.N()) {
                                        ((ggtj)((ggtj)fxle.b.i()).ar(0x4C41)).x("old alert format with arw");
                                    }
                                    else if(fxme.a().g().booleanValue()) {
                                        this.l.c(((gxev)hftv0), ((fxob)this.d.get()).b.a);
                                    }
                                }
                            }
                            else if(this.n != null && fxlu.a().d().booleanValue()) {
                                fxjk fxjk0 = this.n;
                                Location location0 = ((fxob)this.d.get()).b.a;
                                fxjm fxjm0 = fxjk0.f;
                                gxeo gxeo0 = ((gxev)hftv0).f;
                                if(gxeo0 == null) {
                                    gxeo0 = gxeo.a;
                                }
                                int v1 = gxeu.a(((gxev)hftv0).c);
                                if(v1 == 0) {
                                    v1 = 1;
                                }
                                switch(v1 - 2) {
                                    case 1: {
                                        v2 = 2;
                                        break;
                                    }
                                    case 2: {
                                        v2 = 3;
                                        break;
                                    }
                                    case 3: {
                                        v2 = 4;
                                        break;
                                    }
                                    default: {
                                        v2 = 1;
                                    }
                                }
                                String s1 = gxeo0.c;
                                long v3 = hfyn.b((gxeo0.e == null ? hfwn.a : gxeo0.e));
                                int v4 = gxem.a(gxeo0.h) == 0 ? 1 : gxem.a(gxeo0.h);
                            alab1:
                                switch((gxen.b(gxeo0.d) == 0 ? 1 : gxen.b(gxeo0.d)) - 2) {
                                    case 1: {
                                        switch(v4 - 2) {
                                            case 0: 
                                            case 1: {
                                                v5 = 5;
                                                break alab1;
                                            }
                                            case 2: {
                                                v5 = 7;
                                                break alab1;
                                            }
                                            default: {
                                                v5 = 1;
                                                break alab1;
                                            }
                                        }
                                    }
                                    case 2: {
                                        switch(v4 - 2) {
                                            case 0: 
                                            case 1: {
                                                v5 = 6;
                                                break alab1;
                                            }
                                            case 2: {
                                                v5 = 8;
                                                break alab1;
                                            }
                                            default: {
                                                v5 = 1;
                                                break alab1;
                                            }
                                        }
                                    }
                                    default: {
                                        v5 = 1;
                                    }
                                }
                                fxnb.b(s1, v3, v5, v2, bbpg.a(fxjm0.a));
                                fxmv.b((gxeo0.e == null ? hfwn.a : gxeo0.e));
                                fxjm.b((gxen.b(gxeo0.d) == 0 ? 1 : gxen.b(gxeo0.d)));
                                fxmv fxmv0 = fxjm0.b;
                                fxmv0.f(2, "%s:%s t=%d m=%d", new Object[]{gxeo0.c, fxmv.b((gxeo0.e == null ? hfwn.a : gxeo0.e)), fxjm.b((gxen.b(gxeo0.d) == 0 ? 1 : gxen.b(gxeo0.d))), ((int)(v2 - 1))});
                                gxeo gxeo1 = ((gxev)hftv0).f;
                                if(gxeo1 == null) {
                                    gxeo1 = gxeo.a;
                                }
                                int v6 = gxeu.a(((gxev)hftv0).c);
                                if(v6 == 0) {
                                    v6 = 1;
                                }
                            alab2:
                                switch(v6 - 2) {
                                    case 1: {
                                        v7 = 3;
                                        Iterator iterator0 = gfud.e('.').n(((gxev)hftv0).d).iterator();
                                        while(true) {
                                            if(!iterator0.hasNext()) {
                                                break alab2;
                                            }
                                            Object object0 = iterator0.next();
                                            if(!"tst".equals(((String)object0))) {
                                                continue;
                                            }
                                            v7 = 4;
                                            break alab2;
                                        }
                                    }
                                    case 2: {
                                        v7 = 4;
                                        break;
                                    }
                                    default: {
                                        v7 = 5;
                                    }
                                }
                                if(!((ProtoLiteMessage)gxeo1).isInitialized()) {
                                    v8 = 3;
                                }
                                else if((gxeo1.b & 1) == 0) {
                                    v8 = 4;
                                }
                                else if(location0 == null) {
                                    v8 = 10;
                                }
                                else {
                                    v8 = 0;
                                }
                                if(v8 == 0) {
                                    hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
                                    hfuo hfuo0 = gxeo1.g;
                                    if(hfuo0 == null) {
                                        fxjm1 = fxjm0;
                                        z = false;
                                    }
                                    else {
                                        ArrayList arrayList0 = new ArrayList();
                                        for(Object object1: hfuo0) {
                                            arrayList0.add(Long.valueOf(ggym.ab(((String)object1)).c));
                                        }
                                        ggyq ggyq0 = new ggyq();
                                        ggyq0.l(arrayList0);
                                        fxjm1 = fxjm0;
                                        z = ggyq0.g(ggzv.i(location0.getLatitude(), location0.getLongitude()).k());
                                    }
                                    if(hfwn0 == null) {
                                        throw new NullPointerException("Null nowTimestamp");
                                    }
                                    long v9 = SystemClock.elapsedRealtime();
                                    hfst hfst0 = hfyn.e((gxeo1.e == null ? hfwn.a : gxeo1.e), hfwn0);
                                    if(hfst0 == null) {
                                        throw new NullPointerException("Null latency");
                                    }
                                    fxjc fxjc0 = new fxjc(location0, hfwn0, v9, hfst0, z);
                                    String s2 = gxeo1.c;
                                    long v10 = hfyn.b((gxeo1.e == null ? hfwn.a : gxeo1.e));
                                    boolean z1 = fxjc0.d;
                                    fxnb.a(s2, v10, 0L, z1, false, false);
                                    fxmv.b((gxeo1.e == null ? hfwn.a : gxeo1.e));
                                    fxmv0.f(3, "%s:%s %s", new Object[]{gxeo1.c, fxmv.b((gxeo1.e == null ? hfwn.a : gxeo1.e)), fxjc0});
                                    hfst hfst1 = fxjc0.c;
                                    if(hfyf.q(hfst1) && Math.abs(hfyf.e(hfst1)) > fxjk0.c.b) {
                                        z2 = true;
                                    }
                                    else if(hfyf.e(hfst1) > fxjk0.c.a) {
                                        z2 = false;
                                    }
                                    else if(!z1) {
                                        huqb.C();
                                        z2 = huqb.C() ? false : false;
                                    }
                                    else {
                                        z2 = false;
                                    }
                                    if(z2) {
                                        fxjm1.a(gxeo1, ((int)z2));
                                    }
                                    else if(!fxmj.e()) {
                                        fxjm1.a(gxeo1, 9);
                                    }
                                    else if(v7 != 5) {
                                        fxje[] arr_fxje = fxjk0.b;
                                        for(int v11 = 0; v11 < 5; ++v11) {
                                            fxje fxje0 = arr_fxje[v11];
                                            if(fxje0.b(gxeo1)) {
                                                int v12 = fxje0.a;
                                                Integer integer0 = v12;
                                                int v13 = gxen.b(gxeo1.d);
                                                if(v13 == 0) {
                                                    v13 = true;
                                                }
                                                gxen.a(v13);
                                                long v14 = fxjc0.b;
                                                fxjk fxjk1 = fxje0.d;
                                                Map map0 = fxjk1.h;
                                                fxjd fxjd0 = (fxjd)map0.get(fxje0);
                                                if(fxjd0 == null) {
                                                    fxjd0 = fxjk1.e;
                                                }
                                                int v15 = fxjd0.a.equals(fxjk1.d);
                                                long v16 = v14 - fxjd0.b;
                                                boolean z3 = fxjd0.b > 0L && v16 < fxje0.b;
                                                boolean z4 = v15 == 0 && z3;
                                                fxjk1.f.b.f(5, "%b: [%b|%b] %s@%d->%s@%d [%d,%d]", new Object[]{Boolean.valueOf(z4), Boolean.valueOf(((boolean)(v15 ^ 1))), Boolean.valueOf(z3), ((int)fxjd0.a.a), ((long)fxjd0.b), integer0, v14, v16, ((long)fxje0.b)});
                                                if(z4) {
                                                    fxjk1.g.a(gxeo1.c, hfyn.b((gxeo1.e == null ? hfwn.a : gxeo1.e)), v12, 1);
                                                    break;
                                                }
                                                fxje0.a(new EAlertUxArgs(0L, null, 0.0f, new LatLng(fxjc0.a.getLatitude(), fxjc0.a.getLongitude()), 0.0, null, v7 == 4, gxeo1.c, hfyn.b((gxeo1.e == null ? hfwn.a : gxeo1.e)), fxje0.c, v12, null, 0, 0, gxeo1.f, false, false, false));
                                                fxjk1.g.a(gxeo1.c, hfyn.b((gxeo1.e == null ? hfwn.a : gxeo1.e)), v12, 2);
                                                map0.put(fxje0, new fxjd(fxje0, v14));
                                                break;
                                            }
                                        }
                                    }
                                }
                                else {
                                    fxjm0.a(gxeo1, v8);
                                }
                            }
                        }
                        else if(!huqb.N()) {
                            this.l.c(((gxev)hftv0), ((fxob)this.d.get()).b.a);
                        }
                        else if((((gxev)hftv0).b & 2) != 0) {
                            ((ggtj)((ggtj)fxle.b.i()).ar(0x4C40)).x("arw message outside enabled area");
                        }
                        else {
                            ((ggtj)((ggtj)fxle.b.i()).ar(0x4C3F)).x("old alert format");
                        }
                        goto label_187;
                    }
                    catch(hfur unused_ex) {
                        goto label_187;
                    }
                    catch(Throwable throwable0) {
                    }
                    this.i.g();
                    throw throwable0;
                }
            label_187:
                this.i.g();
                return true;
            }
            case 7: {
                this.k.a();
                try {
                    fxld fxld0 = (fxld)fxpj0.b;
                    if(fxld0 != null) {
                        hgud hgud0 = fxld0.a;
                        if(hgud0 != null) {
                            fxix fxix0 = this.m;
                            Location location1 = ((fxob)this.d.get()).b.a;
                            Iterable.-EL.forEach(hgud0.d, new fxig(fxix0, location1));
                        }
                    }
                }
                catch(Throwable throwable1) {
                    this.i.g();
                    throw throwable1;
                }
                this.i.g();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // fxpd
    public final void d(PrintWriter printWriter0) {
        this.i(printWriter0);
        this.k.b.c(printWriter0);
        fxjm fxjm0 = this.o;
        if(fxjm0 != null) {
            fxjm0.b.c(printWriter0);
        }
        this.h(printWriter0);
        printWriter0.println("uxl>");
        if(huqb.G()) {
            fxmt.b().a.c(printWriter0);
        }
        printWriter0.println("<uxl");
    }

    public final void e(hgud hgud0) {
        long v = huqb.p();
        this.i.c(v);
        this.h.e(7, new fxld(hgud0));
    }

    public final void f(String s) {
        long v = huqb.p();
        this.i.c(v);
        this.h.e(4, new fxlc(s));
    }
}

