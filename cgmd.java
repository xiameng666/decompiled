public final class cgmd implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 0);
        ccvw0.g(huvk.g());
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
        ((bbdv)hftv0).c = 5;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cgmf cgmf0 = new cgmf();
        cglw cglw0 = new cglw();
        cglx cglx0 = new cglx();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cgmf0, ((gful_cronetEngineProvider)cglw0), cglx0);
        cdhx0.E(0xE02CB21F);
        cgly cgly0 = new cgly();
        cglz cglz0 = new cglz();
        cdhx0.H(cizl.g, cgly0, cglz0);
        cgma cgma0 = new cgma();
        cgmb cgmb0 = new cgmb();
        cdhx0.H(cizl.c, cgma0, cgmb0);
        cdhx0.j(new cgmc());
        cdhx0.i(new cgmg(), new cgme());
        cdhx0.m(new cgmg(), new cgmh());
        if(huvk.a.j().j()) {
            cgmi cgmi0 = new cgmi();
            cgmj cgmj0 = new cgmj();
            cdhx0.H(cizl.f, cgmi0, cgmj0);
            cgmk cgmk0 = new cgmk();
            cgml cgml0 = new cgml();
            cdhx0.H(cizl.f, cgmk0, cgml0);
            cdhx0.H(new cizk(new cgmm(), gkpz.a), new cglt(), new cglu());
        }
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huvk.g();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        cczs0.d = new cglv();
        return cczs0.p();
    }
}

