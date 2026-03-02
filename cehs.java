public final class cehs implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejr gejr0 = (gejr)((ProtoLiteBuilder)object0).b_message;
        gejr0.b |= 0x200;
        gejr0.l = v;
    }
}

