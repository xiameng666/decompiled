public final class chsd implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((glil)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((glil)object0))).ensureMutable();
        }
        glim glim0 = (glim)((glil)object0).b_message;
        ((glel)object1).getClass();
        hfuo hfuo0 = glim0.aj;
        if(!hfuo0.c()) {
            glim0.aj = ProtoLiteMessage.E(hfuo0);
        }
        glim0.aj.add(((glel)object1));
    }
}

