public final class cewv implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("FIND_MY_DEVICE_CLEARCUT", 205);
        ccvw0.b = new ceww();
        ccvw0.g(hros.t());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.bu;
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
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cczs cczs0 = cdmy.a(hgzq.class);
        cczs0.a = hros.t();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        return cczs0.p();
    }
}

