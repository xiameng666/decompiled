public final class cezb implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbc btbc0 = (btbc)((ProtoLiteBuilder)object0).b_message;
        btbc0.b |= 4;
        btbc0.e = v;
    }
}

