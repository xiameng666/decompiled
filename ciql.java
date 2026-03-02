public final class ciql implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ffdd ffdd0 = (ffdd)((ProtoLiteBuilder)object0).b_message;
        ffdd0.c = ((ffdf)object1).c;
        ffdd0.b |= 1;
    }
}

