public final class cgom implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 2);
        ccvw0.g(huvk.d());
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
        ((bbdv)hftv0).c = 9;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cgon cgon0 = new cgon();
        cgoq cgoq0 = new cgoq();
        cgor cgor0 = new cgor();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cgon0, ((gful_cronetEngineProvider)cgoq0), cgor0);
        cdhx0.E(910335612);
        cdhx0.m(new cdhp(new cgos(), new cgot()), new cgou());
        if(hupd.g()) {
            cdhx0.d(new cdhp(new cgoi(), new cgoj()), new cgok());
        }
        if(hupd.e()) {
            cgol cgol0 = new cgol();
            cgoo cgoo0 = new cgoo();
            cdhx0.H(cizl.d, cgol0, cgoo0);
        }
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huvk.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        cczs0.d = new cgop();
        return cczs0.p();
    }
}

