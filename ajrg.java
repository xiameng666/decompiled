import j..time.Duration;

public final class ajrg implements ajrb {
    public final long a;
    public final grdm b;

    public ajrg(long v, grdm grdm0) {
        this.a = v;
        this.b = grdm0;
    }

    @Override  // ajrb
    public final Object a(Object object0) {
        grfi grfi0 = (grfi)((grfi)((grfi)object0).n(Duration.ofMillis(this.a))).q(cmlp.a, cjzl.b);
        iakr iakr0 = grfi0.a;
        gRPCMethodDescriptor iaoj0 = grfj.c;
        if(iaoj0 == null) {
            synchronized(grfj.class) {
                iaoj0 = grfj.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainRecoveryFactorDataService", "GetRecoveryContactData");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grdm.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grds.a));
                    iaoj0 = iaog0.build();
                    grfj.c = iaoj0;
                }
            }
            return (grds)ibjw.b(iakr0, iaoj0, grfi0.b, this.b);
        }
        return (grds)ibjw.b(iakr0, iaoj0, grfi0.b, this.b);
    }
}

