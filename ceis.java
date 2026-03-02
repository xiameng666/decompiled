public final class ceis implements gful_cronetEngineProvider {
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
        ((bbdv)hftv0).c = 11;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        ceit ceit0 = new ceit();
        ceiw ceiw0 = new ceiw();
        ceix ceix0 = new ceix();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gejt.a), ceit0, ((gful_cronetEngineProvider)ceiw0), ceix0);
        cdhx0.E(0x2E90B0FC);
        ceiy ceiy0 = new ceiy();
        ceiz ceiz0 = new ceiz();
        cdhx0.H(cizl.g, ceiy0, ceiz0);
        cdhx0.H(new cizk(new ceja(), geig.a), new ceio(), new ceip());
        cdhx0.g(new cdhp(new ceiq(), new ceir()), new ceiu());
        cdhx0.j(new ceiv());
        cczs cczs0 = cdmy.a(gejt.class);
        cczs0.a = hsdw.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

