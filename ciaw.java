public final class ciaw implements gful_cronetEngineProvider {
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
        ciav ciav0 = new ciav();
        ciam ciam0 = new ciam();
        cian cian0 = new cian();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gzkh.a), ciav0, ((gful_cronetEngineProvider)ciam0), cian0);
        cdhx0.E(-951688051);
        cdhx0.v(new ciao(), new ciap());
        cdhx0.k(new ciaq(), new ciar());
        cdhx0.k(new cias(), new ciat());
        cdhx0.v(new ciau(), new ciax());
        cdhx0.v(new ciay(), new ciaz());
        cdhx0.v(new ciba(), new cibb());
        cdhx0.k(new cibc(), new cibd());
        cdhx0.k(new cibe(), new cial());
        cczs cczs0 = cdmy.a(gzkh.class);
        cczs0.a = hxwy.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

