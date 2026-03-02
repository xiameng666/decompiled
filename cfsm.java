public final class cfsm implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 44);
        ccvw0.h(true);
        ccvw0.d(0x5DDE70F);
        ccvw0.e(hlqj.d);
        ccvw0.g(htyi.c());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cl;
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
        bbdz bbdz0 = bbdz.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cfsu cfsu0 = new cfsu();
        cfta cfta0 = new cfta();
        cftb cftb0 = new cftb();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), cfsu0, ((gful_cronetEngineProvider)cfta0), cftb0);
        cdhx0.E(193457205);
        cdhx0.H(new cizk(new cftc(), glfc.a), new cfsn(), new cfso());
        cdhx0.H(new cizk(new cfsp(), glfe.a), new cfsq(), new cfsr());
        cdhx0.H(new cizk(new cfss(), glfg.a), new cfsv(), new cfsw());
        cdhx0.g(new cfsx(), new cfsy());
        cdhx0.j(new cfsz());
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = htyi.c();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

