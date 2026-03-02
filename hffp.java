public final class hffp extends ibjl {
    public hffp(iakr iakr0, iakq iakq0) {
        super(iakr0, iakq0);
    }

    public final hffw a(hffu hffu0) {
        gRPCMethodDescriptor iaoj0 = hffq.a;
        if(iaoj0 == null) {
            synchronized(hffq.class) {
                iaoj0 = hffq.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("footprints.oneplatform.FootprintsService", "GetActivityControlsSettings");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hffu.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hffw.a));
                    iaoj0 = iaog0.build();
                    hffq.a = iaoj0;
                }
            }
            return (hffw)ibjw.b(this.a, iaoj0, this.b, hffu0);
        }
        return (hffw)ibjw.b(this.a, iaoj0, this.b, hffu0);
    }

    public final hfgv b(hfgu hfgu0) {
        gRPCMethodDescriptor iaoj0 = hffq.b;
        if(iaoj0 == null) {
            synchronized(hffq.class) {
                iaoj0 = hffq.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("footprints.oneplatform.FootprintsService", "UpdateActivityControlsSettings");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hfgu.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hfgv.a));
                    iaoj0 = iaog0.build();
                    hffq.b = iaoj0;
                }
            }
            return (hfgv)ibjw.b(this.a, iaoj0, this.b, hfgu0);
        }
        return (hfgv)ibjw.b(this.a, iaoj0, this.b, hfgu0);
    }

    @Override  // ibjo
    protected final ibjo d(iakr iakr0, iakq iakq0) {
        return new hffp(iakr0, iakq0);
    }
}

