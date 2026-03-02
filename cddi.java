public final class cddi implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gliz.a).v_newBuilder();
        cdef cdef0 = cdef.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gliz gliz0 = (gliz)hftp0.b_message;
        gliz0.c = cdef0.a();
        gliz0.b |= 1;
        int v = cddz.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gliz gliz1 = (gliz)hftp0.b_message;
        gliz1.b |= 8;
        gliz1.f = v;
        glil0.p(((gliz)hftp0.N_build()));
        return (glim)((ProtoLiteBuilder)glil0).N_build();
    }
}

