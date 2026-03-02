public final class cehe implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejq gejq0 = (gejq)((ProtoLiteBuilder)object0).b_message;
        gejq0.e = ((geic)object1).d;
        gejq0.b |= 4;
    }
}

