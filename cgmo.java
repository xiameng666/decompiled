public final class cgmo implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 2);
        ccvw0.g(huvk.c());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cy;
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
        cgnd cgnd0 = new cgnd();
        cgms cgms0 = new cgms();
        cgmu cgmu0 = new cgmu();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cgnd0, ((gful_cronetEngineProvider)cgms0), cgmu0);
        cdhx0.E(0x370F0C23);
        cdhx0.H(new cizk(new cgmv(), gkpg.a), new cgmw(), new cgmx());
        cgmy cgmy0 = new cgmy();
        cgna cgna0 = new cgna();
        cdhx0.H(cizl.d, cgmy0, cgna0);
        cdhx0.g(new cgnb(), new cgnc());
        cdhx0.s(new cgne(), new cgnf());
        cdhx0.p(new cgng(), new cgnh());
        cdhx0.g(new cgni(), new cgnj());
        cdhx0.s(new cgnk(), new cgmp());
        cdhx0.p(new cgmq(), new cgmr());
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huvk.c();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        cczs0.d = new cgmt();
        return cczs0.p();
    }
}

