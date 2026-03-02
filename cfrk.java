public final class cfrk implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GOOGLE_ONE_CLIENT", 0xB8);
        ccvw0.g(htul.c());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cf;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 7;
        bbdz bbdz0 = bbdz.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cdnr cdnr0 = cdnt.b();
        cdnr0.d(true);
        cczs cczs0 = cdmy.a(hjaq.class);
        cczs0.a = htul.c();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.b = cdnr0.a();
        cczs0.o(Boolean.valueOf(true));
        return cczs0.p();
    }
}

