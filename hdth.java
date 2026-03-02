public final class hdth extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hdth() {
        super(((ProtoLiteMessage)hdtk.a));
    }

    public final void a(long v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdtk hdtk0 = (hdtk)this.b_message;
        hfui hfui0 = hdtk0.d;
        if(!hfui0.c()) {
            hdtk0.d = ProtoLiteMessage.D(hfui0);
        }
        hdtk0.d.g(v);
    }
}

