public final class dmpv extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public dmpv() {
        super(((ProtoLiteMessage)dmpz.a));
    }

    public final void a(String s, dmpx dmpx0) {
        s.getClass();
        dmpx0.getClass();
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        dmpz dmpz0 = (dmpz)this.b_message;
        hfvh hfvh0 = dmpz0.b;
        if(!hfvh0.b) {
            dmpz0.b = hfvh0.a();
        }
        dmpz0.b.put(s, dmpx0);
    }
}

