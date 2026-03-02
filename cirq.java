public final class cirq implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        glkw glkw0 = ((glim)((glil)object0).b_message).ar;
        if(glkw0 == null) {
            glkw0 = glkw.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)glkw0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)glkw0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glkw glkw1 = (glkw)hftp0.b_message;
        ((glkt)object1).getClass();
        glkw1.c();
        glkw1.d.add(((glkt)object1));
        if(!((glil)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((glil)object0))).ensureMutable();
        }
        glim glim0 = (glim)((glil)object0).b_message;
        glkw glkw2 = (glkw)hftp0.N_build();
        glkw2.getClass();
        glim0.ar = glkw2;
        glim0.b |= 0x400000;
    }
}

