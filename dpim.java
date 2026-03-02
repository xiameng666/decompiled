public final class dpim implements bboe {
    public final dpeo a;

    public dpim(dpeo dpeo0) {
        this.a = dpeo0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dpft dpft0 = (dpft)((ProtoLiteBuilder)object0).b_message;
        this.a.getClass();
        dpft0.j = this.a;
        dpft0.b |= 0x20;
        return (ProtoLiteBuilder)object0;
    }
}

