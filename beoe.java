public final class beoe {
    public static final hhyo a(hhyo hhyo0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hhyo0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hhyo0));
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhyo hhyo1 = (hhyo)hftp0.b_message;
        hhyo1.b |= 4;
        hhyo1.e = "https://t1.gstatic.com/faviconV2?client=PASSWORD_MANAGER&type=FAVICON&fallback_opts=TYPE,SIZE,URL&size=32&nfrp=3";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhyo.c(((hhyo)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhyo.b(((hhyo)hftp0.b_message));
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hhyo)hftv0;
    }
}

