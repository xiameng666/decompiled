public final class ceto implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        glgl glgl0 = ((glim)((glil)object0).b_message).u;
        if(glgl0 == null) {
            glgl0 = glgl.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)glgl0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)glgl0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glgl glgl1 = (glgl)hftp0.b_message;
        ((glgk)object1).getClass();
        glgl1.b();
        glgl1.e.add(((glgk)object1));
        if(!((glil)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((glil)object0))).ensureMutable();
        }
        glim glim0 = (glim)((glil)object0).b_message;
        glgl glgl2 = (glgl)hftp0.N_build();
        glgl2.getClass();
        glim0.u = glgl2;
        glim0.b |= 0x800;
    }
}

