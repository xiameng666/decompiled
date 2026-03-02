public final class cfpc implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 0x30);
        ccvw0.g(hros.V());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.av;
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
        cfpd cfpd0 = new cfpd();
        cfph cfph0 = new cfph();
        cfpi cfpi0 = new cfpi();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), cfpd0, ((gful_cronetEngineProvider)cfph0), cfpi0);
        cdhx0.E(0x4D7B891F);
        cdhx0.v(new cfpj(), new cfpk());
        cdhx0.v(new cfox(), new cfoy());
        cdhx0.x(new cfoz(), new cfpa());
        cdhx0.x(new cfpb(), new cfpe());
        cdhx0.v(new cfpf(), new cfpg());
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.V();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

