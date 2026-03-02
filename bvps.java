public final class bvps {
    private static final bboh a;

    static {
        bvps.a = bboh.b("FeatureDrops", bbcu.eN);
    }

    public static hgni a(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hgni.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hgni)hftv0;
        }
        catch(hfur hfur0) {
            a.ae(bvps.a.j(), "Failed to convert bytes to Screen", hfur0);
            return null;
        }
    }

    public static byte[] b(hgnj hgnj0) {
        return hgnj0 == null ? null : hgnj0.toBytesArray();
    }
}

