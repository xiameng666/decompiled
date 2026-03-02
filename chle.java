public final class chle implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("GMS_CORE", 24);
        ccvw0.g(hros.G());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.aM;
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
        ggdy ggdy0 = new ggdy();
        if(hrsz.d()) {
            ggdy0.i(cczk.i);
        }
        boolean z = hrsz.e();
        cczs cczs0 = cdmy.a(glim.class);
        cczs0.a = hros.G();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.a(ggdy0.h());
        cczs0.g(z);
        return cczs0.p();
    }
}

