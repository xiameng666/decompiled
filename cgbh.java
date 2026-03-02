public final class cgbh implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkro gkro0 = (gkro)((ProtoLiteBuilder)object0).b_message;
        gkro0.j = ((gkrm)object1).e;
        gkro0.b |= 0x80;
    }
}

