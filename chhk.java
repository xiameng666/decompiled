public final class chhk implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvx ccvx0;
        if(hvqn.a.p().ar()) {
            ccvw ccvw0 = ccvx.c("NEARBY_PRESENCE", 2000);
            ccvw0.h(true);
            chhj chhj0 = new chhj();
            if(ccvw0.c == null) {
                if(ccvw0.d == null) {
                    ccvw0.c = new ggdy();
                }
                else {
                    ccvw0.c = new ggdy();
                    ccvw0.c.k(ccvw0.d);
                    ccvw0.d = null;
                }
            }
            ccvw0.c.i(chhj0);
            ccvw0.g(hros.C());
            ccvx0 = ccvw0.a();
        }
        else {
            ccvw ccvw1 = ccvx.c("NEARBY_PRESENCE", 2000);
            ccvw1.h(true);
            ccvw1.g(hros.C());
            ccvx0 = ccvw1.a();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.dH;
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
        cczs cczs0 = cdmy.a(gdzx.class);
        cczs0.a = hros.C();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        return cczs0.p();
    }
}

