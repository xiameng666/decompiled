public final class cfal implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccwv ccwv0 = ccwv.b("GCM_COUNTERS", null).a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.bL;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 12;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cfav cfav0 = new cfav();
        cfbc cfbc0 = new cfbc();
        cfam cfam0 = new cfam();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)ccwr.a), cfav0, ((gful_cronetEngineProvider)cfbc0), cfam0);
        cdhx0.E(0xE84DD371);
        cfan cfan0 = new cfan();
        cfao cfao0 = new cfao();
        cdhx0.H(cizl.g, cfan0, cfao0);
        cdhx0.H(new cizk(new cfap(), ccwp.a), new cfaq(), new cfar());
        cfas cfas0 = new cfas();
        cfat cfat0 = new cfat();
        cdhx0.H(cizl.f, cfas0, cfat0);
        cfaw cfaw0 = new cfaw();
        cfax cfax0 = new cfax();
        cdhx0.H(cizl.c, cfaw0, cfax0);
        cfay cfay0 = new cfay();
        cfaz cfaz0 = new cfaz();
        cdhx0.H(cizl.d, cfay0, cfaz0);
        cdhx0.x(new cfba(), new cfbb());
        cczs cczs0 = cdmy.a(ccwr.class);
        cczs0.a = htgx.a.h().c();
        cczs0.k(ccwv0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        cczs0.h(true);
        return cczs0.p();
    }
}

