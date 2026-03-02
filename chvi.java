public final class chvi implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hhaa hhaa0 = (hhaa)((ProtoLiteBuilder)object0).b_message;
        hhaa0.k = ((hgzz)object1).o;
        hhaa0.b |= 0x100;
    }
}

