public final class athf implements athd {
    private araj a;
    private arae b;
    private arag c;
    private arac d;
    private ByteString e;
    private arak f;
    private final atfw g;

    public athf(atfw atfw0) {
        this.g = atfw0;
    }

    @Override  // athd
    public final void a(atgb atgb0) {
        araj araj0 = this.a;
        gftb.z(araj0, "CipherType not specified");
        arae arae0 = this.b;
        gftb.z(arae0, "ChunkOrdering not specified");
        arag arag0 = this.c;
        gftb.z(arag0, "ChunkOrderingType not specified");
        arac arac0 = this.d;
        gftb.z(arac0, "ChecksumType not specified");
        ByteString hfsf0 = this.e;
        gftb.z(hfsf0, "ChecksumDigest not specified");
        arak arak0 = this.f;
        if(arak0 == null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arak.a).v_newBuilder();
            aram aram0 = aram.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((arak)hftp0.b_message).c = aram0.d;
            ((arak)hftp0.b_message).b |= 1;
            arak0 = (arak)hftp0.N_build();
        }
        boolean z = false;
        int v = araj0.c;
        gftb.d(araj0 == araj.b, "CipherType %s not supported in code level 2", v);
        int v1 = arag0.d;
        gftb.d(arag0 == arag.b, "ChunkOrderingType %s not supported in code level 2", v1);
        int v2 = arac0.c;
        gftb.d(arac0 == arac.b, "ChecksumType %s not supported in code level 2", v2);
        int v3 = arak0.c;
        if((aram.b(v3) == null ? aram.a : aram.b(v3)) == aram.b || (aram.b(v3) == null ? aram.a : aram.b(v3)) == aram.c) {
            z = true;
        }
        gftb.d(z, "CompressionMethod %s not supported in code level 2", (aram.b(v3) == null ? aram.a : aram.b(v3)).d);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqzz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((aqzz)hftv0).c = v;
        ((aqzz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        aqzz aqzz0 = (aqzz)hftp1.b_message;
        aqzz0.b |= 2;
        aqzz0.d = 2;
        byte[] arr_b = ((aqzz)hftp1.N_build()).toBytesArray();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)aran.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)arae0).jf(5, null);
        hftp3.X(((ProtoLiteMessage)arae0));
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((arae)hftp3.b_message).e = v1;
        ((arae)hftp3.b_message).b |= 2;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        aran aran0 = (aran)hftp2.b_message;
        arae arae1 = (arae)hftp3.N_build();
        arae1.getClass();
        aran0.e = arae1;
        aran0.b |= 4;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)araa.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp4.b_message;
        ((araa)hftv1).c = v2;
        ((araa)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp4.ensureMutable();
        }
        araa araa0 = (araa)hftp4.b_message;
        araa0.b |= 2;
        araa0.d = hfsf0;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        aran aran1 = (aran)hftp2.b_message;
        araa araa1 = (araa)hftp4.N_build();
        araa1.getClass();
        aran1.d = araa1;
        aran1.b |= 2;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        aran aran2 = (aran)hftp2.b_message;
        arak0.getClass();
        aran2.c = arak0;
        aran2.b |= 1;
        byte[] arr_b1 = ((aran)hftp2.N_build()).toBytesArray();
        byte[] arr_b2 = this.g.a(arr_b1, arr_b);
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)arah.a).v_newBuilder();
        araj araj1 = araj.a;
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp5.b_message;
        ((arah)hftv2).c = araj1.c;
        ((arah)hftv2).b |= 1;
        arac arac1 = arac.a;
        if(!hftv2.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp5.b_message;
        ((arah)hftv3).f = arac1.c;
        ((arah)hftv3).b |= 8;
        arag arag1 = arag.a;
        if(!hftv3.isImmutable()) {
            hftp5.ensureMutable();
        }
        ((arah)hftp5.b_message).d = arag1.d;
        ((arah)hftp5.b_message).b |= 2;
        ByteString hfsf1 = ByteString.copyFrom(arr_b);
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        arah arah0 = (arah)hftp5.b_message;
        arah0.b |= 16;
        arah0.g = hfsf1;
        ByteString hfsf2 = ByteString.copyFrom(arr_b2);
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        arah arah1 = (arah)hftp5.b_message;
        arah1.b |= 0x20;
        arah1.h = hfsf2;
        atgb0.a(((arah)hftp5.N_build()).toBytesArray());
    }

    @Override  // athd
    public final void b(arak arak0) {
        this.f = arak0;
    }

    @Override  // athd
    public final void c(ByteString hfsf0) {
        this.e = hfsf0;
    }

    @Override  // athd
    public final void d(arac arac0) {
        this.d = arac0;
    }

    @Override  // athd
    public final void e(arae arae0) {
        this.b = arae0;
    }

    @Override  // athd
    public final void f(arag arag0) {
        this.c = arag0;
    }

    @Override  // athd
    public final void g(araj araj0) {
        this.a = araj0;
    }
}

