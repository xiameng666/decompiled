public final class cfbj implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GCM", 6);
        ccvw0.d(0x6AB2D1F);
        ccvw0.e(hlqj.d);
        ccvw0.g(htgx.f());
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
        ((bbdv)hftv0).c = 10;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cfbh cfbh0 = new cfbh();
        cfbm cfbm0 = new cfbm();
        cfbn cfbn0 = new cfbn();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)btbs.a), cfbh0, ((gful_cronetEngineProvider)cfbm0), cfbn0);
        cdhx0.E(-1539220893);
        cdhx0.H(new cizk(new cfbo(), btby.a), new cfbp(), new cfbq());
        cfbr cfbr0 = new cfbr();
        cfbs cfbs0 = new cfbs();
        cdhx0.H(cizl.g, cfbr0, cfbs0);
        cdhx0.j(new cfbt());
        cfbi cfbi0 = new cfbi();
        cfbl cfbl0 = new cfbl();
        cdhx0.e(cizl.d, 0, cfbi0, cfbl0);
        cczs cczs0 = cdmy.a(btbs.class);
        cczs0.a = htgx.f();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

