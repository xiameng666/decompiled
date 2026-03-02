public final class cfaa implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GCM", 10);
        ccvw0.d(0x6AB2D1F);
        ccvw0.e(hlqj.d);
        ccvw0.g(htgx.c());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.bL;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 16;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cfab cfab0 = new cfab();
        cfac cfac0 = new cfac();
        cfad cfad0 = new cfad();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)btbs.a), cfab0, ((gful_cronetEngineProvider)cfac0), cfad0);
        cdhx0.E(0xD4860B4A);
        cfae cfae0 = new cfae();
        cfaf cfaf0 = new cfaf();
        cdhx0.H(cizl.g, cfae0, cfaf0);
        cfag cfag0 = new cfag();
        cfah cfah0 = new cfah();
        cdhx0.e(cizl.d, 0, cfag0, cfah0);
        cdhx0.n(0.5, new cdhp(new cfai(), new cfag()), new cfaj());
        cczs cczs0 = cdmy.a(btbs.class);
        cczs0.a = htgx.c();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

