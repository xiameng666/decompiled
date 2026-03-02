public final class chgn implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvx ccvx0;
        if(hvkd.a.c().b()) {
            ccvw ccvw0 = ccvx.c("MOBILE_DATA_PLAN", 0);
            ccvw0.b = new chgm();
            ccvw0.g(hvkd.b());
            ccvx0 = ccvw0.a();
        }
        else {
            ccvw ccvw1 = ccvx.c("MOBILE_DATA_PLAN", 0);
            ccvw1.g(hvkd.b());
            ccvx0 = ccvw1.a();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.iQ;
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
        cczs cczs0 = cdmy.a(gizg.class);
        cczs0.a = hvkd.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        return cczs0.p();
    }
}

