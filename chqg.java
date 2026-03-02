public final class chqg implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 0x20);
        ccvw0.g(hros.i());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.fC;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 7;
        bbdz bbdz0 = bbdz.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        chqr chqr0 = new chqr();
        chpz chpz0 = new chpz();
        chqk chqk0 = new chqk();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), chqr0, ((gful_cronetEngineProvider)chpz0), chqk0);
        cdhx0.E(0x439A1C94);
        chql chql0 = new chql();
        chqm chqm0 = new chqm();
        cdhx0.H(cizl.f, chql0, chqm0);
        chqn chqn0 = new chqn();
        chqo chqo0 = new chqo();
        cdhx0.H(cizl.f, chqn0, chqo0);
        cdhx0.H(new cizk(new chqp(), glmg.a), new chqq(), new chqs());
        cdhx0.H(new cizk(new chqt(), glme.a), new chqu(), new chqv());
        cdhx0.g(new chqw(), new chqx());
        cdhx0.g(new chqy(), new chqz());
        cdhx0.h(new chpw(), new chpx());
        cdhx0.g(new chpy(), new chqa());
        cdhx0.g(new chqb(), new chqc());
        cdhx0.h(new chqd(), new chqe());
        if(hzgz.a.b().a()) {
            cdhx0.H(new cizk(new chqf(), glec.a), new chqh(), new chqi());
        }
        if(hzgw.a.b().b()) {
            cdhx0.j(new chqj());
        }
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.i();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

