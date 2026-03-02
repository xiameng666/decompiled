public final class chfg implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccwv ccwv0 = ccwv.b("MAGICTETHER_COUNTERS", null).a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cR;
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
        chfh chfh0 = new chfh();
        chfo chfo0 = new chfo();
        chey chey0 = new chey();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)ccwr.a), chfh0, ((gful_cronetEngineProvider)chfo0), chey0);
        cdhx0.E(0x56B6C50A);
        chez chez0 = new chez();
        chfa chfa0 = new chfa();
        cdhx0.H(cizl.g, chez0, chfa0);
        cdhx0.H(new cizk(new chfb(), ccwp.a), new chfc(), new chfd());
        chfe chfe0 = new chfe();
        chff chff0 = new chff();
        cdhx0.H(cizl.f, chfe0, chff0);
        chfi chfi0 = new chfi();
        chfj chfj0 = new chfj();
        cdhx0.H(cizl.c, chfi0, chfj0);
        chfk chfk0 = new chfk();
        chfl chfl0 = new chfl();
        cdhx0.H(cizl.d, chfk0, chfl0);
        cdhx0.x(new chfm(), new chfn());
        boolean z = hvbn.a.d().e();
        cczs cczs0 = cdmy.a(ccwr.class);
        cczs0.a = hvbn.a.d().b();
        cczs0.k(ccwv0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        cczs0.h(true);
        cczs0.g(z);
        return cczs0.p();
    }
}

