public final class cgow implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 2);
        ccvw0.b = new cgph();
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
        ((bbdv)hftv0).c = 4;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cgoz cgoz0 = new cgoz();
        cgpl cgpl0 = new cgpl();
        cgpt cgpt0 = new cgpt();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cgoz0, ((gful_cronetEngineProvider)cgpl0), cgpt0);
        cdhx0.E(0x9A01649A);
        cgpu cgpu0 = new cgpu();
        cgpv cgpv0 = new cgpv();
        cdhx0.H(cizl.c, cgpu0, cgpv0);
        cgpw cgpw0 = new cgpw();
        cgpx cgpx0 = new cgpx();
        cdhx0.H(cizl.f, cgpw0, cgpx0);
        cgpy cgpy0 = new cgpy();
        cgpz cgpz0 = new cgpz();
        cdhx0.H(cizl.c, cgpy0, cgpz0);
        cgps cgps0 = new cgps();
        cgqb cgqb0 = new cgqb();
        cdhx0.H(cizl.f, cgps0, cgqb0);
        cdhx0.H(new cizk(new cgqc(), gkpe.a), new cgqd(), new cgqe());
        cdhx0.j(new cgqf());
        cdhx0.v(new cdhp(new cgqg(), new cgqh()), new cgox());
        cdhx0.g(new cdhp(new cgoy(), new cgpa()), new cgpb());
        cdhx0.g(new cdhp(new cgpc(), new cgpd()), new cgpe());
        cdhx0.v(new cgpf(), new cgpg());
        if(hupd.h()) {
            cgpi cgpi0 = new cgpi();
            cgpj cgpj0 = new cgpj();
            cdhx0.H(cizl.d, cgpi0, cgpj0);
        }
        if(!huvk.k()) {
            cdhx0.v(new cdhp(new cgpk(), new cgpm()), new cgpn());
        }
        if(huvk.k()) {
            cdhx0.m(new cdhp(new cgpo(), new cgpp()), new cgpq());
        }
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huvk.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        cczs0.d = new cgpr();
        return cczs0.p();
    }
}

