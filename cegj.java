public final class cegj implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("DROIDGUARD_ONDEVICE", 0);
        ccvw0.g(hsdw.d());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.hy;
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
        bbdz bbdz0 = bbdz.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cegk cegk0 = new cegk();
        cegp cegp0 = new cegp();
        cegq cegq0 = new cegq();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gejt.a), cegk0, ((gful_cronetEngineProvider)cegp0), cegq0);
        cdhx0.E(-823809038);
        cegr cegr0 = new cegr();
        cegd cegd0 = new cegd();
        cdhx0.H(cizl.g, cegr0, cegd0);
        cege cege0 = new cege();
        cegf cegf0 = new cegf();
        cdhx0.H(cizl.g, cege0, cegf0);
        cdhx0.H(new cizk(new cegg(), gehu.a), new cegh(), new cegi());
        cdhx0.g(new cdhp(new cegl(), new cegm()), new cegn());
        cdhx0.j(new cego());
        cczs cczs0 = cdmy.a(gejt.class);
        cczs0.a = hsdw.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

