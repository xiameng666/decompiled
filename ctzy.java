public final class ctzy {
    public static final String a(ProtoLiteBuilder hftp0) {
        String s = ((ctyq)hftp0.b_message).e;
        ibuq.e(s, "getMimeType(...)");
        return s;
    }

    public static final void b(String s, ProtoLiteBuilder hftp0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctyq ctyq0 = (ctyq)hftp0.b_message;
        ctyq0.b |= 4;
        ctyq0.e = s;
    }
}

