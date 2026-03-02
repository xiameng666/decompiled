public final class cfdj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        double f = (double)(((Double)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glhl glhl0 = (glhl)((ProtoLiteBuilder)object0).b_message;
        glhl0.b |= 0x800;
        glhl0.i = f;
    }
}

