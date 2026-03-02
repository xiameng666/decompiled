public final class cguf implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 5);
        ccvw0.g(huws.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cv;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 7;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cgum cgum0 = new cgum();
        cgur cgur0 = new cgur();
        cgus cgus0 = new cgus();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cgum0, ((gful_cronetEngineProvider)cgur0), cgus0);
        cdhx0.E(0x9BCC3D46);
        cdhx0.e = new cgut();
        cguu cguu0 = new cguu();
        cgug cgug0 = new cgug();
        cdhx0.G(cizl.d, cguu0, cgug0);
        cdhx0.G(new cizb(new ciza(((ProtoLiteMessage)gksf.a))), new cguh(), new cgui());
        cdhx0.G(new cizb(new ciza(((ProtoLiteMessage)gksf.a))), new cguj(), new cguk());
        cdhx0.G(new ciza(((ProtoLiteMessage)gksi.a)), new cgun(), new cguo());
        cdhx0.G(new ciza(((ProtoLiteMessage)gksi.a)), new cgup(), new cguq());
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huws.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

