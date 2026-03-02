public final class cfep implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        glgy glgy0 = ((glim)((glil)object0).b_message).v;
        if(glgy0 == null) {
            glgy0 = glgy.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)glgy0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)glgy0));
        ((glgw)hftp0).a(((glkz)object1));
        if(!((glil)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((glil)object0))).ensureMutable();
        }
        glim glim0 = (glim)((glil)object0).b_message;
        glgy glgy1 = (glgy)((ProtoLiteBuilder)(((glgw)hftp0))).N_build();
        glgy1.getClass();
        glim0.v = glgy1;
        glim0.b |= 0x1000;
    }
}

