public final class cier implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((gzii)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gzii)object0))).ensureMutable();
        }
        ((gzij)((gzii)object0).b_message).c |= 0x100;
        ((gzij)((gzii)object0).b_message).R = v;
    }
}

