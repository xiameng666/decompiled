public final class albp implements gful_cronetEngineProvider {
    public final hfjb a;
    public final int b;

    public albp(hfjb hfjb0, int v) {
        this.a = hfjb0;
        this.b = v;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Object object0 = ((ProtoLiteMessage)hfji.a).v_newBuilder();
        long v = this.a.b;
        if(!object0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ProtoLiteMessage hftv0 = object0.b_message;
        ((hfji)hftv0).b |= 8;
        ((hfji)hftv0).e = v;
        if(!hftv0.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ProtoLiteMessage hftv1 = object0.b_message;
        ((hfji)hftv1).c = 1;
        ((hfji)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((hfji)object0.b_message).d = this.b - 1;
        ((hfji)object0.b_message).b |= 2;
        return object0;
    }
}

