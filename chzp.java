public final class chzp implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzio gzio0 = (gzio)((ProtoLiteBuilder)object0).b_message;
        gzio0.b |= 4;
        gzio0.e = v;
    }
}

