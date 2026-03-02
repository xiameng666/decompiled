public final class ceic implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejr gejr0 = (gejr)((ProtoLiteBuilder)object0).b_message;
        gejr0.e = ((geie)object1).g;
        gejr0.b |= 4;
    }
}

