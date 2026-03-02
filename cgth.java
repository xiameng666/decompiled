public final class cgth implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LE", 0x1F);
        ccvw0.g(huvv.d());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.cN;
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
        cgto cgto0 = new cgto();
        cgta cgta0 = new cgta();
        cgtf cgtf0 = new cgtf();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gixy.a), cgto0, ((gful_cronetEngineProvider)cgta0), cgtf0);
        cdhx0.E(1790775718);
        cdhx0.v(new cdhp(new cgtg(), new cgti()), new cgtj());
        cdhx0.v(new cdhp(new cgtk(), new cgtl()), new cgtm());
        cdhx0.m(new cdhp(new cgtn(), new cgtp()), new cgtq());
        cdhx0.m(new cdhp(new cgtr(), new cgts()), new cgtt());
        cdhx0.g(new cdhp(new cgtu(), new cgtv()), new cgsx());
        cdhx0.v(new cdhp(new cgsy(), new cgsz()), new cgtb());
        cdhx0.v(new cdhp(new cgtc(), new cgtd()), new cgte());
        cczs cczs0 = cdmy.a(gixy.class);
        cczs0.a = huvv.d();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

