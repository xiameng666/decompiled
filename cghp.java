public final class cghp implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkou gkou0 = (gkou)((ProtoLiteBuilder)object0).b_message;
        gkou0.b |= 8;
        gkou0.f = f;
    }
}

