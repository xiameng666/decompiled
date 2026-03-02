public final class chsy implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 0x20);
        ccvw0.g(hros.N());
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
        ((bbdv)hftv0).c = 1;
        bbdz bbdz0 = bbdz.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        chti chti0 = new chti();
        chtp chtp0 = new chtp();
        chsz chsz0 = new chsz();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), chti0, ((gful_cronetEngineProvider)chtp0), chsz0);
        cdhx0.E(0xE4E40978);
        cdhx0.H(new cizk(new chta(), glly.a), new chtb(), new chtc());
        cdhx0.j(new chtd());
        cdhx0.g(new chte(), new chtf());
        cdhx0.g(new chtg(), new chtj());
        hzgw hzgw0 = hzgw.a;
        if(hzgw0.b().c()) {
            cdhx0.H(new cizk(new chtk(), glma.a), new chtl(), new chtm());
        }
        if(hzgw0.b().a()) {
            cdhx0.x(new chtn(), new chto());
        }
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.N();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

