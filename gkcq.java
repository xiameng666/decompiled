public final class gkcq extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gkcq() {
        super(((ProtoLiteMessage)gkct.a));
    }

    public final void a(String s, String s1) {
        s1.getClass();
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gkct gkct0 = (gkct)this.b_message;
        hfvh hfvh0 = gkct0.b;
        if(!hfvh0.b) {
            gkct0.b = hfvh0.a();
        }
        gkct0.b.put(s, s1);
    }
}

