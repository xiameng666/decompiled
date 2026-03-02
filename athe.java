public final class athe implements athd {
    private araj a;
    private arae b;
    private arag c;
    private arac d;
    private ByteString e;
    private final atfw f;

    public athe(atfw atfw0) {
        this.f = atfw0;
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
        boolean z = false;
        int v = araj0.c;
        gftb.d(araj0 == araj.b, "CipherType %s not supported in code level 1", v);
        int v1 = arag0.d;
        gftb.d(arag0 == arag.a || arag0 == arag.b, "ChunkOrderingType %s not supported in code level 1", v1);
        if(arac0 == arac.b) {
            z = true;
        }
        int v2 = arac0.c;
        gftb.d(z, "ChecksumType %s not supported in code level 1", v2);
        atfw atfw0 = this.f;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)arae0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)arae0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arae arae1 = (arae)hftp0.b_message;
        arae1.b |= 1;
        arae1.d = hfsf0;
        byte[] arr_b = atfy.a(atfw0, ((arae)hftp0.N_build()).toBytesArray());
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arah.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((arah)hftv0).c = v;
        ((arah)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((arah)hftv1).f = v2;
        ((arah)hftv1).b |= 8;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((arah)hftp1.b_message).d = v1;
        ((arah)hftp1.b_message).b |= 2;
        ByteString hfsf1 = ByteString.copyFrom(arr_b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arah arah0 = (arah)hftp1.b_message;
        arah0.b |= 4;
        arah0.e = hfsf1;
        atgb0.a(((arah)hftp1.N_build()).toBytesArray());
    }

    @Override  // athd
    public final void b(arak arak0) {
        throw new UnsupportedOperationException();
    }

    @Override  // athd
    public final void c(ByteString hfsf0) {
        gftb.check(hfsf0);
        this.e = hfsf0;
    }

    @Override  // athd
    public final void d(arac arac0) {
        gftb.check(arac0);
        this.d = arac0;
    }

    @Override  // athd
    public final void e(arae arae0) {
        gftb.check(arae0);
        this.b = arae0;
    }

    @Override  // athd
    public final void f(arag arag0) {
        gftb.check(arag0);
        this.c = arag0;
    }

    @Override  // athd
    public final void g(araj araj0) {
        gftb.check(araj0);
        this.a = araj0;
    }
}

