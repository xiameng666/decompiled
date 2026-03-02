public final class chrc implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 0x20);
        ccvw0.g(hros.j());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.fC;
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
        bbdz bbdz0 = bbdz.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        chrd chrd0 = new chrd();
        chre chre0 = new chre();
        chrf chrf0 = new chrf();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), chrd0, ((gful_cronetEngineProvider)chre0), chrf0);
        cdhx0.E(0xCECABD1A);
        cdhx0.H(new cizk(new chrg(), glee.a), new chrh(), new chri());
        cdhx0.j(new chrj());
        cdhx0.g(new chrk(), new chrl());
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.j();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

