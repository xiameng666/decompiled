public final class cirb implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glks glks0 = (glks)((ProtoLiteBuilder)object0).b_message;
        glks0.b |= 8;
        glks0.f = z;
    }
}

