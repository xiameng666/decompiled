public final class giks {
    public static final void a(gikp gikp0, ProtoLiteBuilder hftp0) {
        ibuq.f(gikp0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gikr gikr0 = (gikr)hftp0.b_message;
        gikr0.k = gikp0.a();
        gikr0.b |= 0x80;
    }
}

