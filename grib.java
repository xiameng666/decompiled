public final class grib extends ibjl {
    public grib(iakr iakr0, iakq iakq0) {
        super(iakr0, iakq0);
    }

    public final grik a(grii grii0) {
        gRPCMethodDescriptor iaoj0 = grid.c;
        if(iaoj0 == null) {
            synchronized(grid.class) {
                iaoj0 = grid.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.auth.aang.v1.AangService", "DecryptFrp");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grii.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grik.a));
                    iaoj0 = iaog0.build();
                    grid.c = iaoj0;
                }
            }
            return (grik)ibjw.b(this.a, iaoj0, this.b, grii0);
        }
        return (grik)ibjw.b(this.a, iaoj0, this.b, grii0);
    }

    @Override  // ibjo
    protected final ibjo d(iakr iakr0, iakq iakq0) {
        return new grib(iakr0, iakq0);
    }
}

