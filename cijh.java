public final class cijh implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("SPOT_ONBOARDING", 0);
        ccvw0.g(hsxo.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.bu;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 3;
        bbdz bbdz0 = bbdz.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        ciis ciis0 = new ciis();
        ciiu ciiu0 = new ciiu();
        ciix ciix0 = new ciix();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)gjpw.a), ciis0, ((gful_cronetEngineProvider)ciiu0), ciix0);
        cdhx0.E(0x3505B40D);
        cdhx0.H(new cizk(new ciiy(), hadq.a), new ciiz(), new cija());
        cdhx0.H(new cizk(new cijb(), hadx.a), new cijc(), new cije());
        cdhx0.H(new cizk(new cijf(), haea.a), new cijd(), new ciji());
        cdhx0.H(new cizk(new cijj(), hadw.a), new cijk(), new cijl());
        cdhx0.g(new cdhp(new cijm(), new cijn()), new cijo());
        cdhx0.h(new cdhp(new cijp(), new ciit()), new ciiv());
        cdhx0.j(new ciiw());
        cczs cczs0 = cdmy.a(gjpw.class);
        cczs0.a = hsxo.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

