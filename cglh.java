public final class cglh implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 2);
        ccvw0.h(true);
        ccvw0.g(huvk.i());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cy;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 12;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cgli cgli0 = new cgli();
        cglm cglm0 = new cglm();
        cgln cgln0 = new cgln();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cgli0, ((gful_cronetEngineProvider)cglm0), cgln0);
        cdhx0.E(0x9948A9C1);
        cdhx0.m(new cdhp(new cglo(), new cglp()), new cglq());
        cdhx0.l(new cdhp(new cgld(), new cgle()), new cglf());
        cdhx0.l(new cdhp(new cglg(), new cglj()), new cglk());
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huvk.i();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        cczs0.d = new cgll();
        return cczs0.p();
    }
}

