public final class chnj implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("DROIDGUARD_ONDEVICE", 0);
        ccvw0.g(hxpp.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.jE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 5;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        chni chni0 = new chni();
        chmz chmz0 = new chmz();
        chna chna0 = new chna();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gejt.a), chni0, ((gful_cronetEngineProvider)chmz0), chna0);
        cdhx0.E(0x4E33C0DE);
        cdhx0.H(new cizk(new chnb(), geia.a), new chnc(), new chnd());
        cdhx0.H(new cizk(new chne(), gehy.a), new chnf(), new chng());
        cdhx0.g(new cdhp(new chnh(), new chnk()), new chnl());
        cdhx0.i(new cdhp(new chnm(), new chnn()), new chno());
        cdhx0.i(new cdhp(new chnp(), new chnq()), new chnr());
        cdhx0.j(new chmy());
        cczs cczs0 = cdmy.a(gejt.class);
        cczs0.a = hxpp.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

