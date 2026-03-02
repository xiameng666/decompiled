public final class bnqa implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqyf)object0))));
        if(((fqyd)hftp0).a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        ((fqyd)hftp0).b_message = ((ProtoLiteBuilder)(((fqyd)hftp0))).P_newInstance();
        return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
    }
}

