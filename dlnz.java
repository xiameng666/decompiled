public final class dlnz {
    public static final fsxc a(fswz fswz0) {
        ibuq.f(fswz0, "type");
        fsxe fsxe0 = fsxd.a(((ProtoLiteMessage)fsxc.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fsxa.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(fswz0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fsxa fsxa0 = (fsxa)hftp0.b_message;
        fsxa0.b = fswz0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((fsxa)hftv0), "value");
        ProtoLiteBuilder hftp1 = fsxe0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fsxc fsxc0 = (fsxc)hftp1.b_message;
        ((fsxa)hftv0).getClass();
        fsxc0.c = (fsxa)hftv0;
        fsxc0.b = 1;
        return fsxe0.a();
    }
}

