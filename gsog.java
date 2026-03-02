public final class gsog extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsog() {
        super(((ProtoLiteMessage)gsoi.a));
    }

    public final void a(String s, String s1) {
        s.getClass();
        s1.getClass();
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsoi gsoi0 = (gsoi)this.b_message;
        hfvh hfvh0 = gsoi0.b;
        if(!hfvh0.b) {
            gsoi0.b = hfvh0.a();
        }
        gsoi0.b.put(s, s1);
    }
}

