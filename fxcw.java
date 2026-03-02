import j..util.function.Consumer.-CC;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public final class fxcw implements fxbx, Consumer {
    public final fwru a;
    public final boolean b;
    public final fvqd c;
    private long d;
    private final fwze e;
    private final fvkc f;
    private final fvrj g;
    private final fxzs h;
    private final fvrf i;
    private final fvqn j;
    private final fxcz k;
    private final fvtk l;
    private final fwrh m;
    private final fwrd n;
    private final fxcq o;
    private fxcv p;

    public fxcw(fwze fwze0, fwxs fwxs0, File file0, boolean z) {
        fvrf fvrf2;
        fvrj fvrj1;
        fvrf fvrf1;
        fvqn fvqn1;
        fwze fwze1;
        fwrd fwrd1;
        fvtk fvtk1;
        this.e = fwze0;
        fwyi fwyi0 = fwze0.h();
        fwyk fwyk0 = fwze0.mK();
        fwyd fwyd0 = fwze0.f();
        fvrj fvrj0 = new fvrj(fwyd0, new fvrl(fwyk0, fwyd0.a(), fwyd0.b()));
        fvkc fvkc0 = new fvkc(fwze0.f(), fwyk0, fwyi0);
        this.f = fvkc0;
        fvrf fvrf0 = new fvrf(fwze0.q().b());
        fvrf0.h();
        fvrf0.b();
        this.i = fvrf0;
        fvqn fvqn0 = new fvqn(fwze0.mK(), fwyi0.b());
        this.j = fvqn0;
        fwze0.e();
        fxzs fxzs0 = new fxzs(new fxzt[]{fvkc0, fvqn0, fvrj0});
        this.h = fxzs0;
        fvtk fvtk0 = new fvtk(fwze0);
        fvtk0.b();
        this.l = fvtk0;
        fwrd fwrd0 = new fwrd();
        this.n = fwrd0;
        fwrh fwrh0 = new fwrh(fwze0);
        this.m = fwrh0;
        if(huvd.z()) {
            this.a = null;
            fvtk1 = fvtk0;
            fwrd1 = fwrd0;
        }
        else {
            fvtk1 = fvtk0;
            fwrd1 = fwrd0;
            this.a = new fwru(fwze0, fwrh0, fvtk0, fwrd0, fwrv.a(fwze0.e()));
        }
        this.b = z;
        if(z) {
            fwze1 = fwze0;
            fvqn1 = fvqn0;
            fvrf1 = fvrf0;
            fvrj1 = fvrj0;
            this.c = new fvqx(fwze1, fwze0.f(), fwze0.l(), fwze0.s(), fvkc0, fvqn0, fxzs0, fvrf0, fvrj0, fvtk1, fwxs0);
        }
        else {
            fvrf1 = fvrf0;
            fvqn1 = fvqn0;
            fvrj1 = fvrj0;
            fwze1 = fwze0;
            this.c = new fvqy(fwze1, fwze0.f(), fwze0.s(), fvrj1, fvkc0, fxzs0);
        }
        if(huvd.z()) {
            fwyd fwyd1 = fwze1.f();
            fvwz fvwz0 = fwze1.mH();
            fvrf2 = fvrf1;
            this.p = new fxcv(fwyd1, fvrf1, fvtk1, this.c, fvwz0);
            this.o = new fxcq(fwze1, fwrd1, this.p);
        }
        else {
            fvrf2 = fvrf1;
            this.o = null;
        }
        this.g = fvrj1;
        this.k = new fxcz(fwze1, fvqn1, file0, fvrf2);
    }

    @Override  // fxbx
    public final void A(boolean z, boolean z1) {
        if(!huvd.z()) {
            fwru fwru0 = this.a;
            if(fwru0 != null) {
                fwru0.h(this.e.f(), fwru0.p, z);
            }
        }
        this.c.q(z);
        this.k.b = z1;
        this.k.b();
        fxcq fxcq0 = this.o;
        if(fxcq0 != null) {
            fxcq0.d.d(z);
        }
    }

    @Override  // fxbx
    public final void B(cjds cjds0) {
        if(cjds0.c != -1 && cjds0.c < 3) {
            return;
        }
        this.n.b(cjds0);
        this.c.w(cjds0);
    }

    @Override  // fxbx
    public final void C(long[] arr_v, long[] arr_v1, fwpb fwpb0, fwyc fwyc0) {
        hecu hecu0 = new hecu(arr_v);
        List list0 = glxd.g(arr_v1);
        fwzv fwzv0 = this.e.u();
        boolean z = huvd.a.f().Z();
        gmcg gmcg0 = this.e.mJ().a;
        gmcd gmcd0 = glzd.f(new hedh(this.m, fwzv0, hecu0, list0, z, fwyc0, gmcg0).a(), new fxct(fwpb0), this.e.mJ().a);
        this.e.g().b(gmcd0);
    }

    @Override  // fxbx
    public final void D(fvtm fvtm0) {
        long v = this.e.f().b();
        this.i.g();
        if(!huvd.z()) {
            this.l.c(v, fvtm0);
        }
        this.c.d(fvtm0);
    }

    @Override  // fxbx
    public final void E(Object object0) {
        this.c.D(object0);
    }

    // Detected as a lambda impl.
    public final void F() {
        long v = this.e.f().b();
        if(v - this.d > 10800000L) {
            fvkc fvkc0 = this.f;
            fvkc0.d();
            fvkc0.d();
            try {
                fvur fvur0 = fvkc0.b();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwvv.a).v_newBuilder();
                long v1 = fvkc0.b.a();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvv gwvv0 = (gwvv)hftp0.b_message;
                gwvv0.b |= 1;
                gwvv0.c = v1;
                Iterator iterator0 = fvkc0.c();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwwe.a).v_newBuilder();
                    long v2 = ((fvkb)object0).a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((gwwe)hftv0).b |= 1;
                    ((gwwe)hftv0).c = v2;
                    int v3 = ((fvkb)object0).b;
                    if(v3 != 0x7FFF) {
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gwwe gwwe0 = (gwwe)hftp1.b_message;
                        gwwe0.b |= 4;
                        gwwe0.d = v3;
                    }
                    gwwe gwwe1 = (gwwe)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwvv gwvv1 = (gwvv)hftp0.b_message;
                    gwwe1.getClass();
                    hfuo hfuo0 = gwvv1.d;
                    if(!hfuo0.c()) {
                        gwvv1.d = ProtoLiteMessage.E(hfuo0);
                    }
                    gwvv1.d.add(gwwe1);
                }
                fvur0.b(fvur0.c(((MessageLite)(((gwvv)hftp0.N_build())))));
            }
            catch(IOException unused_ex) {
            }
            this.j.p();
            this.d = v;
        }
    }

    @Override  // fxbx
    public final void a(boolean z) {
        if(!huvd.z()) {
            fwru fwru0 = this.a;
            if(fwru0 != null) {
                fwru0.h(this.e.f(), ((boolean)(((int)z) ^ 1)), fwru0.r);
            }
        }
    }

    @Override
    public final void accept(Object object0) {
        fvrf fvrf0 = (fvrf)object0;
        this.c.k();
        this.k.b();
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override  // fxbx
    public final void b(fwzf fwzf0) {
        switch(fwzf0.ordinal()) {
            case 0: {
                fwru fwru0 = this.a;
                if(fwru0 != null) {
                    fwyd fwyd0 = this.e.f();
                    fwru0.b.b = fwyd0.b();
                    if(huvd.w()) {
                        fwru0.f();
                    }
                    else {
                        fwru0.i(fwyd0, null);
                    }
                }
                break;
            }
            case 7: {
                fxcz fxcz0 = this.k;
                if(fwzf0 == fwzf.h) {
                    fxcz0.a = -1L;
                    fxcz0.b();
                }
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 9: 
            case 10: {
                this.c.b(fwzf0);
            }
        }
        this.F();
    }

    @Override  // fxbx
    public final void c(int v, int v1, boolean z) {
        this.i.a(v, v1, z);
        this.c.c(v, v1, z);
        Boolean.valueOf(z).getClass();
        this.k.c = z;
        this.k.b();
    }

    @Override  // fxbx
    public final void d(boolean z, boolean z1, boolean z2, int v, String s) {
        this.g.c(z1);
        this.k.d = z;
        this.k.e = this.k.f.f().b();
        this.k.b();
    }

    @Override  // fxbx
    public final void e(boolean z) {
        if(z && huvd.o()) {
            return;
        }
        this.i.d(z);
        fwru fwru0 = this.a;
        if(fwru0 != null && !huvd.o()) {
            if(z && fwru0.l()) {
                fwru0.g(fwru0.a.f().b());
            }
            fwru0.g = z;
        }
        this.c.h(z);
    }

    @Override  // fxbx
    public final void f(PrintWriter printWriter0) {
        if(huvd.z()) {
            fxcq fxcq0 = this.o;
            if(fxcq0 != null) {
                printWriter0.println("Provider:Coordinator active");
                printWriter0.println(a.an(huvd.u(), "  fbefi="));
                printWriter0.println("  mbom=" + huvd.d());
                printWriter0.println(a.an(huph.e(), "  uft="));
                printWriter0.println(a.an(hupd.h(), "  us2="));
                printWriter0.println("  fse-passive=" + huvd.j());
                printWriter0.println("  stationary-throttle=" + huvd.y());
                printWriter0.println("  enable-in-idle=" + huvd.o());
                printWriter0.println("  scan_stat:null=" + fxcq0.h + ", old=" + fxcq0.i + ", dup=" + fxcq0.j + ", ok=" + fxcq0.k);
                fxcq0.d.b(printWriter0);
            }
        }
        fxcv fxcv0 = this.p;
        if(fxcv0 != null) {
            printWriter0.println("NP: nwc= " + fxcv0.a);
            printWriter0.println("NP: ztc= " + fxcv0.c);
            printWriter0.println("NP: ztw= " + fxcv0.b);
        }
        fwru fwru0 = this.a;
        if(fwru0 == null) {
            this.m.d(printWriter0);
        }
        else {
            printWriter0.println("NL: lastLocationTimestamp: " + fwru0.a());
            printWriter0.println("NL: locationCount: " + fwru0.A);
            printWriter0.println("NL: wifiEnabled: " + fwru0.r);
            printWriter0.println("NL: software batch bins: 0");
            printWriter0.println("NL: hardware batch bins: 0");
            printWriter0.println("NL: batches delivered  : 0");
            printWriter0.println("NL: deepIdle : " + fwru0.g);
            printWriter0.println("NL: inGls : " + fwru0.j);
            printWriter0.println(a.an(huvd.y(), "NL: stationary throttle  : "));
            printWriter0.println("NL: enableInIdle: " + huvd.o());
            printWriter0.println("NL: useChreScanEngine: " + huvd.z());
            printWriter0.println("NL: useNetworkCapabilitiesApi: " + huvd.A());
            fvtz fvtz0 = fwru0.c;
            if(fvtz0 != null) {
                printWriter0.println("NL: locatorParams: " + fvtz0.toString());
            }
            fwru0.y.b("NetworkLocatorClients", printWriter0, fwru0.z);
            fwru0.d.d(printWriter0);
        }
        printWriter0.println("SU: " + this.k.g + "/" + this.k.h + "/0");
        this.c.e(printWriter0);
    }

    @Override  // fxbx
    public final void g() {
    }

    @Override  // fxbx
    public final void h() {
        if(huvd.z()) {
            fxcq fxcq0 = this.o;
            if(fxcq0 == null) {
                goto label_7;
            }
            else if(!fxcq0.g) {
                fwrm.a(fxcq0.a.mH(), 17, 0, -1);
                fxcq0.e.a.c();
            }
        }
        else {
        label_7:
            fwru fwru0 = this.a;
            if(fwru0 != null) {
                fwze fwze0 = fwru0.a;
                fwrm.c(fwze0.mH(), 5, -1, -1);
                if(!fwru0.l && !fwru0.k && !fwru0.j) {
                    fwru0.d();
                    long v = fwze0.f().b();
                    fwru0.k(glzd.f(fwru0.c(v, false, false, true, ((int)(v / 10000L))), new fwrp(fwru0, v), fwze0.mJ().a));
                }
            }
        }
    }

    @Override  // fxbx
    public final void i() {
    }

    @Override  // fxbx
    public final void j() {
        int v17;
        int v15;
        int v10;
        long v8;
        int v7;
        gwvr gwvr0;
        fxcu fxcu0 = () -> {
            long v = this.e.f().b();
            if(v - this.d > 10800000L) {
                fvkc fvkc0 = this.f;
                fvkc0.d();
                fvkc0.d();
                try {
                    fvur fvur0 = fvkc0.b();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwvv.a).v_newBuilder();
                    long v1 = fvkc0.b.a();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwvv gwvv0 = (gwvv)hftp0.b_message;
                    gwvv0.b |= 1;
                    gwvv0.c = v1;
                    Iterator iterator0 = fvkc0.c();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwwe.a).v_newBuilder();
                        long v2 = ((fvkb)object0).a;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        ((gwwe)hftv0).b |= 1;
                        ((gwwe)hftv0).c = v2;
                        int v3 = ((fvkb)object0).b;
                        if(v3 != 0x7FFF) {
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gwwe gwwe0 = (gwwe)hftp1.b_message;
                            gwwe0.b |= 4;
                            gwwe0.d = v3;
                        }
                        gwwe gwwe1 = (gwwe)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwvv gwvv1 = (gwvv)hftp0.b_message;
                        gwwe1.getClass();
                        hfuo hfuo0 = gwvv1.d;
                        if(!hfuo0.c()) {
                            gwvv1.d = ProtoLiteMessage.E(hfuo0);
                        }
                        gwvv1.d.add(gwwe1);
                    }
                    fvur0.b(fvur0.c(((MessageLite)(((gwvv)hftp0.N_build())))));
                }
                catch(IOException unused_ex) {
                }
                this.j.p();
                this.d = v;
            }
        };
        this.c.n(fxcu0);
        synchronized(this.i.c) {
            this.i.b.add(this);
        }
        this.i.c(true);
        this.i.d(false);
        fvkc fvkc0 = this.f;
        try {
            gwvv gwvv0 = (gwvv)fvkc0.b().a(((Parser)((ProtoLiteMessage)gwvv.a).jf(7, null)));
            long v1 = gwvv0.c;
            long v2 = fvkc0.b.c();
            long v3 = fvkc0.b.b();
            for(Object object0: gwvv0.d) {
                gwwe gwwe0 = (gwwe)object0;
                if((gwwe0.b & 1) != 0) {
                    fvkb fvkb0 = new fvkb(gwwe0);
                    int v4 = fvkb0.b;
                    if(v4 != 0x7FFF) {
                        fvkb0.b = fvkb.a(Math.min(v3, ((long)v4) * 86400000L + v1 - (v2 - v3)));
                    }
                    fvkc0.a.c(fvkb0);
                }
            }
            fvkc0.d();
        }
        catch(IOException unused_ex) {
            fvkc0.a.a.clear();
        }
        long v5 = this.e.f().b();
        this.h.b(v5);
        fvqn fvqn0 = this.j;
        synchronized(fvqn0) {
            fvur fvur0 = fvqn0.h();
            try {
                gwvr0 = (gwvr)fvur0.a(((Parser)((ProtoLiteMessage)gwvr.a).jf(7, null)));
                v7 = gwvr0.b;
                v8 = 0L;
                if((v7 & 1) == 0) {
                    goto label_41;
                }
                else {
                    goto label_39;
                }
                goto label_42;
            }
            catch(IOException unused_ex) {
                goto label_118;
            }
        label_39:
            long v9 = gwvr0.d;
            goto label_42;
        label_41:
            v9 = 0L;
        label_42:
            fvqn0.a = v9;
            if((v7 & 0x100) == 0) {
                v10 = 1;
            }
            else {
                v10 = gwvq.a(gwvr0.m);
                if(v10 == 0) {
                    v10 = 1;
                }
            }
            fvqn0.k = v10;
            fvqn0.b = (v7 & 2) == 0 ? 0L : gwvr0.e;
            fvqn0.c = (v7 & 16) == 0 ? 0L : gwvr0.h;
            fvqn0.d = (v7 & 0x80) == 0 ? 0L : gwvr0.k;
            if((v7 & 0x40) != 0) {
                v8 = gwvr0.j;
            }
            fvqn0.e = v8;
            fvqn0.f = (v7 & 0x20) == 0 ? 0 : gwvr0.i;
            int v11 = 0x80000000;
            fvqn0.g = (v7 & 8) == 0 ? 0x80000000 : gwvr0.g;
            if((v7 & 4) != 0) {
                v11 = gwvr0.f;
            }
            fvqn0.h = v11;
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: gwvr0.l) {
                gwvu gwvu0 = (gwvu)object1;
                if((gwvu0.b & 1) != 0) {
                    String s = gwvu0.c;
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object2: gwvu0.d) {
                        gwwb gwwb0 = (gwwb)object2;
                        if((gwwb0.b & 1) != 0 && (gwwb0.b & 2) != 0) {
                            long v12 = (long)gwwb0.c;
                            long v13 = (long)gwwb0.d;
                            if(v12 < v13) {
                                arrayList1.add(new fvsl(v12, v13));
                            }
                        }
                    }
                    arrayList0.add(new fvqm(s, arrayList1));
                }
            }
            fvqn0.i = gged_interceptors.i(arrayList0);
            List list0 = new ArrayList();
            for(Object object3: gwvr0.c) {
                gwwa gwwa0 = (gwwa)object3;
                if((gwwa0.b & 16) == 0) {
                    v15 = 0;
                }
                else {
                    int v14 = gwvx.a(gwwa0.f);
                    v15 = v14 == 0 ? 1 : v14;
                }
                if(huvd.r()) {
                    if((gwwa0.b & 0x20) == 0) {
                        v17 = 0;
                    }
                    else {
                        int v16 = gwtj.a(gwwa0.g);
                        v17 = v16 == 0 ? 1 : v16;
                    }
                    int v18 = gwvz.a(gwwa0.e);
                    super(gwwa0.c, gwwa0.d, (v18 == 0 ? 1 : v18), v17, v15);
                }
                else {
                    int v19 = gwvz.a(gwwa0.e);
                    super(gwwa0.c, gwwa0.d, (v19 == 0 ? 1 : v19), v15);
                }
                list0.add(null);
            }
            Collections.sort(list0);
            int v20 = list0.size();
            if(v20 > 20) {
                list0 = list0.subList(v20 - 20, v20);
            }
            fvqn0.j = gged_interceptors.i(list0);
        }
    label_118:
        heci heci0 = new heci(this.m, this.e);
        synchronized(heci.class) {
            heci.a = heci0;
        }
    }

    @Override  // fxbx
    public final void k() {
    }

    @Override  // fxbx
    public final void l(fuxg fuxg0) {
        this.c.g(fuxg0);
    }

    @Override  // fxbx
    public final void m(fwzf fwzf0, fvsx fvsx0) {
    }

    @Override  // fxbx
    public final void n(boolean z) {
    }

    @Override  // fxbx
    public final void o(long v) {
    }

    @Override  // fxbx
    public final void p(long v) {
        this.c.i(v);
    }

    @Override  // fxbx
    public final void q(fvuu fvuu0) {
    }

    @Override  // fxbx
    public final void r(boolean z) {
        this.c.j(z);
    }

    @Override  // fxbx
    public final void s(boolean z) {
        synchronized(heci.class) {
            heci.a = null;
        }
        fvrf fvrf0 = this.i;
        fvrf0.c(false);
        this.c.l();
        fwru fwru0 = this.a;
        if(fwru0 != null) {
            fwze fwze0 = fwru0.a;
            fwze0.s().b(fwzf.a);
            if(fwru0.l()) {
                fwru0.g(fwze0.f().b());
            }
            fwru0.d.g();
        }
        fxcq fxcq0 = this.o;
        if(fxcq0 != null && !fxcq0.g) {
            fwzy fwzy0 = new fwzy(6);
            fxcq0.d.e(fwzl.a, fwzy0);
            fxcq0.g = true;
            fxcq0.d.c();
        }
        if(huvd.z()) {
            this.m.g();
        }
        synchronized(fvrf0.c) {
            fvrf0.b.remove(this);
        }
        if(!z) {
            File file0 = fvqn.j(this.e.mK());
            if(file0 != null) {
                file0.delete();
            }
        }
    }

    @Override  // fxbx
    public final void t(boolean z) {
        if(!huvd.z()) {
            long v = this.e.f().b();
            this.l.d(z, v);
        }
        this.i.e(z);
        this.c.m(z);
    }

    @Override  // fxbx
    public final void u(int v, Object object0, fwyc fwyc0) {
    }

    @Override  // fxbx
    public final void v(fvtz fvtz0, boolean z) {
        long v2;
        fvtz fvtz1;
        fxcl fxcl0;
        if(huvd.z()) {
            fxcq fxcq0 = this.o;
            if(fxcq0 == null) {
                goto label_21;
            }
            else if(!fxcq0.g) {
                fwze fwze0 = fxcq0.a;
                fwrm.a(fwze0.mH(), 34, ((int)fxcq0.f), -1);
                if(fvtz0.d()) {
                    fxcl0 = new fxcl(fxcq0, fxcq0.d, fwze0, fvtz0);
                    fvtz1 = fvtz0;
                }
                else {
                    fxcb fxcb0 = new fxcb(fxcq0);
                    fvtz1 = fvtz0;
                    fxcl0 = new fxcg(fxcq0, fxcq0.d, fwze0, fvtz1, fxcb0);
                }
                fxcq0.e.a = fxcl0;
                if(!fxcq0.f) {
                    fxcq0.f = true;
                    gmcg gmcg0 = fwze0.mJ().a;
                    fwrm.a(fwze0.mH(), 17, 1, -1);
                    gmcd gmcd0 = glzd.f(glzd.g(fxcq0.d.a(), new fxcc(fxcq0, fvtz1), gmcg0), new fxcd(fxcq0, ((boolean)(((int)z)))), gmcg0);
                    fwze0.g().b(gmcd0);
                }
            }
        }
        else {
        label_21:
            fwru fwru0 = this.a;
            if(fwru0 != null) {
                fwyd fwyd0 = this.e.f();
                long v = fwyd0.b();
                boolean z1 = fwru0.k;
                boolean z2 = fwru0.j;
                fwrm.c(fwru0.a.mH(), 35, (fwru0.l ? 2 : 0) | ((int)z) | (z1 ? 4 : 0) | (z2 ? 8 : 0), -1);
                if(fwru0.l || z1 || z2) {
                    z = 0;
                }
                long v1 = fwru0.a();
                fvtz fvtz2 = fwru0.c;
                if(!fwru0.p && !fwru0.r || !fvtz0.e()) {
                    fvtz0.e = 0x7FFFFFFFFFFFFFFFL;
                }
                else if(!fvtz0.d()) {
                    if(((int)z) == 0) {
                        if(v1 == 0L) {
                            v1 = 0x8000000000000000L;
                        }
                        v2 = fvtz0.b(v1);
                    }
                    else {
                        v2 = 0L;
                    }
                    fvtz0.e = v2;
                }
                else if(((int)z) == 0 && fvtz2.d() && fvtz0.a == fvtz2.a && fvtz0.c == fvtz2.c) {
                    fvtz0.e = fvtz2.e;
                }
                else {
                    fvtz0.e = ((int)z) == 0 ? fvtz0.b(v) : 0L;
                }
                fwru0.c = fvtz0;
                fwru0.y.a(Math.max(0L, fwru0.c.e - v));
                if(!fwru0.l && !z1 && !z2) {
                    if(huvd.w()) {
                        fwru0.f();
                        return;
                    }
                    if(!fwru0.l()) {
                        fwru0.d();
                    }
                    fwru0.k(gmbu.i(new hecr(1)));
                    fwru0.i(fwyd0, null);
                }
            }
        }
    }

    @Override  // fxbx
    public final void w() {
    }

    @Override  // fxbx
    public final void x() {
    }

    @Override  // fxbx
    public final void y() {
    }

    @Override  // fxbx
    public final void z(fvvj[] arr_fvvj, boolean z) {
        fvvc fvvc0;
        if(arr_fvvj != null) {
            if(arr_fvvj.length > 0) {
                this.c.p(arr_fvvj[0]);
            }
            if(!z) {
                fwru fwru0 = this.a;
                if(fwru0 != null) {
                    fvvc[] arr_fvvc = new fvvc[arr_fvvj.length];
                    for(int v1 = 0; v1 < arr_fvvj.length; ++v1) {
                        fvvj fvvj0 = arr_fvvj[v1];
                        if((fvvj0 instanceof fvvc)) {
                            fvvc0 = (fvvc)fvvj0;
                        }
                        else {
                            int v2 = fvvj0.d();
                            fvvb fvvb0 = new fvvb(fvvj0.m(), v2);
                            fvvb0.c(fvvj0.p());
                            for(int v3 = 0; v3 < v2; ++v3) {
                                fvvc.r(fvvj0, v3, fvvb0);
                            }
                            fvvc0 = fvvb0.a(fvvj0.o());
                        }
                        arr_fvvc[v1] = fvvc0;
                    }
                    fwyd fwyd0 = fwru0.a.f();
                    fwru0.f = fwyd0.b();
                    for(int v = 0; v < arr_fvvj.length; ++v) {
                        fvvc fvvc1 = arr_fvvc[v];
                        if(fvvc1 != null) {
                            arr_fvvc[v] = (fvvc)fvvc1.u();
                        }
                    }
                    fwru0.i(fwyd0, arr_fvvc);
                }
            }
        }
    }
}

