public final class ewqi implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((ewri)((ProtoLiteBuilder)object0).b_message).d = null;
        ((ewri)((ProtoLiteBuilder)object0).b_message).b &= -3;
        return (ProtoLiteBuilder)object0;
    }
}

