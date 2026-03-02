public final class eqmi {
    private final ProtoLiteBuilder a;

    public eqmi(ProtoLiteBuilder hftp0) {
        gftb.check(hftp0);
        this.a = hftp0;
        ((ProtoLiteMessage)gjoa.a).v_newBuilder();
    }

    public final void a(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjob gjob0 = (gjob)hftp0.b_message;
        gjob0.b |= 4;
        gjob0.e = v;
    }
}

