public final class cnvh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((cnwa)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cnwa)object0))).ensureMutable();
        }
        cnwc cnwc0 = (cnwc)((cnwa)object0).b_message;
        cnwc0.b |= 0x40;
        cnwc0.j = true;
        return (cnwa)object0;
    }
}

