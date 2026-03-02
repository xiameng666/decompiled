public final class cdtv implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ghoi ghoi0 = (ghoi)((ProtoLiteBuilder)object0).b_message;
        ghoi0.d = ((ghoh)object1).d;
        ghoi0.b |= 2;
    }
}

