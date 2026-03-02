public final class dpho implements bboe {
    public final gtgn a;

    public dpho(gtgn gtgn0) {
        this.a = gtgn0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dpft dpft0 = (dpft)((ProtoLiteBuilder)object0).b_message;
        this.a.getClass();
        dpft0.g = this.a;
        dpft0.b |= 4;
        return (ProtoLiteBuilder)object0;
    }
}

