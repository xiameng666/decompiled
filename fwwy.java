import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fwwy implements cmob, fwxz, gxbl, gxcz {
    public final bblf a;
    public Runnable b;
    gxdb c;
    private static final AtomicBoolean d;
    private final Context e;
    private final gxcy f;
    private final fwwu g;
    private final bblg h;
    private final List i;
    private long j;
    private boolean k;

    static {
        fwwy.d = new AtomicBoolean(true);
    }

    private fwwy(Context context0, gxcy gxcy0) {
        this.i = new ArrayList();
        this.j = 0L;
        this.c = null;
        this.k = false;
        this.e = context0;
        this.f = gxcy0;
        this.g = new fwwu(context0);
        bblg bblg0 = new bblg("CCC_Handler", 10);
        this.h = bblg0;
        bblg0.start();
        this.a = new bblf(bblg0);
    }

    @Override  // gxcz
    public final void a(gxcy gxcy0, gxdb gxdb0, gxdm gxdm0) {
        boolean z1;
        boolean z;
        synchronized(this) {
            if(gxdb0 != null) {
                int v1 = gxdm0.a;
                if(v1 == 2) {
                    synchronized(this) {
                        Runnable runnable0 = this.b;
                        if(runnable0 != null) {
                            this.a.removeCallbacks(runnable0);
                            this.b = null;
                        }
                    }
                    gwzr gwzr0 = (gwzr)gxdm0.a(((Parser)((ProtoLiteMessage)gwzr.a).jf(7, null)));
                    if(gwzr0 == null || (gwzr0.b & 1) == 0) {
                        goto label_289;
                    }
                    gwzl gwzl0 = gwzr0.c == null ? gwzl.a : gwzr0.c;
                    if(huol.c()) {
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gwkb.a).v_newBuilder();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((gwkb)hftp5.b_message).c = 1;
                        ((gwkb)hftp5.b_message).b |= 1;
                        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gwjz.a).v_newBuilder();
                        boolean z2 = gwzl0.b;
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ProtoLiteMessage hftv5 = hftp6.b_message;
                        ((gwjz)hftv5).b |= 1;
                        ((gwjz)hftv5).c = z2;
                        long v10 = gwzl0.c;
                        if(!hftv5.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ProtoLiteMessage hftv6 = hftp6.b_message;
                        ((gwjz)hftv6).b |= 2;
                        ((gwjz)hftv6).d = v10;
                        int v11 = gwzl0.d;
                        if(!hftv6.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ProtoLiteMessage hftv7 = hftp6.b_message;
                        ((gwjz)hftv7).b |= 4;
                        ((gwjz)hftv7).e = v11;
                        long v12 = gwzl0.e;
                        if(!hftv7.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ProtoLiteMessage hftv8 = hftp6.b_message;
                        ((gwjz)hftv8).b |= 8;
                        ((gwjz)hftv8).f = v12;
                        long v13 = gwzl0.h;
                        if(!hftv8.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ProtoLiteMessage hftv9 = hftp6.b_message;
                        ((gwjz)hftv9).b |= 0x40;
                        ((gwjz)hftv9).i = v13;
                        long v14 = gwzl0.f;
                        if(!hftv9.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ProtoLiteMessage hftv10 = hftp6.b_message;
                        ((gwjz)hftv10).b |= 16;
                        ((gwjz)hftv10).g = v14;
                        long v15 = gwzl0.g;
                        if(!hftv10.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ProtoLiteMessage hftv11 = hftp6.b_message;
                        ((gwjz)hftv11).b |= 0x20;
                        ((gwjz)hftv11).h = v15;
                        hfuf hfuf0 = gwzl0.i;
                        if(!hftv11.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        gwjz gwjz0 = (gwjz)hftp6.b_message;
                        hfuf hfuf1 = gwjz0.j;
                        if(!hfuf1.c()) {
                            gwjz0.j = ProtoLiteMessage.C(hfuf1);
                        }
                        hfrj.E(hfuf0, gwjz0.j);
                        gwjz gwjz1 = (gwjz)hftp6.N_build();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gwkb gwkb0 = (gwkb)hftp5.b_message;
                        gwjz1.getClass();
                        gwkb0.d = gwjz1;
                        gwkb0.b |= 2;
                        boolean z3 = bbmq.T();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gwkb gwkb1 = (gwkb)hftp5.b_message;
                        gwkb1.b |= 8;
                        gwkb1.f = z3;
                        boolean z4 = bbmn.u(AppContextProvider.a());
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gwkb gwkb2 = (gwkb)hftp5.b_message;
                        gwkb2.b |= 16;
                        gwkb2.g = z4;
                        gxdb gxdb1 = this.c;
                        if(gxdb1 != null) {
                            int v16 = gxdb1.c();
                            if(!hftp5.b_message.isImmutable()) {
                                hftp5.ensureMutable();
                            }
                            gwkb gwkb3 = (gwkb)hftp5.b_message;
                            gwkb3.b |= 4;
                            gwkb3.e = v16;
                        }
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        gwik gwik2 = (gwik)hftp4.b_message;
                        gwkb gwkb4 = (gwkb)hftp5.N_build();
                        gwkb4.getClass();
                        gwik2.k = gwkb4;
                        gwik2.b |= 0x80;
                        if(huod.f()) {
                            cczb cczb1 = cfzq.v().c(((ProtoLiteMessage)(((gwik)hftp4.N_build()))));
                            cczb1.c = (int)9;
                            cczb1.a();
                            return;
                        }
                        this.s(((gwik)hftp4.N_build()), 10);
                        return;
                    label_289:
                        this.l(4);
                    }
                }
                else {
                    switch(v1) {
                        case 4: {
                            this.g.b = this;
                            cmoc cmoc0 = new cmoc(100, 0L);
                            cmoc0.j(0L);
                            cmoc0.h(20);
                            cmoc0.g(0L);
                            cmoc0.b(30000L);
                            LocationRequest locationRequest0 = cmoc0.a();
                            Looper looper0 = Looper.getMainLooper();
                            this.g.a.n(locationRequest0, this, looper0);
                            return;
                        }
                        case 5: {
                            fwwu fwwu0 = this.g;
                            cmob cmob0 = fwwu0.b;
                            if(cmob0 != null) {
                                fwwu0.a.g(cmob0);
                                fwwu0.b = null;
                                return;
                            }
                            break;
                        }
                        case 0x92: {
                            gwzh gwzh0 = (gwzh)gxdm0.a(((Parser)((ProtoLiteMessage)gwzh.a).jf(7, null)));
                            int v2 = gwzg.a(gwzh0.c) == 0 ? 1 : gwzg.a(gwzh0.c);
                            if(v2 - 1 != 1 && v2 - 1 != 2) {
                                switch(v2 - 1) {
                                    case 3: {
                                        for(Object object0: this.i) {
                                            gxdb0.c();
                                            ((fwxy)object0).a();
                                        }
                                        break;
                                    }
                                    case 4: {
                                        if(huol.c()) {
                                            this.t((gwzh0.e == null ? gwzd.a : gwzh0.e), gwzh0.f, System.currentTimeMillis(), gxdb0.c(), true);
                                            return;
                                        }
                                        break;
                                    }
                                    case 5: {
                                        if(huol.c()) {
                                            gwzk gwzk0 = gwzh0.g == null ? gwzk.a : gwzh0.g;
                                            int v3 = gxdb0.c();
                                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
                                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwjy.a).v_newBuilder();
                                            if(!hftp1.b_message.isImmutable()) {
                                                hftp1.ensureMutable();
                                            }
                                            ProtoLiteMessage hftv0 = hftp1.b_message;
                                            ((gwjy)hftv0).b |= 1;
                                            ((gwjy)hftv0).e = v3;
                                            int v4 = gwzj.a(gwzk0.d) == 0 ? 1 : gwzj.a(gwzk0.d);
                                            if(!hftv0.isImmutable()) {
                                                hftp1.ensureMutable();
                                            }
                                            int v5 = gwjx.a(v4 - 1);
                                            gwjy gwjy0 = (gwjy)hftp1.b_message;
                                            if(v5 == 0) {
                                                throw null;
                                            }
                                            gwjy0.f = v5 - 1;
                                            gwjy0.b |= 2;
                                            if(gwzk0.b == 3) {
                                                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwkd.a).v_newBuilder();
                                                int v6 = (gwzk0.b == 3 ? ((gwzs)gwzk0.c) : gwzs.a).b;
                                                if(!hftp2.b_message.isImmutable()) {
                                                    hftp2.ensureMutable();
                                                }
                                                gwkd gwkd0 = (gwkd)hftp2.b_message;
                                                gwkd0.b |= 1;
                                                gwkd0.c = v6;
                                                for(Object object1: (gwzk0.b == 3 ? ((gwzs)gwzk0.c) : gwzs.a).c) {
                                                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwke.a).v_newBuilder();
                                                    long v7 = ((gwzt)object1).b;
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv1 = hftp3.b_message;
                                                    ((gwke)hftv1).b |= 1;
                                                    ((gwke)hftv1).c = v7;
                                                    float f = ((gwzt)object1).c;
                                                    if(!hftv1.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv2 = hftp3.b_message;
                                                    ((gwke)hftv2).b |= 2;
                                                    ((gwke)hftv2).d = f;
                                                    float f1 = ((gwzt)object1).d;
                                                    if(!hftv2.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv3 = hftp3.b_message;
                                                    ((gwke)hftv3).b |= 4;
                                                    ((gwke)hftv3).e = f1;
                                                    float f2 = ((gwzt)object1).e;
                                                    if(!hftv3.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv4 = hftp3.b_message;
                                                    ((gwke)hftv4).b |= 8;
                                                    ((gwke)hftv4).f = f2;
                                                    long v8 = ((gwzt)object1).f;
                                                    if(!hftv4.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    gwke gwke0 = (gwke)hftp3.b_message;
                                                    gwke0.b |= 16;
                                                    gwke0.g = v8;
                                                    if(!hftp2.b_message.isImmutable()) {
                                                        hftp2.ensureMutable();
                                                    }
                                                    gwkd gwkd1 = (gwkd)hftp2.b_message;
                                                    gwke gwke1 = (gwke)hftp3.N_build();
                                                    gwke1.getClass();
                                                    hfuo hfuo0 = gwkd1.d;
                                                    if(!hfuo0.c()) {
                                                        gwkd1.d = ProtoLiteMessage.E(hfuo0);
                                                    }
                                                    gwkd1.d.add(gwke1);
                                                }
                                                if(!hftp1.b_message.isImmutable()) {
                                                    hftp1.ensureMutable();
                                                }
                                                gwjy gwjy1 = (gwjy)hftp1.b_message;
                                                gwkd gwkd2 = (gwkd)hftp2.N_build();
                                                gwkd2.getClass();
                                                gwjy1.d = gwkd2;
                                                gwjy1.c = 3;
                                            }
                                            gwjy gwjy2 = (gwjy)hftp1.N_build();
                                            if(!hftp0.b_message.isImmutable()) {
                                                hftp0.ensureMutable();
                                            }
                                            gwik gwik0 = (gwik)hftp0.b_message;
                                            gwjy2.getClass();
                                            gwik0.q = gwjy2;
                                            gwik0.b |= 0x2000;
                                            gwik gwik1 = (gwik)hftp0.N_build();
                                            if(huod.a.e().f()) {
                                                cczb cczb0 = cfzn.v().c(((ProtoLiteMessage)gwik1));
                                                cczb0.c = (int)15;
                                                cczb0.a();
                                                return;
                                            }
                                            this.s(gwik1, 16);
                                            return;
                                        }
                                        break;
                                    }
                                }
                            }
                            else {
                                int v9 = gwzh0.b;
                                if((v9 & 4) != 0) {
                                    gwzd gwzd0 = gwzh0.e == null ? gwzd.a : gwzh0.e;
                                    gxdb0.c();
                                    switch(gwzg.a(gwzh0.c)) {
                                        case 0: {
                                            z = false;
                                            break;
                                        }
                                        case 2: {
                                            z = true;
                                            break;
                                        }
                                        default: {
                                            z = false;
                                        }
                                    }
                                    fwxx fwxx0 = new fwxx(gwzd0.b, gwzd0.l, gwzd0.h, gwzd0.i, z);
                                    for(Object object2: this.i) {
                                        ((fwxy)object2).b(fwxx0);
                                    }
                                    if(huol.c()) {
                                        this.t((gwzh0.e == null ? gwzd.a : gwzh0.e), gwzh0.f, System.currentTimeMillis(), gxdb0.c(), false);
                                    }
                                }
                                else if((v9 & 2) != 0) {
                                    gwze gwze0 = gwzh0.d == null ? gwze.a : gwzh0.d;
                                    gxdb0.c();
                                    switch(gwzg.a(gwzh0.c)) {
                                        case 0: {
                                            z1 = false;
                                            break;
                                        }
                                        case 2: {
                                            z1 = true;
                                            break;
                                        }
                                        default: {
                                            z1 = false;
                                        }
                                    }
                                    fwxx fwxx1 = new fwxx(gwze0.b, gwze0.c, gwze0.d, gwze0.e, z1);
                                    for(Object object3: this.i) {
                                        ((fwxy)object3).b(fwxx1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static gwzo b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwzo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwzn.a).v_newBuilder();
        ByteString hfsf0 = huoe.a.b().a().getDefaultInstanceForType();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwzn gwzn0 = (gwzn)hftp1.b_message;
        gwzn0.b |= 1;
        gwzn0.c = hfsf0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwzo gwzo0 = (gwzo)hftp0.b_message;
        gwzn gwzn1 = (gwzn)hftp1.N_build();
        gwzn1.getClass();
        gwzo0.c = gwzn1;
        gwzo0.b = 1;
        return (gwzo)hftp0.N_build();
    }

    @Override  // fwxz
    public final void c(fwxy fwxy0) {
        synchronized(this) {
            List list0 = this.i;
            if(!list0.contains(fwxy0)) {
                list0.add(fwxy0);
            }
        }
    }

    @Override  // fwxz
    public final void d() {
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime();
            if(v1 - this.j >= huod.a.e().a()) {
                this.j = v1;
                if(this.c != null) {
                    this.n();
                    return;
                }
                this.l(6);
            }
        }
    }

    @Override  // fwxz
    public final void e() {
        synchronized(this) {
            if(this.c != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwzo.a).v_newBuilder();
                gwzm gwzm0 = gwzm.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwzo gwzo0 = (gwzo)hftp0.b_message;
                gwzm0.getClass();
                gwzo0.c = gwzm0;
                gwzo0.b = 2;
                this.q(((gwzo)hftp0.N_build()));
            }
            this.k = false;
        }
    }

    @Override  // fwxz
    public final void f() {
        synchronized(this) {
            if(this.c != null) {
                this.q(fwwy.b());
            }
            this.k = true;
        }
    }

    public final void g(int v, int v1, boolean z) {
        synchronized(this) {
            gxdb gxdb0 = this.c;
            if(gxdb0 != null && this.k) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwzc.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gwzc)hftv0).b |= 1;
                ((gwzc)hftv0).c = z;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gwzc)hftv1).b |= 2;
                ((gwzc)hftv1).d = v;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwzc gwzc0 = (gwzc)hftp0.b_message;
                gwzc0.b |= 4;
                gwzc0.e = v1;
                gxdd gxdd0 = gxdb0.e(3, 1, ((MessageLite)(((gwzc)hftp0.N_build()))), fwwy.o());
                if(gxdd0 != null) {
                    gxdd0.a(new fwwx(this));
                }
            }
        }
    }

    @Override  // fwxz
    public final boolean h() {
        synchronized(this) {
        }
        return this.c != null;
    }

    public static fwwy i(Context context0) {
        synchronized(fwwy.class) {
            if(huod.a.e().h()) {
                Context context1 = ModuleManager.requireSubmoduleContext(context0, "carcrash");
                gxcy gxcy0 = fwpq.a(context1);
                if(gxcy0 != null) {
                    fwwy fwwy0 = new fwwy(context1, gxcy0);
                    fwwy0.f.f(0x476F6F676C00100DL, fwwy0, fwwy0.a);
                    return fwwy0;
                }
            }
        }
        return null;
    }

    @Override  // gxbl
    public final void j() {
        synchronized(this) {
            gxcy gxcy0 = this.f;
            gxdb gxdb0 = gxcy0.b(0x476F6F676C00100DL);
            if(gxdb0 != null) {
                this.c = gxdb0;
                if(!gxcy0.h(gxdb0)) {
                    if(fwwy.d.compareAndSet(true, false)) {
                        try {
                            this.e();
                        }
                        catch(SecurityException unused_ex) {
                        }
                    }
                    this.c = null;
                    return;
                }
                gxdb0.h(this, this.a);
                if(this.k) {
                    this.q(fwwy.b());
                }
            }
        }
    }

    @Override  // gxbl
    public final void k(int v) {
        synchronized(this) {
            this.m();
        }
    }

    public final void l(int v) {
        if(!huol.c()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwkb.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gwkb)hftp1.b_message).c = v - 1;
        ((gwkb)hftp1.b_message).b |= 1;
        boolean z = bbmq.T();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwkb gwkb0 = (gwkb)hftp1.b_message;
        gwkb0.b |= 8;
        gwkb0.f = z;
        boolean z1 = bbmn.u(AppContextProvider.a());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwkb gwkb1 = (gwkb)hftp1.b_message;
        gwkb1.b |= 16;
        gwkb1.g = z1;
        gxdb gxdb0 = this.c;
        if(gxdb0 != null) {
            int v1 = gxdb0.c();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwkb gwkb2 = (gwkb)hftp1.b_message;
            gwkb2.b |= 4;
            gwkb2.e = v1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwkb gwkb3 = (gwkb)hftp1.N_build();
        gwkb3.getClass();
        gwik0.k = gwkb3;
        gwik0.b |= 0x80;
        if(huod.f()) {
            cczb cczb0 = cfzq.v().c(((ProtoLiteMessage)(((gwik)hftp0.N_build()))));
            cczb0.c = (int)9;
            cczb0.a();
            return;
        }
        this.s(((gwik)hftp0.N_build()), 10);
    }

    private final void m() {
        gxdb gxdb0 = this.c;
        if(gxdb0 != null) {
            gxdb0.i(this);
        }
        this.c = null;
    }

    private final void n() {
        synchronized(this) {
            gxdb gxdb0 = this.c;
            if(gxdb0 != null) {
                gxdd gxdd0 = gxdb0.e(1, 1, null, fwwy.o());
                if(gxdd0 != null) {
                    gxdd0.a(new fwww(this));
                }
            }
        }
    }

    private static final gxcx o() {
        return huod.a.e().i() ? gxcx.b : gxcx.f;
    }

    @Override  // cmob
    public final void onLocationChanged(Location location0) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwzq.a).v_newBuilder();
            double f = (double)location0.getElapsedRealtimeNanos();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwzq gwzq0 = (gwzq)hftp0.b_message;
            gwzq0.b |= 1;
            gwzq0.c = (long)(f / 1000000.0);
            double f1 = location0.getLatitude() * 10000000.0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwzq gwzq1 = (gwzq)hftp0.b_message;
            gwzq1.b |= 2;
            gwzq1.d = (int)f1;
            double f2 = location0.getLongitude() * 10000000.0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwzq gwzq2 = (gwzq)hftp0.b_message;
            gwzq2.b |= 4;
            gwzq2.e = (int)f2;
            float f3 = location0.getSpeed();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwzq gwzq3 = (gwzq)hftp0.b_message;
            gwzq3.b |= 8;
            gwzq3.f = f3;
            this.p(((gwzq)hftp0.N_build()));
        }
    }

    private final void p(gwzq gwzq0) {
        gxdb gxdb0 = this.c;
        if(gxdb0 != null) {
            gxdd gxdd0 = gxdb0.e(6, 1, ((MessageLite)gwzq0), fwwy.o());
            if(gxdd0 != null) {
                try {
                    Integer integer0 = (Integer)gxdd0.get(1L, TimeUnit.SECONDS);
                }
                catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
                }
            }
        }
    }

    private final void q(gwzo gwzo0) {
        gxdb gxdb0 = this.c;
        if(gxdb0 != null) {
            gxdd gxdd0 = gxdb0.e(0x90, 1, ((MessageLite)gwzo0), fwwy.o());
            if(gxdd0 != null) {
                try {
                    Integer integer0 = (Integer)gxdd0.get(1L, TimeUnit.SECONDS);
                }
                catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
                }
            }
        }
    }

    @Override  // gxbl
    public final void r() {
        synchronized(this) {
            this.m();
        }
    }

    private final void s(gwik gwik0, int v) {
        if(huol.a.b().a()) {
            Context context0 = this.e;
            Object object0 = fuyu.a;
            synchronized(object0) {
                if(fuyu.b == null) {
                    fuyu.b = new fuyu(context0.getApplicationContext());
                }
            }
            ayuc ayuc0 = fuyu.b.c.i(((MessageLite)gwik0));
            ayuc0.k(v - 1);
            ayuc0.d();
            return;
        }
        fuyt fuyt0 = fuyt.a(this.e);
        ayuc ayuc1 = fuyt0.a.i(((MessageLite)gwik0));
        ayuc1.k(v - 1);
        if(humr.q()) {
            ayuc1.o = fuyt0.b;
        }
        ayuc1.d();
    }

    private final void t(gwzd gwzd0, long v, long v1, int v2, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwjv.a).v_newBuilder();
        float f = gwzd0.b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gwjv)hftv0).b |= 1;
        ((gwjv)hftv0).c = f;
        long v3 = gwzd0.c + v1 - v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gwjv)hftv1).b |= 2;
        ((gwjv)hftv1).d = v3;
        long v4 = gwzd0.c;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gwjv)hftv2).b |= 0x100;
        ((gwjv)hftv2).r = v4;
        float f1 = gwzd0.h;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gwjv)hftv3).b |= 4;
        ((gwjv)hftv3).i = f1;
        float f2 = gwzd0.i;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((gwjv)hftv4).b |= 8;
        ((gwjv)hftv4).j = f2;
        float f3 = gwzd0.l;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwjv gwjv0 = (gwjv)hftp1.b_message;
        gwjv0.b |= 16;
        gwjv0.m = f3;
        for(int v5 = 0; v5 < gwzd0.d.size(); ++v5) {
            gwzt gwzt0 = (gwzt)gwzd0.d.get(v5);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwke.a).v_newBuilder();
            long v6 = gwzt0.b + v1 - v;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp2.b_message;
            ((gwke)hftv5).b |= 1;
            ((gwke)hftv5).c = v6;
            float f4 = gwzt0.c;
            if(!hftv5.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp2.b_message;
            ((gwke)hftv6).b |= 2;
            ((gwke)hftv6).d = f4;
            float f5 = gwzt0.d;
            if(!hftv6.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp2.b_message;
            ((gwke)hftv7).b |= 4;
            ((gwke)hftv7).e = f5;
            float f6 = gwzt0.e;
            if(!hftv7.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwke gwke0 = (gwke)hftp2.b_message;
            gwke0.b |= 8;
            gwke0.f = f6;
            gwke gwke1 = (gwke)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwjv gwjv1 = (gwjv)hftp1.b_message;
            gwke1.getClass();
            hfuo hfuo0 = gwjv1.e;
            if(!hfuo0.c()) {
                gwjv1.e = ProtoLiteMessage.E(hfuo0);
            }
            gwjv1.e.add(gwke1);
        }
        for(Object object0: gwzd0.e) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwke.a).v_newBuilder();
            long v7 = ((gwzt)object0).b + v1 - v;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp3.b_message;
            ((gwke)hftv8).b |= 1;
            ((gwke)hftv8).c = v7;
            float f7 = ((gwzt)object0).c;
            if(!hftv8.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv9 = hftp3.b_message;
            ((gwke)hftv9).b |= 2;
            ((gwke)hftv9).d = f7;
            float f8 = ((gwzt)object0).d;
            if(!hftv9.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv10 = hftp3.b_message;
            ((gwke)hftv10).b |= 4;
            ((gwke)hftv10).e = f8;
            float f9 = ((gwzt)object0).e;
            if(!hftv10.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv11 = hftp3.b_message;
            ((gwke)hftv11).b |= 8;
            ((gwke)hftv11).f = f9;
            long v8 = ((gwzt)object0).f;
            if(!hftv11.isImmutable()) {
                hftp3.ensureMutable();
            }
            gwke gwke2 = (gwke)hftp3.b_message;
            gwke2.b |= 16;
            gwke2.g = v8;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwjv gwjv2 = (gwjv)hftp1.b_message;
            gwke gwke3 = (gwke)hftp3.N_build();
            gwke3.getClass();
            hfuo hfuo1 = gwjv2.f;
            if(!hfuo1.c()) {
                gwjv2.f = ProtoLiteMessage.E(hfuo1);
            }
            gwjv2.f.add(gwke3);
        }
        for(Object object1: gwzd0.f) {
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gwke.a).v_newBuilder();
            long v9 = ((gwzt)object1).b + v1 - v;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv12 = hftp4.b_message;
            ((gwke)hftv12).b |= 1;
            ((gwke)hftv12).c = v9;
            float f10 = ((gwzt)object1).c;
            if(!hftv12.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv13 = hftp4.b_message;
            ((gwke)hftv13).b |= 2;
            ((gwke)hftv13).d = f10;
            long v10 = ((gwzt)object1).f;
            if(!hftv13.isImmutable()) {
                hftp4.ensureMutable();
            }
            gwke gwke4 = (gwke)hftp4.b_message;
            gwke4.b |= 16;
            gwke4.g = v10;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwjv gwjv3 = (gwjv)hftp1.b_message;
            gwke gwke5 = (gwke)hftp4.N_build();
            gwke5.getClass();
            hfuo hfuo2 = gwjv3.g;
            if(!hfuo2.c()) {
                gwjv3.g = ProtoLiteMessage.E(hfuo2);
            }
            gwjv3.g.add(gwke5);
        }
        for(int v11 = 0; v11 < gwzd0.g.size(); ++v11) {
            gwzp gwzp0 = (gwzp)gwzd0.g.get(v11);
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gwkc.a).v_newBuilder();
            long v12 = gwzp0.b + v1 - v;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv14 = hftp5.b_message;
            ((gwkc)hftv14).b |= 1;
            ((gwkc)hftv14).c = v12;
            int v13 = gwzp0.c;
            if(!hftv14.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv15 = hftp5.b_message;
            ((gwkc)hftv15).b |= 2;
            ((gwkc)hftv15).d = v13;
            int v14 = gwzp0.d;
            if(!hftv15.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv16 = hftp5.b_message;
            ((gwkc)hftv16).b |= 4;
            ((gwkc)hftv16).e = v14;
            float f11 = gwzp0.e;
            if(!hftv16.isImmutable()) {
                hftp5.ensureMutable();
            }
            gwkc gwkc0 = (gwkc)hftp5.b_message;
            gwkc0.b |= 8;
            gwkc0.f = f11;
            gwkc gwkc1 = (gwkc)hftp5.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwjv gwjv4 = (gwjv)hftp1.b_message;
            gwkc1.getClass();
            hfuo hfuo3 = gwjv4.h;
            if(!hfuo3.c()) {
                gwjv4.h = ProtoLiteMessage.E(hfuo3);
            }
            gwjv4.h.add(gwkc1);
        }
        for(int v15 = 0; v15 < gwzd0.j.size(); ++v15) {
            gwza gwza0 = (gwza)gwzd0.j.get(v15);
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gwjt.a).v_newBuilder();
            long v16 = gwza0.b + v1 - v;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv17 = hftp6.b_message;
            ((gwjt)hftv17).b |= 1;
            ((gwjt)hftv17).c = v16;
            int v17 = gwza0.c;
            if(!hftv17.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv18 = hftp6.b_message;
            ((gwjt)hftv18).b |= 2;
            ((gwjt)hftv18).d = v17;
            float f12 = gwza0.d;
            if(!hftv18.isImmutable()) {
                hftp6.ensureMutable();
            }
            gwjt gwjt0 = (gwjt)hftp6.b_message;
            gwjt0.b |= 4;
            gwjt0.e = f12;
            gwjt gwjt1 = (gwjt)hftp6.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwjv gwjv5 = (gwjv)hftp1.b_message;
            gwjt1.getClass();
            hfuo hfuo4 = gwjv5.k;
            if(!hfuo4.c()) {
                gwjv5.k = ProtoLiteMessage.E(hfuo4);
            }
            gwjv5.k.add(gwjt1);
        }
        for(int v18 = 0; v18 < gwzd0.k.size(); ++v18) {
            gwza gwza1 = (gwza)gwzd0.k.get(v18);
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gwjt.a).v_newBuilder();
            long v19 = gwza1.b + v1 - v;
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            ProtoLiteMessage hftv19 = hftp7.b_message;
            ((gwjt)hftv19).b |= 1;
            ((gwjt)hftv19).c = v19;
            int v20 = gwza1.c;
            if(!hftv19.isImmutable()) {
                hftp7.ensureMutable();
            }
            ProtoLiteMessage hftv20 = hftp7.b_message;
            ((gwjt)hftv20).b |= 2;
            ((gwjt)hftv20).d = v20;
            float f13 = gwza1.d;
            if(!hftv20.isImmutable()) {
                hftp7.ensureMutable();
            }
            gwjt gwjt2 = (gwjt)hftp7.b_message;
            gwjt2.b |= 4;
            gwjt2.e = f13;
            gwjt gwjt3 = (gwjt)hftp7.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwjv gwjv6 = (gwjv)hftp1.b_message;
            gwjt3.getClass();
            hfuo hfuo5 = gwjv6.l;
            if(!hfuo5.c()) {
                gwjv6.l = ProtoLiteMessage.E(hfuo5);
            }
            gwjv6.l.add(gwjt3);
        }
        for(int v21 = 0; v21 < gwzd0.m.size(); ++v21) {
            gwzb gwzb0 = (gwzb)gwzd0.m.get(v21);
            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gwju.a).v_newBuilder();
            long v22 = gwzb0.b + v1 - v;
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            ProtoLiteMessage hftv21 = hftp8.b_message;
            ((gwju)hftv21).b |= 1;
            ((gwju)hftv21).c = v22;
            String s = gwzb0.d;
            if(!hftv21.isImmutable()) {
                hftp8.ensureMutable();
            }
            gwju gwju0 = (gwju)hftp8.b_message;
            s.getClass();
            gwju0.b |= 2;
            gwju0.e = s;
            for(int v23 = 0; v23 < gwzb0.c.size(); ++v23) {
                float f14 = gwzb0.c.d(v23);
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                gwju gwju1 = (gwju)hftp8.b_message;
                hfue hfue0 = gwju1.d;
                if(!hfue0.c()) {
                    gwju1.d = ProtoLiteMessage.B(hfue0);
                }
                gwju1.d.h(f14);
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwjv gwjv7 = (gwjv)hftp1.b_message;
            gwju gwju2 = (gwju)hftp8.N_build();
            gwju2.getClass();
            hfuo hfuo6 = gwjv7.p;
            if(!hfuo6.c()) {
                gwjv7.p = ProtoLiteMessage.E(hfuo6);
            }
            gwjv7.p.add(gwju2);
        }
        gwjv gwjv8 = (gwjv)hftp1.N_build();
        ProtoLiteBuilder hftp9 = (ProtoLiteBuilder)((ProtoLiteMessage)gwjv8).jf(5, null);
        hftp9.X(((ProtoLiteMessage)gwjv8));
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        ProtoLiteMessage hftv22 = hftp9.b_message;
        ((gwjv)hftv22).b |= 0x40;
        ((gwjv)hftv22).o = v2;
        if(!hftv22.isImmutable()) {
            hftp9.ensureMutable();
        }
        ProtoLiteMessage hftv23 = hftp9.b_message;
        ((gwjv)hftv23).b |= 0x20;
        ((gwjv)hftv23).n = false;
        if(!hftv23.isImmutable()) {
            hftp9.ensureMutable();
        }
        gwjv gwjv9 = (gwjv)hftp9.b_message;
        gwjv9.b |= 0x80;
        gwjv9.q = z;
        boolean z1 = bbmq.T();
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        gwjv gwjv10 = (gwjv)hftp9.b_message;
        gwjv10.b |= 0x200;
        gwjv10.s = z1;
        boolean z2 = bbmn.u(AppContextProvider.a());
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        gwjv gwjv11 = (gwjv)hftp9.b_message;
        gwjv11.b |= 0x400;
        gwjv11.t = z2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwjv gwjv12 = (gwjv)hftp9.N_build();
        gwjv12.getClass();
        gwik0.l = gwjv12;
        gwik0.b |= 0x100;
        gwik gwik1 = (gwik)hftp0.N_build();
        if(huod.a.e().e()) {
            cczb cczb0 = cfzk.v().c(((ProtoLiteMessage)gwik1));
            cczb0.c = (int)10;
            cczb0.a();
            return;
        }
        this.s(gwik1, 11);
    }
}

