import j..time.Duration;
import j..util.Objects;
import j..util.Optional;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class gpvi extends gpty {
    private long A;
    private Double B;
    private Double C;
    private gpvh D;
    private gpvm E;
    private int F;
    private ProtoLiteBuilder G;
    public static final int a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private long f;
    private long g;
    private long h;
    private gptu_Position i;
    private long j;
    private cjhf k;
    private final huqn_elevationGraphOptimizerFlags l;
    private final long m;
    private String n;
    private String o;
    private long p;
    private final cczf q;
    private final cczf r;
    private final gpvq s;
    private long t;
    private final ObserverRegistry u;
    private final fvzk v;
    private final gpvl w;
    private final gpvd x;
    private final gpvd y;
    private boolean z;

    static {
        gpvi.b = TimeUtils.d(60.0);
        gpvi.c = TimeUtils.d(5.0);
        gpvi.d = TimeUtils.d(5.0);
        gpvi.e = TimeUtils.d(30.0);
    }

    public gpvi(huqn_elevationGraphOptimizerFlags huqn0, gfsi gfsi0, ObserverRegistry gpyo0, fgvt fgvt0, fvzk fvzk0) {
        this.f = 0L;
        this.i = null;
        this.k = null;
        this.n = null;
        this.o = null;
        this.p = 0L;
        this.t = -1L;
        this.w = new gpvl(new gpvf());
        this.m = TimeUtils.d(huqn0.H());
        this.l = huqn0;
        this.q = gfsi0.apply(cdef.aB);
        this.r = gfsi0.apply(cdef.eD);
        this.u = gpyo0;
        gpvd gpvd0 = huqn0.ac() ? new gpve(gpvi.z(huqn0.I()), gpvi.z(huqn0.r()), gpvi.z(huqn0.n()), gpvi.z(huqn0.q()), gpvi.z(huqn0.s()), huqn0.ab()) : new gpvd(gpvi.z(huqn0.I()), gpvi.z(huqn0.r()), gpvi.z(huqn0.n()), gpvi.z(huqn0.q()), gpvi.z(huqn0.s()), huqn0.ab());
        this.x = gpvd0;
        gpve gpve0 = !huqn0.aa() || !huqn0.ac() ? null : new gpve(gpvi.z(huqn0.I()), gpvi.z(huqn0.r()), gpvi.z(huqn0.n()), gpvi.z(huqn0.q()), gpvi.z(huqn0.s()), huqn0.ab());
        this.y = gpve0;
        this.G = ((ProtoLiteMessage)cnma.a).v_newBuilder();
        this.v = fvzk0;
        if(huqn0.Y() && fgvt0 != null && fvzk0 != null) {
            if(gpve0 != null) {
                gpvd0 = gpve0;
            }
            this.s = new gpvq(huqn0, gpvd0, fvzk0);
            return;
        }
        this.s = null;
    }

    private final gptu_Position A(gptu_Position gptu0, gfsz gfsz0) {
        if((this.l.U() || this.l.ah()) && gfsz0 != null) {
            PositionBuilder gptr0 = gptu0.g();
            gptr0.n(((Double)gfsz0.a).floatValue());
            gptr0.m(((Double)gfsz0.b).floatValue());
            return new gptu_Position(gptr0);
        }
        return gptu0;
    }

    private final gpvm B(int v, int v1, int v2) {
        int v3 = v;
        gpvl gpvl0 = this.w;
        gpvm gpvm0 = (gpvm)gpvl0.c(v3);
        huqn_elevationGraphOptimizerFlags huqn0 = this.l;
        double f = gpvi.u(gpvm0, huqn0);
        if((huqn0.v() > 1.0) && ((long)v1) >= huqn0.N() && gpvm0.e != v2) {
            f *= huqn0.v();
        }
        int v4 = 0;
        if(Long.compare(huqn0.J(), -1L) != 0) {
            v4 = Math.max(0, v3 - ((int)huqn0.J()));
        }
        while(v3 >= v4) {
            gpvm gpvm1 = (gpvm)gpvl0.c(v3);
            int v5 = gpvm1.e;
            if(v5 == gpvm0.e) {
                --v3;
                continue;
            }
            double f1 = gpvi.u(gpvm1, huqn0);
            if((huqn0.v() > 1.0) && ((long)v1) >= huqn0.N() && v5 != v2) {
                f1 *= huqn0.v();
            }
            double f2 = huqn0.d();
            return f1 + gpvi.x(gpvm0.a - gpvm1.a) * f2 < f ? gpvm1 : gpvm0;
        }
        return gpvm0;
    }

    private final void C(cnlv cnlv0) {
        gpvl gpvl0;
        if(this.J()) {
            boolean z = false;
            int v1 = 0;
            for(int v = 0; true; ++v) {
                gpvl0 = this.w;
                if(v >= gpvl0.a()) {
                    break;
                }
                if(((gpvm)gpvl0.c(v)).e == 1) {
                    ++v1;
                }
            }
            gpvd gpvd0 = this.x;
            if(!gpvd0.f()) {
                ProtoLiteBuilder hftp0 = this.G;
                long v2 = gpvd0.a() - gpvd0.b();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                cnma cnma0 = (cnma)hftp0.b_message;
                cnma0.b |= 2;
                cnma0.d = (int)gpvi.x(v2);
            }
            if(!gpvl0.g()) {
                ProtoLiteBuilder hftp1 = this.G;
                long v3 = gpvl0.c - gpvl0.b();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                cnma cnma1 = (cnma)hftp1.b_message;
                cnma1.b |= 16;
                cnma1.g = (int)gpvi.x(v3);
                int v4 = gpvl0.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((cnma)hftv0).b |= 0x80;
                ((cnma)hftv0).j = v4;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                cnma cnma2 = (cnma)hftp1.b_message;
                cnma2.b |= 0x400;
                cnma2.m = v1;
            }
            ProtoLiteBuilder hftp2 = this.G;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((cnma)hftp2.b_message).u = cnlv0.h;
            ((cnma)hftp2.b_message).b |= 0x40000;
            if(this.B == null) {
                z = true;
            }
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            cnma cnma3 = (cnma)hftp2.b_message;
            cnma3.b |= 0x80000;
            cnma3.v = z;
            cczf cczf0 = this.q;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
            gixx gixx0 = gixx.w;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gixy)hftp3.b_message).d = gixx0.H;
            ((gixy)hftp3.b_message).b |= 1;
            cnls cnls0 = (cnls)((ProtoLiteMessage)cnlt.a).v_newBuilder();
            ProtoLiteBuilder hftp4 = this.G;
            if(!cnls0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)cnls0).ensureMutable();
            }
            cnlt cnlt0 = (cnlt)cnls0.b_message;
            cnma cnma4 = (cnma)hftp4.N_build();
            cnma4.getClass();
            cnlt0.b();
            cnlt0.b.add(cnma4);
            cnlt cnlt1 = (cnlt)((ProtoLiteBuilder)cnls0).N_build();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gixy gixy0 = (gixy)hftp3.b_message;
            cnlt1.getClass();
            gixy0.z = cnlt1;
            gixy0.b |= 0x400000;
            cczf0.f(((gixy)hftp3.N_build()));
            this.G = ((ProtoLiteMessage)cnma.a).v_newBuilder();
        }
    }

    private final void D(coad coad0, boolean z, Float float0, float f, Float float1) {
        float f7;
        float f6;
        float f5;
        if(huxn.d() && coad0 != null) {
            cczf cczf0 = this.r;
            if(cczf0 != null && cczf0.q()) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)coad0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)coad0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                coad coad1 = (coad)hftp0.b_message;
                coad1.b |= 0x1000000;
                coad1.A = z;
                float f1 = gpvi.y(f);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                coad coad2 = (coad)hftp0.b_message;
                coad2.b |= 0x100;
                coad2.k = f1;
                if(float0 != null) {
                    float f2 = gpvi.y(float0.floatValue());
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    coad coad3 = (coad)hftp0.b_message;
                    coad3.b |= 1;
                    coad3.c = f2;
                }
                if(float1 != null) {
                    double f3 = (double)(((float)float1));
                    double f4 = Math.abs(f3);
                    if((f4 > 10.0)) {
                        f5 = (float)((f3 < 0.0 ? -1 : 1) * 10);
                    }
                    else if((f4 > 1.0)) {
                        f5 = (float)Math.round(f3);
                    }
                    else {
                        if((f4 > 0.1)) {
                            f6 = (float)Math.round(f3 * 10.0);
                            f7 = 10.0f;
                        }
                        else {
                            f6 = (float)Math.round(f3 * 100.0);
                            f7 = 100.0f;
                        }
                        f5 = f6 / f7;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    coad coad4 = (coad)hftp0.b_message;
                    coad4.b |= 0x100000;
                    coad4.w = f5;
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
                gixx gixx0 = gixx.s;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gixy)hftp1.b_message).d = gixx0.H;
                ((gixy)hftp1.b_message).b |= 1;
                cnze cnze0 = (cnze)((ProtoLiteMessage)cnzg.a).v_newBuilder();
                if(!cnze0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)cnze0).ensureMutable();
                }
                ((cnzg)cnze0.b_message).c = 5;
                ((cnzg)cnze0.b_message).b |= 1;
                if(!cnze0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)cnze0).ensureMutable();
                }
                cnzg cnzg0 = (cnzg)cnze0.b_message;
                coad coad5 = (coad)hftp0.N_build();
                coad5.getClass();
                cnzg0.e();
                cnzg0.h.add(coad5);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gixy gixy0 = (gixy)hftp1.b_message;
                cnzg cnzg1 = (cnzg)((ProtoLiteBuilder)cnze0).N_build();
                cnzg1.getClass();
                gixy0.v = cnzg1;
                gixy0.b |= 0x40000;
                cczf0.f(((gixy)hftp1.N_build()));
            }
        }
    }

    private final void E() {
        gpvl gpvl0 = this.w;
        if(gpvl0.g()) {
            return;
        }
        gpvm gpvm0 = this.E;
        if(gpvm0 == null) {
            gpvm0 = (gpvm)gpvl0.c(0);
            this.E = gpvm0;
        }
        gpvm gpvm1 = this.B(gpvl0.a() - 1, this.F, gpvm0.e);
        if(gpvm1.e == gpvm0.e) {
            ++this.F;
        }
        else {
            this.F = 0;
        }
        this.E = gpvm1;
        this.B = (double)gpvm1.c;
        double f = this.l.B();
        this.C = (double)(gpvm1.d + f * gpvi.x(this.A - gpvm1.a));
    }

    private final boolean F() {
        gpvl gpvl0 = this.w;
        huqn_elevationGraphOptimizerFlags huqn0 = this.l;
        if(Long.compare(gpvl0.a(), huqn0.M()) < 0) {
            int v1 = 0;
            int v2 = 0;
            for(int v = 0; v < gpvl0.a(); ++v) {
                if(((gpvm)gpvl0.c(v)).e == 0) {
                    ++v2;
                }
                else {
                    ++v1;
                }
            }
            return v1 > 0 || ((long)v2) >= huqn0.M();
        }
        return true;
    }

    private final boolean G(long v) {
        return v <= this.h + gpvi.c && (this.i != null && this.i.n() && ((double)this.i.speedMps) > 3.0);
    }

    private final boolean H(long v) {
        if(Long.compare(v, this.j + gpvi.d) <= 0 && (this.k != null && this.k.a.size() >= 5)) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ((cjhf)Objects.requireNonNull(this.k)).a) {
                cjha cjha0 = (cjha)object0;
                if(cjha0.j()) {
                    arrayList0.add(Float.valueOf(cjha0.b()));
                }
            }
            if(arrayList0.size() < 5) {
                return false;
            }
            Collections.sort(arrayList0, Collections.reverseOrder());
            return ((double)(((float)(((Float)arrayList0.get(4)))))) > 5.0;
        }
        return false;
    }

    private final boolean I(gptu_Position gptu0, long v) {
        if(gptu0.k()) {
            double f = this.l.j();
            return ((double)gptu0.indoorProbability) >= f ? false : this.H(v) || this.G(v);
        }
        return this.H(v) || this.G(v);
    }

    private final boolean J() {
        return Math.random() < this.l.c();
    }

    private static final gptu_Position K(gptu_Position gptu0, Double double0, Double double1) {
        if(double0 != null && double1 != null && !Double.isNaN(double0.doubleValue()) && !Double.isInfinite(double0.doubleValue()) && !Double.isNaN(double1.doubleValue()) && !Double.isInfinite(double1.doubleValue())) {
            PositionBuilder gptr0 = gptu0.g();
            gptr0.c(double0.doubleValue());
            gptr0.l(double1.doubleValue());
            return new gptu_Position(gptr0);
        }
        return gptu0;
    }

    @Override  // ISensorFusionProcessor
    public final int L(long v) {
        if(!this.l.V() && (Long.compare(this.f, gpvi.b) > 0 || (v <= this.g + gpvi.e || this.G(v) || this.H(v)))) {
            return this.s == null ? 0x80 : 640;
        }
        return this.s == null ? 0x81 : 641;
    }

    @Override  // gpty
    public final gptu_Position a(long v, gptu_Position gptu0) {
        ArrayList arrayList1;
        Double double3;
        float f7;
        double f6;
        int v14;
        int v13;
        huqn_elevationGraphOptimizerFlags huqn1;
        gfsz gfsz0;
        gptu_Position gptu1;
        cnlx cnlx0;
        cnlz cnlz0;
        long v1 = System.currentTimeMillis();
        gpvm gpvm0 = null;
        if(this.J()) {
            ProtoLiteBuilder hftp0 = this.G;
            long v2 = this.t == -1L ? 0L : v1 - this.t;
            if((((float)v2) / 60000.0f >= 0.0f) && (((float)v2) / 60000.0f < 5.0f)) {
                cnlz0 = cnlz.b;
            }
            else if((((float)v2) / 60000.0f < 10.0f)) {
                cnlz0 = cnlz.c;
            }
            else if((((float)v2) / 60000.0f < 20.0f)) {
                cnlz0 = cnlz.d;
            }
            else if((((float)v2) / 60000.0f < 40.0f)) {
                cnlz0 = cnlz.e;
            }
            else if((((float)v2) / 60000.0f < 60.0f)) {
                cnlz0 = cnlz.f;
            }
            else {
                cnlz0 = ((float)v2) / 60000.0f >= 60.0f ? cnlz.g : cnlz.a;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((cnma)hftp0.b_message).s = cnlz0.h;
            ((cnma)hftp0.b_message).b |= 0x10000;
            gptt_LocationType gptt0 = gptu0.provider;
            if(gptt0 == null) {
                cnlx0 = cnlx.a;
            }
            else {
                switch(gptt0.ordinal()) {
                    case 0: {
                        cnlx0 = cnlx.b;
                        break;
                    }
                    case 1: {
                        cnlx0 = cnlx.c;
                        break;
                    }
                    case 2: {
                        cnlx0 = cnlx.d;
                        break;
                    }
                    case 3: {
                        cnlx0 = cnlx.e;
                        break;
                    }
                    case 4: {
                        cnlx0 = cnlx.f;
                        break;
                    }
                    case 5: {
                        cnlx0 = cnlx.g;
                        break;
                    }
                    default: {
                        throw new RuntimeException(null, null);
                    }
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((cnma)hftp0.b_message).w = cnlx0.h;
            ((cnma)hftp0.b_message).b |= 0x100000;
        }
        this.t = v1;
        huqn_elevationGraphOptimizerFlags huqn0 = this.l;
        long v3 = v - gpvi.z(huqn0.I());
        gpvl gpvl0 = this.w;
        gpvl0.f(v3);
        gpvd gpvd0 = this.x;
        gpvd0.d(v);
        gpvd gpvd1 = this.y;
        if(gpvd1 != null) {
            gpvd1.d(v);
        }
        if(gpvl0.g()) {
            this.B = null;
            this.C = null;
        }
        if(this.I(gptu0, v)) {
            PositionBuilder gptr0 = gptu0.g();
            gptr0.floorLabel = null;
            gptr0.mask &= 0xFFFFFEFF;
            gptr0.levelId = null;
            gptu1 = new gptu_Position(gptr0);
        }
        else {
            PositionBuilder gptr1 = gptu0.g();
            if(gptu0.floorLabel == null) {
                String s = this.n;
                if(s != null && (v >= this.p && v - this.p < this.m)) {
                    gptr1.f(s);
                    String s1 = this.o;
                    if(s1 != null) {
                        gptr1.levelId = s1;
                    }
                }
            }
            gptu1 = new gptu_Position(gptr1);
        }
        if(huqn0.af()) {
            gpvq gpvq0 = this.s;
            if(gpvq0 == null) {
                gfsz0 = null;
            }
            else {
                gfsz0 = gpvq0.c(v);
                if(gfsz0 != null) {
                    this.B = (Double)gfsz0.a;
                    this.C = (Double)gfsz0.b;
                    return gpvi.K(gptu1, this.B, ((Double)gfsz0.b));
                }
            }
        }
        else {
            gfsz0 = null;
        }
        if(this.z && this.F()) {
            this.A = Math.max(gpvl0.c, gpvd0.a());
            if(huqn0.ah() || huqn0.U()) {
                gpvq gpvq1 = this.s;
                if(gpvq1 != null) {
                    gfsz0 = gpvq1.c(this.A);
                    gptu1 = this.A(gptu1, gfsz0);
                }
            }
            int v4 = 0;
            this.z = false;
            if(gpvd0.f()) {
                this.C(cnlv.e);
                this.E();
                huqn1 = huqn0;
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                long v5 = huqn0.P() - 1L;
                int v6 = gpvl0.a() - 1;
                int v7 = 0;
                int v8 = -1;
                int v9 = -1;
                while(((long)v4) < huqn0.P()) {
                    int v10 = (int)(((double)v6) * (((double)v4) / ((double)(((int)v5)))));
                    v8 = v8;
                    if(v8 != v10) {
                        gpvm gpvm1 = this.B(v10, v7, v9);
                        if(gpvm0 != gpvm1) {
                            int v11 = gpvm1.e;
                            int v12 = v11 == v9 ? v7 + 1 : 0;
                            Double double0 = gpvd0.c(gpvm1.a);
                            if(double0 == null) {
                                v13 = v12;
                                v14 = v11;
                            }
                            else {
                                v13 = v12;
                                v14 = v11;
                                arrayList0.add(new gpvg(gpvm1, gpye.a(double0.doubleValue(), 1013.25, huqn0.o())));
                            }
                            v9 = v14;
                            v7 = v13;
                            gpvm0 = gpvm1;
                        }
                        v8 = v10;
                    }
                    ++v4;
                    v5 = v5;
                }
                if(arrayList0.isEmpty()) {
                    this.C(cnlv.f);
                    this.E();
                    huqn1 = huqn0;
                }
                else {
                    gpvh gpvh0 = new gpvh();
                    gpvh gpvh1 = new gpvh();
                    HashSet hashSet0 = new HashSet();
                    Iterator iterator0 = arrayList0.iterator();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        double f = ((gpvg)object0).a.c - ((gpvg)object0).b;
                        gpvh0.b = f;
                        if(hashSet0.add(Double.valueOf(((double)Math.round(f * 10.0)) / 10.0))) {
                            double f1 = 0.0;
                            for(Object object1: arrayList0) {
                                double f2 = gpvh0.b;
                                double f3 = gpvi.u(((gpvg)object1).a, huqn0);
                                double f4 = huqn0.k();
                                f1 += Math.pow(Math.abs(f2 + ((gpvg)object1).b - ((gpvg)object1).a.c) / f3, f4);
                                hashSet0 = hashSet0;
                                iterator0 = iterator0;
                            }
                            gpvh0.a = f1;
                            if((f1 < gpvh1.a)) {
                                gpvh1.a = f1;
                                gpvh1.b = gpvh0.b;
                            }
                            hashSet0 = hashSet0;
                            iterator0 = iterator0;
                        }
                    }
                    if((huqn0.l() > 0.0)) {
                        gpvh gpvh2 = this.D;
                        if(gpvh2 != null) {
                            gpvh1.a = gpvh2.a * huqn0.l() + gpvh1.a * (1.0 - huqn0.l());
                            gpvh1.b = gpvh2.b * huqn0.l() + gpvh1.b * (1.0 - huqn0.l());
                        }
                        this.D = gpvh1;
                    }
                    gpvg gpvg0 = (gpvg)gggq.p(arrayList0);
                    Double double1 = gpvd0.c(this.A);
                    Double double2 = double1 == null ? null : gpye.a(double1.doubleValue(), 1013.25, huqn0.o());
                    if(double2 == null && (gpvi.x(this.A - gpvg0.a.a) > huqn0.g())) {
                        this.C(cnlv.g);
                        this.E();
                        huqn1 = huqn0;
                    }
                    else {
                        double f5 = gpvh1.b + (double2 == null ? gpvg0.b : ((double)double2));
                        if((huqn0.u() > 0.0)) {
                            int v15 = 0;
                            while(v15 < Math.min(3, arrayList0.size())) {
                                gpvm gpvm2 = ((gpvg)arrayList0.get(arrayList0.size() - 1 - v15)).a;
                                if(gpvm2.e != 0) {
                                    f6 = gpvm2.c;
                                    if((Math.abs(f6 - f5) < huqn0.u())) {
                                        f7 = (float)(f5 - f6);
                                        goto label_189;
                                    }
                                }
                                ++v15;
                            }
                        }
                        f6 = f5;
                        f7 = 0.0f;
                    label_189:
                        if(f7 != 0.0f && huqn0.t() != 0.0) {
                            double f8 = Math.exp(((double)f7) * huqn0.t() * -0.283412 / (huqn0.o() * 8.31432)) * 1013.25;
                            ProtoLiteBuilder hftp1 = this.G;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            cnma cnma0 = (cnma)hftp1.b_message;
                            cnma0.b |= 0x2000;
                            cnma0.p = (float)(f8 - 1013.25);
                            gpvd0.l += (float)(f8 - 1013.25);
                        }
                        this.B = f6;
                        if(huqn0.P() <= 0L) {
                            double3 = this.C;
                            arrayList1 = arrayList0;
                            huqn1 = huqn0;
                        }
                        else {
                            double f9 = 1.0 - huqn0.m() * ((double)arrayList0.size()) / ((double)huqn0.P());
                            int v16 = arrayList0.size();
                            double f10 = 0.0;
                            double f11 = 0.0;
                            int v17 = 0;
                            while(v17 < arrayList0.size()) {
                                gpvg gpvg1 = (gpvg)arrayList0.get(v17);
                                ++v17;
                                double f12 = Math.abs(gpvg1.a.c - gpvg1.b - gpvh1.b);
                                double f13 = huqn0.D();
                                double f14 = 1.0 / Math.pow(f12 + 1.0, huqn0.A()) * Math.pow(((double)v17) / ((double)v16), f13);
                                f11 += gpvg1.a.d * f14;
                                f10 += f14;
                                arrayList0 = arrayList0;
                                huqn0 = huqn0;
                                gpvh1 = gpvh1;
                                f9 = f9;
                                v16 = v16;
                            }
                            arrayList1 = arrayList0;
                            huqn1 = huqn0;
                            double3 = f10 == 0.0 ? this.C : ((double)(f11 / f10 * f9 + huqn1.B() * gpvi.x(this.A - gpvg0.a.a)));
                        }
                        this.C = double3;
                        if(double3 != null) {
                            this.C = (double)(((double)double3) * huqn1.C());
                        }
                        if(huqn1.X() && this.B != null && this.C != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for(Object object2: arrayList1) {
                                arrayList2.add(((gpvg)object2).a);
                            }
                            gftb.check(this.B);
                            gftb.check(this.C);
                            for(Object object3: this.u.a) {
                                ((IFilterObserver)object3).az();
                            }
                        }
                        this.C(cnlv.b);
                    }
                }
            }
            if(huqn1.ah() && gfsz0 != null) {
                if(this.B != null && this.C != null && !Double.isNaN(this.B.doubleValue()) && !Double.isNaN(this.C.doubleValue())) {
                    Double double4 = this.C;
                    gftb.check(double4);
                    Double double5 = this.B;
                    gftb.check(double5);
                    double f15 = 1.0 / ((double)(((Double)gfsz0.b)));
                    Double double6 = this.C;
                    gftb.check(double6);
                    double f16 = 1.0 / ((double)double6);
                    Double double7 = this.B;
                    gftb.check(double7);
                    double f17 = f16 + f15;
                    this.B = (double)((((double)double7) * f16 + ((double)(((Double)gfsz0.a))) * f15) / f17);
                    Double double8 = this.C;
                    gftb.check(double8);
                    this.C = (double)((((double)double8) * f16 + f15 * ((double)(((Double)gfsz0.b)))) / f17);
                    gftb.check(this.s);
                    coad coad0 = this.s.f;
                    Double double9 = this.C;
                    gftb.check(double9);
                    this.D(coad0, false, Float.valueOf(double4.floatValue()), double9.floatValue(), Float.valueOf(double5.floatValue() - ((Double)gfsz0.a).floatValue()));
                    return gpvi.K(gptu1, this.B, this.C);
                }
                this.B = (Double)gfsz0.a;
                this.C = (Double)gfsz0.b;
            }
            return gpvi.K(gptu1, this.B, this.C);
        }
        this.C((this.z ? cnlv.d : cnlv.c));
        if(huqn0.ah() && this.z && !this.F()) {
            gpvq gpvq2 = this.s;
            if(gpvq2 != null) {
                gfsz0 = gpvq2.c(v);
                gptu1 = this.A(gptu1, gfsz0);
            }
        }
        if(gfsz0 != null) {
            this.B = (Double)gfsz0.a;
            this.C = (Double)gfsz0.b;
            gftb.check(this.s);
            coad coad1 = this.s.f;
            Double double10 = this.C;
            gftb.check(double10);
            this.D(coad1, true, null, double10.floatValue(), null);
        }
        return gpvi.K(gptu1, this.B, this.C);
    }

    @Override  // gpty
    public final void d(long v, gptu_Position gptu0) {
        Object object0 = null;
        if(gptu0.u()) {
            if(this.I(gptu0, v)) {
                this.n = null;
                this.o = null;
            }
            else {
                String s = gptu0.floorLabel;
                if(s != null) {
                    this.n = s;
                    this.o = gptu0.levelId;
                    this.p = v;
                }
            }
        }
        if(gptu0.h() && gptu0.p() && (gptu0.t() || gptu0.u()) && DistanceUtils.a(gptu0.latE7, gptu0.lngE7, ((double)gptu0.accuracyMm)) && ((gptu0.altitudeMeters >= -500.0) && (gptu0.altitudeMeters <= 16000.0) && gptu0.altitudeMeters != 0.0)) {
            object0 = new gpvm(v, gptu0);
        }
        if(object0 == null) {
            return;
        }
        gpvq gpvq0 = this.s;
        if(gpvq0 != null) {
            gpvq0.e = Optional.of(ggzv.i(gptu0.b(), gptu0.d()));
        }
        if(gptu0.t()) {
            this.h = v;
            this.i = gptu0;
        }
        else if(gptu0.u()) {
            this.g = v;
        }
        this.w.e(object0);
        long v1 = v - gpvi.z(this.l.I());
        this.w.f(v1);
        this.z = true;
    }

    @Override  // gpty
    public final void e(long v, List list0) {
        gpvm gpvm0 = (gpvm)this.w.d(v, v);
        if(gpvm0 != null) {
            Double double0 = this.y == null ? null : this.y.c(v);
            huqn_elevationGraphOptimizerFlags huqn0 = this.l;
            if(huqn0.Z()) {
                fvzk fvzk0 = this.v;
                if(fvzk0 != null && double0 != null) {
                    fvze fvze0 = new fvze(fvzk0, list0, v, double0, fhts.m(fhts.i(gpvm0.f, gpvm0.g), ((int)huqn0.S())));
                    fvzk0.d.execute(fvze0);
                }
            }
        }
    }

    @Override  // gpty
    public final void l(long v, cjhf cjhf0) {
        this.j = v;
        this.k = cjhf0;
    }

    @Override  // gpty
    public final void m(long v, float f) {
        if(this.x.e(v, f)) {
            gpvd gpvd0 = this.y;
            if(gpvd0 != null) {
                gpvd0.e(v, f);
            }
            if(v > this.A + gpvi.z(this.l.p())) {
                this.z = true;
            }
        }
    }

    @Override  // gpty
    public final void n(long v, long v1) {
        this.f = v1;
    }

    @Override  // gpty
    public final void p(long v, Collection collection0, long v1) {
        gpvq gpvq0 = this.s;
        if(gpvq0 != null) {
            for(Object object0: collection0) {
                icvq icvq0 = (icvq)object0;
                gpvq0.d = v1;
                if(!gpvq0.c.isPresent() || icvq0.c > ((icvq)gpvq0.c.get()).c) {
                    if(gpvq0.d(icvq0, gpvq0.a.T(), gpvq0.a.i())) {
                        gpvq0.c = Optional.of(icvq0);
                    }
                    if(huxn.d()) {
                        fvzk fvzk0 = gpvq0.b;
                        long v2 = gpvq0.b();
                        if(ccze.b(fvzk0.h)) {
                            fvzc fvzc0 = new fvzc(fvzk0, v2);
                            fvzk0.d.execute(fvzc0);
                        }
                    }
                }
            }
            if(this.l.Z()) {
                fvzk fvzk1 = this.v;
                if(fvzk1 != null) {
                    fvzk1.c(v, collection0, v1 + Duration.ofNanos(v).toMillis());
                }
            }
        }
    }

    @Override  // ISensorFusionProcessor
    public final long r() {
        throw new UnsupportedOperationException("ElevationGraphOptimizationSensorFusion does not support estimating positions and their time.");
    }

    @Override  // ISensorFusionProcessor
    public final gptu_Position s() {
        throw new UnsupportedOperationException("ElevationGraphOptimizationSensorFusion does not support estimating positions and their time.");
    }

    @Override  // ISensorFusionProcessor
    public final void t(long v, PrintWriter printWriter0) {
        printWriter0.println(a.u(v, "ElevationGraphOptimizationSensorFusion - dump - "));
        String s = this.n;
        if(s != null) {
            printWriter0.println("floorLabel{" + s + "} at {" + this.p + "}");
        }
        if(this.l.Y() && huxn.a.c().b()) {
            fvzk fvzk0 = this.v;
            if(fvzk0 != null && huqy_phenotype.u()) {
                try {
                    fvyz fvyz0 = new fvyz(fvzk0, printWriter0);
                    ((bblp)fvzk0.d).d(fvyz0).get();
                }
                catch(InterruptedException | ExecutionException exception0) {
                    ggrv ggrv0 = fvzk0.c;
                    if(ggrv0 != null) {
                        ggrv0.i().s(exception0).ar(19101).B("Failed to dump bias manager state to bugreport. %s", exception0);
                    }
                }
            }
        }
        printWriter0.println("uwbe -" + this.l.ah());
    }

    private static double u(gpvm gpvm0, huqn_elevationGraphOptimizerFlags huqn0) {
        if(gpvm0.e == 0) {
            double f = huqn0.e();
            double f1 = huqn0.f();
            return Math.max(gpvm0.d, gpvm0.b / 1000.0 / f) * f1;
        }
        double f2 = huqn0.F();
        return Math.max(gpvm0.d, gpvm0.b / 1000.0 / f2);
    }

    @Override  // ISensorFusionProcessor
    public final void v() {
        gpvq gpvq0 = this.s;
        if(gpvq0 != null) {
            gpvq0.c = Optional.empty();
        }
    }

    @Override  // ISensorFusionProcessor
    public final void w() {
    }

    private static double x(long v) {
        return ((double)v) / 1000000000.0;
    }

    private static float y(double f) {
        return (float)Math.min(20.0, Math.pow(1.2, Math.round(Math.log(f) / Math.log(1.2))));
    }

    private static long z(double f) {
        return (long)(f * 1000000000.0);
    }
}

