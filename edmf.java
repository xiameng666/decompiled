public final class edmf implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((dnqc)((ProtoLiteBuilder)object0).b_message).e = true;
        return (ProtoLiteBuilder)object0;
    }
}

