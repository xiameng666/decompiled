public final class dphn implements bboe {
    public final hksr a;
    public final gtjh b;

    public dphn(hksr hksr0, gtjh gtjh0) {
        this.a = hksr0;
        this.b = gtjh0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dpft dpft0 = (dpft)((ProtoLiteBuilder)object0).b_message;
        this.a.getClass();
        dpft0.h = this.a;
        dpft0.b |= 8;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dpft dpft1 = (dpft)((ProtoLiteBuilder)object0).b_message;
        this.b.getClass();
        dpft1.l = this.b;
        dpft1.b |= 0x80;
        return (ProtoLiteBuilder)object0;
    }
}

