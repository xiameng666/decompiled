public final class cgjt implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpc gkpc0 = (gkpc)((ProtoLiteBuilder)object0).b_message;
        gkpc0.b |= 0x80000;
        gkpc0.w = v;
    }
}

