public final class chia implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvx ccvx0;
        if(hvqf.z()) {
            ccvw ccvw0 = ccvx.c("NEARBY", 0);
            ccvw0.b = new chib();
            ccvw0.g(hvqf.f());
            ccvx0 = ccvw0.a();
        }
        else {
            ccvw ccvw1 = ccvx.c("NEARBY", 0);
            ccvw1.g(hvqf.f());
            ccvx0 = ccvw1.a();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.dE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 2;
        bbdz bbdz0 = bbdz.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cdnr cdnr0 = cdnt.b();
        cdnr0.d(true);
        cczs cczs0 = cdmy.a(gypl.class);
        cczs0.a = hvqf.f();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.b = cdnr0.a();
        cczs0.o(Boolean.valueOf(true));
        return cczs0.p();
    }
}

