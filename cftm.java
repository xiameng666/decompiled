public final class cftm implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 43);
        ccvw0.h(true);
        ccvw0.d(0x5DDE70F);
        ccvw0.e(hlqj.d);
        ccvw0.g(htyi.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.ck;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 2;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cfte cfte0 = new cfte();
        cftt cftt0 = new cftt();
        cftu cftu0 = new cftu();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), cfte0, ((gful_cronetEngineProvider)cftt0), cftu0);
        cdhx0.E(0x907592E0);
        cdhx0.H(new cizk(new cftv(), glex.a), new cftf(), new cftg());
        cdhx0.H(new cizk(new cfth(), glez.a), new cfti(), new cftj());
        cftk cftk0 = new cftk();
        cftn cftn0 = new cftn();
        cdhx0.H(cizl.f, cftk0, cftn0);
        cdhx0.g(new cfto(), new cftp());
        cdhx0.v(new cftq(), new cftr());
        cdhx0.j(new cfts());
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = htyi.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

