final class bfev extends ibsl implements ibtw {
    final bfew a;

    public bfev(bfew bfew0, ibrl ibrl0) {
        this.a = bfew0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bfev)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bfev(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ibuq.e(ckdb.b, "CD_INITIATOR_CATEGORY_1");
        grrq grrq0 = (grrq)this.a.a.q(cmlp.a, ckdb.b);
        grqt grqt0 = grqt.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grqt0).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        iakr iakr0 = grrq0.a;
        gRPCMethodDescriptor iaoj0 = grrr.a;
        if(iaoj0 == null) {
            synchronized(grrr.class) {
                iaoj0 = grrr.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.chrome.sync.passwords.v1.Passwords", "ListPasswordSharingRecipients");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grqt0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grqu.a));
                    gRPCMethodDescriptor iaoj1 = iaog0.build();
                    grrr.a = iaoj1;
                    iaoj0 = iaoj1;
                }
            }
            return (grqu)ibjw.b(iakr0, iaoj0, grrq0.b, ((grqt)hftv0));
        }
        return (grqu)ibjw.b(iakr0, iaoj0, grrq0.b, ((grqt)hftv0));
    }
}

