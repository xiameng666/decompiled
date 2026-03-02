public final class cfxf implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 19);
        ccvw0.g(huxn.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cC;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 6;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cfwz cfwz0 = new cfwz();
        cfxa cfxa0 = new cfxa();
        cfxb cfxb0 = new cfxb();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cfwz0, ((gful_cronetEngineProvider)cfxa0), cfxb0);
        cdhx0.E(0x46B3F484);
        cdhx0.e = new cfxc();
        cdhx0.G(new ciza(((ProtoLiteMessage)cnzn.a)), new cfxd(), new cfxe());
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huxn.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

