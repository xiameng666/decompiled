public final class fdod implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ffdc ffdc0 = (ffdc)((ProtoLiteMessage)ffdg.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffdd.a).v_newBuilder();
        ffdf ffdf0 = ffdf.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ffdd)hftv0).c = ffdf0.c;
        ((ffdd)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffdd ffdd0 = (ffdd)hftp0.b_message;
        ffdd0.b |= 2;
        ffdd0.d = 1;
        ffdc0.a(((ffdd)hftp0.N_build()));
        hftr hftr0 = (hftr)((ProtoLiteMessage)gild.a).v_newBuilder();
        ffdg ffdg0 = (ffdg)((ProtoLiteBuilder)ffdc0).N_build();
        hftr0.n(ffdg.c, ffdg0);
        return (gild)((ProtoLiteBuilder)hftr0).N_build();
    }
}

