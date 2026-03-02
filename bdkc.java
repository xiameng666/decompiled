public final class bdkc {
    public static final byte[] a;
    public static final hepd b;

    static {
        byte[] arr_b = "|".getBytes(ibyo.a);
        ibuq.e(arr_b, "getBytes(...)");
        bdkc.a = arr_b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hepd.a).v_newBuilder();
        hepx hepx0 = hepx.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hepd hepd0 = (hepd)hftp0.b_message;
        hepx0.getClass();
        hepd0.d = hepx0;
        hepd0.c = 0xB331;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        bdkc.b = (hepd)hftv0;
    }
}

