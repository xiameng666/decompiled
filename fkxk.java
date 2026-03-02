import java.util.concurrent.atomic.AtomicReference;

public final class fkxk implements ibts {
    public final AtomicReference a;
    public final fkys b;
    public final gsun c;
    public final AtomicReference d;

    public fkxk(AtomicReference atomicReference0, fkys fkys0, gsun gsun0, AtomicReference atomicReference1) {
        this.a = atomicReference0;
        this.b = fkys0;
        this.c = gsun0;
        this.d = atomicReference1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        this.a.set(((fkvu)object0));
        ibuq.c(((fkvu)object0));
        ibuq.f(this.c, "request");
        fkys fkys0 = this.b;
        gste gste0 = (gste)((cpzz)fkys0.a).b.q(cmlp.a, ckjf.b);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.c).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.c));
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsun)hftp0.b_message).h = false;
        gssr gssr0 = cpzz.a();
        ibuq.f(gssr0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsun gsun0 = (gsun)hftp0.b_message;
        gssr0.getClass();
        gsun0.i = gssr0;
        gsun0.b |= 8;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        gRPCMethodDescriptor iaoj0 = gstf.c;
        if(iaoj0 == null) {
            synchronized(gstf.class) {
                iaoj0 = gstf.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.people.v2.InternalPeopleService", "UpdatePersonPhoto");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gsun.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gsuo.a));
                    iaoj0 = iaog0.build();
                    gstf.c = iaoj0;
                }
            }
            return gdtf.j(gdtf.k(ibjw.a(gste0.a.a(iaoj0, gste0.b), ((gsun)hftv0)), new fkxh(new fkxg(fkys0, ((fkvu)object0))), gmap.a), new fkwy(new fkwx(this.d)), gmap.a);
        }
        return gdtf.j(gdtf.k(ibjw.a(gste0.a.a(iaoj0, gste0.b), ((gsun)hftv0)), new fkxh(new fkxg(fkys0, ((fkvu)object0))), gmap.a), new fkwy(new fkwx(this.d)), gmap.a);
    }
}

