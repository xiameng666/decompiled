public final class edmd implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((dnqc)((ProtoLiteBuilder)object0).b_message).m = true;
        return (ProtoLiteBuilder)object0;
    }
}

