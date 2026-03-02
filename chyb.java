public final class chyb implements gful_cronetEngineProvider {
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
        chxx chxx0 = new chxx();
        chyg chyg0 = new chyg();
        chyh chyh0 = new chyh();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gzkh.a), chxx0, ((gful_cronetEngineProvider)chyg0), chyh0);
        cdhx0.E(0x8A2D9825);
        cdhx0.w(new chyi(), new chyj());
        cdhx0.w(new chyk(), new chyl());
        cdhx0.w(new chxy(), new chxz());
        if(!hxwy.a.e().u()) {
            cdhx0.n(0.5, new chya(), new chyd());
            cdhx0.n(0.5, new chye(), new chyf());
        }
        cczs cczs0 = cdmy.a(gzkh.class);
        cczs0.a = hxwy.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

