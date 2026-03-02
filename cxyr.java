public final class cxyr implements kar {
    @Override  // kar
    public final void accept(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gypr gypr0 = (gypr)((ProtoLiteBuilder)object0).b_message;
        gypr0.b |= 8;
        gypr0.f = true;
    }
}

