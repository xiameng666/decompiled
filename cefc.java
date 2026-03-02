public final class cefc implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("DROIDGUARD_ONDEVICE", 0);
        ccvw0.g(hsdw.d());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.hy;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 8;
        bbdz bbdz0 = bbdz.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        ceet ceet0 = new ceet();
        cefk cefk0 = new cefk();
        cefl cefl0 = new cefl();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gejt.a), ceet0, ((gful_cronetEngineProvider)cefk0), cefl0);
        cdhx0.E(1705075369);
        ceeu ceeu0 = new ceeu();
        ceev ceev0 = new ceev();
        cdhx0.H(cizl.g, ceeu0, ceev0);
        ceew ceew0 = new ceew();
        ceex ceex0 = new ceex();
        cdhx0.H(cizl.g, ceew0, ceex0);
        cdhx0.H(new cizk(new ceey(), gehs.a), new ceez(), new cefa());
        cdhx0.g(new cdhp(new cefd(), new cefe()), new ceff());
        cdhx0.g(new cdhp(new cefg(), new cefh()), new cefi());
        cdhx0.j(new cefj());
        cczs cczs0 = cdmy.a(gejt.class);
        cczs0.a = hsdw.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

