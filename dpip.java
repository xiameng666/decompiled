public final class dpip implements bboe {
    public final gtjo a;

    public dpip(gtjo gtjo0) {
        this.a = gtjo0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dpft dpft0 = (dpft)((ProtoLiteBuilder)object0).b_message;
        this.a.getClass();
        dpft0.i = this.a;
        dpft0.b |= 16;
        return (ProtoLiteBuilder)object0;
    }
}

