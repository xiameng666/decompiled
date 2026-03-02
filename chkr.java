public final class chkr implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 28);
        ccvw0.h(true);
        ccvw0.g(hros.I());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.aM;
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
        chks chks0 = new chks();
        chkv chkv0 = new chkv();
        chkw chkw0 = new chkw();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), chks0, ((gful_cronetEngineProvider)chkv0), chkw0);
        cdhx0.E(0x800C07F4);
        chkx chkx0 = new chkx();
        chky chky0 = new chky();
        cdhx0.H(cizl.g, chkx0, chky0);
        chkz chkz0 = new chkz();
        chkn chkn0 = new chkn();
        cdhx0.H(cizl.g, chkz0, chkn0);
        cdhx0.H(new cizk(new chko(), glgd.a), new chkp(), new chkq());
        cdhx0.j(new chkt());
        chku chku0 = new chku();
        cdhx0.b().i(new cdhq(new cdkn(), null, chku0));
        ggdy ggdy0 = new ggdy();
        if(hrsz.d()) {
            ggdy0.i(cczk.i);
        }
        boolean z = hrsz.e();
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.I();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.a(ggdy0.h());
        cczs0.c = cdhx0.a();
        cczs0.g(z);
        return cczs0.p();
    }
}

