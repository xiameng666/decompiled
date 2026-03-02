public final class cfyn implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 19);
        ccvw0.g(huxn.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cC;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 3;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cfyr cfyr0 = new cfyr();
        cfyd cfyd0 = new cfyd();
        cfyk cfyk0 = new cfyk();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cfyr0, ((gful_cronetEngineProvider)cfyd0), cfyk0);
        cdhx0.E(0x5616F5E5);
        cdhx0.e = new cfyl();
        cdhx0.p(new cfym(), new cfyo());
        cdhx0.g(new cfym(), new cfyp());
        cdhx0.s(new cfym(), new cfyq());
        cdhx0.r(new cfys(), new cfyt());
        cdhx0.h(new cfys(), new cfyu());
        cdhx0.t(new cfys(), new cfyv());
        cdhx0.h(new cfyw(), new cfyx());
        cdhx0.t(new cfyw(), new cfyy());
        cdhx0.r(new cfyw(), new cfye());
        cdhx0.j(new cfyf());
        if(huqm.d()) {
            cdhx0.p(new cfyg(), new cfyh());
            cdhx0.g(new cfyg(), new cfyi());
            cdhx0.s(new cfyg(), new cfyj());
        }
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huxn.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

