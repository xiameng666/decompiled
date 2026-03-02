public final class gsnd extends ibjm {
    public gsnd(iakr iakr0, iakq iakq0) {
        super(iakr0, iakq0);
    }

    public final gmcd a(gsnf gsnf0) {
        gRPCMethodDescriptor iaoj0 = gsne.b;
        if(iaoj0 == null) {
            synchronized(gsne.class) {
                iaoj0 = gsne.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.maps.geomobileservices.geocoding.v3mobile.GeocodingService", "ReverseGeocode");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gsnf.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gsmw.a));
                    iaoj0 = iaog0.build();
                    gsne.b = iaoj0;
                }
            }
            return ibjw.a(this.a.a(iaoj0, this.b), gsnf0);
        }
        return ibjw.a(this.a.a(iaoj0, this.b), gsnf0);
    }

    @Override  // ibjo
    protected final ibjo d(iakr iakr0, iakq iakq0) {
        return new gsnd(iakr0, iakq0);
    }
}

