public final class chmg implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 60);
        ccvw0.h(true);
        ccvw0.g(hros.K());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.eh;
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
        chmb chmb0 = new chmb();
        chmk chmk0 = new chmk();
        chml chml0 = new chml();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), chmb0, ((gful_cronetEngineProvider)chmk0), chml0);
        cdhx0.E(0xE909612D);
        cdhx0.H(new cizk(new chmm(), gljr.a), new chmn(), new chmo());
        cdhx0.j(new chmp());
        cdhx0.g(new cdhp(new chmc(), new chmd()), new chme());
        cdhx0.g(new cdhp(new chmh(), new chmi()), new chmj());
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.K();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

