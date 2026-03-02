public final class cfuv implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccwv ccwv0 = ccwv.b("WESTINGHOUSE_COUNTERS", new cfuu()).a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.in;
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
        cful cful0 = new cful();
        cfum cfum0 = new cfum();
        cfun cfun0 = new cfun();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)ccwr.a), cful0, ((gful_cronetEngineProvider)cfum0), cfun0);
        cdhx0.E(0xD528AE15);
        cfuo cfuo0 = new cfuo();
        cfup cfup0 = new cfup();
        cdhx0.H(cizl.g, cfuo0, cfup0);
        cdhx0.H(new cizk(new cfuq(), ccwp.a), new cfur(), new cfus());
        cfut cfut0 = new cfut();
        cfuw cfuw0 = new cfuw();
        cdhx0.H(cizl.f, cfut0, cfuw0);
        cfux cfux0 = new cfux();
        cfuy cfuy0 = new cfuy();
        cdhx0.H(cizl.c, cfux0, cfuy0);
        cfuz cfuz0 = new cfuz();
        cfva cfva0 = new cfva();
        cdhx0.H(cizl.d, cfuz0, cfva0);
        cfvb cfvb0 = new cfvb();
        cfvc cfvc0 = new cfvc();
        cdhx0.H(cizl.i, cfvb0, cfvc0);
        cdhx0.x(new cfvd(), new cfuk());
        cczs cczs0 = cdmy.a(ccwr.class);
        cczs0.a = hugg.a.b().a();
        cczs0.k(ccwv0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        cczs0.h(true);
        return cczs0.p();
    }
}

