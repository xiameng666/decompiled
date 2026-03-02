public final class gssq extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gssq() {
        super(((ProtoLiteMessage)gssr.a));
    }

    public final void a(String s) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gssr gssr0 = (gssr)this.b_message;
        s.getClass();
        hfuo hfuo0 = gssr0.c;
        if(!hfuo0.c()) {
            gssr0.c = ProtoLiteMessage.E(hfuo0);
        }
        gssr0.c.add(s);
    }
}

