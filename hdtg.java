public final class hdtg extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hdtg() {
        super(((ProtoLiteMessage)hdtl.a));
    }

    public final void a(hdtk hdtk0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdtl hdtl0 = (hdtl)this.b_message;
        hdtk0.getClass();
        hfuo hfuo0 = hdtl0.b;
        if(!hfuo0.c()) {
            hdtl0.b = ProtoLiteMessage.E(hfuo0);
        }
        hdtl0.b.add(hdtk0);
    }
}

