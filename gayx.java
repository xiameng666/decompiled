public final class gayx implements ibts {
    public final long a;

    public gayx(long v) {
        this.a = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "<this>");
        long v = this.a;
        if(v != -1L) {
            if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)object0).ensureMutable();
            }
            gkxt gkxt0 = (gkxt)((ProtoLiteBuilder)object0).b_message;
            gkxt0.b |= 8;
            gkxt0.h = v;
        }
        return ibom.a;
    }
}

