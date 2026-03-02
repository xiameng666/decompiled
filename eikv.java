public final class eikv {
    public static gwhg a(byte[] arr_b) {
        gwhg gwhg0;
        try {
            gwhg0 = gwhg.a;
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gwhg0), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (gwhg)hftv0;
        }
        catch(hfur hfur0) {
            a.ae(eicd.a.j(), "RDB: Cannot convert from Optional DD.", hfur0);
            return gwhg0;
        }
    }
}

