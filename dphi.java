public final class dphi implements bboe {
    public final String a;

    public dphi(String s) {
        this.a = s;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        ((dpeb)((dpdv)object0).b_message).q = this.a;
        return (dpdv)object0;
    }
}

