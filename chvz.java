public final class chvz implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMSCORE_SCHEDULER_EVENT", 0);
        ccvw0.g(hrvw.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.em;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 8;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        chvq chvq0 = new chvq();
        chvr chvr0 = new chvr();
        chvs chvs0 = new chvs();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)btai.a), chvq0, ((gful_cronetEngineProvider)chvr0), chvs0);
        cdhx0.E(0xBA648B6C);
        cdhx0.y(new ciza(((ProtoLiteMessage)bsze.a)), new chvt(), new chvu(), true);
        cdhx0.y(new ciza(((ProtoLiteMessage)bsze.a)), new chvv(), new chvw(), true);
        cdhx0.j(new chvx());
        cczs cczs0 = cdmy.a(btai.class);
        cczs0.a = hrvw.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

