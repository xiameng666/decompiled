public final class dpiw implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        dpeb dpeb0 = (dpeb)((dpdv)object0).b_message;
        dpeb0.n = dpfu.a(4);
        return (dpdv)object0;
    }
}

