public final class chyn implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("SEMANTIC_LOCATION_ANDROID_LOG_EVENTS", 0);
        ccvw0.h(true);
        ccvw0.g(hxwy.d());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.jX;
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
        chys chys0 = new chys();
        chyu chyu0 = new chyu();
        chyv chyv0 = new chyv();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gzkh.a), chys0, ((gful_cronetEngineProvider)chyu0), chyv0);
        cdhx0.E(0x1E5A85FF);
        cdhx0.k(new chyw(), new chyx());
        cdhx0.k(new chyy(), new chyz());
        cdhx0.k(new chyo(), new chyp());
        cdhx0.v(new chyq(), new chyt());
        cczs cczs0 = cdmy.a(gzkh.class);
        cczs0.a = hxwy.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

