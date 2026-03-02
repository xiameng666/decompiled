public final class hddk extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hddk() {
        super(((ProtoLiteMessage)hddl.a));
    }

    public final void a(long v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hddl hddl0 = (hddl)this.b_message;
        hfui hfui0 = hddl0.c;
        if(!hfui0.c()) {
            hddl0.c = ProtoLiteMessage.D(hfui0);
        }
        hddl0.c.g(v);
    }
}

