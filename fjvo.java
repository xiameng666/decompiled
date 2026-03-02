public final class fjvo implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fjcu)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fjcu)object0))));
        if(((fjcs)hftp0).a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        ((fjcs)hftp0).b_message = ((ProtoLiteBuilder)(((fjcs)hftp0))).P_newInstance();
        return (fjcu)((ProtoLiteBuilder)(((fjcs)hftp0))).N_build();
    }
}

