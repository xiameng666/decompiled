import java.util.concurrent.TimeUnit;

public final class ajre implements ajrb {
    public final long a;
    public final grdh b;

    public ajre(long v, grdh grdh0) {
        this.a = v;
        this.b = grdh0;
    }

    @Override  // ajrb
    public final Object a(Object object0) {
        grfi grfi0 = (grfi)((grfi)((grfi)object0).o(this.a, TimeUnit.MILLISECONDS)).q(cmlp.a, cjzk.b);
        iakr iakr0 = grfi0.a;
        gRPCMethodDescriptor iaoj0 = grfj.a;
        if(iaoj0 == null) {
            synchronized(grfj.class) {
                iaoj0 = grfj.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainRecoveryFactorDataService", "GetCurrentGaiaPasswordEncryptionKeyData");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grdh.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grdi.a));
                    iaoj0 = iaog0.build();
                    grfj.a = iaoj0;
                }
            }
            return (grdi)ibjw.b(iakr0, iaoj0, grfi0.b, this.b);
        }
        return (grdi)ibjw.b(iakr0, iaoj0, grfi0.b, this.b);
    }
}

