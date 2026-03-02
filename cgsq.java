public final class cgsq implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkvw gkvw0 = (gkvw)((ProtoLiteBuilder)object0).b_message;
        gkvw0.b |= 0x2000;
        gkvw0.p = v;
    }
}

