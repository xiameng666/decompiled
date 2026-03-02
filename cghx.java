public final class cghx implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkou gkou0 = (gkou)((ProtoLiteBuilder)object0).b_message;
        gkou0.b |= 1;
        gkou0.c = v;
    }
}

