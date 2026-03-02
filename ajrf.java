import j..time.Duration;

public final class ajrf implements ajrb {
    public final long a;
    public final grfs b;

    public ajrf(long v, grfs grfs0) {
        this.a = v;
        this.b = grfs0;
    }

    @Override  // ajrb
    public final Object a(Object object0) {
        grfi grfi0 = (grfi)((grfi)((grfi)object0).n(Duration.ofMillis(this.a))).q(cmlp.a, cjzx.b);
        iakr iakr0 = grfi0.a;
        gRPCMethodDescriptor iaoj0 = grfj.d;
        if(iaoj0 == null) {
            synchronized(grfj.class) {
                iaoj0 = grfj.d;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainRecoveryFactorDataService", "StoreRecoveryContactRetrievalPackets");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grfs.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grft.a));
                    iaoj0 = iaog0.build();
                    grfj.d = iaoj0;
                }
            }
            return (grft)ibjw.b(iakr0, iaoj0, grfi0.b, this.b);
        }
        return (grft)ibjw.b(iakr0, iaoj0, grfi0.b, this.b);
    }
}

