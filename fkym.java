import java.util.concurrent.atomic.AtomicReference;

public final class fkym implements ibts {
    public final AtomicReference a;
    public final fkys b;
    public final gsup c;
    public final AtomicReference d;

    public fkym(AtomicReference atomicReference0, fkys fkys0, gsup gsup0, AtomicReference atomicReference1) {
        this.a = atomicReference0;
        this.b = fkys0;
        this.c = gsup0;
        this.d = atomicReference1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        this.a.set(((fkvu)object0));
        ibuq.c(((fkvu)object0));
        ibuq.f(this.c, "request");
        fkys fkys0 = this.b;
        gste gste0 = (gste)((cpzz)fkys0.a).b.q(cmlp.a, ckje.b);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.c).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.c));
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsup)hftp0.b_message).i = false;
        gssr gssr0 = cpzz.a();
        ibuq.f(gssr0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsup gsup0 = (gsup)hftp0.b_message;
        gssr0.getClass();
        gsup0.h = gssr0;
        gsup0.b |= 4;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        gRPCMethodDescriptor iaoj0 = gstf.b;
        if(iaoj0 == null) {
            synchronized(gstf.class) {
                iaoj0 = gstf.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.people.v2.InternalPeopleService", "UpdatePerson");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gsup.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gsuq.a));
                    iaoj0 = iaog0.build();
                    gstf.b = iaoj0;
                }
            }
            return gdtf.j(gdtf.k(ibjw.a(gste0.a.a(iaoj0, gste0.b), ((gsup)hftv0)), new fkxs(new fkxr(fkys0, ((fkvu)object0))), gmap.a), new fkxj(new fkxi(this.d)), gmap.a);
        }
        return gdtf.j(gdtf.k(ibjw.a(gste0.a.a(iaoj0, gste0.b), ((gsup)hftv0)), new fkxs(new fkxr(fkys0, ((fkvu)object0))), gmap.a), new fkxj(new fkxi(this.d)), gmap.a);
    }
}

