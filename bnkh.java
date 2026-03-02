public final class bnkh {
    public final hnos a;

    public bnkh(hnos hnos0) {
        this.a = hnos0;
    }

    public final gmcd a(long v, gsyz gsyz0) {
        return this.b(v, gsyz0, false);
    }

    public final gmcd b(long v, gsyz gsyz0, boolean z) {
        hlvj hlvj0 = hlvj.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlvj0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hlvj)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        gsyz0.getClass();
        ((hlvj)hftv1).d = gsyz0;
        ((hlvj)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlvj)hftp0.b_message).e = z;
        hlvj hlvj1 = (hlvj)hftp0.N_build();
        hnos hnos0 = (hnos)this.a.q(cmlp.a, ckfj.b);
        iakr iakr0 = hnos0.a;
        gRPCMethodDescriptor iaoj0 = hnot.c;
        if(iaoj0 == null) {
            synchronized(hnot.class) {
                iaoj0 = hnot.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.fmd.FmdApiService", "RegisterSpotAndroidDevice");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlvj0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlvk.a));
                    iaoj0 = iaog0.build();
                    hnot.c = iaoj0;
                }
            }
            return gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, hnos0.b), hlvj1), "registerSpotAndroidDevice")).h(new bnkd(), gmap.a);
        }
        return gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, hnos0.b), hlvj1), "registerSpotAndroidDevice")).h(new bnkd(), gmap.a);
    }

    public final gmcd c(long v) {
        hlvf hlvf0 = hlvf.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlvf0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlvf)hftp0.b_message).b = v;
        hlvf hlvf1 = (hlvf)hftp0.N_build();
        hnos hnos0 = (hnos)this.a.q(cmlp.a, ckfe.b);
        iakr iakr0 = hnos0.a;
        gRPCMethodDescriptor iaoj0 = hnot.e;
        if(iaoj0 == null) {
            synchronized(hnot.class) {
                iaoj0 = hnot.e;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.fmd.FmdApiService", "DeleteSpotAndroidDeviceRegistration");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlvf0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlvg.a));
                    gRPCMethodDescriptor iaoj1 = iaog0.build();
                    hnot.e = iaoj1;
                    iaoj0 = iaoj1;
                }
            }
        }
        gdta gdta0 = gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, hnos0.b), hlvf1), "deleteSpotAndroidDeviceRegistration")).h(new bnkf(), gmap.a);
        bnkg bnkg0 = new bnkg();
        return gdta0.f(bnlq.class, bnkg0, gmap.a);
    }
}

