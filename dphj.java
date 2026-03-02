public final class dphj implements bboe {
    public final ByteString a;

    public dphj(ByteString hfsf0) {
        this.a = hfsf0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dpft dpft0 = (dpft)((ProtoLiteBuilder)object0).b_message;
        this.a.getClass();
        dpft0.e = this.a;
        return (ProtoLiteBuilder)object0;
    }
}

