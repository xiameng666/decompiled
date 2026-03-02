public final class arbb extends ibjm {
    public arbb(iakr iakr0, iakq iakq0) {
        super(iakr0, iakq0);
    }

    public final gmcd a(arbd arbd0) {
        gRPCMethodDescriptor iaoj0 = arbc.c;
        if(iaoj0 == null) {
            synchronized(arbc.class) {
                iaoj0 = arbc.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "GetCustomD2DItem");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)arbd.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)arbe.a));
                    iaoj0 = iaog0.build();
                    arbc.c = iaoj0;
                }
            }
            return ibjw.a(this.a.a(iaoj0, this.b), arbd0);
        }
        return ibjw.a(this.a.a(iaoj0, this.b), arbd0);
    }

    public final gmcd b(arbf arbf0) {
        gRPCMethodDescriptor iaoj0 = arbc.b;
        if(iaoj0 == null) {
            synchronized(arbc.class) {
                iaoj0 = arbc.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "GetMetadata");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)arbf.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)arbg.a));
                    iaoj0 = iaog0.build();
                    arbc.b = iaoj0;
                }
            }
            return ibjw.a(this.a.a(iaoj0, this.b), arbf0);
        }
        return ibjw.a(this.a.a(iaoj0, this.b), arbf0);
    }

    public final gmcd c(arbh arbh0) {
        gRPCMethodDescriptor iaoj0 = arbc.a;
        if(iaoj0 == null) {
            synchronized(arbc.class) {
                iaoj0 = arbc.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "Handshake");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)arbh.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)arbi.a));
                    iaoj0 = iaog0.build();
                    arbc.a = iaoj0;
                }
            }
            return ibjw.a(this.a.a(iaoj0, this.b), arbh0);
        }
        return ibjw.a(this.a.a(iaoj0, this.b), arbh0);
    }

    @Override  // ibjo
    protected final ibjo d(iakr iakr0, iakq iakq0) {
        return new arbb(iakr0, iakq0);
    }
}

