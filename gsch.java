public final class gsch {
    private static volatile gRPCMethodDescriptor a;

    public static gRPCMethodDescriptor a() {
        gRPCMethodDescriptor iaoj1;
        gRPCMethodDescriptor iaoj0 = gsch.a;
        if(iaoj0 == null) {
            synchronized(gsch.class) {
                iaoj1 = gsch.a;
                if(iaoj1 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.cryptauth.fido.enrollment.v1.FidoCredentialEnrollmentService", "EnrollFidoCredential");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gscd.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gsce.a));
                    iaoj1 = iaog0.build();
                    gsch.a = iaoj1;
                }
            }
            return iaoj1;
        }
        return iaoj0;
    }
}

