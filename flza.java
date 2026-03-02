public final class flza implements glzn {
    public final hnqj a;

    public flza(hnqj hnqj0) {
        this.a = hnqj0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnqh)object0).a;
        gRPCMethodDescriptor iaoj0 = hnqi.a;
        if(iaoj0 == null) {
            synchronized(hnqi.class) {
                iaoj0 = hnqi.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.LighterCapabilities", "RegisterCapabilities");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnqj.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnqk.a));
                    iaoj0 = iaog0.build();
                    hnqi.a = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnqh)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnqh)object0).b), this.a);
    }
}

