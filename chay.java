public final class chay implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ccvw ccvw0 = ccvx.c("LOCATION_SHARING_REPORTER", 0);
        ccvw0.b = new chba();
        ccvw0.g(huzc.b());
        ccvx ccvx0 = ccvw0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.it;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 35;
        bbdz bbdz0 = bbdz.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        bbdv bbdv2 = (bbdv)hftp0.N_build();
        cczs cczs0 = cdmy.a(fybj.class);
        cczs0.a = huzc.b();
        cczs0.k(ccvx0);
        cczs0.g = bbdv2;
        cczs0.o(Boolean.valueOf(true));
        cczs0.n();
        return cczs0.p();
    }
}

