public final class dpic implements bboe {
    public final int a;

    public dpic(int v) {
        this.a = v;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        dpeb dpeb0 = (dpeb)((dpdv)object0).b_message;
        dpeb0.n = dpfu.a(this.a);
        return (dpdv)object0;
    }
}

