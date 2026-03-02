public final class cefn implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("DROIDGUARD_ONDEVICE", 0);
        ccvw0.g(hsdw.d());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.hy;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 9;
        bbdz bbdz0 = bbdz.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cefp cefp0 = new cefp();
        cefq cefq0 = new cefq();
        cefr cefr0 = new cefr();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gejt.a), cefp0, ((gful_cronetEngineProvider)cefq0), cefr0);
        cdhx0.E(1754448000);
        cefs cefs0 = new cefs();
        ceft ceft0 = new ceft();
        cdhx0.H(cizl.g, cefs0, ceft0);
        cdhx0.j(new cefu());
        cczs cczs0 = cdmy.a(gejt.class);
        cczs0.a = hsdw.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

