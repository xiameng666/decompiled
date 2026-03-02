public final class chyz implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzhr gzhr0 = (gzhr)((ProtoLiteBuilder)object0).b_message;
        gzhr0.b |= 0x20;
        gzhr0.h = v;
    }
}

