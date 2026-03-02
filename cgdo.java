public final class cgdo implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 0);
        ccvw0.g(huro.c());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cx;
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
        cgdz cgdz0 = new cgdz();
        cgdh cgdh0 = new cgdh();
        cgdt cgdt0 = new cgdt();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cgdz0, ((gful_cronetEngineProvider)cgdh0), cgdt0);
        cdhx0.E(0x55722423);
        cdhx0.e = new cgdv();
        cdhx0.H(new ciza(((ProtoLiteMessage)gkqh.a)), new cgdw(), new cgdx());
        cdhx0.H(new ciza(((ProtoLiteMessage)gkqe.a)), new cgdy(), new cgea());
        cdhx0.d(new cgeb(), new cgec());
        cdhx0.v(new cged(), new cgee());
        cdhx0.x(new cgef(), new cgeg());
        cdhx0.G(new cizk(new cgeh(), gkqs.a), new cgei(), new cgej());
        cdhx0.G(new cizk(new cgde(), gkqq.a), new cgdf(), new cgdg());
        if(huro.f()) {
            cdhx0.H(new ciza(((ProtoLiteMessage)gkql.a)), new cgdi(), new cgdj());
        }
        if(huro.e()) {
            cgdk cgdk0 = new cgdk();
            cgdl cgdl0 = new cgdl();
            cdhx0.F(cizl.d, cgdk0, cgdl0);
        }
        if(huro.f()) {
            cgdm cgdm0 = new cgdm();
            cgdn cgdn0 = new cgdn();
            cdhx0.f(cizl.d, 60, cgdm0, cgdn0);
            cdhx0.f(new ciza(((ProtoLiteMessage)gkqm.a)), 20, new cgdp(), new cgdq());
            cgdr cgdr0 = new cgdr();
            cgds cgds0 = new cgds();
            cdhx0.f(cizl.d, 20, cgdr0, cgds0);
        }
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huro.c();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        cczs0.d = new cgdu();
        return cczs0.p();
    }
}

