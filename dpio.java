public final class dpio implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        ((dpeb)((dpdv)object0).b_message).o = hfvv.a;
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        dpeb dpeb0 = (dpeb)((dpdv)object0).b_message;
        dpeb0.n = dpfu.a(3);
        return (dpdv)object0;
    }
}

