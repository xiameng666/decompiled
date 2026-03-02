public final class bnly implements glzn {
    public final bnmb a;

    public bnly(bnmb bnmb0) {
        this.a = bnmb0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((gfsx)object0).i()) {
            ((ggtj)bnmb.a.j()).x("Failed notifying battery level change - no device in cache.");
            return gmbu.i(gfqx.a);
        }
        bnmb bnmb0 = this.a;
        fqun fqun0 = (fqun)((gfsx)object0).d();
        long v = bnmb0.d.d().toEpochMilli();
        if(bnlw.a(fqun0, bnmb0.h, v)) {
            bnla bnla0 = bnmb0.i;
            gsyz gsyz0 = bnmb0.f;
            gtdj gtdj0 = (gtdj)bnla0.a.q(cmlp.a, ckfg.b);
            gtau gtau0 = gtau.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtau0).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gtau)hftp0.b_message).c = gsyz0;
            ((gtau)hftp0.b_message).b |= 1;
            gtau gtau1 = (gtau)hftp0.N_build();
            iakr iakr0 = gtdj0.a;
            gRPCMethodDescriptor iaoj0 = gtdk.j;
            if(iaoj0 == null) {
                synchronized(gtdk.class) {
                    iaoj0 = gtdk.j;
                    if(iaoj0 == null) {
                        gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                        iaog0.methodType = gRPCMethodType.a;
                        iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotService", "GetBleDevice");
                        iaog0.setSampledToLocalTracing();
                        iaog0.requestMarshaller = new ibjh(((MessageLite)gtau0));
                        iaog0.responseMarshaller = new ibjh(((MessageLite)gtav.a));
                        gRPCMethodDescriptor iaoj1 = iaog0.build();
                        gtdk.j = iaoj1;
                        iaoj0 = iaoj1;
                    }
                }
                return gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtau1), "getOwnedDevice")).h(new bnkr(), bnla0.c);
            }
            return gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtau1), "getOwnedDevice")).h(new bnkr(), bnla0.c);
        }
        ((ggtj)bnmb.a.j()).x("Should not trigger battery level notification.");
        return gmbu.i(gfqx.a);
    }
}

