public final class chxz implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzhv gzhv0 = (gzhv)((ProtoLiteBuilder)object0).b_message;
        gzhv0.b |= 0x20;
        gzhv0.h = v;
    }
}

