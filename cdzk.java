public final class cdzk implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvx ccvx0;
        if(hqal.q()) {
            ccvw ccvw0 = ccvx.c("AUTOFILL_WITH_GOOGLE", 0);
            ccvw0.h(true);
            ccvw0.g(hqal.f());
            ccvx0 = ccvw0.a();
        }
        else {
            ccvw ccvw1 = ccvx.c("AUTOFILL_WITH_GOOGLE", 0);
            ccvw1.g(hqal.f());
            ccvx0 = ccvw1.a();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.gp;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 1;
        bbdz bbdz0 = bbdz.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cczs cczs0 = cdmy.a(aolm.class);
        cczs0.a = hqal.f();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        return cczs0.p();
    }
}

