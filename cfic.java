public final class cfic implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 29);
        ccvw0.g(hros.s());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.aP;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 19;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cfii cfii0 = new cfii();
        cfhv cfhv0 = new cfhv();
        cfhz cfhz0 = new cfhz();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), cfii0, ((gful_cronetEngineProvider)cfhv0), cfhz0);
        cdhx0.E(1474018285);
        cdhx0.H(new ciza(((ProtoLiteMessage)brvq.a)), new cfia(), new cfib());
        cdhx0.H(new cizk(new cfid(), bbdi.a), new cfie(), new cfif());
        cfig cfig0 = new cfig();
        cfih cfih0 = new cfih();
        cdhx0.H(cizl.g, cfig0, cfih0);
        cfij cfij0 = new cfij();
        cfik cfik0 = new cfik();
        cdhx0.H(cizl.f, cfij0, cfik0);
        cdhx0.H(new cizk(new cfil(), brvs.a), new cfim(), new cfin());
        cdhx0.H(new ciza(((ProtoLiteMessage)brvv.a)), new cfio(), new cfip());
        cdhx0.j(new cfhs());
        if(!hros.af()) {
            cdhx0.H(new ciza(((ProtoLiteMessage)brvo.a)), new cfht(), new cfhu());
        }
        if(hros.ag()) {
            cdhx0.H(new cizk(new cfhw(), bbdg.a), new cfhx(), new cfhy());
        }
        ggdy ggdy0 = new ggdy();
        if(hros.af()) {
            ggdy0.i(cczk.e);
            ggdy0.i(cczk.g);
        }
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.s();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.a(ggdy0.h());
        cczs0.c = cdhx0.a();
        cczs0.o(Boolean.valueOf(true));
        return cczs0.p();
    }
}

