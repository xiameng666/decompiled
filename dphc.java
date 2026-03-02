public final class dphc implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        ((dpeb)((dpdv)object0).b_message).v = true;
        return (dpdv)object0;
    }
}

