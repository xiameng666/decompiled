public final class gayw implements ibts {
    public final long a;

    public gayw(long v) {
        this.a = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "<this>");
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkxt gkxt0 = (gkxt)((ProtoLiteBuilder)object0).b_message;
        gkxt0.b |= 0x20;
        gkxt0.l = this.a;
        return ibom.a;
    }
}

