public final class cdtn implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("ANDROID_AUTH", 2600);
        ccvw0.g(hpaw.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.z;
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
        cdto cdto0 = new cdto();
        cdtp cdtp0 = new cdtp();
        cdtq cdtq0 = new cdtq();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)ghon.a), cdto0, ((gful_cronetEngineProvider)cdtp0), cdtq0);
        cdhx0.E(0xDAB7A6EB);
        cdtr cdtr0 = new cdtr();
        cdts cdts0 = new cdts();
        cdhx0.H(cizl.g, cdtr0, cdts0);
        cdhx0.H(new cizk(new cdtt(), ghoh.a), new cdtu(), new cdtv());
        cdhx0.j(new cdtm());
        cczs cczs0 = cdmy.a(ghon.class);
        cczs0.a = hpaw.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

