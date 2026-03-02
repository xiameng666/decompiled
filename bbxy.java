final class bbxy implements ianw {
    @Override  // ianw
    public final Object a(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hoec.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hoec)hftv0;
        }
        catch(hfur hfur0) {
            bbxz.b.g("Invalid phone verification error details.", hfur0, new Object[0]);
            throw new RuntimeException(hfur0);
        }
    }

    @Override  // ianw
    public final byte[] b(Object object0) {
        return ((hoec)object0).toBytesArray();
    }
}

