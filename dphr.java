public final class dphr implements bboe {
    public final dpey a;

    public dphr(dpey dpey0) {
        this.a = dpey0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        int v = this.a.b ^ 1;
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        ((dpeb)((dpdv)object0).b_message).t = v;
        return (dpdv)object0;
    }
}

