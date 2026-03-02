public final class bnlj implements gful_cronetEngineProvider {
    public final bnli a;

    public bnlj(bnli bnli0) {
        this.a = bnli0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        gtdj gtdj0 = (gtdj)this.a.a.q(cmlp.a, ckfo.b);
        iakr iakr0 = gtdj0.a;
        gtbg gtbg0 = gtbg.a;
        gRPCMethodDescriptor iaoj0 = gtdk.m;
        if(iaoj0 == null) {
            synchronized(gtdk.class) {
                iaoj0 = gtdk.m;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotService", "GetServicePublicKey");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gtbg0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gtbh.a));
                    iaoj0 = iaog0.build();
                    gtdk.m = iaoj0;
                }
            }
            return bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtbg0), "getServicePublicKey");
        }
        return bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtbg0), "getServicePublicKey");
    }
}

