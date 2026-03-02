public final class edsw implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((dxfm)((ProtoLiteBuilder)object0).b_message).b = 0;
        return ibom.a;
    }
}

