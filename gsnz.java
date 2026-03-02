public final class gsnz extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsnz() {
        super(((ProtoLiteMessage)gsob.a));
    }

    public final void a(String s, String s1) {
        s.getClass();
        s1.getClass();
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsob gsob0 = (gsob)this.b_message;
        hfvh hfvh0 = gsob0.b;
        if(!hfvh0.b) {
            gsob0.b = hfvh0.a();
        }
        gsob0.b.put(s, s1);
    }
}

