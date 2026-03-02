import j..time.Duration;

public final class ajrh implements ajrb {
    public final long a;
    public final grfq b;

    public ajrh(long v, grfq grfq0) {
        this.a = v;
        this.b = grfq0;
    }

    @Override  // ajrb
    public final Object a(Object object0) {
        grfi grfi0 = (grfi)((grfi)((grfi)object0).n(Duration.ofMillis(this.a))).q(cmlp.a, cjzw.b);
        iakr iakr0 = grfi0.a;
        gRPCMethodDescriptor iaoj0 = grfj.b;
        if(iaoj0 == null) {
            synchronized(grfj.class) {
                iaoj0 = grfj.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainRecoveryFactorDataService", "StoreRecoveryContactProviderKeys");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grfq.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grfr.a));
                    iaoj0 = iaog0.build();
                    grfj.b = iaoj0;
                }
            }
            return (grfr)ibjw.b(iakr0, iaoj0, grfi0.b, this.b);
        }
        return (grfr)ibjw.b(iakr0, iaoj0, grfi0.b, this.b);
    }
}

