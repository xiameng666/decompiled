public final class fmae implements glzn {
    public final hnpj a;

    public fmae(hnpj hnpj0) {
        this.a = hnpj0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnvt)object0).a;
        gRPCMethodDescriptor iaoj0 = hnvu.a;
        if(iaoj0 == null) {
            synchronized(hnvu.class) {
                iaoj0 = hnvu.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.SmartMessaging", "GetContentDecoration");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnpj.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnpk.a));
                    iaoj0 = iaog0.build();
                    hnvu.a = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnvt)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnvt)object0).b), this.a);
    }
}

