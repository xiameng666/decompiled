import j..time.Instant;
import j..util.DesugarCollections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class fkys {
    public final fkwn a;
    public final fkrk b;
    public final fkwk c;
    private final gful_cronetEngineProvider d;
    private final gful_cronetEngineProvider e;
    private final Executor f;
    private final fkyz g;

    public fkys(fkrk fkrk0, fkwn fkwn0, fkwk fkwk0, fkyz fkyz0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, Executor executor0, cqao cqao0, glxv glxv0) {
        ibuq.f(fkrk0, "responseStorage");
        ibuq.f(executor0, "listenersExecutor");
        ibuq.f(cqao0, "internalFlags");
        ibuq.f(glxv0, "timeSource");
        super();
        this.b = fkrk0;
        this.a = fkwn0;
        this.c = fkwk0;
        this.g = fkyz0;
        this.d = gful0;
        this.e = gful1;
        this.f = executor0;
    }

    public final gmcd a(fkwm fkwm0, Instant instant0) {
        ibuq.f(fkwm0, "consistencyLevel");
        ibuq.f(instant0, "syncTime");
        if(cqao.a()) {
            return gdtf.k(this.b.a(), new fkxb(new fkwz(instant0, this, fkwm0)), gmap.a);
        }
        AtomicReference atomicReference0 = new AtomicReference();
        fkxd fkxd0 = new fkxd(new fkxc(atomicReference0, this, fkwm0));
        return gdtf.j(this.b.b(fkxd0, gmap.a), new fkxf(new fkxe(this, atomicReference0)), gmap.a);
    }

    public final gmcd b(fkvu fkvu0, fkwm fkwm0) {
        hilh hilh0;
        ibuq.f(fkwm0, "consistencyLevel");
        gste gste0 = (gste)((cpzz)this.a).b.q(cmlp.a, ckjd.b);
        ibuq.f(fkwm0, "consistencyLevel");
        gssr gssr0 = cpzz.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gssr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gssr0));
        gsst gsst0 = gsss.a(((gssq)hftp0));
        List list0 = DesugarCollections.unmodifiableList(((gssr)gsst0.a.b_message).c);
        ibuq.e(list0, "getPersonIdList(...)");
        new hfxu(list0);
        gsst0.a.a("me");
        if(fkwm0 != fkwm.a) {
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)cpzz.a).jf(5, null);
            hftp1.X(((ProtoLiteMessage)cpzz.a));
            gstu gstu0 = gstt.a(hftp1);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hili.a).v_newBuilder();
            ibuq.f(hftp2, "builder");
            ibuq.f(fkwm0, "consistencyLevel");
            switch(fkwm0.ordinal()) {
                case 0: {
                    hilh0 = hilh.b;
                    break;
                }
                case 1: {
                    hilh0 = hilh.c;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            ibuq.f(hilh0, "value");
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hili)hftp2.b_message).c = hilh0.g;
            ((hili)hftp2.b_message).b |= 1;
            ProtoLiteMessage hftv0 = hftp2.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((hili)hftv0), "value");
            ProtoLiteBuilder hftp3 = gstu0.a;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gsts gsts0 = (gsts)hftp3.b_message;
            ((hili)hftv0).getClass();
            gsts0.e = (hili)hftv0;
            gsts0.b |= 8;
            gsst0.b(gstu0.a());
        }
        gssr gssr1 = gsst0.a();
        gRPCMethodDescriptor iaoj0 = gstf.a;
        if(iaoj0 == null) {
            synchronized(gstf.class) {
                iaoj0 = gstf.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.people.v2.InternalPeopleService", "GetPeople");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gssr.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gssv.a));
                    iaoj0 = iaog0.build();
                    gstf.a = iaoj0;
                }
            }
            return gdtf.k(ibjw.a(gste0.a.a(iaoj0, gste0.b), gssr1), new fkyb(new fkya(this, fkvu0)), gmap.a);
        }
        return gdtf.k(ibjw.a(gste0.a.a(iaoj0, gste0.b), gssr1), new fkyb(new fkya(this, fkvu0)), gmap.a);
    }

    public final gmcd c(fkvu fkvu0, gssv gssv0) {
        gmcd gmcd0;
        gssv gssv1 = fkvu0.c == null ? gssv.a : fkvu0.c;
        ibuq.e(gssv1, "getGetPeopleResponse(...)");
        if(fkyo.a(gssv1, gssv0)) {
            gmcd0 = gmbu.i(Boolean.valueOf(true));
        }
        else {
            fkvt fkvt0 = fkvt.a;
            if(ibuq.m((fkvu0.d == null ? fkvt.a : fkvu0.d), fkvt0)) {
                gmcd0 = gmbu.i(Boolean.valueOf(true));
            }
            else {
                fkvt fkvt1 = fkvu0.d;
                if(fkvt1 != null) {
                    fkvt0 = fkvt1;
                }
                ibuq.e(fkvt0, "getPhotoUris(...)");
                gmcd gmcd1 = gdtf.d(new gmcd[]{this.f(fkvt0, 0), this.f(fkvt0, 1), this.f(fkvt0, 2), this.f(fkvt0, 3), this.f(fkvt0, 4)}).a(new fkws(), gmap.a);
                fkwu fkwu0 = new fkwu(new fkwt());
                gmcd0 = gdtf.j(gdtf.e(gmcd1, Exception.class, fkwu0, gmap.a), new fkxl(fkyr.a), gmap.a);
            }
        }
        gmcd gmcd2 = gdtf.k(gmcd0, new fkyd(new fkyc(fkvu0, gssv0, this)), gmap.a);
        fkyf fkyf0 = new fkyf(new fkye());
        return gdtf.e(gmcd2, Exception.class, fkyf0, gmap.a);
    }

    public final boolean d(fkvu fkvu0, fkvu fkvu1) {
        boolean z;
        gssv gssv0 = fkvu1.c == null ? gssv.a : fkvu1.c;
        ibuq.e(gssv0, "getGetPeopleResponse(...)");
        gssv gssv1 = fkvu0.c == null ? gssv.a : fkvu0.c;
        ibuq.e(gssv1, "getGetPeopleResponse(...)");
        if(fkys.e(gssv1, gssv0)) {
            Runnable runnable0 = gdrx.g(new fkxp(((cqag)this.d).a));
            this.f.execute(runnable0);
            z = true;
        }
        else {
            z = false;
        }
        if(!ibuq.m((fkvu0.d == null ? fkvt.a : fkvu0.d), (fkvu1.d == null ? fkvt.a : fkvu1.d))) {
            Runnable runnable1 = gdrx.g(new fkxq(((cqah)this.e).a));
            this.f.execute(runnable1);
            return true;
        }
        return z;
    }

    public static final boolean e(gssv gssv0, gssv gssv1) {
        return !ibuq.m(fkys.g(gssv0), fkys.g(gssv1));
    }

    private final gmcd f(fkvt fkvt0, int v) {
        gmcd gmcd0 = this.g.a(fkvt0, v);
        return hvev.a.b().g() ? gdtf.j(gmcd0, new fkyj(fkyq.a), gmap.a) : gdtf.j(gmcd0, new fkyh(new fkxw()), gmap.a);
    }

    private static final gssv g(gssv gssv0) {
        if(!gssv0.b.isEmpty()) {
            gstw gstw0 = (gstw)gssv0.b.get(0);
            ibuq.e(gstw0, "getPersonResponse(...)");
            gdmq gdmq0 = gstw0.d == null ? gdmq.a : gstw0.d;
            ibuq.e(gdmq0, "getPerson(...)");
            gdmx gdmx0 = gdmq0.d == null ? gdmx.a : gdmq0.d;
            ibuq.e(gdmx0, "getMetadata(...)");
            gdmb gdmb0 = gdmx0.f == null ? gdmb.a : gdmx0.f;
            ibuq.e(gdmb0, "getIdentityInfo(...)");
            List list0 = ggia.h(gdmb0.b, new fkyi(new fkyg()));
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gssv0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gssv0));
            if(!((gssu)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gssu)hftp0))).ensureMutable();
            }
            hfvv hfvv0 = hfvv.a;
            ((gssv)((gssu)hftp0).b_message).b = hfvv0;
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gstw0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gstw0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gstw)hftp1.b_message).d = null;
            ((gstw)hftp1.b_message).b &= -3;
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gdmq0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)gdmq0));
            if(!((gdmp)hftp2).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gdmp)hftp2))).ensureMutable();
            }
            ((gdmq)((gdmp)hftp2).b_message).g = hfvv0;
            if(!((gdmp)hftp2).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gdmp)hftp2))).ensureMutable();
            }
            ((gdmq)((gdmp)hftp2).b_message).d = null;
            ((gdmq)((gdmp)hftp2).b_message).b &= -3;
            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gdmx0).jf(5, null);
            hftp3.X(((ProtoLiteMessage)gdmx0));
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp3.b_message;
            ((gdmx)hftv0).b &= -17;
            ((gdmx)hftv0).e = 0L;
            if(!hftv0.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gdmx)hftp3.b_message).f = null;
            ((gdmx)hftp3.b_message).b &= -33;
            ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)gdmb0).jf(5, null);
            hftp4.X(((ProtoLiteMessage)gdmb0));
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((gdmb)hftp4.b_message).b = hfvv0;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gdmb gdmb1 = (gdmb)hftp4.b_message;
            gdmb1.b();
            hfrj.E(list0, gdmb1.b);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gdmx gdmx1 = (gdmx)hftp3.b_message;
            gdmb gdmb2 = (gdmb)hftp4.N_build();
            gdmb2.getClass();
            gdmx1.f = gdmb2;
            gdmx1.b |= 0x20;
            if(!((gdmp)hftp2).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gdmp)hftp2))).ensureMutable();
            }
            gdmq gdmq1 = (gdmq)((gdmp)hftp2).b_message;
            gdmx gdmx2 = (gdmx)hftp3.N_build();
            gdmx2.getClass();
            gdmq1.d = gdmx2;
            gdmq1.b |= 2;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gstw gstw1 = (gstw)hftp1.b_message;
            gdmq gdmq2 = (gdmq)((ProtoLiteBuilder)(((gdmp)hftp2))).N_build();
            gdmq2.getClass();
            gstw1.d = gdmq2;
            gstw1.b |= 2;
            if(!((gssu)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gssu)hftp0))).ensureMutable();
            }
            gssv gssv1 = (gssv)((gssu)hftp0).b_message;
            gstw gstw2 = (gstw)hftp1.N_build();
            gstw2.getClass();
            gssv1.b();
            gssv1.b.add(gstw2);
            ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)(((gssu)hftp0))).N_build();
            ibuq.e(hftv1, "build(...)");
            return (gssv)hftv1;
        }
        return gssv0;
    }
}

