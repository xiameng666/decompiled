public final class ewrn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((ewrj)((ProtoLiteBuilder)object0).b_message).d = hfvv.a;
        return (ProtoLiteBuilder)object0;
    }
}

