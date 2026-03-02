public final class cfjc implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 29);
        ccvw0.h(true);
        ccvw0.g(hros.q());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.aK;
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
        cfjj cfjj0 = new cfjj();
        cfiv cfiv0 = new cfiv();
        cfja cfja0 = new cfja();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), cfjj0, ((gful_cronetEngineProvider)cfiv0), cfja0);
        cdhx0.E(597006775);
        cdhx0.H(new ciza(((ProtoLiteMessage)brvq.a)), new cfjb(), new cfjd());
        cdhx0.H(new cizk(new cfje(), bbdi.a), new cfjf(), new cfjg());
        cfjh cfjh0 = new cfjh();
        cfji cfji0 = new cfji();
        cdhx0.H(cizl.g, cfjh0, cfji0);
        cfjk cfjk0 = new cfjk();
        cfjl cfjl0 = new cfjl();
        cdhx0.H(cizl.f, cfjk0, cfjl0);
        cdhx0.H(new cizk(new cfjm(), brvs.a), new cfjn(), new cfjo());
        cdhx0.H(new ciza(((ProtoLiteMessage)brvv.a)), new cfjp(), new cfjq());
        cdhx0.j(new cfis());
        if(!hros.af()) {
            cdhx0.H(new ciza(((ProtoLiteMessage)brvo.a)), new cfit(), new cfiu());
        }
        if(hros.ag()) {
            cdhx0.H(new cizk(new cfiw(), bbdg.a), new cfix(), new cfiy());
        }
        cdnr cdnr0 = cdnt.a(new cfjj());
        cdnr0.a = new cfiz();
        ggdy ggdy0 = new ggdy();
        if(hros.af()) {
            ggdy0.i(cczk.e);
            ggdy0.i(cczk.g);
        }
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.q();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.a(ggdy0.h());
        cczs0.c = cdhx0.a();
        cczs0.b = cdnr0.a();
        return cczs0.p();
    }
}

