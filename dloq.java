public final class dloq implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        dxgb dxgb0 = dxgb.b;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dxgc dxgc0 = (dxgc)((ProtoLiteBuilder)object0).b_message;
        dxgc0.b = dxgb0.a();
        return ibom.a;
    }
}

