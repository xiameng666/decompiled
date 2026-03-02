public final class dpgn implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        if(((ProtoLiteBuilder)object0).a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        ((ProtoLiteBuilder)object0).b_message = ((ProtoLiteBuilder)object0).P_newInstance();
        return (ProtoLiteBuilder)object0;
    }
}

