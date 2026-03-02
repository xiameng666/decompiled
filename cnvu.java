public final class cnvu implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((cnwa)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cnwa)object0))).ensureMutable();
        }
        cnwc cnwc0 = (cnwc)((cnwa)object0).b_message;
        cnwc0.b |= 1;
        cnwc0.c = false;
        return (cnwa)object0;
    }
}

