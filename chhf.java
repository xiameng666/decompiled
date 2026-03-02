public final class chhf implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvx ccvx0;
        if(hvqf.z()) {
            ccvw ccvw0 = ccvx.c("COPRESENCE", 0);
            ccvw0.h(true);
            ccvw0.b = new chhe();
            ccvw0.g(hvqf.j());
            ccvx0 = ccvw0.a();
        }
        else {
            ccvw ccvw1 = ccvx.c("COPRESENCE", 0);
            ccvw1.h(true);
            ccvw1.g(hvqf.j());
            ccvx0 = ccvw1.a();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.dI;
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
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cczs cczs0 = cdmy.a(hiat.class);
        cczs0.a = hvqf.j();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        return cczs0.p();
    }
}

