public final class fjtx implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fjci)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fjci)object0))));
        if(((fjcf)hftp0).a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        ((fjcf)hftp0).b_message = ((ProtoLiteBuilder)(((fjcf)hftp0))).P_newInstance();
        return (fjci)((ProtoLiteBuilder)(((fjcf)hftp0))).N_build();
    }
}

