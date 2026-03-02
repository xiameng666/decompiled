public final class cgns implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpl gkpl0 = (gkpl)((ProtoLiteBuilder)object0).b_message;
        gkpl0.g = ((gkpk)object1).d;
        gkpl0.b |= 16;
    }
}

