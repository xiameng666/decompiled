public final class dphl implements bboe {
    public final hjyk a;

    public dphl(hjyk hjyk0) {
        this.a = hjyk0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dpft dpft0 = (dpft)((ProtoLiteBuilder)object0).b_message;
        this.a.getClass();
        dpft0.f = this.a;
        dpft0.b |= 2;
        return (ProtoLiteBuilder)object0;
    }
}

