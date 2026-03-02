public final class cefu implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejf gejf0 = (gejf)((ProtoLiteBuilder)object0).b_message;
        gejf0.b |= 2;
        gejf0.d = v;
    }
}

