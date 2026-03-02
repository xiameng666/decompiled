public final class ewru implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((ewri)((ProtoLiteBuilder)object0).b_message).e = hfvv.a;
        return (ProtoLiteBuilder)object0;
    }
}

