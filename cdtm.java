public final class cdtm implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ghoi ghoi0 = (ghoi)((ProtoLiteBuilder)object0).b_message;
        ghoi0.b |= 4;
        ghoi0.e = v;
    }
}

