public final class dtzn {
    public static final hjzr a(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjzr.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hjzr)hftv0).b |= 1;
        ((hjzr)hftv0).c = s + " (sandbox fallback)";
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hjzr)hftv1).b |= 2;
        ((hjzr)hftv1).d = "https://fonts.gstatic.com/s/i/googlematerialicons/fingerprint/v12/gm_grey-24dp/1x/gm_fingerprint_gm_grey_24dp.png";
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hjzr)hftv2).b |= 4;
        ((hjzr)hftv2).e = "https://wallet.google/digitalid/";
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hjzr)hftv3).b |= 8;
        ((hjzr)hftv3).f = "https://wallet.google/digitalid/";
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjzr hjzr0 = (hjzr)hftp0.b_message;
        hjzr0.b |= 16;
        hjzr0.g = "https://://wallet.google/digitalid/";
        ProtoLiteMessage hftv4 = hftp0.N_build();
        ibuq.e(hftv4, "build(...)");
        return (hjzr)hftv4;
    }
}

