public final class ciih implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("SPOT_ONBOARDING", 0);
        ccvw0.g(hsxo.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.bu;
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
        ciii ciii0 = new ciii();
        cihy cihy0 = new cihy();
        cihz cihz0 = new cihz();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gjpw.a), ciii0, ((gful_cronetEngineProvider)cihy0), cihz0);
        cdhx0.E(0x97D2A00);
        cdhx0.H(new cizk(new ciia(), hadq.a), new ciib(), new ciic());
        cdhx0.H(new cizk(new ciid(), hadt.a), new ciie(), new ciif());
        cdhx0.H(new cizk(new ciig(), hadw.a), new ciij(), new ciik());
        cdhx0.H(new cizk(new ciil(), hadu.a), new ciim(), new ciin());
        cdhx0.v(new ciio(), new ciip());
        cdhx0.j(new ciiq());
        cczs cczs0 = cdmy.a(gjpw.class);
        cczs0.a = hsxo.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

