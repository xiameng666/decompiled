public final class cdvh implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ghur ghur0 = (ghur)((ProtoLiteBuilder)object0).b_message;
        ghur0.b |= 16;
        ghur0.g = v;
    }
}

