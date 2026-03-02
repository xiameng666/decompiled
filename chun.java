public final class chun implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 0x20);
        ccvw0.g(hros.P());
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
        ((bbdv)hftv0).c = 3;
        bbdz bbdz0 = bbdz.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        chug chug0 = new chug();
        chuh chuh0 = new chuh();
        chui chui0 = new chui();
        cdhx cdhx0 = cdhz.a(((ProtoLiteMessage)glim.a), chug0, ((gful_cronetEngineProvider)chuh0), chui0);
        cdhx0.E(0xADB917F1);
        cdhx0.j(new chuj());
        if(hzgw.a.b().d()) {
            cdhx0.g(new chuk(), new chul());
        }
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.P();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.c = cdhx0.a();
        return cczs0.p();
    }
}

