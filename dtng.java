public final class dtng implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((gtvt)((ProtoLiteBuilder)object0).b_message).e = false;
        return (ProtoLiteBuilder)object0;
    }
}

